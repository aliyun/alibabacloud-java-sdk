// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class BatchImportHttpApisRequest extends TeaModel {
    /**
     * <p>Specifies whether to overwrite existing APIs. If set to true, gatewayId is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("allowUpdate")
    public Boolean allowUpdate;

    /**
     * <p>The API type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Http</p>
     */
    @NameInMap("apiType")
    public String apiType;

    /**
     * <p>Enables the dry run feature, which validates the definition without performing the actual import.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    /**
     * <p>The gateway instance ID. For REST APIs, this parameter is required when withGatewayExtension is set to true or allowUpdate is set to true. For batch import of HTTP APIs, this parameter is always required.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-xxx</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-xxx</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The standard Base64 encoding of the raw bytes of the OAS ZIP package. The decoded size cannot exceed 10 MiB. This parameter cannot be specified together with specFileUrl or specOssConfig. Dry run is supported and returns validation results, but the dry run task result does not return a replayable importRequest.</p>
     * 
     * <strong>example:</strong>
     * <p>b3BlbmFwaTogMy4wLjAKaW5mbzoKICAgIHRpdGxlOiBkZW1vCiAgICBkZXNjcmlwdGlvbjogdGhpc2lzZGVtbwogICAgdmVyc2lvbjogIiIKcGF0aHM6CiAgICAvdXNlci97dXNlcklkfToKICAgICAgICBnZXQ6CiAgICAgICAgICAgIHN1bW1hcnk6IOiOt+WPlueUqOaIt+S/oeaBrwogICAgICAgICAgICBkZXNjcmlwdGlvbjog6I635Y+W55So5oi35L+h5oGvCiAgICAgICAgICAgIG9wZXJhdGlvbklkOiBHZXRVc2VySW5mbwogICAgICAgICAgICByZXNwb25zZXM6CiAgICAgICAgICAgICAgICAiMjAwIjoKICAgICAgICAgICAgICAgICAgICBkZXNjcmlwdGlvbjog5oiQ5YqfCiAgICAgICAgICAgICAgICAgICAgY29udGVudDoKICAgICAgICAgICAgICAgICAgICAgICAgYXBwbGljYXRpb24vanNvbjtjaGFyc2V0PXV0Zi04OgogICAgICAgICAgICAgICAgICAgICAgICAgICAgc2NoZW1hOiBudWxsCnNlcnZlcnM6CiAgICAtIHVybDogaHR0cDovL2FwaS5leGFtcGxlLmNvbS92MQo=</p>
     */
    @NameInMap("specContentBase64")
    public String specContentBase64;

    /**
     * <p>The download URL of the OAS ZIP file. The URL must support unauthenticated downloads. OSS URLs and whitelisted backend domain names are supported. At least one of specFileUrl and specOssConfig must be specified.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oss-cn-hangzhou.aliyuncs.com/my-bucket/imports/batch.zip">https://oss-cn-hangzhou.aliyuncs.com/my-bucket/imports/batch.zip</a></p>
     */
    @NameInMap("specFileUrl")
    public String specFileUrl;

    /**
     * <p>The OSS configuration for the OAS file in ZIP format. At least one of specFileUrl and specOssConfig must be specified.</p>
     */
    @NameInMap("specOssConfig")
    public BatchImportHttpApisRequestSpecOssConfig specOssConfig;

    /**
     * <p>The conflict merge strategy during import. Default value: ExistFirst.</p>
     * 
     * <strong>example:</strong>
     * <p>ExistFirst</p>
     */
    @NameInMap("strategy")
    public String strategy;

    /**
     * <p>Specifies whether to import with gateway extension configurations. This parameter must be set to true for batch import of HTTP APIs.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("withGatewayExtension")
    public Boolean withGatewayExtension;

    public static BatchImportHttpApisRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchImportHttpApisRequest self = new BatchImportHttpApisRequest();
        return TeaModel.build(map, self);
    }

    public BatchImportHttpApisRequest setAllowUpdate(Boolean allowUpdate) {
        this.allowUpdate = allowUpdate;
        return this;
    }
    public Boolean getAllowUpdate() {
        return this.allowUpdate;
    }

    public BatchImportHttpApisRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public BatchImportHttpApisRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public BatchImportHttpApisRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public BatchImportHttpApisRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public BatchImportHttpApisRequest setSpecContentBase64(String specContentBase64) {
        this.specContentBase64 = specContentBase64;
        return this;
    }
    public String getSpecContentBase64() {
        return this.specContentBase64;
    }

    public BatchImportHttpApisRequest setSpecFileUrl(String specFileUrl) {
        this.specFileUrl = specFileUrl;
        return this;
    }
    public String getSpecFileUrl() {
        return this.specFileUrl;
    }

    public BatchImportHttpApisRequest setSpecOssConfig(BatchImportHttpApisRequestSpecOssConfig specOssConfig) {
        this.specOssConfig = specOssConfig;
        return this;
    }
    public BatchImportHttpApisRequestSpecOssConfig getSpecOssConfig() {
        return this.specOssConfig;
    }

    public BatchImportHttpApisRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

    public BatchImportHttpApisRequest setWithGatewayExtension(Boolean withGatewayExtension) {
        this.withGatewayExtension = withGatewayExtension;
        return this;
    }
    public Boolean getWithGatewayExtension() {
        return this.withGatewayExtension;
    }

    public static class BatchImportHttpApisRequestSpecOssConfig extends TeaModel {
        /**
         * <p>The OSS bucket name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-bucket</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <p>OSS Object Key。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>imports/batch.zip</p>
         */
        @NameInMap("objectKey")
        public String objectKey;

        /**
         * <p>The region ID of the OSS bucket.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        public static BatchImportHttpApisRequestSpecOssConfig build(java.util.Map<String, ?> map) throws Exception {
            BatchImportHttpApisRequestSpecOssConfig self = new BatchImportHttpApisRequestSpecOssConfig();
            return TeaModel.build(map, self);
        }

        public BatchImportHttpApisRequestSpecOssConfig setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public BatchImportHttpApisRequestSpecOssConfig setObjectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }
        public String getObjectKey() {
            return this.objectKey;
        }

        public BatchImportHttpApisRequestSpecOssConfig setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}

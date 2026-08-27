// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class BatchImportHttpApisRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("allowUpdate")
    public Boolean allowUpdate;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Http</p>
     */
    @NameInMap("apiType")
    public String apiType;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    /**
     * <strong>example:</strong>
     * <p>gw-xxx</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <strong>example:</strong>
     * <p>rg-xxx</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>b3BlbmFwaTogMy4wLjAKaW5mbzoKICAgIHRpdGxlOiBkZW1vCiAgICBkZXNjcmlwdGlvbjogdGhpc2lzZGVtbwogICAgdmVyc2lvbjogIiIKcGF0aHM6CiAgICAvdXNlci97dXNlcklkfToKICAgICAgICBnZXQ6CiAgICAgICAgICAgIHN1bW1hcnk6IOiOt+WPlueUqOaIt+S/oeaBrwogICAgICAgICAgICBkZXNjcmlwdGlvbjog6I635Y+W55So5oi35L+h5oGvCiAgICAgICAgICAgIG9wZXJhdGlvbklkOiBHZXRVc2VySW5mbwogICAgICAgICAgICByZXNwb25zZXM6CiAgICAgICAgICAgICAgICAiMjAwIjoKICAgICAgICAgICAgICAgICAgICBkZXNjcmlwdGlvbjog5oiQ5YqfCiAgICAgICAgICAgICAgICAgICAgY29udGVudDoKICAgICAgICAgICAgICAgICAgICAgICAgYXBwbGljYXRpb24vanNvbjtjaGFyc2V0PXV0Zi04OgogICAgICAgICAgICAgICAgICAgICAgICAgICAgc2NoZW1hOiBudWxsCnNlcnZlcnM6CiAgICAtIHVybDogaHR0cDovL2FwaS5leGFtcGxlLmNvbS92MQo=</p>
     */
    @NameInMap("specContentBase64")
    public String specContentBase64;

    /**
     * <strong>example:</strong>
     * <p><a href="https://oss-cn-hangzhou.aliyuncs.com/my-bucket/imports/batch.zip">https://oss-cn-hangzhou.aliyuncs.com/my-bucket/imports/batch.zip</a></p>
     */
    @NameInMap("specFileUrl")
    public String specFileUrl;

    @NameInMap("specOssConfig")
    public BatchImportHttpApisRequestSpecOssConfig specOssConfig;

    /**
     * <strong>example:</strong>
     * <p>ExistFirst</p>
     */
    @NameInMap("strategy")
    public String strategy;

    /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-bucket</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>imports/batch.zip</p>
         */
        @NameInMap("objectKey")
        public String objectKey;

        /**
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

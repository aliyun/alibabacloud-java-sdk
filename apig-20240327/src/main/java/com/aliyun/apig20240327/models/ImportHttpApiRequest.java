// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ImportHttpApiRequest extends TeaModel {
    /**
     * <p>The description of the imported API. If not provided, it will be extracted from the API definition. The length is limited to 255 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>测试专用API</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Pre-import check. If enabled, only the check will be performed without importing the API.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    /**
     * <p>The name of the imported API. If not provided, it will be extracted from the API definition file. If the API name and version configuration already exist, this import will update the existing API definition based on the <code>strategy</code> field.</p>
     * 
     * <strong>example:</strong>
     * <p>import-test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm3q4zjh7fkki</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Base64 encoded API definition, supporting OAS2.0 and OAS3.0 specifications, in YAML or JSON format. It has a higher priority than the <code>specFileUrl</code> parameter. If the file size exceeds 10MB, please use the <code>specFileUrl</code> parameter to transfer.</p>
     * 
     * <strong>example:</strong>
     * <p>b3BlbmFwaTogMy4wLjAKaW5mbzoKICAgIHRpdGxlOiBkZW1vCiAgICBkZXNjcmlwdGlvbjogdGhpc2lzZGVtbwogICAgdmVyc2lvbjogIiIKcGF0aHM6CiAgICAvdXNlci97dXNlcklkfToKICAgICAgICBnZXQ6CiAgICAgICAgICAgIHN1bW1hcnk6IOiOt+WPlueUqOaIt+S/oeaBrwogICAgICAgICAgICBkZXNjcmlwdGlvbjog6I635Y+W55So5oi35L+h5oGvCiAgICAgICAgICAgIG9wZXJhdGlvbklkOiBHZXRVc2VySW5mbwogICAgICAgICAgICByZXNwb25zZXM6CiAgICAgICAgICAgICAgICAiMjAwIjoKICAgICAgICAgICAgICAgICAgICBkZXNjcmlwdGlvbjog5oiQ5YqfCiAgICAgICAgICAgICAgICAgICAgY29udGVudDoKICAgICAgICAgICAgICAgICAgICAgICAgYXBwbGljYXRpb24vanNvbjtjaGFyc2V0PXV0Zi04OgogICAgICAgICAgICAgICAgICAgICAgICAgICAgc2NoZW1hOiBudWxsCnNlcnZlcnM6CiAgICAtIHVybDogaHR0cDovL2FwaS5leGFtcGxlLmNvbS92MQo=</p>
     */
    @NameInMap("specContentBase64")
    public String specContentBase64;

    /**
     * <p>Download URL for the API definition file, which must be accessible from the public network or via an internal OSS download address within the same region. The file URL must have download permissions. For non-publicly readable OSS file links, refer to the documentation at <a href="https://help.aliyun.com/zh/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects">https://help.aliyun.com/zh/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects</a>, and provide a URL with download permissions. Currently, only API definition files stored on OSS are supported.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://my-bucket.oss-cn-hangzhou.aliyuncs.com/my-api/api.yaml">https://my-bucket.oss-cn-hangzhou.aliyuncs.com/my-api/api.yaml</a></p>
     */
    @NameInMap("specFileUrl")
    public String specFileUrl;

    /**
     * <p>The oss config info.</p>
     */
    @NameInMap("specOssConfig")
    public ImportHttpApiRequestSpecOssConfig specOssConfig;

    /**
     * <p>When the imported API name and version management match an existing API, you need to specify an update strategy.</p>
     * <ul>
     * <li>SpecOnly: Completely based on the imported file.</li>
     * <li>SpecFirst: Prioritize the imported file, add new interfaces and update existing ones, while keeping interfaces not mentioned in the file unchanged.</li>
     * <li>ExistFirst: Prioritize the existing API, only add new interfaces without updating existing ones.
     * If not specified, the default strategy is ExistFirst.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ExistFirst</p>
     */
    @NameInMap("strategy")
    public String strategy;

    /**
     * <p>If this field is specified, this import will update the specified API instead of importing or searching for an existing API based on the API name and version management configuration. The target API must be of REST type.</p>
     * 
     * <strong>example:</strong>
     * <p>api-xxxx</p>
     */
    @NameInMap("targetHttpApiId")
    public String targetHttpApiId;

    /**
     * <p>API versioning configuration. If versioning is enabled, and the version number and API name match an existing API, this import will be treated as an update. If versioning is not enabled, and the API name matches an existing API, this import will also be treated as an update.</p>
     */
    @NameInMap("versionConfig")
    public HttpApiVersionConfig versionConfig;

    public static ImportHttpApiRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportHttpApiRequest self = new ImportHttpApiRequest();
        return TeaModel.build(map, self);
    }

    public ImportHttpApiRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ImportHttpApiRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ImportHttpApiRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ImportHttpApiRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ImportHttpApiRequest setSpecContentBase64(String specContentBase64) {
        this.specContentBase64 = specContentBase64;
        return this;
    }
    public String getSpecContentBase64() {
        return this.specContentBase64;
    }

    public ImportHttpApiRequest setSpecFileUrl(String specFileUrl) {
        this.specFileUrl = specFileUrl;
        return this;
    }
    public String getSpecFileUrl() {
        return this.specFileUrl;
    }

    public ImportHttpApiRequest setSpecOssConfig(ImportHttpApiRequestSpecOssConfig specOssConfig) {
        this.specOssConfig = specOssConfig;
        return this;
    }
    public ImportHttpApiRequestSpecOssConfig getSpecOssConfig() {
        return this.specOssConfig;
    }

    public ImportHttpApiRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

    public ImportHttpApiRequest setTargetHttpApiId(String targetHttpApiId) {
        this.targetHttpApiId = targetHttpApiId;
        return this;
    }
    public String getTargetHttpApiId() {
        return this.targetHttpApiId;
    }

    public ImportHttpApiRequest setVersionConfig(HttpApiVersionConfig versionConfig) {
        this.versionConfig = versionConfig;
        return this;
    }
    public HttpApiVersionConfig getVersionConfig() {
        return this.versionConfig;
    }

    public static class ImportHttpApiRequestSpecOssConfig extends TeaModel {
        /**
         * <p>The name of the Object Storage Service (OSS) bucket that stores the dictionary file.</p>
         * 
         * <strong>example:</strong>
         * <p>api-1</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <p>The file path.</p>
         * 
         * <strong>example:</strong>
         * <p>/test/swagger.json</p>
         */
        @NameInMap("objectKey")
        public String objectKey;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        public static ImportHttpApiRequestSpecOssConfig build(java.util.Map<String, ?> map) throws Exception {
            ImportHttpApiRequestSpecOssConfig self = new ImportHttpApiRequestSpecOssConfig();
            return TeaModel.build(map, self);
        }

        public ImportHttpApiRequestSpecOssConfig setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public ImportHttpApiRequestSpecOssConfig setObjectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }
        public String getObjectKey() {
            return this.objectKey;
        }

        public ImportHttpApiRequestSpecOssConfig setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}

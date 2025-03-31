// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ImportHttpApiRequest extends TeaModel {
    /**
     * <p>The API description, which cannot exceed 255 bytes in length. If you do not specify a description, a description is extracted from the definition file.</p>
     * 
     * <strong>example:</strong>
     * <p>API for testing</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run. If this parameter is set to true, a dry run is performed without importing the file.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    /**
     * <p>The API name. If you do not specify a name, a name is extracted from the definition file. If a name and a versioning configuration already exist, the existing API definition is updated based on the strategy field.</p>
     * 
     * <strong>example:</strong>
     * <p>import-test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p><a href="https://help.aliyun.com/document_detail/151181.html">The resource group ID</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm3q4zjh7fkki</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The Base64-encoded API definition. OAS 2.0 and OAS 3.0 specifications are supported. YAML and JSON formats are supported. This parameter precedes over the specFileUrl parameter. However, if the file size exceeds 10 MB, use the specFileUrl parameter to pass the definition.</p>
     * 
     * <strong>example:</strong>
     * <p>b3BlbmFwaTogMy4wLjAKaW5mbzoKICAgIHRpdGxlOiBkZW1vCiAgICBkZXNjcmlwdGlvbjogdGhpc2lzZGVtbwogICAgdmVyc2lvbjogIiIKcGF0aHM6CiAgICAvdXNlci97dXNlcklkfToKICAgICAgICBnZXQ6CiAgICAgICAgICAgIHN1bW1hcnk6IOiOt+WPlueUqOaIt+S/oeaBrwogICAgICAgICAgICBkZXNjcmlwdGlvbjog6I635Y+W55So5oi35L+h5oGvCiAgICAgICAgICAgIG9wZXJhdGlvbklkOiBHZXRVc2VySW5mbwogICAgICAgICAgICByZXNwb25zZXM6CiAgICAgICAgICAgICAgICAiMjAwIjoKICAgICAgICAgICAgICAgICAgICBkZXNjcmlwdGlvbjog5oiQ5YqfCiAgICAgICAgICAgICAgICAgICAgY29udGVudDoKICAgICAgICAgICAgICAgICAgICAgICAgYXBwbGljYXRpb24vanNvbjtjaGFyc2V0PXV0Zi04OgogICAgICAgICAgICAgICAgICAgICAgICAgICAgc2NoZW1hOiBudWxsCnNlcnZlcnM6CiAgICAtIHVybDogaHR0cDovL2FwaS5leGFtcGxlLmNvbS92MQo=</p>
     */
    @NameInMap("specContentBase64")
    public String specContentBase64;

    /**
     * <p>The download URL of the API definition file. You can download the file over the Internet or by using an Object Storage Service (OSS) internal download URL that belongs to the current region. You must obtain the required permissions to download the file. For OSS URLs that are not publicly readable, refer to <a href="https://help.aliyun.com/zh/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects">https://help.aliyun.com/zh/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects</a> to specify URLs that provide download permissions. Currently, only OSS URLs are supported.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://my-bucket.oss-cn-hangzhou.aliyuncs.com/my-api/api.yaml">https://my-bucket.oss-cn-hangzhou.aliyuncs.com/my-api/api.yaml</a></p>
     */
    @NameInMap("specFileUrl")
    public String specFileUrl;

    /**
     * <p>The OSS information.</p>
     */
    @NameInMap("specOssConfig")
    public ImportHttpApiRequestSpecOssConfig specOssConfig;

    /**
     * <p>The update policy when the API to be imported has the same version and name as an existing one. Valid values:</p>
     * <ul>
     * <li>SpectOnly: All configurations in the file take effect.</li>
     * <li>SpecFirst: The file takes precedence. New APIs are created and existing ones are updated. APIs not included in the file remain unchanged.</li>
     * <li>ExistFirst (default): The existing APIs take precedence. New APIs are created but existing ones remain unchanged.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ExistFirst</p>
     */
    @NameInMap("strategy")
    public String strategy;

    /**
     * <p>The API to be updated. If this parameter is specified, this import updates only the specified API. New APIs are not created and unspecified existing APIs are not updated. Only REST APIs can be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>api-xxxx</p>
     */
    @NameInMap("targetHttpApiId")
    public String targetHttpApiId;

    /**
     * <p>Version configuration.</p>
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
         * <p>The bucket name.</p>
         * 
         * <strong>example:</strong>
         * <p>api-1</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <p>The full path of the file.</p>
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

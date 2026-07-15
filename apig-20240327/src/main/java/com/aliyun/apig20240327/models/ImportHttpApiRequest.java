// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ImportHttpApiRequest extends TeaModel {
    /**
     * <p>The API deployment configurations.</p>
     */
    @NameInMap("deployConfigs")
    public java.util.List<HttpApiDeployConfig> deployConfigs;

    /**
     * <p>The description of the imported API. If not specified, the description is extracted from the API definition. Maximum length: 255 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>测试专用API</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to enable dry run mode. If enabled, only validation is performed without performing the actual import.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    /**
     * <p>The gateway ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-xxx</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The MCP route ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("mcpRouteId")
    public String mcpRouteId;

    /**
     * <p>The name of the imported API. If not specified, the name is extracted from the API definition file. If the API name and version configuration already exist, this import updates the existing API definition based on the strategy field.</p>
     * 
     * <strong>example:</strong>
     * <p>import-test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The <a href="https://help.aliyun.com/document_detail/151181.html">resource group ID</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek23nsa353vmra</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The Base64-encoded API definition that supports OAS 2.0 and OAS 3.0 specifications in YAML or JSON format. This parameter takes priority over the specFileUrl parameter. If the file size exceeds 10 MB, use the specFileUrl parameter instead.</p>
     * 
     * <strong>example:</strong>
     * <p>b3BlbmFwaTogMy4wLjAKaW5mbzoKICAgIHRpdGxlOiBkZW1vCiAgICBkZXNjcmlwdGlvbjogdGhpc2lzZGVtbwogICAgdmVyc2lvbjogIiIKcGF0aHM6CiAgICAvdXNlci97dXNlcklkfToKICAgICAgICBnZXQ6CiAgICAgICAgICAgIHN1bW1hcnk6IOiOt+WPlueUqOaIt+S/oeaBrwogICAgICAgICAgICBkZXNjcmlwdGlvbjog6I635Y+W55So5oi35L+h5oGvCiAgICAgICAgICAgIG9wZXJhdGlvbklkOiBHZXRVc2VySW5mbwogICAgICAgICAgICByZXNwb25zZXM6CiAgICAgICAgICAgICAgICAiMjAwIjoKICAgICAgICAgICAgICAgICAgICBkZXNjcmlwdGlvbjog5oiQ5YqfCiAgICAgICAgICAgICAgICAgICAgY29udGVudDoKICAgICAgICAgICAgICAgICAgICAgICAgYXBwbGljYXRpb24vanNvbjtjaGFyc2V0PXV0Zi04OgogICAgICAgICAgICAgICAgICAgICAgICAgICAgc2NoZW1hOiBudWxsCnNlcnZlcnM6CiAgICAtIHVybDogaHR0cDovL2FwaS5leGFtcGxlLmNvbS92MQo=</p>
     */
    @NameInMap("specContentBase64")
    public String specContentBase64;

    /**
     * <p>The download URL of the API definition file. The URL must be accessible from the public network or be an internal network OSS download URL in the same region. The URL must have download permissions. For OSS files that are not publicly readable, see References <a href="https://help.aliyun.com/document_detail/39607.html">Download objects using presigned URLs</a> and provide a URL with download permissions. Currently, only API definition files stored on OSS are supported.</p>
     */
    @NameInMap("specFileUrl")
    public String specFileUrl;

    /**
     * <p>The OSS configuration.</p>
     */
    @NameInMap("specOssConfig")
    public ImportHttpApiRequestSpecOssConfig specOssConfig;

    /**
     * <p>The update strategy to use when the imported API name and version management match an existing API. Valid values:</p>
     * <ul>
     * <li>SpecFirst: the imported file takes priority. New operations are added and existing operations are updated. Operations not mentioned in the file remain unchanged.</li>
     * <li>SpecOnly: the imported file is used as the sole source of truth.</li>
     * <li>ExistFirst: the existing API takes priority. Only new operations are added. Existing operations are not updated.</li>
     * </ul>
     * <p>Default value: ExistFirst.</p>
     * 
     * <strong>example:</strong>
     * <p>ExistFirst</p>
     */
    @NameInMap("strategy")
    public String strategy;

    /**
     * <p>If this field is specified, this import updates the specified API instead of importing a new one or searching for an existing API based on the API name and version management configuration. The target API must be of the REST type.</p>
     * 
     * <strong>example:</strong>
     * <p>api-xxxx</p>
     */
    @NameInMap("targetHttpApiId")
    public String targetHttpApiId;

    /**
     * <p>The API version configuration. If version configuration is enabled and the version number and API name match an existing API, this import is treated as an update. If version configuration is not enabled and the API name matches an existing API, this import is treated as an update.</p>
     */
    @NameInMap("versionConfig")
    public HttpApiVersionConfig versionConfig;

    /**
     * <p>Specifies whether to import gateway extension information.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("withGatewayExtension")
    public Boolean withGatewayExtension;

    public static ImportHttpApiRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportHttpApiRequest self = new ImportHttpApiRequest();
        return TeaModel.build(map, self);
    }

    public ImportHttpApiRequest setDeployConfigs(java.util.List<HttpApiDeployConfig> deployConfigs) {
        this.deployConfigs = deployConfigs;
        return this;
    }
    public java.util.List<HttpApiDeployConfig> getDeployConfigs() {
        return this.deployConfigs;
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

    public ImportHttpApiRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ImportHttpApiRequest setMcpRouteId(String mcpRouteId) {
        this.mcpRouteId = mcpRouteId;
        return this;
    }
    public String getMcpRouteId() {
        return this.mcpRouteId;
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

    public ImportHttpApiRequest setWithGatewayExtension(Boolean withGatewayExtension) {
        this.withGatewayExtension = withGatewayExtension;
        return this;
    }
    public Boolean getWithGatewayExtension() {
        return this.withGatewayExtension;
    }

    public static class ImportHttpApiRequestSpecOssConfig extends TeaModel {
        /**
         * <p>The bucket name.</p>
         * 
         * <strong>example:</strong>
         * <p>gms-service-prod</p>
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
         * <p>cn-shanghai</p>
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

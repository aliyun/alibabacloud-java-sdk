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
     * <p>The description of the API to import. If omitted, the description is taken from the API definition. The maximum length is 255 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>测试专用API</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Indicates whether to perform a dry run. If <code>true</code>, the system validates the request but does not import the API.</p>
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
     * <p>The name of the API to import. If omitted, the name is taken from the API definition file. If an API with the same name and versioning configuration already exists, the import acts as an update based on the specified <code>strategy</code>.</p>
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
     * <p>The Base64-encoded API definition. It supports OpenAPI Specification (OAS) 2.0 and 3.0 and can be in either YAML or JSON format. This parameter takes precedence over <code>specFileUrl</code>. If the file size is larger than 10 MB, use the <code>specFileUrl</code> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>b3BlbmFwaTogMy4wLjAKaW5mbzoKICAgIHRpdGxlOiBkZW1vCiAgICBkZXNjcmlwdGlvbjogdGhpc2lzZGVtbwogICAgdmVyc2lvbjogIiIKcGF0aHM6CiAgICAvdXNlci97dXNlcklkfToKICAgICAgICBnZXQ6CiAgICAgICAgICAgIHN1bW1hcnk6IOiOt+WPlueUqOaIt+S/oeaBrwogICAgICAgICAgICBkZXNjcmlwdGlvbjog6I635Y+W55So5oi35L+h5oGvCiAgICAgICAgICAgIG9wZXJhdGlvbklkOiBHZXRVc2VySW5mbwogICAgICAgICAgICByZXNwb25zZXM6CiAgICAgICAgICAgICAgICAiMjAwIjoKICAgICAgICAgICAgICAgICAgICBkZXNjcmlwdGlvbjog5oiQ5YqfCiAgICAgICAgICAgICAgICAgICAgY29udGVudDoKICAgICAgICAgICAgICAgICAgICAgICAgYXBwbGljYXRpb24vanNvbjtjaGFyc2V0PXV0Zi04OgogICAgICAgICAgICAgICAgICAgICAgICAgICAgc2NoZW1hOiBudWxsCnNlcnZlcnM6CiAgICAtIHVybDogaHR0cDovL2FwaS5leGFtcGxlLmNvbS92MQo=</p>
     */
    @NameInMap("specContentBase64")
    public String specContentBase64;

    /**
     * <p>The URL of the API definition file stored in OSS. The URL must be accessible from the public network or be an internal OSS endpoint in the same region. For OSS objects that are not publicly readable, use a presigned URL. For details, see <a href="https://help.aliyun.com/document_detail/39607.html">Download a file by using a presigned URL</a>.</p>
     */
    @NameInMap("specFileUrl")
    public String specFileUrl;

    /**
     * <p>Configuration for fetching the API definition from an OSS bucket.</p>
     */
    @NameInMap("specOssConfig")
    public ImportHttpApiRequestSpecOssConfig specOssConfig;

    /**
     * <p>The update strategy to apply when an API with the same name and versioning configuration already exists.</p>
     * <ul>
     * <li><p><code>SpecOnly</code>: Overwrites the existing API completely with the imported definition.</p>
     * </li>
     * <li><p><code>SpecFirst</code>: Updates existing APIs and creates new ones based on the imported definition. Existing APIs not included in the import file are unaffected.</p>
     * </li>
     * <li><p><code>ExistFirst</code>: Creates new APIs from the imported definition but does not modify any existing APIs. This is the default strategy.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ExistFirst</p>
     */
    @NameInMap("strategy")
    public String strategy;

    /**
     * <p>If you specify this parameter, the import updates the specified API instead of creating a new one or searching for an existing API by name and versioning configuration. The target API must be an HTTP API.</p>
     * 
     * <strong>example:</strong>
     * <p>api-xxxx</p>
     */
    @NameInMap("targetHttpApiId")
    public String targetHttpApiId;

    /**
     * <p>The versioning configuration for the API. If an existing API matches the specified name (and version, if enabled), this import updates that API.</p>
     */
    @NameInMap("versionConfig")
    public HttpApiVersionConfig versionConfig;

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
         * <p>The name of the OSS bucket that contains the API definition file.</p>
         * 
         * <strong>example:</strong>
         * <p>gms-service-prod</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <p>The object key (file path) of the API definition file within the bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>/test/swagger.json</p>
         */
        @NameInMap("objectKey")
        public String objectKey;

        /**
         * <p>The ID of the region where the OSS bucket is located.</p>
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

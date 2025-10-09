// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateNacosMcpServerRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("EncryptToolSpec")
    public Boolean encryptToolSpec;

    /**
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;REF&quot;,&quot;data&quot;:{&quot;namespaceId&quot;:&quot;public&quot;,&quot;groupName&quot;:&quot;mcp-endpoints&quot;,&quot;serviceName&quot;:&quot;mcp-demo&quot;}}</p>
     */
    @NameInMap("EndpointSpecification")
    public String endpointSpecification;

    /**
     * <strong>example:</strong>
     * <p>mse-cn-st21ri2****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <strong>example:</strong>
     * <p>mcp-demo</p>
     */
    @NameInMap("ServerName")
    public String serverName;

    /**
     * <strong>example:</strong>
     * <p>{&quot;description&quot;:&quot;a mcp demo service&quot;,&quot;capabilities&quot;:[],&quot;allVersions&quot;:[{&quot;version&quot;:&quot;1.0.0&quot;,&quot;release_date&quot;:&quot;2025-08-13T01:58:42Z&quot;,&quot;is_latest&quot;:true}],&quot;remoteServerConfig&quot;:{&quot;exportPath&quot;:&quot;/sse&quot;},&quot;enabled&quot;:true,&quot;versionDetail&quot;:{&quot;version&quot;:&quot;1.0.1&quot;},&quot;backendEndpoints&quot;:[{&quot;path&quot;:&quot;/sse&quot;,&quot;address&quot;:&quot;127.0.0.1&quot;,&quot;port&quot;:8080}],&quot;protocol&quot;:&quot;mcp-sse&quot;,&quot;name&quot;:&quot;mcp-demo&quot;,&quot;frontProtocol&quot;:&quot;mcp-sse&quot;}</p>
     */
    @NameInMap("ServerSpecification")
    public String serverSpecification;

    /**
     * <strong>example:</strong>
     * <p>{&quot;tools&quot;:[{&quot;name&quot;:&quot;demo-tool&quot;,&quot;description&quot;:&quot;a demo tool&quot;,&quot;inputSchema&quot;:{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;name&quot;:{&quot;type&quot;:&quot;string&quot;,&quot;description&quot;:&quot;name&quot;}}}}],&quot;toolsMeta&quot;:{&quot;demo-tool&quot;:{&quot;enabled&quot;:true}}}</p>
     */
    @NameInMap("ToolSpecification")
    public String toolSpecification;

    /**
     * <strong>example:</strong>
     * <p>allowTools:</p>
     * <ul>
     * <li>demo-tool
     * securityScheme: {}
     * server:
     * name: mcp-demo
     * tools:</li>
     * <li>args:<ul>
     * <li>name: name
     * description: name
     * type: string
     * description: a demo tool
     * name: demo-tool</li>
     * </ul>
     * </li>
     * </ul>
     */
    @NameInMap("YamlConfig")
    public String yamlConfig;

    public static CreateNacosMcpServerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNacosMcpServerRequest self = new CreateNacosMcpServerRequest();
        return TeaModel.build(map, self);
    }

    public CreateNacosMcpServerRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateNacosMcpServerRequest setEncryptToolSpec(Boolean encryptToolSpec) {
        this.encryptToolSpec = encryptToolSpec;
        return this;
    }
    public Boolean getEncryptToolSpec() {
        return this.encryptToolSpec;
    }

    public CreateNacosMcpServerRequest setEndpointSpecification(String endpointSpecification) {
        this.endpointSpecification = endpointSpecification;
        return this;
    }
    public String getEndpointSpecification() {
        return this.endpointSpecification;
    }

    public CreateNacosMcpServerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateNacosMcpServerRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public CreateNacosMcpServerRequest setServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }
    public String getServerName() {
        return this.serverName;
    }

    public CreateNacosMcpServerRequest setServerSpecification(String serverSpecification) {
        this.serverSpecification = serverSpecification;
        return this;
    }
    public String getServerSpecification() {
        return this.serverSpecification;
    }

    public CreateNacosMcpServerRequest setToolSpecification(String toolSpecification) {
        this.toolSpecification = toolSpecification;
        return this;
    }
    public String getToolSpecification() {
        return this.toolSpecification;
    }

    public CreateNacosMcpServerRequest setYamlConfig(String yamlConfig) {
        this.yamlConfig = yamlConfig;
        return this;
    }
    public String getYamlConfig() {
        return this.yamlConfig;
    }

}

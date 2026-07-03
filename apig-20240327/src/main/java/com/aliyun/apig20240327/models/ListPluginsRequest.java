// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPluginsRequest extends TeaModel {
    /**
     * <p>The ID of the attached resource.</p>
     * 
     * <strong>example:</strong>
     * <p>api-cuip2pum1hksng6oni3g</p>
     */
    @NameInMap("attachResourceId")
    public String attachResourceId;

    /**
     * <p>The type of the attachment point supported by the policy.</p>
     * <ul>
     * <li>HttpApi: HttpApi.</li>
     * <li>Operation: Operation of HttpApi.</li>
     * <li>GatewayRoute: gateway route.</li>
     * <li>GatewayService: gateway service.</li>
     * <li>GatewayServicePort: gateway service port.</li>
     * <li>Domain: gateway domain name.</li>
     * <li>Gateway: gateway.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HttpApi</p>
     */
    @NameInMap("attachResourceType")
    public String attachResourceType;

    /**
     * <p>The ID of the gateway instance used to filter results.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-csrhgn6m1hkt65qbxxgg</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The gateway type used to filter results. Valid values: <strong>AI</strong> and <strong>API</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>AI</p>
     */
    @NameInMap("gatewayType")
    public String gatewayType;

    /**
     * <p>Specifies whether the response includes built-in AI plugins installed by the system. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("includeBuiltinAiGateway")
    public Boolean includeBuiltinAiGateway;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the plugin type used to filter results.</p>
     * 
     * <strong>example:</strong>
     * <p>pls-dn82a9djd8z****</p>
     */
    @NameInMap("pluginClassId")
    public String pluginClassId;

    /**
     * <p>The name of the plugin type used to filter results.</p>
     * 
     * <strong>example:</strong>
     * <p>key-auth</p>
     */
    @NameInMap("pluginClassName")
    public String pluginClassName;

    /**
     * <p>Specifies whether the response includes the plugin attachment information corresponding to attachResourceId.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("withAttachmentInfo")
    public Boolean withAttachmentInfo;

    public static ListPluginsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPluginsRequest self = new ListPluginsRequest();
        return TeaModel.build(map, self);
    }

    public ListPluginsRequest setAttachResourceId(String attachResourceId) {
        this.attachResourceId = attachResourceId;
        return this;
    }
    public String getAttachResourceId() {
        return this.attachResourceId;
    }

    public ListPluginsRequest setAttachResourceType(String attachResourceType) {
        this.attachResourceType = attachResourceType;
        return this;
    }
    public String getAttachResourceType() {
        return this.attachResourceType;
    }

    public ListPluginsRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListPluginsRequest setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

    public ListPluginsRequest setIncludeBuiltinAiGateway(Boolean includeBuiltinAiGateway) {
        this.includeBuiltinAiGateway = includeBuiltinAiGateway;
        return this;
    }
    public Boolean getIncludeBuiltinAiGateway() {
        return this.includeBuiltinAiGateway;
    }

    public ListPluginsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPluginsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPluginsRequest setPluginClassId(String pluginClassId) {
        this.pluginClassId = pluginClassId;
        return this;
    }
    public String getPluginClassId() {
        return this.pluginClassId;
    }

    public ListPluginsRequest setPluginClassName(String pluginClassName) {
        this.pluginClassName = pluginClassName;
        return this;
    }
    public String getPluginClassName() {
        return this.pluginClassName;
    }

    public ListPluginsRequest setWithAttachmentInfo(Boolean withAttachmentInfo) {
        this.withAttachmentInfo = withAttachmentInfo;
        return this;
    }
    public Boolean getWithAttachmentInfo() {
        return this.withAttachmentInfo;
    }

}

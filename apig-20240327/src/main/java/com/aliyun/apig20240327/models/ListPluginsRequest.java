// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPluginsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>api-cuip2pum1hksng6oni3g</p>
     */
    @NameInMap("attachResourceId")
    public String attachResourceId;

    /**
     * <strong>example:</strong>
     * <p>HttpApi</p>
     */
    @NameInMap("attachResourceType")
    public String attachResourceType;

    /**
     * <strong>example:</strong>
     * <p>gw-csrhgn6m1hkt65qbxxgg</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <strong>example:</strong>
     * <p>AI</p>
     */
    @NameInMap("gatewayType")
    public String gatewayType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>pls-dn82a9djd8z****</p>
     */
    @NameInMap("pluginClassId")
    public String pluginClassId;

    /**
     * <strong>example:</strong>
     * <p>key-auth</p>
     */
    @NameInMap("pluginClassName")
    public String pluginClassName;

    /**
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPluginAttachmentsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>hr-cv2h58em1hkg7c6vt43g</p>
     */
    @NameInMap("attachResourceId")
    public String attachResourceId;

    /**
     * <strong>example:</strong>
     * <p>GatewayRoute</p>
     */
    @NameInMap("attachResourceType")
    public String attachResourceType;

    /**
     * <strong>example:</strong>
     * <p>GatewayRoute</p>
     */
    @NameInMap("attachResourceTypes")
    public String attachResourceTypes;

    /**
     * <strong>example:</strong>
     * <p>env-crlnqhtlhtgqflkqislg</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <strong>example:</strong>
     * <p>gw-cr79f75lhtgme744084g</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

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
     * <p>pl-ct8181um1hkiqns9f6e0</p>
     */
    @NameInMap("pluginId")
    public String pluginId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("withParentResource")
    public Boolean withParentResource;

    public static ListPluginAttachmentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPluginAttachmentsRequest self = new ListPluginAttachmentsRequest();
        return TeaModel.build(map, self);
    }

    public ListPluginAttachmentsRequest setAttachResourceId(String attachResourceId) {
        this.attachResourceId = attachResourceId;
        return this;
    }
    public String getAttachResourceId() {
        return this.attachResourceId;
    }

    public ListPluginAttachmentsRequest setAttachResourceType(String attachResourceType) {
        this.attachResourceType = attachResourceType;
        return this;
    }
    public String getAttachResourceType() {
        return this.attachResourceType;
    }

    public ListPluginAttachmentsRequest setAttachResourceTypes(String attachResourceTypes) {
        this.attachResourceTypes = attachResourceTypes;
        return this;
    }
    public String getAttachResourceTypes() {
        return this.attachResourceTypes;
    }

    public ListPluginAttachmentsRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public ListPluginAttachmentsRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListPluginAttachmentsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPluginAttachmentsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPluginAttachmentsRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public ListPluginAttachmentsRequest setWithParentResource(Boolean withParentResource) {
        this.withParentResource = withParentResource;
        return this;
    }
    public Boolean getWithParentResource() {
        return this.withParentResource;
    }

}

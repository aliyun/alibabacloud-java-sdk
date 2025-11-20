// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPluginAttachmentsRequest extends TeaModel {
    /**
     * <p>The resource attachment ID.</p>
     * 
     * <strong>example:</strong>
     * <p>hr-cv2h58em1hkg7c6vt43g</p>
     */
    @NameInMap("attachResourceId")
    public String attachResourceId;

    /**
     * <p>The resource attachment type (not yet in use).</p>
     * 
     * <strong>example:</strong>
     * <p>GatewayRoute</p>
     */
    @NameInMap("attachResourceType")
    public String attachResourceType;

    /**
     * <p>The resource attachment types, separated by commas.</p>
     * 
     * <strong>example:</strong>
     * <p>GatewayRoute</p>
     */
    @NameInMap("attachResourceTypes")
    public String attachResourceTypes;

    /**
     * <p>The environment ID.</p>
     * 
     * <strong>example:</strong>
     * <p>env-crlnqhtlhtgqflkqislg</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <p>The gateway ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-cr79f75lhtgme744084g</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The page number to return. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The plug-in ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pl-ct8181um1hkiqns9f6e0</p>
     */
    @NameInMap("pluginId")
    public String pluginId;

    /**
     * <p>Specifies whether to return parent resource attachments.</p>
     * 
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

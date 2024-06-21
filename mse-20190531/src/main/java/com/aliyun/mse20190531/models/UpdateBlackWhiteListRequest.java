// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateBlackWhiteListRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The content of the blacklist.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.2.11</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The unique ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-c70622ff52fe49beb29bea9a6f52****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The ID of the blacklist.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Specifies whether to enable the whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsWhite")
    public Boolean isWhite;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a note</p>
     */
    @NameInMap("Note")
    public String note;

    /**
     * <p>The resource IDs in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>[123]</p>
     */
    @NameInMap("ResourceIdJsonList")
    public String resourceIdJsonList;

    /**
     * <p>The type of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>GATEWAY</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>Specifies whether to enable the blacklist or whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The type of the blacklist or whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>IP</p>
     */
    @NameInMap("Type")
    public String type;

    public static UpdateBlackWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBlackWhiteListRequest self = new UpdateBlackWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBlackWhiteListRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateBlackWhiteListRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateBlackWhiteListRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateBlackWhiteListRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateBlackWhiteListRequest setIsWhite(Boolean isWhite) {
        this.isWhite = isWhite;
        return this;
    }
    public Boolean getIsWhite() {
        return this.isWhite;
    }

    public UpdateBlackWhiteListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateBlackWhiteListRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public UpdateBlackWhiteListRequest setResourceIdJsonList(String resourceIdJsonList) {
        this.resourceIdJsonList = resourceIdJsonList;
        return this;
    }
    public String getResourceIdJsonList() {
        return this.resourceIdJsonList;
    }

    public UpdateBlackWhiteListRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UpdateBlackWhiteListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateBlackWhiteListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

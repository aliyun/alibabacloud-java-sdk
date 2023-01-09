// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateBlackWhiteListRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The content of the blacklist.
    @NameInMap("Content")
    public String content;

    // The unique ID of the gateway.
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    // The ID of the blacklist.
    @NameInMap("Id")
    public Long id;

    // Specifies whether to modify the whitelist.
    @NameInMap("IsWhite")
    public Boolean isWhite;

    // The name.
    @NameInMap("Name")
    public String name;

    // The description.
    @NameInMap("Note")
    public String note;

    // The resource IDs in the JSON format.
    @NameInMap("ResourceIdJsonList")
    public String resourceIdJsonList;

    // The type of the resource.
    @NameInMap("ResourceType")
    public String resourceType;

    // Specifies whether to enable the blacklist or whitelist.
    @NameInMap("Status")
    public String status;

    // The type of the blacklist or whitelist.
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

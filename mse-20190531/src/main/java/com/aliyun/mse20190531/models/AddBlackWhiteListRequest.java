// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddBlackWhiteListRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The content of the blacklist.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The unique ID of the gateway.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The whitelist. Default value: No.</p>
     */
    @NameInMap("IsWhite")
    public Boolean isWhite;

    /**
     * <p>The name.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The description.</p>
     */
    @NameInMap("Note")
    public String note;

    /**
     * <p>The resource IDs in the JSON format.</p>
     */
    @NameInMap("ResourceIdJsonList")
    public String resourceIdJsonList;

    /**
     * <p>The effective scope of the blacklist or whitelist. Valid values:</p>
     * <br>
     * <p>*   GATEWAY</p>
     * <p>*   DOMAIN</p>
     * <p>*   ROUTE</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The status of the blacklist.</p>
     * <br>
     * <p>*   on: enabled</p>
     * <p>*   off: disabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The type of object in the blacklist or whitelist.</p>
     */
    @NameInMap("Type")
    public String type;

    public static AddBlackWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBlackWhiteListRequest self = new AddBlackWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public AddBlackWhiteListRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public AddBlackWhiteListRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public AddBlackWhiteListRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public AddBlackWhiteListRequest setIsWhite(Boolean isWhite) {
        this.isWhite = isWhite;
        return this;
    }
    public Boolean getIsWhite() {
        return this.isWhite;
    }

    public AddBlackWhiteListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddBlackWhiteListRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public AddBlackWhiteListRequest setResourceIdJsonList(String resourceIdJsonList) {
        this.resourceIdJsonList = resourceIdJsonList;
        return this;
    }
    public String getResourceIdJsonList() {
        return this.resourceIdJsonList;
    }

    public AddBlackWhiteListRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public AddBlackWhiteListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AddBlackWhiteListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

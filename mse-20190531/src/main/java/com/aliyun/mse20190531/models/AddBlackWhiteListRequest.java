// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddBlackWhiteListRequest extends TeaModel {
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
     * <p>1.117.115.51</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The unique ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-0fe488252dc44d55a9dd57875193****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The whitelist. Default value: No.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
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
     * <p>The effective scope of the blacklist or whitelist. Valid values:</p>
     * <ul>
     * <li>GATEWAY</li>
     * <li>DOMAIN</li>
     * <li>ROUTE</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GATEWAY</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The status of the blacklist.</p>
     * <ul>
     * <li>on: enabled</li>
     * <li>off: disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The type of object in the blacklist or whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>IP</p>
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

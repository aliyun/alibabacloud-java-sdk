// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddAuthResourceShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the authorization record.</p>
     */
    @NameInMap("AuthId")
    public Long authId;

    @NameInMap("AuthResourceHeaderList")
    public String authResourceHeaderListShrink;

    /**
     * <p>The domain ID.</p>
     */
    @NameInMap("DomainId")
    public Long domainId;

    /**
     * <p>The unique ID of the gateway.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    @NameInMap("IgnoreCase")
    public Boolean ignoreCase;

    /**
     * <p>The matching type.</p>
     * <br>
     * <p>*   exact: exact matching</p>
     * <p>*   prefix: prefix matching</p>
     * <p>*   regex: regular expression matching</p>
     */
    @NameInMap("MatchType")
    public String matchType;

    /**
     * <p>The path.</p>
     */
    @NameInMap("Path")
    public String path;

    public static AddAuthResourceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAuthResourceShrinkRequest self = new AddAuthResourceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddAuthResourceShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public AddAuthResourceShrinkRequest setAuthId(Long authId) {
        this.authId = authId;
        return this;
    }
    public Long getAuthId() {
        return this.authId;
    }

    public AddAuthResourceShrinkRequest setAuthResourceHeaderListShrink(String authResourceHeaderListShrink) {
        this.authResourceHeaderListShrink = authResourceHeaderListShrink;
        return this;
    }
    public String getAuthResourceHeaderListShrink() {
        return this.authResourceHeaderListShrink;
    }

    public AddAuthResourceShrinkRequest setDomainId(Long domainId) {
        this.domainId = domainId;
        return this;
    }
    public Long getDomainId() {
        return this.domainId;
    }

    public AddAuthResourceShrinkRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public AddAuthResourceShrinkRequest setIgnoreCase(Boolean ignoreCase) {
        this.ignoreCase = ignoreCase;
        return this;
    }
    public Boolean getIgnoreCase() {
        return this.ignoreCase;
    }

    public AddAuthResourceShrinkRequest setMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }
    public String getMatchType() {
        return this.matchType;
    }

    public AddAuthResourceShrinkRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

}

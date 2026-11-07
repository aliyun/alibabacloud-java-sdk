// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddAuthResourceRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese.</li>
     * <li>en: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The authorization ID.</p>
     * 
     * <strong>example:</strong>
     * <p>13</p>
     */
    @NameInMap("AuthId")
    public Long authId;

    /**
     * <p>The list of authentication resource headers.</p>
     */
    @NameInMap("AuthResourceHeaderList")
    public java.util.List<AddAuthResourceRequestAuthResourceHeaderList> authResourceHeaderList;

    /**
     * <p>The domain name ID.</p>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("DomainId")
    public Long domainId;

    /**
     * <p>The unique gateway ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-86575c0bc9f04ecfbacb92b8e392****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>Specifies whether to ignore case. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IgnoreCase")
    public Boolean ignoreCase;

    /**
     * <p>The match type. Valid values:</p>
     * <ul>
     * <li>EQUAL: Exact match.</li>
     * <li>PRE: Prefix match.</li>
     * <li>ERGULAR: Regular expression match.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRE</p>
     */
    @NameInMap("MatchType")
    public String matchType;

    /**
     * <p>The path.</p>
     * 
     * <strong>example:</strong>
     * <p>/abc</p>
     */
    @NameInMap("Path")
    public String path;

    public static AddAuthResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAuthResourceRequest self = new AddAuthResourceRequest();
        return TeaModel.build(map, self);
    }

    public AddAuthResourceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public AddAuthResourceRequest setAuthId(Long authId) {
        this.authId = authId;
        return this;
    }
    public Long getAuthId() {
        return this.authId;
    }

    public AddAuthResourceRequest setAuthResourceHeaderList(java.util.List<AddAuthResourceRequestAuthResourceHeaderList> authResourceHeaderList) {
        this.authResourceHeaderList = authResourceHeaderList;
        return this;
    }
    public java.util.List<AddAuthResourceRequestAuthResourceHeaderList> getAuthResourceHeaderList() {
        return this.authResourceHeaderList;
    }

    public AddAuthResourceRequest setDomainId(Long domainId) {
        this.domainId = domainId;
        return this;
    }
    public Long getDomainId() {
        return this.domainId;
    }

    public AddAuthResourceRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public AddAuthResourceRequest setIgnoreCase(Boolean ignoreCase) {
        this.ignoreCase = ignoreCase;
        return this;
    }
    public Boolean getIgnoreCase() {
        return this.ignoreCase;
    }

    public AddAuthResourceRequest setMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }
    public String getMatchType() {
        return this.matchType;
    }

    public AddAuthResourceRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public static class AddAuthResourceRequestAuthResourceHeaderList extends TeaModel {
        /**
         * <p>The HTTP header parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Access-Control-Allow-Origin</p>
         */
        @NameInMap("HeaderKey")
        public String headerKey;

        /**
         * <p>The header match method.</p>
         * 
         * <strong>example:</strong>
         * <p>EQUAL</p>
         */
        @NameInMap("HeaderMethod")
        public String headerMethod;

        /**
         * <p>The value of the HTTP header parameter.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("HeaderValue")
        public String headerValue;

        public static AddAuthResourceRequestAuthResourceHeaderList build(java.util.Map<String, ?> map) throws Exception {
            AddAuthResourceRequestAuthResourceHeaderList self = new AddAuthResourceRequestAuthResourceHeaderList();
            return TeaModel.build(map, self);
        }

        public AddAuthResourceRequestAuthResourceHeaderList setHeaderKey(String headerKey) {
            this.headerKey = headerKey;
            return this;
        }
        public String getHeaderKey() {
            return this.headerKey;
        }

        public AddAuthResourceRequestAuthResourceHeaderList setHeaderMethod(String headerMethod) {
            this.headerMethod = headerMethod;
            return this;
        }
        public String getHeaderMethod() {
            return this.headerMethod;
        }

        public AddAuthResourceRequestAuthResourceHeaderList setHeaderValue(String headerValue) {
            this.headerValue = headerValue;
            return this;
        }
        public String getHeaderValue() {
            return this.headerValue;
        }

    }

}

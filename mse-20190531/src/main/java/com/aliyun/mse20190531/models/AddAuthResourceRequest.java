// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddAuthResourceRequest extends TeaModel {
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

    /**
     * <p>The authentication resource headers.</p>
     */
    @NameInMap("AuthResourceHeaderList")
    public java.util.List<AddAuthResourceRequestAuthResourceHeaderList> authResourceHeaderList;

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

    /**
     * <p>Specifies whether the matching is not case-sensitive. Default value: true.</p>
     */
    @NameInMap("IgnoreCase")
    public Boolean ignoreCase;

    /**
     * <p>The matching type. Valid values:</p>
     * <br>
     * <p>*   EQUAL</p>
     * <p>*   PRE</p>
     * <p>*   ERGULAR</p>
     */
    @NameInMap("MatchType")
    public String matchType;

    /**
     * <p>The path.</p>
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
         * <p>The parameter of the HTTP header.</p>
         */
        @NameInMap("HeaderKey")
        public String headerKey;

        /**
         * <p>The header matching mode.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   SUFFIX</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   EXIST</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   PREFIX</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   EQUAL</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   EXCLUDE</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   NOT_EQUAL</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   NOT_EXIST</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   REGREX</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   INCLUDE</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("HeaderMethod")
        public String headerMethod;

        /**
         * <p>The parameter value of the HTTP header.</p>
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

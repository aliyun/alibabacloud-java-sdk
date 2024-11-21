// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetSiteCustomLogResponseBody extends TeaModel {
    /**
     * <p>The ID of the custom log field configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>6befa4aa-2a94-4f51-a245-295787192d2c</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>Indicates whether the custom configuration exists.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsExist")
    public Boolean isExist;

    /**
     * <p>The custom fields.</p>
     */
    @NameInMap("LogCustomField")
    public GetSiteCustomLogResponseBodyLogCustomField logCustomField;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6befa4aa-2a94-4f51-a245-295787192d2c</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The website ID.</p>
     * 
     * <strong>example:</strong>
     * <p>167026711***</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static GetSiteCustomLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSiteCustomLogResponseBody self = new GetSiteCustomLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSiteCustomLogResponseBody setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public GetSiteCustomLogResponseBody setIsExist(Boolean isExist) {
        this.isExist = isExist;
        return this;
    }
    public Boolean getIsExist() {
        return this.isExist;
    }

    public GetSiteCustomLogResponseBody setLogCustomField(GetSiteCustomLogResponseBodyLogCustomField logCustomField) {
        this.logCustomField = logCustomField;
        return this;
    }
    public GetSiteCustomLogResponseBodyLogCustomField getLogCustomField() {
        return this.logCustomField;
    }

    public GetSiteCustomLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSiteCustomLogResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public static class GetSiteCustomLogResponseBodyLogCustomField extends TeaModel {
        /**
         * <p>The cookie fields.</p>
         */
        @NameInMap("Cookies")
        public java.util.List<String> cookies;

        /**
         * <p>The request header fields.</p>
         */
        @NameInMap("RequestHeaders")
        public java.util.List<String> requestHeaders;

        /**
         * <p>The response header fields.</p>
         */
        @NameInMap("ResponseHeaders")
        public java.util.List<String> responseHeaders;

        public static GetSiteCustomLogResponseBodyLogCustomField build(java.util.Map<String, ?> map) throws Exception {
            GetSiteCustomLogResponseBodyLogCustomField self = new GetSiteCustomLogResponseBodyLogCustomField();
            return TeaModel.build(map, self);
        }

        public GetSiteCustomLogResponseBodyLogCustomField setCookies(java.util.List<String> cookies) {
            this.cookies = cookies;
            return this;
        }
        public java.util.List<String> getCookies() {
            return this.cookies;
        }

        public GetSiteCustomLogResponseBodyLogCustomField setRequestHeaders(java.util.List<String> requestHeaders) {
            this.requestHeaders = requestHeaders;
            return this;
        }
        public java.util.List<String> getRequestHeaders() {
            return this.requestHeaders;
        }

        public GetSiteCustomLogResponseBodyLogCustomField setResponseHeaders(java.util.List<String> responseHeaders) {
            this.responseHeaders = responseHeaders;
            return this;
        }
        public java.util.List<String> getResponseHeaders() {
            return this.responseHeaders;
        }

    }

}

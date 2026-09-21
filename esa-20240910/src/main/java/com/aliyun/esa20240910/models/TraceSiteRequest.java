// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class TraceSiteRequest extends TeaModel {
    /**
     * <p>The HTTP request body.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;PlainText&quot;:&quot;bc58c54211db&quot;}</p>
     */
    @NameInMap("Body")
    public TraceSiteRequestBody body;

    /**
     * <p>The environment context. This parameter is optional.</p>
     */
    @NameInMap("Context")
    public TraceSiteRequestContext context;

    /**
     * <p>The cookie parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Cookies")
    public java.util.List<TraceSiteRequestCookies> cookies;

    /**
     * <p>The request headers.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Headers")
    public java.util.List<TraceSiteRequestHeaders> headers;

    /**
     * <p>The HTTP method.</p>
     * 
     * <strong>example:</strong>
     * <p>GET</p>
     */
    @NameInMap("Method")
    public String method;

    /**
     * <p>The HTTP protocol.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP/1.1</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The URL of the request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.com/test">http://example.com/test</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static TraceSiteRequest build(java.util.Map<String, ?> map) throws Exception {
        TraceSiteRequest self = new TraceSiteRequest();
        return TeaModel.build(map, self);
    }

    public TraceSiteRequest setBody(TraceSiteRequestBody body) {
        this.body = body;
        return this;
    }
    public TraceSiteRequestBody getBody() {
        return this.body;
    }

    public TraceSiteRequest setContext(TraceSiteRequestContext context) {
        this.context = context;
        return this;
    }
    public TraceSiteRequestContext getContext() {
        return this.context;
    }

    public TraceSiteRequest setCookies(java.util.List<TraceSiteRequestCookies> cookies) {
        this.cookies = cookies;
        return this;
    }
    public java.util.List<TraceSiteRequestCookies> getCookies() {
        return this.cookies;
    }

    public TraceSiteRequest setHeaders(java.util.List<TraceSiteRequestHeaders> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.List<TraceSiteRequestHeaders> getHeaders() {
        return this.headers;
    }

    public TraceSiteRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public TraceSiteRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public TraceSiteRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public static class TraceSiteRequestBody extends TeaModel {
        /**
         * <p>The content in JSON format. If both JSON format content and plain text content are specified, the JSON format content takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;request_id&quot;,&quot;3f809c32&quot;}</p>
         */
        @NameInMap("Json")
        public Object json;

        /**
         * <p>The plain text content.</p>
         * 
         * <strong>example:</strong>
         * <p>bc58c54211db</p>
         */
        @NameInMap("PlainText")
        public String plainText;

        public static TraceSiteRequestBody build(java.util.Map<String, ?> map) throws Exception {
            TraceSiteRequestBody self = new TraceSiteRequestBody();
            return TeaModel.build(map, self);
        }

        public TraceSiteRequestBody setJson(Object json) {
            this.json = json;
            return this;
        }
        public Object getJson() {
            return this.json;
        }

        public TraceSiteRequestBody setPlainText(String plainText) {
            this.plainText = plainText;
            return this;
        }
        public String getPlainText() {
            return this.plainText;
        }

    }

    public static class TraceSiteRequestContextGeoLocation extends TeaModel {
        /**
         * <p>The country/region code.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("CountryCode")
        public String countryCode;

        /**
         * <p>The Internet service provider (ISP) code. This parameter is valid only when the country or region is the Chinese mainland.</p>
         * 
         * <strong>example:</strong>
         * <p>100025</p>
         */
        @NameInMap("IspCode")
        public String ispCode;

        /**
         * <p>The region or province code. This parameter is valid only when the country or region is the Chinese mainland.</p>
         * 
         * <strong>example:</strong>
         * <p>CN-BJ</p>
         */
        @NameInMap("RegionCode")
        public String regionCode;

        public static TraceSiteRequestContextGeoLocation build(java.util.Map<String, ?> map) throws Exception {
            TraceSiteRequestContextGeoLocation self = new TraceSiteRequestContextGeoLocation();
            return TeaModel.build(map, self);
        }

        public TraceSiteRequestContextGeoLocation setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public TraceSiteRequestContextGeoLocation setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

        public TraceSiteRequestContextGeoLocation setRegionCode(String regionCode) {
            this.regionCode = regionCode;
            return this;
        }
        public String getRegionCode() {
            return this.regionCode;
        }

    }

    public static class TraceSiteRequestContext extends TeaModel {
        /**
         * <p>The simulated geolocation information.</p>
         */
        @NameInMap("GeoLocation")
        public TraceSiteRequestContextGeoLocation geoLocation;

        /**
         * <p>Specifies whether to skip the security challenge test.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SkipChallenge")
        public Boolean skipChallenge;

        public static TraceSiteRequestContext build(java.util.Map<String, ?> map) throws Exception {
            TraceSiteRequestContext self = new TraceSiteRequestContext();
            return TeaModel.build(map, self);
        }

        public TraceSiteRequestContext setGeoLocation(TraceSiteRequestContextGeoLocation geoLocation) {
            this.geoLocation = geoLocation;
            return this;
        }
        public TraceSiteRequestContextGeoLocation getGeoLocation() {
            return this.geoLocation;
        }

        public TraceSiteRequestContext setSkipChallenge(Boolean skipChallenge) {
            this.skipChallenge = skipChallenge;
            return this;
        }
        public Boolean getSkipChallenge() {
            return this.skipChallenge;
        }

    }

    public static class TraceSiteRequestCookies extends TeaModel {
        /**
         * <p>The cookie name.</p>
         * 
         * <strong>example:</strong>
         * <p>sessionId</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The cookie value.</p>
         * 
         * <strong>example:</strong>
         * <p>f9ca1f7d-15bb-4c60-ad99-71b8e3e4985b</p>
         */
        @NameInMap("Value")
        public String value;

        public static TraceSiteRequestCookies build(java.util.Map<String, ?> map) throws Exception {
            TraceSiteRequestCookies self = new TraceSiteRequestCookies();
            return TeaModel.build(map, self);
        }

        public TraceSiteRequestCookies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TraceSiteRequestCookies setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class TraceSiteRequestHeaders extends TeaModel {
        /**
         * <p>The HTTP request header name.</p>
         * 
         * <strong>example:</strong>
         * <p>User-Agent</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The HTTP request header value.</p>
         * 
         * <strong>example:</strong>
         * <p>trace-test</p>
         */
        @NameInMap("Value")
        public String value;

        public static TraceSiteRequestHeaders build(java.util.Map<String, ?> map) throws Exception {
            TraceSiteRequestHeaders self = new TraceSiteRequestHeaders();
            return TeaModel.build(map, self);
        }

        public TraceSiteRequestHeaders setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TraceSiteRequestHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

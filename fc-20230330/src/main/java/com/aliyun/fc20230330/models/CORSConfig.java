// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CORSConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("allowCredentials")
    public Boolean allowCredentials;

    /**
     * <strong>example:</strong>
     * <p>[&quot;Content-Type&quot;, &quot;Authorization&quot;]</p>
     */
    @NameInMap("allowHeaders")
    public java.util.List<String> allowHeaders;

    /**
     * <strong>example:</strong>
     * <p>[&quot;GET&quot;, &quot;POST&quot;, &quot;OPTIONS&quot;]</p>
     */
    @NameInMap("allowMethods")
    public java.util.List<String> allowMethods;

    /**
     * <strong>example:</strong>
     * <p>[&quot;<a href="https://example.com">https://example.com</a>&quot;, &quot;<a href="https://app.example.com%22%5D">https://app.example.com&quot;]</a></p>
     */
    @NameInMap("allowOrigins")
    public java.util.List<String> allowOrigins;

    /**
     * <strong>example:</strong>
     * <p>[&quot;X-Custom-Header&quot;]</p>
     */
    @NameInMap("exposeHeaders")
    public java.util.List<String> exposeHeaders;

    /**
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("maxAge")
    public Integer maxAge;

    public static CORSConfig build(java.util.Map<String, ?> map) throws Exception {
        CORSConfig self = new CORSConfig();
        return TeaModel.build(map, self);
    }

    public CORSConfig setAllowCredentials(Boolean allowCredentials) {
        this.allowCredentials = allowCredentials;
        return this;
    }
    public Boolean getAllowCredentials() {
        return this.allowCredentials;
    }

    public CORSConfig setAllowHeaders(java.util.List<String> allowHeaders) {
        this.allowHeaders = allowHeaders;
        return this;
    }
    public java.util.List<String> getAllowHeaders() {
        return this.allowHeaders;
    }

    public CORSConfig setAllowMethods(java.util.List<String> allowMethods) {
        this.allowMethods = allowMethods;
        return this;
    }
    public java.util.List<String> getAllowMethods() {
        return this.allowMethods;
    }

    public CORSConfig setAllowOrigins(java.util.List<String> allowOrigins) {
        this.allowOrigins = allowOrigins;
        return this;
    }
    public java.util.List<String> getAllowOrigins() {
        return this.allowOrigins;
    }

    public CORSConfig setExposeHeaders(java.util.List<String> exposeHeaders) {
        this.exposeHeaders = exposeHeaders;
        return this;
    }
    public java.util.List<String> getExposeHeaders() {
        return this.exposeHeaders;
    }

    public CORSConfig setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
        return this;
    }
    public Integer getMaxAge() {
        return this.maxAge;
    }

}

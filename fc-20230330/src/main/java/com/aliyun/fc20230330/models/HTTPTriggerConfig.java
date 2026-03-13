// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class HTTPTriggerConfig extends TeaModel {
    /**
     * <p>The authentication configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;JWKS&quot;:{&quot;foo&quot;:&quot;bar&quot;},&quot;TokenLookup&quot;:&quot;header:Authorization:Bearer,cookie:AuthorizationCookie&quot;,&quot;ClaimPassBy&quot;:&quot;query:uid:uid,header:name:name&quot;}</p>
     */
    @NameInMap("authConfig")
    public String authConfig;

    /**
     * <p>The authentication type. Valid values:</p>
     * <ul>
     * <li><strong>function</strong>: requires authentication.</li>
     * <li><strong>anonymous</strong>: does not require authentication.</li>
     * </ul>
     * <blockquote>
     * <p> The default value is <strong>function</strong></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>anonymous</p>
     */
    @NameInMap("authType")
    public String authType;

    @NameInMap("corsConfig")
    public CORSConfig corsConfig;

    /**
     * <p>Specifies whether to disable access to the default Internet domain. If you set this parameter to true, a 403 error is returned if you access the default public URL provided by the function. A value of false does not have affect the running of the function.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("disableURLInternet")
    public Boolean disableURLInternet;

    /**
     * <p>The list of request methods. Multiple methods are supported.</p>
     */
    @NameInMap("methods")
    public java.util.List<String> methods;

    public static HTTPTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
        HTTPTriggerConfig self = new HTTPTriggerConfig();
        return TeaModel.build(map, self);
    }

    public HTTPTriggerConfig setAuthConfig(String authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public String getAuthConfig() {
        return this.authConfig;
    }

    public HTTPTriggerConfig setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public HTTPTriggerConfig setCorsConfig(CORSConfig corsConfig) {
        this.corsConfig = corsConfig;
        return this;
    }
    public CORSConfig getCorsConfig() {
        return this.corsConfig;
    }

    public HTTPTriggerConfig setDisableURLInternet(Boolean disableURLInternet) {
        this.disableURLInternet = disableURLInternet;
        return this;
    }
    public Boolean getDisableURLInternet() {
        return this.disableURLInternet;
    }

    public HTTPTriggerConfig setMethods(java.util.List<String> methods) {
        this.methods = methods;
        return this;
    }
    public java.util.List<String> getMethods() {
        return this.methods;
    }

}

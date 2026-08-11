// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class AuthInfoConfigValue extends TeaModel {
    /**
     * <p>The credential.</p>
     * 
     * <strong>example:</strong>
     * <p>token-xxx</p>
     */
    @NameInMap("AuthToken")
    public String authToken;

    /**
     * <p>The private domain name.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx">https://xxx</a></p>
     */
    @NameInMap("PrivateDomain")
    public String privateDomain;

    /**
     * <p>The project space.</p>
     * 
     * <strong>example:</strong>
     * <p>proj-xxx</p>
     */
    @NameInMap("Project")
    public String project;

    /**
     * <p>The public domain name.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx">https://xxx</a></p>
     */
    @NameInMap("PublicDomain")
    public String publicDomain;

    public static AuthInfoConfigValue build(java.util.Map<String, ?> map) throws Exception {
        AuthInfoConfigValue self = new AuthInfoConfigValue();
        return TeaModel.build(map, self);
    }

    public AuthInfoConfigValue setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AuthInfoConfigValue setPrivateDomain(String privateDomain) {
        this.privateDomain = privateDomain;
        return this;
    }
    public String getPrivateDomain() {
        return this.privateDomain;
    }

    public AuthInfoConfigValue setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public AuthInfoConfigValue setPublicDomain(String publicDomain) {
        this.publicDomain = publicDomain;
        return this;
    }
    public String getPublicDomain() {
        return this.publicDomain;
    }

}

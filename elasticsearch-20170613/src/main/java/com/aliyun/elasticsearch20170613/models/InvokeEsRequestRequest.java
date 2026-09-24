// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InvokeEsRequestRequest extends TeaModel {
    /**
     * <p>The request body passed through to ES. Set this parameter based on the requirements of the target ES API. This parameter is not required for calls such as GET that do not have a request body.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;query&quot;:{&quot;match_all&quot;:{}}}</p>
     */
    @NameInMap("body")
    public String body;

    /**
     * <p>The ID of the credential to use. If this parameter is not specified, the default credential of the instance is used.</p>
     * 
     * <strong>example:</strong>
     * <p>cred-7k2mq9xr4vbn</p>
     */
    @NameInMap("credentialId")
    public String credentialId;

    /**
     * <p>The HTTP method used to access ES. Default value: GET.</p>
     * 
     * <strong>example:</strong>
     * <p>GET</p>
     */
    @NameInMap("method")
    public String method;

    /**
     * <p>The ES path to access. This parameter is required. The leading / can be omitted.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>_cat/indices?format=json</p>
     */
    @NameInMap("path")
    public String path;

    /**
     * <p>Specifies whether to use the Alibaba Cloud ES system credential. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("system")
    public Boolean system;

    public static InvokeEsRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeEsRequestRequest self = new InvokeEsRequestRequest();
        return TeaModel.build(map, self);
    }

    public InvokeEsRequestRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public InvokeEsRequestRequest setCredentialId(String credentialId) {
        this.credentialId = credentialId;
        return this;
    }
    public String getCredentialId() {
        return this.credentialId;
    }

    public InvokeEsRequestRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public InvokeEsRequestRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public InvokeEsRequestRequest setSystem(Boolean system) {
        this.system = system;
        return this;
    }
    public Boolean getSystem() {
        return this.system;
    }

}

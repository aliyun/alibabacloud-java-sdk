// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class SessionNetworkRuleTransform extends TeaModel {
    /**
     * <p>The list of rules for replacing placeholders in HTTP header values before the request is forwarded to the matched host.</p>
     */
    @NameInMap("headerValueReplacements")
    public java.util.List<SessionNetworkHeaderValueReplacement> headerValueReplacements;

    /**
     * <p>The HTTP headers injected or overwritten before the request is forwarded to the matched host. Header values are returned in plaintext in GetSession and ListSessions.</p>
     */
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    public static SessionNetworkRuleTransform build(java.util.Map<String, ?> map) throws Exception {
        SessionNetworkRuleTransform self = new SessionNetworkRuleTransform();
        return TeaModel.build(map, self);
    }

    public SessionNetworkRuleTransform setHeaderValueReplacements(java.util.List<SessionNetworkHeaderValueReplacement> headerValueReplacements) {
        this.headerValueReplacements = headerValueReplacements;
        return this;
    }
    public java.util.List<SessionNetworkHeaderValueReplacement> getHeaderValueReplacements() {
        return this.headerValueReplacements;
    }

    public SessionNetworkRuleTransform setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}

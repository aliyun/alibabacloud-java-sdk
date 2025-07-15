// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class QuerySnapshotCallbackAuthResponseBody extends TeaModel {
    /**
     * <p>The callback authentication key.</p>
     * 
     * <strong>example:</strong>
     * <p>yourkey</p>
     */
    @NameInMap("CallbackAuthKey")
    public String callbackAuthKey;

    /**
     * <p>Indicates whether callback authentication is enabled. Valid values:</p>
     * <ul>
     * <li><strong>yes</strong>: Callback authentication is enabled.</li>
     * <li><strong>no</strong>: Callback authentication is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>yes</p>
     */
    @NameInMap("CallbackReqAuth")
    public String callbackReqAuth;

    /**
     * <p>The main streaming domain.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QuerySnapshotCallbackAuthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySnapshotCallbackAuthResponseBody self = new QuerySnapshotCallbackAuthResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySnapshotCallbackAuthResponseBody setCallbackAuthKey(String callbackAuthKey) {
        this.callbackAuthKey = callbackAuthKey;
        return this;
    }
    public String getCallbackAuthKey() {
        return this.callbackAuthKey;
    }

    public QuerySnapshotCallbackAuthResponseBody setCallbackReqAuth(String callbackReqAuth) {
        this.callbackReqAuth = callbackReqAuth;
        return this;
    }
    public String getCallbackReqAuth() {
        return this.callbackReqAuth;
    }

    public QuerySnapshotCallbackAuthResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public QuerySnapshotCallbackAuthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

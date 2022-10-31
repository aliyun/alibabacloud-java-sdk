// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class QuerySnapshotCallbackAuthResponseBody extends TeaModel {
    @NameInMap("CallbackAuthKey")
    public String callbackAuthKey;

    @NameInMap("CallbackReqAuth")
    public String callbackReqAuth;

    @NameInMap("DomainName")
    public String domainName;

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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationGrantScopeResponseBody extends TeaModel {
    @NameInMap("ApplicationGrantScope")
    public GetApplicationGrantScopeResponseBodyApplicationGrantScope applicationGrantScope;

    @NameInMap("RequestId")
    public String requestId;

    public static GetApplicationGrantScopeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationGrantScopeResponseBody self = new GetApplicationGrantScopeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationGrantScopeResponseBody setApplicationGrantScope(GetApplicationGrantScopeResponseBodyApplicationGrantScope applicationGrantScope) {
        this.applicationGrantScope = applicationGrantScope;
        return this;
    }
    public GetApplicationGrantScopeResponseBodyApplicationGrantScope getApplicationGrantScope() {
        return this.applicationGrantScope;
    }

    public GetApplicationGrantScopeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetApplicationGrantScopeResponseBodyApplicationGrantScope extends TeaModel {
        /**
         * <p>应用授权的api权限scope列表</p>
         */
        @NameInMap("GrantScopes")
        public java.util.List<String> grantScopes;

        public static GetApplicationGrantScopeResponseBodyApplicationGrantScope build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationGrantScopeResponseBodyApplicationGrantScope self = new GetApplicationGrantScopeResponseBodyApplicationGrantScope();
            return TeaModel.build(map, self);
        }

        public GetApplicationGrantScopeResponseBodyApplicationGrantScope setGrantScopes(java.util.List<String> grantScopes) {
            this.grantScopes = grantScopes;
            return this;
        }
        public java.util.List<String> getGrantScopes() {
            return this.grantScopes;
        }

    }

}

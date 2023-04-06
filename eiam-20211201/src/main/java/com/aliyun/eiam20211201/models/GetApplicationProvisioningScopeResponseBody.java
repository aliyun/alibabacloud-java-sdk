// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationProvisioningScopeResponseBody extends TeaModel {
    @NameInMap("ApplicationProvisioningScope")
    public GetApplicationProvisioningScopeResponseBodyApplicationProvisioningScope applicationProvisioningScope;

    @NameInMap("RequestId")
    public String requestId;

    public static GetApplicationProvisioningScopeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationProvisioningScopeResponseBody self = new GetApplicationProvisioningScopeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationProvisioningScopeResponseBody setApplicationProvisioningScope(GetApplicationProvisioningScopeResponseBodyApplicationProvisioningScope applicationProvisioningScope) {
        this.applicationProvisioningScope = applicationProvisioningScope;
        return this;
    }
    public GetApplicationProvisioningScopeResponseBodyApplicationProvisioningScope getApplicationProvisioningScope() {
        return this.applicationProvisioningScope;
    }

    public GetApplicationProvisioningScopeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetApplicationProvisioningScopeResponseBodyApplicationProvisioningScope extends TeaModel {
        /**
         * <p>同步授权的组织机构列表</p>
         */
        @NameInMap("OrganizationalUnitIds")
        public java.util.List<String> organizationalUnitIds;

        public static GetApplicationProvisioningScopeResponseBodyApplicationProvisioningScope build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationProvisioningScopeResponseBodyApplicationProvisioningScope self = new GetApplicationProvisioningScopeResponseBodyApplicationProvisioningScope();
            return TeaModel.build(map, self);
        }

        public GetApplicationProvisioningScopeResponseBodyApplicationProvisioningScope setOrganizationalUnitIds(java.util.List<String> organizationalUnitIds) {
            this.organizationalUnitIds = organizationalUnitIds;
            return this;
        }
        public java.util.List<String> getOrganizationalUnitIds() {
            return this.organizationalUnitIds;
        }

    }

}

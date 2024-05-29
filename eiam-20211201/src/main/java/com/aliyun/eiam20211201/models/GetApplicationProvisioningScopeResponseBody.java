// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationProvisioningScopeResponseBody extends TeaModel {
    /**
     * <p>The scope of account synchronization.</p>
     */
    @NameInMap("ApplicationProvisioningScope")
    public GetApplicationProvisioningScopeResponseBodyApplicationProvisioningScope applicationProvisioningScope;

    /**
     * <p>The ID of the request.</p>
     */
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
         * <p>同步授权的组列表</p>
         */
        @NameInMap("GroupIds")
        public java.util.List<String> groupIds;

        /**
         * <p>租户最大授权主体quota数量</p>
         */
        @NameInMap("MaxQuota")
        public Integer maxQuota;

        /**
         * <p>The list of organizational units that are authorized for account synchronization.</p>
         */
        @NameInMap("OrganizationalUnitIds")
        public java.util.List<String> organizationalUnitIds;

        /**
         * <p>已使用授权主体quota数量</p>
         */
        @NameInMap("UsedQuota")
        public Integer usedQuota;

        public static GetApplicationProvisioningScopeResponseBodyApplicationProvisioningScope build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationProvisioningScopeResponseBodyApplicationProvisioningScope self = new GetApplicationProvisioningScopeResponseBodyApplicationProvisioningScope();
            return TeaModel.build(map, self);
        }

        public GetApplicationProvisioningScopeResponseBodyApplicationProvisioningScope setGroupIds(java.util.List<String> groupIds) {
            this.groupIds = groupIds;
            return this;
        }
        public java.util.List<String> getGroupIds() {
            return this.groupIds;
        }

        public GetApplicationProvisioningScopeResponseBodyApplicationProvisioningScope setMaxQuota(Integer maxQuota) {
            this.maxQuota = maxQuota;
            return this;
        }
        public Integer getMaxQuota() {
            return this.maxQuota;
        }

        public GetApplicationProvisioningScopeResponseBodyApplicationProvisioningScope setOrganizationalUnitIds(java.util.List<String> organizationalUnitIds) {
            this.organizationalUnitIds = organizationalUnitIds;
            return this;
        }
        public java.util.List<String> getOrganizationalUnitIds() {
            return this.organizationalUnitIds;
        }

        public GetApplicationProvisioningScopeResponseBodyApplicationProvisioningScope setUsedQuota(Integer usedQuota) {
            this.usedQuota = usedQuota;
            return this;
        }
        public Integer getUsedQuota() {
            return this.usedQuota;
        }

    }

}

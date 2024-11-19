// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetInstanceIpWhiteListResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AuthAction&quot;:&quot;xxx&quot;,&quot;AuthPrincipalDisplayName&quot;:&quot;222&quot;,&quot;AuthPrincipalOwnerId&quot;:&quot;111&quot;,&quot;AuthPrincipalType&quot;:&quot;SubUser&quot;,,&quot;NoPermissionType&quot;:&quot;ImplicitDeny&quot;,&quot;PolicyType&quot;:&quot;AccountLevelIdentityBasedPolicy&quot;,&quot;EncodedDiagnosticMessage&quot;:&quot;xxxxxx&quot;}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The details about the IP address whitelists.</p>
     */
    @NameInMap("GroupList")
    public java.util.List<GetInstanceIpWhiteListResponseBodyGroupList> groupList;

    /**
     * <p>The ID of the Lindorm instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-bp1z3506imz2f****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The list of IP addresses in the whitelist of the instance.</p>
     */
    @NameInMap("IpList")
    public java.util.List<String> ipList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1D1F6F4D-9203-53E7-84E9-5376B4657E63</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceIpWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceIpWhiteListResponseBody self = new GetInstanceIpWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceIpWhiteListResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetInstanceIpWhiteListResponseBody setGroupList(java.util.List<GetInstanceIpWhiteListResponseBodyGroupList> groupList) {
        this.groupList = groupList;
        return this;
    }
    public java.util.List<GetInstanceIpWhiteListResponseBodyGroupList> getGroupList() {
        return this.groupList;
    }

    public GetInstanceIpWhiteListResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceIpWhiteListResponseBody setIpList(java.util.List<String> ipList) {
        this.ipList = ipList;
        return this;
    }
    public java.util.List<String> getIpList() {
        return this.ipList;
    }

    public GetInstanceIpWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceIpWhiteListResponseBodyGroupList extends TeaModel {
        /**
         * <p>The name of the IP address whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The IP addresses in the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24</p>
         */
        @NameInMap("SecurityIpList")
        public String securityIpList;

        public static GetInstanceIpWhiteListResponseBodyGroupList build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceIpWhiteListResponseBodyGroupList self = new GetInstanceIpWhiteListResponseBodyGroupList();
            return TeaModel.build(map, self);
        }

        public GetInstanceIpWhiteListResponseBodyGroupList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetInstanceIpWhiteListResponseBodyGroupList setSecurityIpList(String securityIpList) {
            this.securityIpList = securityIpList;
            return this;
        }
        public String getSecurityIpList() {
            return this.securityIpList;
        }

    }

}

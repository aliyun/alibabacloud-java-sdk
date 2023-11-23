// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetInstanceIpWhiteListResponseBody extends TeaModel {
    @NameInMap("GroupList")
    public java.util.List<GetInstanceIpWhiteListResponseBodyGroupList> groupList;

    /**
     * <p>The ID of the Lindorm instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IpList")
    public java.util.List<String> ipList;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceIpWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceIpWhiteListResponseBody self = new GetInstanceIpWhiteListResponseBody();
        return TeaModel.build(map, self);
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
        @NameInMap("GroupName")
        public String groupName;

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

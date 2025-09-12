// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormV2InstanceSecurityGroupsResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SgList")
    public java.util.List<GetLindormV2InstanceSecurityGroupsResponseBodySgList> sgList;

    public static GetLindormV2InstanceSecurityGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLindormV2InstanceSecurityGroupsResponseBody self = new GetLindormV2InstanceSecurityGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLindormV2InstanceSecurityGroupsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetLindormV2InstanceSecurityGroupsResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetLindormV2InstanceSecurityGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLindormV2InstanceSecurityGroupsResponseBody setSgList(java.util.List<GetLindormV2InstanceSecurityGroupsResponseBodySgList> sgList) {
        this.sgList = sgList;
        return this;
    }
    public java.util.List<GetLindormV2InstanceSecurityGroupsResponseBodySgList> getSgList() {
        return this.sgList;
    }

    public static class GetLindormV2InstanceSecurityGroupsResponseBodySgList extends TeaModel {
        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("IpList")
        public String ipList;

        @NameInMap("IsAvailable")
        public Boolean isAvailable;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        public static GetLindormV2InstanceSecurityGroupsResponseBodySgList build(java.util.Map<String, ?> map) throws Exception {
            GetLindormV2InstanceSecurityGroupsResponseBodySgList self = new GetLindormV2InstanceSecurityGroupsResponseBodySgList();
            return TeaModel.build(map, self);
        }

        public GetLindormV2InstanceSecurityGroupsResponseBodySgList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetLindormV2InstanceSecurityGroupsResponseBodySgList setIpList(String ipList) {
            this.ipList = ipList;
            return this;
        }
        public String getIpList() {
            return this.ipList;
        }

        public GetLindormV2InstanceSecurityGroupsResponseBodySgList setIsAvailable(Boolean isAvailable) {
            this.isAvailable = isAvailable;
            return this;
        }
        public Boolean getIsAvailable() {
            return this.isAvailable;
        }

        public GetLindormV2InstanceSecurityGroupsResponseBodySgList setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

}

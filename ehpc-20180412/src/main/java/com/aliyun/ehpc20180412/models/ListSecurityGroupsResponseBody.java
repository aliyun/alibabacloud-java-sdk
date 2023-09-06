// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListSecurityGroupsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The security group ID.</p>
     */
    @NameInMap("SecurityGroups")
    public ListSecurityGroupsResponseBodySecurityGroups securityGroups;

    /**
     * <p>The number of security groups.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSecurityGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityGroupsResponseBody self = new ListSecurityGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSecurityGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSecurityGroupsResponseBody setSecurityGroups(ListSecurityGroupsResponseBodySecurityGroups securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }
    public ListSecurityGroupsResponseBodySecurityGroups getSecurityGroups() {
        return this.securityGroups;
    }

    public ListSecurityGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSecurityGroupsResponseBodySecurityGroups extends TeaModel {
        @NameInMap("SecurityGroup")
        public java.util.List<String> securityGroup;

        public static ListSecurityGroupsResponseBodySecurityGroups build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityGroupsResponseBodySecurityGroups self = new ListSecurityGroupsResponseBodySecurityGroups();
            return TeaModel.build(map, self);
        }

        public ListSecurityGroupsResponseBodySecurityGroups setSecurityGroup(java.util.List<String> securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public java.util.List<String> getSecurityGroup() {
            return this.securityGroup;
        }

    }

}

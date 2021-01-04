// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityGroupIds")
    public DescribeSecurityGroupsResponseBodySecurityGroupIds securityGroupIds;

    public static DescribeSecurityGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityGroupsResponseBody self = new DescribeSecurityGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityGroupsResponseBody setSecurityGroupIds(DescribeSecurityGroupsResponseBodySecurityGroupIds securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public DescribeSecurityGroupsResponseBodySecurityGroupIds getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public static class DescribeSecurityGroupsResponseBodySecurityGroupIds extends TeaModel {
        @NameInMap("SecurityGroupId")
        public java.util.List<String> securityGroupId;

        public static DescribeSecurityGroupsResponseBodySecurityGroupIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupsResponseBodySecurityGroupIds self = new DescribeSecurityGroupsResponseBodySecurityGroupIds();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupIds setSecurityGroupId(java.util.List<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

}

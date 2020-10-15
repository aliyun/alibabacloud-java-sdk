// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("SecurityGroups")
    @Validation(required = true)
    public DescribeSecurityGroupsResponseSecurityGroups securityGroups;

    public static DescribeSecurityGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityGroupsResponse self = new DescribeSecurityGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityGroupsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityGroupsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeSecurityGroupsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSecurityGroupsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSecurityGroupsResponse setSecurityGroups(DescribeSecurityGroupsResponseSecurityGroups securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }
    public DescribeSecurityGroupsResponseSecurityGroups getSecurityGroups() {
        return this.securityGroups;
    }

    public static class DescribeSecurityGroupsResponseSecurityGroupsSecurityGroup extends TeaModel {
        @NameInMap("SecurityGroupId")
        @Validation(required = true)
        public String securityGroupId;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("SecurityGroupName")
        @Validation(required = true)
        public String securityGroupName;

        public static DescribeSecurityGroupsResponseSecurityGroupsSecurityGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupsResponseSecurityGroupsSecurityGroup self = new DescribeSecurityGroupsResponseSecurityGroupsSecurityGroup();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupsResponseSecurityGroupsSecurityGroup setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeSecurityGroupsResponseSecurityGroupsSecurityGroup setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeSecurityGroupsResponseSecurityGroupsSecurityGroup setSecurityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

    }

    public static class DescribeSecurityGroupsResponseSecurityGroups extends TeaModel {
        @NameInMap("SecurityGroup")
        @Validation(required = true)
        public java.util.List<DescribeSecurityGroupsResponseSecurityGroupsSecurityGroup> securityGroup;

        public static DescribeSecurityGroupsResponseSecurityGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupsResponseSecurityGroups self = new DescribeSecurityGroupsResponseSecurityGroups();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupsResponseSecurityGroups setSecurityGroup(java.util.List<DescribeSecurityGroupsResponseSecurityGroupsSecurityGroup> securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public java.util.List<DescribeSecurityGroupsResponseSecurityGroupsSecurityGroup> getSecurityGroup() {
            return this.securityGroup;
        }

    }

}

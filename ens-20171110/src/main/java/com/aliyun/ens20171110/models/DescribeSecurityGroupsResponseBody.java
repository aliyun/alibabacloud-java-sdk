// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupsResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details about security groups.</p>
     */
    @NameInMap("SecurityGroups")
    public DescribeSecurityGroupsResponseBodySecurityGroups securityGroups;

    /**
     * <p>The total number of returned pages.</p>
     * 
     * <strong>example:</strong>
     * <p>49</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSecurityGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityGroupsResponseBody self = new DescribeSecurityGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSecurityGroupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSecurityGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityGroupsResponseBody setSecurityGroups(DescribeSecurityGroupsResponseBodySecurityGroups securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }
    public DescribeSecurityGroupsResponseBodySecurityGroups getSecurityGroups() {
        return this.securityGroups;
    }

    public DescribeSecurityGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupInstanceIds extends TeaModel {
        @NameInMap("InstanceId")
        public java.util.List<String> instanceId;

        public static DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupInstanceIds self = new DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupInstanceIds setInstanceId(java.util.List<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupNetworkInterfaceIds extends TeaModel {
        @NameInMap("NetworkInterfaceId")
        public java.util.List<String> networkInterfaceId;

        public static DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupNetworkInterfaceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupNetworkInterfaceIds self = new DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupNetworkInterfaceIds();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupNetworkInterfaceIds setNetworkInterfaceId(java.util.List<String> networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public java.util.List<String> getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

    }

    public static class DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup extends TeaModel {
        /**
         * <p>The creation time. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-11-01T06:08:46Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>TestDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The number of associated instances.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        /**
         * <p>The list of instance IDs.</p>
         */
        @NameInMap("InstanceIds")
        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupInstanceIds instanceIds;

        /**
         * <p>The IDs of ENIs.</p>
         */
        @NameInMap("NetworkInterfaceIds")
        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupNetworkInterfaceIds networkInterfaceIds;

        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp67acfmxazb4ph***</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The name of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>DocTest</p>
         */
        @NameInMap("SecurityGroupName")
        public String securityGroupName;

        public static DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup self = new DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setInstanceIds(DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupInstanceIds instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupInstanceIds getInstanceIds() {
            return this.instanceIds;
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setNetworkInterfaceIds(DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupNetworkInterfaceIds networkInterfaceIds) {
            this.networkInterfaceIds = networkInterfaceIds;
            return this;
        }
        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroupNetworkInterfaceIds getNetworkInterfaceIds() {
            return this.networkInterfaceIds;
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup setSecurityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

    }

    public static class DescribeSecurityGroupsResponseBodySecurityGroups extends TeaModel {
        @NameInMap("SecurityGroup")
        public java.util.List<DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup> securityGroup;

        public static DescribeSecurityGroupsResponseBodySecurityGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupsResponseBodySecurityGroups self = new DescribeSecurityGroupsResponseBodySecurityGroups();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupsResponseBodySecurityGroups setSecurityGroup(java.util.List<DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup> securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public java.util.List<DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup> getSecurityGroup() {
            return this.securityGroup;
        }

    }

}

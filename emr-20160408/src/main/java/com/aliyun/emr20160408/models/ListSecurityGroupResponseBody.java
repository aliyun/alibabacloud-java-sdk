// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListSecurityGroupResponseBody extends TeaModel {
    @NameInMap("SecurityGroupList")
    public ListSecurityGroupResponseBodySecurityGroupList securityGroupList;

    @NameInMap("RequestId")
    public String requestId;

    public static ListSecurityGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityGroupResponseBody self = new ListSecurityGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSecurityGroupResponseBody setSecurityGroupList(ListSecurityGroupResponseBodySecurityGroupList securityGroupList) {
        this.securityGroupList = securityGroupList;
        return this;
    }
    public ListSecurityGroupResponseBodySecurityGroupList getSecurityGroupList() {
        return this.securityGroupList;
    }

    public ListSecurityGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSecurityGroupResponseBodySecurityGroupListSecurityGroup extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("SecurityGroupName")
        public String securityGroupName;

        @NameInMap("EcsCount")
        public Integer ecsCount;

        @NameInMap("SecurityGroupType")
        public String securityGroupType;

        @NameInMap("AvailableInstanceAmount")
        public Integer availableInstanceAmount;

        public static ListSecurityGroupResponseBodySecurityGroupListSecurityGroup build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityGroupResponseBodySecurityGroupListSecurityGroup self = new ListSecurityGroupResponseBodySecurityGroupListSecurityGroup();
            return TeaModel.build(map, self);
        }

        public ListSecurityGroupResponseBodySecurityGroupListSecurityGroup setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListSecurityGroupResponseBodySecurityGroupListSecurityGroup setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListSecurityGroupResponseBodySecurityGroupListSecurityGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSecurityGroupResponseBodySecurityGroupListSecurityGroup setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListSecurityGroupResponseBodySecurityGroupListSecurityGroup setSecurityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        public ListSecurityGroupResponseBodySecurityGroupListSecurityGroup setEcsCount(Integer ecsCount) {
            this.ecsCount = ecsCount;
            return this;
        }
        public Integer getEcsCount() {
            return this.ecsCount;
        }

        public ListSecurityGroupResponseBodySecurityGroupListSecurityGroup setSecurityGroupType(String securityGroupType) {
            this.securityGroupType = securityGroupType;
            return this;
        }
        public String getSecurityGroupType() {
            return this.securityGroupType;
        }

        public ListSecurityGroupResponseBodySecurityGroupListSecurityGroup setAvailableInstanceAmount(Integer availableInstanceAmount) {
            this.availableInstanceAmount = availableInstanceAmount;
            return this;
        }
        public Integer getAvailableInstanceAmount() {
            return this.availableInstanceAmount;
        }

    }

    public static class ListSecurityGroupResponseBodySecurityGroupList extends TeaModel {
        @NameInMap("SecurityGroup")
        public java.util.List<ListSecurityGroupResponseBodySecurityGroupListSecurityGroup> securityGroup;

        public static ListSecurityGroupResponseBodySecurityGroupList build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityGroupResponseBodySecurityGroupList self = new ListSecurityGroupResponseBodySecurityGroupList();
            return TeaModel.build(map, self);
        }

        public ListSecurityGroupResponseBodySecurityGroupList setSecurityGroup(java.util.List<ListSecurityGroupResponseBodySecurityGroupListSecurityGroup> securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public java.util.List<ListSecurityGroupResponseBodySecurityGroupListSecurityGroup> getSecurityGroup() {
            return this.securityGroup;
        }

    }

}

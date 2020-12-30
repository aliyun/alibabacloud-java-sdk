// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AvailableGroupList")
    public DescribeSecurityGroupAttributeResponseBodyAvailableGroupList availableGroupList;

    @NameInMap("SecurityGroupAttributeList")
    public DescribeSecurityGroupAttributeResponseBodySecurityGroupAttributeList securityGroupAttributeList;

    public static DescribeSecurityGroupAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityGroupAttributeResponseBody self = new DescribeSecurityGroupAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityGroupAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityGroupAttributeResponseBody setAvailableGroupList(DescribeSecurityGroupAttributeResponseBodyAvailableGroupList availableGroupList) {
        this.availableGroupList = availableGroupList;
        return this;
    }
    public DescribeSecurityGroupAttributeResponseBodyAvailableGroupList getAvailableGroupList() {
        return this.availableGroupList;
    }

    public DescribeSecurityGroupAttributeResponseBody setSecurityGroupAttributeList(DescribeSecurityGroupAttributeResponseBodySecurityGroupAttributeList securityGroupAttributeList) {
        this.securityGroupAttributeList = securityGroupAttributeList;
        return this;
    }
    public DescribeSecurityGroupAttributeResponseBodySecurityGroupAttributeList getSecurityGroupAttributeList() {
        return this.securityGroupAttributeList;
    }

    public static class DescribeSecurityGroupAttributeResponseBodyAvailableGroupListSecurityGroup extends TeaModel {
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

        @NameInMap("AvailableInstanceAmount")
        public Integer availableInstanceAmount;

        public static DescribeSecurityGroupAttributeResponseBodyAvailableGroupListSecurityGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupAttributeResponseBodyAvailableGroupListSecurityGroup self = new DescribeSecurityGroupAttributeResponseBodyAvailableGroupListSecurityGroup();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupAttributeResponseBodyAvailableGroupListSecurityGroup setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeSecurityGroupAttributeResponseBodyAvailableGroupListSecurityGroup setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeSecurityGroupAttributeResponseBodyAvailableGroupListSecurityGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSecurityGroupAttributeResponseBodyAvailableGroupListSecurityGroup setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeSecurityGroupAttributeResponseBodyAvailableGroupListSecurityGroup setSecurityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        public DescribeSecurityGroupAttributeResponseBodyAvailableGroupListSecurityGroup setEcsCount(Integer ecsCount) {
            this.ecsCount = ecsCount;
            return this;
        }
        public Integer getEcsCount() {
            return this.ecsCount;
        }

        public DescribeSecurityGroupAttributeResponseBodyAvailableGroupListSecurityGroup setAvailableInstanceAmount(Integer availableInstanceAmount) {
            this.availableInstanceAmount = availableInstanceAmount;
            return this;
        }
        public Integer getAvailableInstanceAmount() {
            return this.availableInstanceAmount;
        }

    }

    public static class DescribeSecurityGroupAttributeResponseBodyAvailableGroupList extends TeaModel {
        @NameInMap("SecurityGroup")
        public java.util.List<DescribeSecurityGroupAttributeResponseBodyAvailableGroupListSecurityGroup> securityGroup;

        public static DescribeSecurityGroupAttributeResponseBodyAvailableGroupList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupAttributeResponseBodyAvailableGroupList self = new DescribeSecurityGroupAttributeResponseBodyAvailableGroupList();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupAttributeResponseBodyAvailableGroupList setSecurityGroup(java.util.List<DescribeSecurityGroupAttributeResponseBodyAvailableGroupListSecurityGroup> securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public java.util.List<DescribeSecurityGroupAttributeResponseBodyAvailableGroupListSecurityGroup> getSecurityGroup() {
            return this.securityGroup;
        }

    }

    public static class DescribeSecurityGroupAttributeResponseBodySecurityGroupAttributeListSecurityGroupAttribute extends TeaModel {
        @NameInMap("BizContent")
        public String bizContent;

        @NameInMap("BizType")
        public String bizType;

        public static DescribeSecurityGroupAttributeResponseBodySecurityGroupAttributeListSecurityGroupAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupAttributeResponseBodySecurityGroupAttributeListSecurityGroupAttribute self = new DescribeSecurityGroupAttributeResponseBodySecurityGroupAttributeListSecurityGroupAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupAttributeResponseBodySecurityGroupAttributeListSecurityGroupAttribute setBizContent(String bizContent) {
            this.bizContent = bizContent;
            return this;
        }
        public String getBizContent() {
            return this.bizContent;
        }

        public DescribeSecurityGroupAttributeResponseBodySecurityGroupAttributeListSecurityGroupAttribute setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

    }

    public static class DescribeSecurityGroupAttributeResponseBodySecurityGroupAttributeList extends TeaModel {
        @NameInMap("SecurityGroupAttribute")
        public java.util.List<DescribeSecurityGroupAttributeResponseBodySecurityGroupAttributeListSecurityGroupAttribute> securityGroupAttribute;

        public static DescribeSecurityGroupAttributeResponseBodySecurityGroupAttributeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupAttributeResponseBodySecurityGroupAttributeList self = new DescribeSecurityGroupAttributeResponseBodySecurityGroupAttributeList();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupAttributeResponseBodySecurityGroupAttributeList setSecurityGroupAttribute(java.util.List<DescribeSecurityGroupAttributeResponseBodySecurityGroupAttributeListSecurityGroupAttribute> securityGroupAttribute) {
            this.securityGroupAttribute = securityGroupAttribute;
            return this;
        }
        public java.util.List<DescribeSecurityGroupAttributeResponseBodySecurityGroupAttributeListSecurityGroupAttribute> getSecurityGroupAttribute() {
            return this.securityGroupAttribute;
        }

    }

}

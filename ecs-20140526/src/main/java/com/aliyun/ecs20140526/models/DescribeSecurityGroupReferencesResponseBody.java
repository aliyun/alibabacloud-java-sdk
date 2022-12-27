// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupReferencesResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Details about the security groups that reference the specified security group.
    @NameInMap("SecurityGroupReferences")
    public DescribeSecurityGroupReferencesResponseBodySecurityGroupReferences securityGroupReferences;

    public static DescribeSecurityGroupReferencesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityGroupReferencesResponseBody self = new DescribeSecurityGroupReferencesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityGroupReferencesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityGroupReferencesResponseBody setSecurityGroupReferences(DescribeSecurityGroupReferencesResponseBodySecurityGroupReferences securityGroupReferences) {
        this.securityGroupReferences = securityGroupReferences;
        return this;
    }
    public DescribeSecurityGroupReferencesResponseBodySecurityGroupReferences getSecurityGroupReferences() {
        return this.securityGroupReferences;
    }

    public static class DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroupsReferencingSecurityGroup extends TeaModel {
        // The ID of the Alibaba Cloud account to which the security group belongs.
        @NameInMap("AliUid")
        public String aliUid;

        // The ID of the security group.
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        public static DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroupsReferencingSecurityGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroupsReferencingSecurityGroup self = new DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroupsReferencingSecurityGroup();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroupsReferencingSecurityGroup setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroupsReferencingSecurityGroup setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroups extends TeaModel {
        @NameInMap("ReferencingSecurityGroup")
        public java.util.List<DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroupsReferencingSecurityGroup> referencingSecurityGroup;

        public static DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroups self = new DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroups();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroups setReferencingSecurityGroup(java.util.List<DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroupsReferencingSecurityGroup> referencingSecurityGroup) {
            this.referencingSecurityGroup = referencingSecurityGroup;
            return this;
        }
        public java.util.List<DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroupsReferencingSecurityGroup> getReferencingSecurityGroup() {
            return this.referencingSecurityGroup;
        }

    }

    public static class DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReference extends TeaModel {
        // Details about the security groups that referenced by the specified security group.
        @NameInMap("ReferencingSecurityGroups")
        public DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroups referencingSecurityGroups;

        // The ID of the queried security group.
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        public static DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReference build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReference self = new DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReference();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReference setReferencingSecurityGroups(DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroups referencingSecurityGroups) {
            this.referencingSecurityGroups = referencingSecurityGroups;
            return this;
        }
        public DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroups getReferencingSecurityGroups() {
            return this.referencingSecurityGroups;
        }

        public DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReference setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class DescribeSecurityGroupReferencesResponseBodySecurityGroupReferences extends TeaModel {
        @NameInMap("SecurityGroupReference")
        public java.util.List<DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReference> securityGroupReference;

        public static DescribeSecurityGroupReferencesResponseBodySecurityGroupReferences build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupReferencesResponseBodySecurityGroupReferences self = new DescribeSecurityGroupReferencesResponseBodySecurityGroupReferences();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupReferencesResponseBodySecurityGroupReferences setSecurityGroupReference(java.util.List<DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReference> securityGroupReference) {
            this.securityGroupReference = securityGroupReference;
            return this;
        }
        public java.util.List<DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReference> getSecurityGroupReference() {
            return this.securityGroupReference;
        }

    }

}

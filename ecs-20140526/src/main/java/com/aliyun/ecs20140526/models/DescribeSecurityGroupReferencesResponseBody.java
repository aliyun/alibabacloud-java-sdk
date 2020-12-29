// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupReferencesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("AliUid")
        public String aliUid;

        public static DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroupsReferencingSecurityGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroupsReferencingSecurityGroup self = new DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroupsReferencingSecurityGroup();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroupsReferencingSecurityGroup setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroupsReferencingSecurityGroup setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
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
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("ReferencingSecurityGroups")
        public DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroups referencingSecurityGroups;

        public static DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReference build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReference self = new DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReference();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReference setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReference setReferencingSecurityGroups(DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroups referencingSecurityGroups) {
            this.referencingSecurityGroups = referencingSecurityGroups;
            return this;
        }
        public DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroups getReferencingSecurityGroups() {
            return this.referencingSecurityGroups;
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

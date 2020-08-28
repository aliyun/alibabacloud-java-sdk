// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupReferencesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SecurityGroupReferences")
    @Validation(required = true)
    public DescribeSecurityGroupReferencesResponseSecurityGroupReferences securityGroupReferences;

    public static DescribeSecurityGroupReferencesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityGroupReferencesResponse self = new DescribeSecurityGroupReferencesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeSecurityGroupReferencesResponseSecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroupsReferencingSecurityGroup extends TeaModel {
        @NameInMap("AliUid")
        @Validation(required = true)
        public String aliUid;

        @NameInMap("SecurityGroupId")
        @Validation(required = true)
        public String securityGroupId;

        public static DescribeSecurityGroupReferencesResponseSecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroupsReferencingSecurityGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupReferencesResponseSecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroupsReferencingSecurityGroup self = new DescribeSecurityGroupReferencesResponseSecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroupsReferencingSecurityGroup();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSecurityGroupReferencesResponseSecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroups extends TeaModel {
        @NameInMap("ReferencingSecurityGroup")
        @Validation(required = true)
        public java.util.List<DescribeSecurityGroupReferencesResponseSecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroupsReferencingSecurityGroup> referencingSecurityGroup;

        public static DescribeSecurityGroupReferencesResponseSecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupReferencesResponseSecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroups self = new DescribeSecurityGroupReferencesResponseSecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroups();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSecurityGroupReferencesResponseSecurityGroupReferencesSecurityGroupReference extends TeaModel {
        @NameInMap("SecurityGroupId")
        @Validation(required = true)
        public String securityGroupId;

        @NameInMap("ReferencingSecurityGroups")
        @Validation(required = true)
        public DescribeSecurityGroupReferencesResponseSecurityGroupReferencesSecurityGroupReferenceReferencingSecurityGroups referencingSecurityGroups;

        public static DescribeSecurityGroupReferencesResponseSecurityGroupReferencesSecurityGroupReference build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupReferencesResponseSecurityGroupReferencesSecurityGroupReference self = new DescribeSecurityGroupReferencesResponseSecurityGroupReferencesSecurityGroupReference();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSecurityGroupReferencesResponseSecurityGroupReferences extends TeaModel {
        @NameInMap("SecurityGroupReference")
        @Validation(required = true)
        public java.util.List<DescribeSecurityGroupReferencesResponseSecurityGroupReferencesSecurityGroupReference> securityGroupReference;

        public static DescribeSecurityGroupReferencesResponseSecurityGroupReferences build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupReferencesResponseSecurityGroupReferences self = new DescribeSecurityGroupReferencesResponseSecurityGroupReferences();
            return TeaModel.build(map, self);
        }

    }

}

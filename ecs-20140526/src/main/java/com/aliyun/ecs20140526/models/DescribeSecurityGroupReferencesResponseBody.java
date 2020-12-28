// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupReferencesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityGroupReferences")
    public java.util.List<DescribeSecurityGroupReferencesResponseBodySecurityGroupReferences> securityGroupReferences;

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

    public DescribeSecurityGroupReferencesResponseBody setSecurityGroupReferences(java.util.List<DescribeSecurityGroupReferencesResponseBodySecurityGroupReferences> securityGroupReferences) {
        this.securityGroupReferences = securityGroupReferences;
        return this;
    }
    public java.util.List<DescribeSecurityGroupReferencesResponseBodySecurityGroupReferences> getSecurityGroupReferences() {
        return this.securityGroupReferences;
    }

    public static class DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesReferencingSecurityGroups extends TeaModel {
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("AliUid")
        public String aliUid;

        public static DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesReferencingSecurityGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesReferencingSecurityGroups self = new DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesReferencingSecurityGroups();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesReferencingSecurityGroups setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesReferencingSecurityGroups setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

    }

    public static class DescribeSecurityGroupReferencesResponseBodySecurityGroupReferences extends TeaModel {
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("ReferencingSecurityGroups")
        public java.util.List<DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesReferencingSecurityGroups> referencingSecurityGroups;

        public static DescribeSecurityGroupReferencesResponseBodySecurityGroupReferences build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupReferencesResponseBodySecurityGroupReferences self = new DescribeSecurityGroupReferencesResponseBodySecurityGroupReferences();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupReferencesResponseBodySecurityGroupReferences setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeSecurityGroupReferencesResponseBodySecurityGroupReferences setReferencingSecurityGroups(java.util.List<DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesReferencingSecurityGroups> referencingSecurityGroups) {
            this.referencingSecurityGroups = referencingSecurityGroups;
            return this;
        }
        public java.util.List<DescribeSecurityGroupReferencesResponseBodySecurityGroupReferencesReferencingSecurityGroups> getReferencingSecurityGroups() {
            return this.referencingSecurityGroups;
        }

    }

}

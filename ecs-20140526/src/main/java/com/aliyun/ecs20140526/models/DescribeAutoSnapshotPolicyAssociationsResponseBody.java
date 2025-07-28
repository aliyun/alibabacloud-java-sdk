// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoSnapshotPolicyAssociationsResponseBody extends TeaModel {
    @NameInMap("AutoSnapshotPolicyAssociations")
    public DescribeAutoSnapshotPolicyAssociationsResponseBodyAutoSnapshotPolicyAssociations autoSnapshotPolicyAssociations;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAutoSnapshotPolicyAssociationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoSnapshotPolicyAssociationsResponseBody self = new DescribeAutoSnapshotPolicyAssociationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutoSnapshotPolicyAssociationsResponseBody setAutoSnapshotPolicyAssociations(DescribeAutoSnapshotPolicyAssociationsResponseBodyAutoSnapshotPolicyAssociations autoSnapshotPolicyAssociations) {
        this.autoSnapshotPolicyAssociations = autoSnapshotPolicyAssociations;
        return this;
    }
    public DescribeAutoSnapshotPolicyAssociationsResponseBodyAutoSnapshotPolicyAssociations getAutoSnapshotPolicyAssociations() {
        return this.autoSnapshotPolicyAssociations;
    }

    public DescribeAutoSnapshotPolicyAssociationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeAutoSnapshotPolicyAssociationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAutoSnapshotPolicyAssociationsResponseBodyAutoSnapshotPolicyAssociationsAutoSnapshotPolicyAssociation extends TeaModel {
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        @NameInMap("DiskId")
        public String diskId;

        public static DescribeAutoSnapshotPolicyAssociationsResponseBodyAutoSnapshotPolicyAssociationsAutoSnapshotPolicyAssociation build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoSnapshotPolicyAssociationsResponseBodyAutoSnapshotPolicyAssociationsAutoSnapshotPolicyAssociation self = new DescribeAutoSnapshotPolicyAssociationsResponseBodyAutoSnapshotPolicyAssociationsAutoSnapshotPolicyAssociation();
            return TeaModel.build(map, self);
        }

        public DescribeAutoSnapshotPolicyAssociationsResponseBodyAutoSnapshotPolicyAssociationsAutoSnapshotPolicyAssociation setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public DescribeAutoSnapshotPolicyAssociationsResponseBodyAutoSnapshotPolicyAssociationsAutoSnapshotPolicyAssociation setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

    }

    public static class DescribeAutoSnapshotPolicyAssociationsResponseBodyAutoSnapshotPolicyAssociations extends TeaModel {
        @NameInMap("AutoSnapshotPolicyAssociation")
        public java.util.List<DescribeAutoSnapshotPolicyAssociationsResponseBodyAutoSnapshotPolicyAssociationsAutoSnapshotPolicyAssociation> autoSnapshotPolicyAssociation;

        public static DescribeAutoSnapshotPolicyAssociationsResponseBodyAutoSnapshotPolicyAssociations build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoSnapshotPolicyAssociationsResponseBodyAutoSnapshotPolicyAssociations self = new DescribeAutoSnapshotPolicyAssociationsResponseBodyAutoSnapshotPolicyAssociations();
            return TeaModel.build(map, self);
        }

        public DescribeAutoSnapshotPolicyAssociationsResponseBodyAutoSnapshotPolicyAssociations setAutoSnapshotPolicyAssociation(java.util.List<DescribeAutoSnapshotPolicyAssociationsResponseBodyAutoSnapshotPolicyAssociationsAutoSnapshotPolicyAssociation> autoSnapshotPolicyAssociation) {
            this.autoSnapshotPolicyAssociation = autoSnapshotPolicyAssociation;
            return this;
        }
        public java.util.List<DescribeAutoSnapshotPolicyAssociationsResponseBodyAutoSnapshotPolicyAssociationsAutoSnapshotPolicyAssociation> getAutoSnapshotPolicyAssociation() {
            return this.autoSnapshotPolicyAssociation;
        }

    }

}

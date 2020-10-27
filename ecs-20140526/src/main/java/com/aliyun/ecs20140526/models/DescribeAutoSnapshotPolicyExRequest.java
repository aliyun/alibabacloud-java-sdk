// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoSnapshotPolicyExRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("AutoSnapshotPolicyId")
    public String autoSnapshotPolicyId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Tag")
    public java.util.List<DescribeAutoSnapshotPolicyExRequestTag> tag;

    public static DescribeAutoSnapshotPolicyExRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoSnapshotPolicyExRequest self = new DescribeAutoSnapshotPolicyExRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAutoSnapshotPolicyExRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAutoSnapshotPolicyExRequest setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
        this.autoSnapshotPolicyId = autoSnapshotPolicyId;
        return this;
    }
    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

    public DescribeAutoSnapshotPolicyExRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAutoSnapshotPolicyExRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAutoSnapshotPolicyExRequest setTag(java.util.List<DescribeAutoSnapshotPolicyExRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeAutoSnapshotPolicyExRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeAutoSnapshotPolicyExRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeAutoSnapshotPolicyExRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoSnapshotPolicyExRequestTag self = new DescribeAutoSnapshotPolicyExRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeAutoSnapshotPolicyExRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAutoSnapshotPolicyExRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

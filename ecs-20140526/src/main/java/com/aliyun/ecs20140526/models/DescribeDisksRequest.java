// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDisksRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("DiskIds")
    public String diskIds;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("DiskType")
    public String diskType;

    @NameInMap("Category")
    public String category;

    @NameInMap("Status")
    public String status;

    @NameInMap("SnapshotId")
    public String snapshotId;

    @NameInMap("Portable")
    public Boolean portable;

    @NameInMap("DeleteWithInstance")
    public Boolean deleteWithInstance;

    @NameInMap("DeleteAutoSnapshot")
    public Boolean deleteAutoSnapshot;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("DiskName")
    public String diskName;

    @NameInMap("AutoSnapshotPolicyId")
    public String autoSnapshotPolicyId;

    @NameInMap("EnableAutoSnapshot")
    public Boolean enableAutoSnapshot;

    @NameInMap("EnableAutomatedSnapshotPolicy")
    public Boolean enableAutomatedSnapshotPolicy;

    @NameInMap("DiskChargeType")
    public String diskChargeType;

    @NameInMap("LockReason")
    public String lockReason;

    @NameInMap("Filter")
    @Validation(required = true)
    public java.util.List<DescribeDisksRequestFilter> filter;

    @NameInMap("Tag")
    public java.util.List<DescribeDisksRequestTag> tag;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("EnableShared")
    public Boolean enableShared;

    @NameInMap("Encrypted")
    public Boolean encrypted;

    @NameInMap("AdditionalAttributes")
    public java.util.List<String> additionalAttributes;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    public static DescribeDisksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDisksRequest self = new DescribeDisksRequest();
        return TeaModel.build(map, self);
    }

    public static class DescribeDisksRequestFilter extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDisksRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksRequestFilter self = new DescribeDisksRequestFilter();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDisksRequestTag extends TeaModel {
        @NameInMap("value")
        @Validation(required = true)
        public String value;

        @NameInMap("key")
        @Validation(required = true)
        public String key;

        public static DescribeDisksRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksRequestTag self = new DescribeDisksRequestTag();
            return TeaModel.build(map, self);
        }

    }

}

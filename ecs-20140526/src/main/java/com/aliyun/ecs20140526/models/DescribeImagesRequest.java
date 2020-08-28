// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImagesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Status")
    public String status;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ShowExpired")
    public Boolean showExpired;

    @NameInMap("SnapshotId")
    public String snapshotId;

    @NameInMap("ImageName")
    public String imageName;

    @NameInMap("ImageFamily")
    public String imageFamily;

    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("IsSupportIoOptimized")
    public Boolean isSupportIoOptimized;

    @NameInMap("IsSupportCloudinit")
    public Boolean isSupportCloudinit;

    @NameInMap("OSType")
    public String OSType;

    @NameInMap("Architecture")
    public String architecture;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Usage")
    public String usage;

    @NameInMap("Tag")
    public java.util.List<DescribeImagesRequestTag> tag;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("ActionType")
    public String actionType;

    @NameInMap("Filter")
    public java.util.List<DescribeImagesRequestFilter> filter;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagesRequest self = new DescribeImagesRequest();
        return TeaModel.build(map, self);
    }

    public static class DescribeImagesRequestTag extends TeaModel {
        @NameInMap("value")
        @Validation(required = true)
        public String value;

        @NameInMap("key")
        @Validation(required = true)
        public String key;

        public static DescribeImagesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesRequestTag self = new DescribeImagesRequestTag();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeImagesRequestFilter extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeImagesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesRequestFilter self = new DescribeImagesRequestFilter();
            return TeaModel.build(map, self);
        }

    }

}

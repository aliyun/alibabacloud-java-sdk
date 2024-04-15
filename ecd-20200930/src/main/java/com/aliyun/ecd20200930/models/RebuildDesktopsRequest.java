// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RebuildDesktopsRequest extends TeaModel {
    /**
     * <p>The IDs of the cloud computers. You can specify 1 to 20 IDs.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The ID of the new image.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The operation type on the data disk.</p>
     * <br>
     * <p>>  This parameter is empty by default regardless of whether data disks are attached to the cloud computer.</p>
     * <br>
     * <p>*   No data disks are attached to the cloud computer:\</p>
     * <p>    No operation is performed on the data disks of the cloud computer regardless of the value of this parameter.</p>
     * <br>
     * <p>*   Data disks are attached to the cloud computer:</p>
     * <br>
     * <p>    1.  The OS of the cloud computer is the same as the OS of the destination image:</p>
     * <br>
     * <p>        *   If you set the OperateType parameter to `replace`, the data in the data disks of the cloud computer is replaced.</p>
     * <p>        *   If you leave the OperateType parameter empty, the data in the data disks of the cloud computer is retained.</p>
     * <br>
     * <p>    2.  The OS of the cloud computer is different from the OS of the destination image:</p>
     * <br>
     * <p>        *   If you set the OperateType parameter to `replace`, the data in the data disks of the cloud computer is replaced.</p>
     * <p>        *   If you leave the OperateType parameter empty, the data in the data disks of the cloud computer is cleared.</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static RebuildDesktopsRequest build(java.util.Map<String, ?> map) throws Exception {
        RebuildDesktopsRequest self = new RebuildDesktopsRequest();
        return TeaModel.build(map, self);
    }

    public RebuildDesktopsRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public RebuildDesktopsRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public RebuildDesktopsRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public RebuildDesktopsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

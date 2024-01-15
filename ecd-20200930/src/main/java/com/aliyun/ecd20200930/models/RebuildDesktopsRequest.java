// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RebuildDesktopsRequest extends TeaModel {
    /**
     * <p>The IDs of the cloud desktops.</p>
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
     * <p>> For cloud desktops that do not have data disks, when you call this operation, you do not need to configure this parameter.</p>
     * <br>
     * <p>*   Cloud desktops do not have data disks\</p>
     * <p>    The values that you configured have no impacts.</p>
     * <br>
     * <p>*   Cloud desktops have data disks</p>
     * <br>
     * <p>    1.  If the OS of the cloud desktop is the same as the OS of a destination image:</p>
     * <br>
     * <p>        *   The value replace indicates that the data disk of the cloud desktop is replaced.</p>
     * <p>        *   If you do not specify this parameter, the data disk of the cloud desktop is retained.</p>
     * <br>
     * <p>    2.  If the OS of the cloud desktop is the different from the OS of a destination image:</p>
     * <br>
     * <p>        *   The value replace indicates that the data disk of the cloud desktop is replaced.</p>
     * <p>        *   If you do not specify this parameter, the data disk of the cloud desktop is cleared.</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    /**
     * <p>The ID of the region.</p>
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

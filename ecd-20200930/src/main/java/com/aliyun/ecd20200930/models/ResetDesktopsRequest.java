// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ResetDesktopsRequest extends TeaModel {
    /**
     * <p>The ID of the cloud computer pool. If you specify the `DesktopId` parameter, ignore the `DesktopGroupId` parameter. If you do not specify the `DesktopId` parameter, specify the `DesktopGroupId` parameter in the call to request all IDs of the cloud computers in the specified pool.</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>The IDs of the cloud computer pools.</p>
     */
    @NameInMap("DesktopGroupIds")
    public java.util.List<String> desktopGroupIds;

    /**
     * <p>The IDs of the cloud computers. You can specify the IDs of 1 to 100 cloud computers.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The ID of the image.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The billing method.</p>
     * <br>
     * <p>> This parameter is available only when you reset cloud computer pools. If you leave this parameter empty, all cloud computers in the specified cloud computer pool are reset, regardless of how the cloud computers are billed.</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~436773~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The reset scope. You can configure this parameter to reset the image or cloud computer.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   ALL (default): resets the image and cloud computer.</p>
     * <p>*   IMAGE: resets only the image.</p>
     */
    @NameInMap("ResetScope")
    public String resetScope;

    /**
     * <p>The disk reset type.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   0: does not reset disks.</p>
     * <p>*   1: resets only the system disk.</p>
     * <p>*   2: resets only the user disk.</p>
     * <p>*   3: resets the system disk and the user disk.</p>
     */
    @NameInMap("ResetType")
    public String resetType;

    public static ResetDesktopsRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetDesktopsRequest self = new ResetDesktopsRequest();
        return TeaModel.build(map, self);
    }

    public ResetDesktopsRequest setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public ResetDesktopsRequest setDesktopGroupIds(java.util.List<String> desktopGroupIds) {
        this.desktopGroupIds = desktopGroupIds;
        return this;
    }
    public java.util.List<String> getDesktopGroupIds() {
        return this.desktopGroupIds;
    }

    public ResetDesktopsRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public ResetDesktopsRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ResetDesktopsRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public ResetDesktopsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ResetDesktopsRequest setResetScope(String resetScope) {
        this.resetScope = resetScope;
        return this;
    }
    public String getResetScope() {
        return this.resetScope;
    }

    public ResetDesktopsRequest setResetType(String resetType) {
        this.resetType = resetType;
        return this;
    }
    public String getResetType() {
        return this.resetType;
    }

}

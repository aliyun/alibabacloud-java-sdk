// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ResetDesktopsRequest extends TeaModel {
    /**
     * <p>The ID of the desktop group. If you specify the `DesktopId` parameter, ignore the `DesktopGroupId` parameter. If you do not specify the `DesktopId` parameter, specify the `DesktopGroupId` parameter in the call to request all IDs of the cloud desktops in the specified desktop group.``</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    @NameInMap("DesktopGroupIds")
    public java.util.List<String> desktopGroupIds;

    /**
     * <p>The IDs of the cloud desktops. You can specify 1 to 100 cloud desktop IDs.</p>
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
     * <p>> This parameter is available only when you reset desktop groups. If you leave this parameter empty, all cloud desktops in the specified desktop group are reset, regardless of how the cloud desktops are billed.</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The ID of the region. You can call the [DescribeRegions](~~436773~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResetScope")
    public String resetScope;

    /**
     * <p>The type of the disk that you want to reset.</p>
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

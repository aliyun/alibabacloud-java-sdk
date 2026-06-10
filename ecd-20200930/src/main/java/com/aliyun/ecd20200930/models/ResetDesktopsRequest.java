// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ResetDesktopsRequest extends TeaModel {
    /**
     * <p>The ID of the shared cloud desktop.</p>
     * <ul>
     * <li><p>If you specify <code>DesktopId</code>, the system ignores <code>DesktopGroupId</code>.</p>
     * </li>
     * <li><p>If <code>DesktopId</code> is empty, the system uses <code>DesktopGroupId</code> to retrieve the <code>DesktopId</code> of all cloud desktops in the shared cloud desktop group.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dg-07if7qsxoxkb6****</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>A list of shared cloud desktop group IDs.</p>
     */
    @NameInMap("DesktopGroupIds")
    public java.util.List<String> desktopGroupIds;

    /**
     * <p>A list of cloud desktop IDs. You can specify 1 to 100 IDs.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>m-4zfb6zj728hhr****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("LastRetryTime")
    public Long lastRetryTime;

    /**
     * <p>The billing method.</p>
     * <blockquote>
     * <p>This parameter applies only when resetting shared cloud desktops. If you leave it empty, the system resets all cloud desktops in the shared cloud desktop group, regardless of their billing method.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The region ID. Call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to list regions that support WUYING Workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The scope of the reset operation. Set this parameter to reset either the image or the cloud desktop.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("ResetScope")
    public String resetScope;

    /**
     * <p>The reset type. This determines whether to reset and which disks to reset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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

    public ResetDesktopsRequest setLastRetryTime(Long lastRetryTime) {
        this.lastRetryTime = lastRetryTime;
        return this;
    }
    public Long getLastRetryTime() {
        return this.lastRetryTime;
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

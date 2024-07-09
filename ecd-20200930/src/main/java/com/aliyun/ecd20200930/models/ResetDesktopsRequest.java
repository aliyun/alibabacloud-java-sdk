// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ResetDesktopsRequest extends TeaModel {
    /**
     * <p>The ID of the cloud computer pool. If you specify the <code>DesktopId</code> parameter, ignore the <code>DesktopGroupId</code> parameter. If you do not specify the <code>DesktopId</code> parameter, specify the <code>DesktopGroupId</code> parameter in the call to request all IDs of the cloud computers in the specified pool.</p>
     * 
     * <strong>example:</strong>
     * <p>dg-07if7qsxoxkb6****</p>
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
     * 
     * <strong>example:</strong>
     * <p>m-4zfb6zj728hhr****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The billing method.</p>
     * <blockquote>
     * <p>This parameter is available only when you reset cloud computer pools. If you leave this parameter empty, all cloud computers in the specified cloud computer pool are reset, regardless of how the cloud computers are billed.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/436773.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The reset scope. You can configure this parameter to reset the image or cloud computer.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>ALL (default): resets the image and cloud computer.</li>
     * <li>IMAGE: resets only the image.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("ResetScope")
    public String resetScope;

    /**
     * <p>The disk reset type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>0: does not reset disks.</li>
     * <li>1: resets only the system disk.</li>
     * <li>2: resets only the user disk.</li>
     * <li>3: resets the system disk and the user disk.</li>
     * </ul>
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

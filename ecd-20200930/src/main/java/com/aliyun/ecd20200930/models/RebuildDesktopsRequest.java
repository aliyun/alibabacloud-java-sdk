// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RebuildDesktopsRequest extends TeaModel {
    @NameInMap("AfterStatus")
    public String afterStatus;

    /**
     * <p>The IDs of the cloud computers to rebuild. You can specify 1 to 20 IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-gx2x1dhsmucyy****</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The ID of the new image.</p>
     * 
     * <strong>example:</strong>
     * <p>m-84mztzatmlnys****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The operating system language. This parameter applies only to system images. For Linux cloud computers, only English is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>Specifies how to handle the data disk.</p>
     * <blockquote>
     * <p>This parameter is optional.</p>
     * </blockquote>
     * <ul>
     * <li><p>If a cloud computer does not have a data disk, this parameter is ignored.<br></p>
     * </li>
     * <li><p>If a cloud computer has a data disk:</p>
     * <ol>
     * <li><p>If the new image has the same operating system as the original one:</p>
     * <ul>
     * <li><p>If you set this parameter to <code>replace</code>, the data disk is replaced.</p>
     * </li>
     * <li><p>If you do not specify this parameter, the data disk is retained.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>If the new image has a different operating system:</p>
     * <ul>
     * <li><p>If you set this parameter to <code>replace</code>, the data disk is replaced.</p>
     * </li>
     * <li><p>If you do not specify this parameter, the data disk is erased.</p>
     * </li>
     * </ul>
     * </li>
     * </ol>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>replace</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    /**
     * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to find the regions where Elastic Desktop Service is available.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static RebuildDesktopsRequest build(java.util.Map<String, ?> map) throws Exception {
        RebuildDesktopsRequest self = new RebuildDesktopsRequest();
        return TeaModel.build(map, self);
    }

    public RebuildDesktopsRequest setAfterStatus(String afterStatus) {
        this.afterStatus = afterStatus;
        return this;
    }
    public String getAfterStatus() {
        return this.afterStatus;
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

    public RebuildDesktopsRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
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

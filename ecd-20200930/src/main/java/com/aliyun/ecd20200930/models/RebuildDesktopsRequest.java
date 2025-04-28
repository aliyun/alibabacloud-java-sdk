// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RebuildDesktopsRequest extends TeaModel {
    @NameInMap("AfterStatus")
    public String afterStatus;

    /**
     * <p>The cloud computer IDs. You can specify the IDs of 1 to 20 cloud computers.</p>
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
     * <p>The OS language. Only system images are supported, and Linux cloud computers support only English.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>en-US: English</li>
     * <li>zh-HK: Traditional Chinese (Hong Kong, China)</li>
     * <li>zh-CN: Simplified Chinese</li>
     * <li>ja-JP: Japanese</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The operation type on the data disk.</p>
     * <blockquote>
     * <p> This parameter is empty by default regardless of whether data disks are attached to the cloud computer.</p>
     * </blockquote>
     * <ul>
     * <li><p>No data disks are attached to the cloud computer:\
     * No operation is performed on the data disks of the cloud computer regardless of the value of this parameter.</p>
     * </li>
     * <li><p>Data disks are attached to the cloud computer:</p>
     * <ol>
     * <li><p>The OS of the cloud computer is the same as the OS of the destination image:</p>
     * <ul>
     * <li>If you set the OperateType parameter to <code>replace</code>, the data in the data disks of the cloud computer is replaced.</li>
     * <li>If you leave the OperateType parameter empty, the data in the data disks of the cloud computer is retained.</li>
     * </ul>
     * </li>
     * <li><p>The OS of the cloud computer is different from the OS of the destination image:</p>
     * <ul>
     * <li>If you set the OperateType parameter to <code>replace</code>, the data in the data disks of the cloud computer is replaced.</li>
     * <li>If you leave the OperateType parameter empty, the data in the data disks of the cloud computer is cleared.</li>
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
     * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the regions supported by Elastic Desktop Service (EDS).</p>
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

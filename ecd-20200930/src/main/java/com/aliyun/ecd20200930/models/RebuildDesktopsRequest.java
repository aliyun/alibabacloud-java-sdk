// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RebuildDesktopsRequest extends TeaModel {
    /**
     * <p>The target status of the cloud computer after the rebuild is complete.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("AfterStatus")
    public String afterStatus;

    /**
     * <p>The cloud computer ID. You can specify 1 to 20 IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-gx2x1dhsmucyy****</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The ID of the new image to use after the change.</p>
     * 
     * <strong>example:</strong>
     * <p>m-84mztzatmlnys****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The operating system language. Currently, only system images are supported, and Linux computers only support English.</p>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The operation type for the data cloud disk.</p>
     * <blockquote>
     * <p>Regardless of whether the cloud computer has a data cloud disk, no field value is passed in by default when you call this operation.</p>
     * </blockquote>
     * <ul>
     * <li>If the cloud computer has no data cloud disk:<br>  No data cloud disk operation is performed regardless of the field value passed in.</li>
     * <li>If the cloud computer has a data cloud disk:<ol>
     * <li>When the operating system of the cloud computer is the same as that of the target image:<ul>
     * <li>If the field value is <code>replace</code>, the data cloud disk of the cloud computer is replaced.</li>
     * <li>If no field value is passed in, the original data cloud disk of the cloud computer is retained.</li>
     * </ul>
     * </li>
     * <li>When the operating system of the cloud computer is different from that of the target image:<ul>
     * <li>If the field value is <code>replace</code>, the data cloud disk of the cloud computer is replaced.</li>
     * <li>If no field value is passed in, the data cloud disk of the cloud computer is cleared.</li>
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
     * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the list of regions supported by Elastic Desktop Service.</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class MigrateImageProtocolRequest extends TeaModel {
    /**
     * <p>The image IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ImageId")
    public java.util.List<String> imageId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The protocol to which you want to update the image protocols. Set the value to ASP.</p>
     * 
     * <strong>example:</strong>
     * <p>ASP</p>
     */
    @NameInMap("TargetProtocolType")
    public String targetProtocolType;

    public static MigrateImageProtocolRequest build(java.util.Map<String, ?> map) throws Exception {
        MigrateImageProtocolRequest self = new MigrateImageProtocolRequest();
        return TeaModel.build(map, self);
    }

    public MigrateImageProtocolRequest setImageId(java.util.List<String> imageId) {
        this.imageId = imageId;
        return this;
    }
    public java.util.List<String> getImageId() {
        return this.imageId;
    }

    public MigrateImageProtocolRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public MigrateImageProtocolRequest setTargetProtocolType(String targetProtocolType) {
        this.targetProtocolType = targetProtocolType;
        return this;
    }
    public String getTargetProtocolType() {
        return this.targetProtocolType;
    }

}

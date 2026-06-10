// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteDesktopsRequest extends TeaModel {
    /**
     * <p>A list of 1 to 100 cloud computer IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The region ID. Call <a href="t2167755.xdita#"></a>to get a list of regions that Elastic Desktop Service (EDS) supports.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResellerOwnerUid")
    public Long resellerOwnerUid;

    public static DeleteDesktopsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDesktopsRequest self = new DeleteDesktopsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDesktopsRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public DeleteDesktopsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteDesktopsRequest setResellerOwnerUid(Long resellerOwnerUid) {
        this.resellerOwnerUid = resellerOwnerUid;
        return this;
    }
    public Long getResellerOwnerUid() {
        return this.resellerOwnerUid;
    }

}

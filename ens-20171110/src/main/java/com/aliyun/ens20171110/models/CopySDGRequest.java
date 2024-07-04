// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CopySDGRequest extends TeaModel {
    /**
     * <p>The destination nodes.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DestinationRegionIds")
    public java.util.List<String> destinationRegionIds;

    /**
     * <p>The ID of the SDG that you want to copy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sdg-xxx</p>
     */
    @NameInMap("SDGId")
    public String SDGId;

    public static CopySDGRequest build(java.util.Map<String, ?> map) throws Exception {
        CopySDGRequest self = new CopySDGRequest();
        return TeaModel.build(map, self);
    }

    public CopySDGRequest setDestinationRegionIds(java.util.List<String> destinationRegionIds) {
        this.destinationRegionIds = destinationRegionIds;
        return this;
    }
    public java.util.List<String> getDestinationRegionIds() {
        return this.destinationRegionIds;
    }

    public CopySDGRequest setSDGId(String SDGId) {
        this.SDGId = SDGId;
        return this;
    }
    public String getSDGId() {
        return this.SDGId;
    }

}

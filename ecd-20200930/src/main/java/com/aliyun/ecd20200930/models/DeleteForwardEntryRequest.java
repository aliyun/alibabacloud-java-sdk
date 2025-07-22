// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteForwardEntryRequest extends TeaModel {
    @NameInMap("ForwardEntryId")
    public String forwardEntryId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ForwardTableId")
    public String forwardTableId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteForwardEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteForwardEntryRequest self = new DeleteForwardEntryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteForwardEntryRequest setForwardEntryId(String forwardEntryId) {
        this.forwardEntryId = forwardEntryId;
        return this;
    }
    public String getForwardEntryId() {
        return this.forwardEntryId;
    }

    public DeleteForwardEntryRequest setForwardTableId(String forwardTableId) {
        this.forwardTableId = forwardTableId;
        return this;
    }
    public String getForwardTableId() {
        return this.forwardTableId;
    }

    public DeleteForwardEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

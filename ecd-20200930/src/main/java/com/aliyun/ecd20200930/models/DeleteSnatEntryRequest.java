// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteSnatEntryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SnatEntryId")
    public String snatEntryId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SnatTableId")
    public String snatTableId;

    public static DeleteSnatEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnatEntryRequest self = new DeleteSnatEntryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSnatEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteSnatEntryRequest setSnatEntryId(String snatEntryId) {
        this.snatEntryId = snatEntryId;
        return this;
    }
    public String getSnatEntryId() {
        return this.snatEntryId;
    }

    public DeleteSnatEntryRequest setSnatTableId(String snatTableId) {
        this.snatTableId = snatTableId;
        return this;
    }
    public String getSnatTableId() {
        return this.snatTableId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteSnatEntryRequest extends TeaModel {
    /**
     * <p>The ID of the SNAT entry that you want to delete.</p>
     */
    @NameInMap("SnatEntryId")
    public String snatEntryId;

    public static DeleteSnatEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnatEntryRequest self = new DeleteSnatEntryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSnatEntryRequest setSnatEntryId(String snatEntryId) {
        this.snatEntryId = snatEntryId;
        return this;
    }
    public String getSnatEntryId() {
        return this.snatEntryId;
    }

}

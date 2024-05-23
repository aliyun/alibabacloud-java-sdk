// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteForwardEntryRequest extends TeaModel {
    /**
     * <p>The ID of the DNAT entry that you want to delete.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ForwardEntryId")
    public String forwardEntryId;

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

}

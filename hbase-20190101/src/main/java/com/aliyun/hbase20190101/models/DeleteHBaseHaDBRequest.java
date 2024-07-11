// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DeleteHBaseHaDBRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bds-bp14112fd7g52s1****</p>
     */
    @NameInMap("BdsId")
    public String bdsId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ha-sw2o0l01s4r76****</p>
     */
    @NameInMap("HaId")
    public String haId;

    public static DeleteHBaseHaDBRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHBaseHaDBRequest self = new DeleteHBaseHaDBRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHBaseHaDBRequest setBdsId(String bdsId) {
        this.bdsId = bdsId;
        return this;
    }
    public String getBdsId() {
        return this.bdsId;
    }

    public DeleteHBaseHaDBRequest setHaId(String haId) {
        this.haId = haId;
        return this;
    }
    public String getHaId() {
        return this.haId;
    }

}

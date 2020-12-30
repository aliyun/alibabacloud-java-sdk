// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DeleteHBaseHaDBRequest extends TeaModel {
    @NameInMap("BdsId")
    public String bdsId;

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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DeleteHbaseHaSlbRequest extends TeaModel {
    @NameInMap("BdsId")
    public String bdsId;

    @NameInMap("HaId")
    public String haId;

    @NameInMap("HaTypes")
    public String haTypes;

    public static DeleteHbaseHaSlbRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHbaseHaSlbRequest self = new DeleteHbaseHaSlbRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHbaseHaSlbRequest setBdsId(String bdsId) {
        this.bdsId = bdsId;
        return this;
    }
    public String getBdsId() {
        return this.bdsId;
    }

    public DeleteHbaseHaSlbRequest setHaId(String haId) {
        this.haId = haId;
        return this;
    }
    public String getHaId() {
        return this.haId;
    }

    public DeleteHbaseHaSlbRequest setHaTypes(String haTypes) {
        this.haTypes = haTypes;
        return this;
    }
    public String getHaTypes() {
        return this.haTypes;
    }

}

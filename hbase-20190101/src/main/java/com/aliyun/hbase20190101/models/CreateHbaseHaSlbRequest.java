// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CreateHbaseHaSlbRequest extends TeaModel {
    @NameInMap("BdsId")
    public String bdsId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("HaId")
    public String haId;

    @NameInMap("HaTypes")
    public String haTypes;

    @NameInMap("HbaseType")
    public String hbaseType;

    public static CreateHbaseHaSlbRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHbaseHaSlbRequest self = new CreateHbaseHaSlbRequest();
        return TeaModel.build(map, self);
    }

    public CreateHbaseHaSlbRequest setBdsId(String bdsId) {
        this.bdsId = bdsId;
        return this;
    }
    public String getBdsId() {
        return this.bdsId;
    }

    public CreateHbaseHaSlbRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateHbaseHaSlbRequest setHaId(String haId) {
        this.haId = haId;
        return this;
    }
    public String getHaId() {
        return this.haId;
    }

    public CreateHbaseHaSlbRequest setHaTypes(String haTypes) {
        this.haTypes = haTypes;
        return this;
    }
    public String getHaTypes() {
        return this.haTypes;
    }

    public CreateHbaseHaSlbRequest setHbaseType(String hbaseType) {
        this.hbaseType = hbaseType;
        return this;
    }
    public String getHbaseType() {
        return this.hbaseType;
    }

}

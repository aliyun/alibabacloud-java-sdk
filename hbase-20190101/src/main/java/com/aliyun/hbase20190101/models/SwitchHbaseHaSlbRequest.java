// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class SwitchHbaseHaSlbRequest extends TeaModel {
    @NameInMap("BdsId")
    public String bdsId;

    @NameInMap("HaId")
    public String haId;

    @NameInMap("HaTypes")
    public String haTypes;

    @NameInMap("HbaseType")
    public String hbaseType;

    public static SwitchHbaseHaSlbRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchHbaseHaSlbRequest self = new SwitchHbaseHaSlbRequest();
        return TeaModel.build(map, self);
    }

    public SwitchHbaseHaSlbRequest setBdsId(String bdsId) {
        this.bdsId = bdsId;
        return this;
    }
    public String getBdsId() {
        return this.bdsId;
    }

    public SwitchHbaseHaSlbRequest setHaId(String haId) {
        this.haId = haId;
        return this;
    }
    public String getHaId() {
        return this.haId;
    }

    public SwitchHbaseHaSlbRequest setHaTypes(String haTypes) {
        this.haTypes = haTypes;
        return this;
    }
    public String getHaTypes() {
        return this.haTypes;
    }

    public SwitchHbaseHaSlbRequest setHbaseType(String hbaseType) {
        this.hbaseType = hbaseType;
        return this;
    }
    public String getHbaseType() {
        return this.hbaseType;
    }

}

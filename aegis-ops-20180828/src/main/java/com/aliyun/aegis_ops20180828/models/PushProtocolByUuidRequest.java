// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class PushProtocolByUuidRequest extends TeaModel {
    @NameInMap("Msg")
    public String msg;

    @NameInMap("ProtocolType")
    public String protocolType;

    @NameInMap("Uuid")
    public String uuid;

    public static PushProtocolByUuidRequest build(java.util.Map<String, ?> map) throws Exception {
        PushProtocolByUuidRequest self = new PushProtocolByUuidRequest();
        return TeaModel.build(map, self);
    }

    public PushProtocolByUuidRequest setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public PushProtocolByUuidRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public PushProtocolByUuidRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryMessageInfoRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot-cn-0pp1n8t***</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>323455***</p>
     */
    @NameInMap("UniMsgId")
    public String uniMsgId;

    public static QueryMessageInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMessageInfoRequest self = new QueryMessageInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryMessageInfoRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryMessageInfoRequest setUniMsgId(String uniMsgId) {
        this.uniMsgId = uniMsgId;
        return this;
    }
    public String getUniMsgId() {
        return this.uniMsgId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetParserRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot-n8t***</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("ParserId")
    public Long parserId;

    public static GetParserRequest build(java.util.Map<String, ?> map) throws Exception {
        GetParserRequest self = new GetParserRequest();
        return TeaModel.build(map, self);
    }

    public GetParserRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public GetParserRequest setParserId(Long parserId) {
        this.parserId = parserId;
        return this;
    }
    public Long getParserId() {
        return this.parserId;
    }

}

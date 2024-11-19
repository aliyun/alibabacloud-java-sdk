// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class StopParserRequest extends TeaModel {
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

    public static StopParserRequest build(java.util.Map<String, ?> map) throws Exception {
        StopParserRequest self = new StopParserRequest();
        return TeaModel.build(map, self);
    }

    public StopParserRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public StopParserRequest setParserId(Long parserId) {
        this.parserId = parserId;
        return this;
    }
    public Long getParserId() {
        return this.parserId;
    }

}

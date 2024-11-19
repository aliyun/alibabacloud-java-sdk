// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteParserRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot-1n8t****</p>
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

    public static DeleteParserRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteParserRequest self = new DeleteParserRequest();
        return TeaModel.build(map, self);
    }

    public DeleteParserRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeleteParserRequest setParserId(Long parserId) {
        this.parserId = parserId;
        return this;
    }
    public Long getParserId() {
        return this.parserId;
    }

}

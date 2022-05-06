// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class RetrySoundCodeLabelBatchRequest extends TeaModel {
    @NameInMap("BatchCode")
    public String batchCode;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static RetrySoundCodeLabelBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        RetrySoundCodeLabelBatchRequest self = new RetrySoundCodeLabelBatchRequest();
        return TeaModel.build(map, self);
    }

    public RetrySoundCodeLabelBatchRequest setBatchCode(String batchCode) {
        this.batchCode = batchCode;
        return this;
    }
    public String getBatchCode() {
        return this.batchCode;
    }

    public RetrySoundCodeLabelBatchRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}

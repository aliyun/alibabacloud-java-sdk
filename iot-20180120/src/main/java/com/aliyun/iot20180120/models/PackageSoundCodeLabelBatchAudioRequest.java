// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PackageSoundCodeLabelBatchAudioRequest extends TeaModel {
    @NameInMap("BatchCode")
    public String batchCode;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static PackageSoundCodeLabelBatchAudioRequest build(java.util.Map<String, ?> map) throws Exception {
        PackageSoundCodeLabelBatchAudioRequest self = new PackageSoundCodeLabelBatchAudioRequest();
        return TeaModel.build(map, self);
    }

    public PackageSoundCodeLabelBatchAudioRequest setBatchCode(String batchCode) {
        this.batchCode = batchCode;
        return this;
    }
    public String getBatchCode() {
        return this.batchCode;
    }

    public PackageSoundCodeLabelBatchAudioRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySoundCodeLabelBatchFailedResultRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Md3ZiTL888K9llXDy7890***********</p>
     */
    @NameInMap("BatchCode")
    public String batchCode;

    /**
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static QuerySoundCodeLabelBatchFailedResultRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySoundCodeLabelBatchFailedResultRequest self = new QuerySoundCodeLabelBatchFailedResultRequest();
        return TeaModel.build(map, self);
    }

    public QuerySoundCodeLabelBatchFailedResultRequest setBatchCode(String batchCode) {
        this.batchCode = batchCode;
        return this;
    }
    public String getBatchCode() {
        return this.batchCode;
    }

    public QuerySoundCodeLabelBatchFailedResultRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}

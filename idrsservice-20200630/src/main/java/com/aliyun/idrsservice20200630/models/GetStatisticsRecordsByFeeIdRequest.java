// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetStatisticsRecordsByFeeIdRequest extends TeaModel {
    @NameInMap("FeeId")
    public String feeId;

    public static GetStatisticsRecordsByFeeIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStatisticsRecordsByFeeIdRequest self = new GetStatisticsRecordsByFeeIdRequest();
        return TeaModel.build(map, self);
    }

    public GetStatisticsRecordsByFeeIdRequest setFeeId(String feeId) {
        this.feeId = feeId;
        return this;
    }
    public String getFeeId() {
        return this.feeId;
    }

}

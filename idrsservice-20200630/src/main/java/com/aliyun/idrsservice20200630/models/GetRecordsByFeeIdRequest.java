// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetRecordsByFeeIdRequest extends TeaModel {
    @NameInMap("FeeId")
    public String feeId;

    public static GetRecordsByFeeIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRecordsByFeeIdRequest self = new GetRecordsByFeeIdRequest();
        return TeaModel.build(map, self);
    }

    public GetRecordsByFeeIdRequest setFeeId(String feeId) {
        this.feeId = feeId;
        return this;
    }
    public String getFeeId() {
        return this.feeId;
    }

}

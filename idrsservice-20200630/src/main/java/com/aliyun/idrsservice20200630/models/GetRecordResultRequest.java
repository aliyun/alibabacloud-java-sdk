// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetRecordResultRequest extends TeaModel {
    @NameInMap("RecordId")
    public String recordId;

    public static GetRecordResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRecordResultRequest self = new GetRecordResultRequest();
        return TeaModel.build(map, self);
    }

    public GetRecordResultRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetAsrResultRequest extends TeaModel {
    @NameInMap("AsrTaskId")
    public String asrTaskId;

    public static GetAsrResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAsrResultRequest self = new GetAsrResultRequest();
        return TeaModel.build(map, self);
    }

    public GetAsrResultRequest setAsrTaskId(String asrTaskId) {
        this.asrTaskId = asrTaskId;
        return this;
    }
    public String getAsrTaskId() {
        return this.asrTaskId;
    }

}

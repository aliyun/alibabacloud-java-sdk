// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20200324.models;

import com.aliyun.tea.*;

public class CreateBpmsResultRequest extends TeaModel {
    @NameInMap("ApplyStatus")
    public String applyStatus;

    @NameInMap("BpmsResultId")
    public String bpmsResultId;

    public static CreateBpmsResultRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBpmsResultRequest self = new CreateBpmsResultRequest();
        return TeaModel.build(map, self);
    }

    public CreateBpmsResultRequest setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
        return this;
    }
    public String getApplyStatus() {
        return this.applyStatus;
    }

    public CreateBpmsResultRequest setBpmsResultId(String bpmsResultId) {
        this.bpmsResultId = bpmsResultId;
        return this;
    }
    public String getBpmsResultId() {
        return this.bpmsResultId;
    }

}

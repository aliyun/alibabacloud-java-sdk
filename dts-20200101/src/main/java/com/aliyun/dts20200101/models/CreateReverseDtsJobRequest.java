// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateReverseDtsJobRequest extends TeaModel {
    @NameInMap("DtsJobId")
    public String dtsJobId;

    public static CreateReverseDtsJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateReverseDtsJobRequest self = new CreateReverseDtsJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateReverseDtsJobRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

}

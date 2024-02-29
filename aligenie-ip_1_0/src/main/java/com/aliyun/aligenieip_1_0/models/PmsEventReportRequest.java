// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class PmsEventReportRequest extends TeaModel {
    @NameInMap("Payload")
    public String payload;

    public static PmsEventReportRequest build(java.util.Map<String, ?> map) throws Exception {
        PmsEventReportRequest self = new PmsEventReportRequest();
        return TeaModel.build(map, self);
    }

    public PmsEventReportRequest setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

}

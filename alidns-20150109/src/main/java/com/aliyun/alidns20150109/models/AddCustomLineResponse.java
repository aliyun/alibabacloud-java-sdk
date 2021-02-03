// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddCustomLineResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LineId")
    @Validation(required = true)
    public Long lineId;

    @NameInMap("LineCode")
    @Validation(required = true)
    public String lineCode;

    public static AddCustomLineResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCustomLineResponse self = new AddCustomLineResponse();
        return TeaModel.build(map, self);
    }

    public AddCustomLineResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddCustomLineResponse setLineId(Long lineId) {
        this.lineId = lineId;
        return this;
    }
    public Long getLineId() {
        return this.lineId;
    }

    public AddCustomLineResponse setLineCode(String lineCode) {
        this.lineCode = lineCode;
        return this;
    }
    public String getLineCode() {
        return this.lineCode;
    }

}

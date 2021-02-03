// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddCustomLineResponseBody extends TeaModel {
    @NameInMap("LineId")
    public Long lineId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LineCode")
    public String lineCode;

    public static AddCustomLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCustomLineResponseBody self = new AddCustomLineResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCustomLineResponseBody setLineId(Long lineId) {
        this.lineId = lineId;
        return this;
    }
    public Long getLineId() {
        return this.lineId;
    }

    public AddCustomLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddCustomLineResponseBody setLineCode(String lineCode) {
        this.lineCode = lineCode;
        return this;
    }
    public String getLineCode() {
        return this.lineCode;
    }

}

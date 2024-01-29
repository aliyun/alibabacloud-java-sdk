// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddCustomLineResponseBody extends TeaModel {
    /**
     * <p>The code of the custom line.</p>
     */
    @NameInMap("LineCode")
    public String lineCode;

    /**
     * <p>The unique ID of the custom line.</p>
     */
    @NameInMap("LineId")
    public Long lineId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddCustomLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCustomLineResponseBody self = new AddCustomLineResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCustomLineResponseBody setLineCode(String lineCode) {
        this.lineCode = lineCode;
        return this;
    }
    public String getLineCode() {
        return this.lineCode;
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

}

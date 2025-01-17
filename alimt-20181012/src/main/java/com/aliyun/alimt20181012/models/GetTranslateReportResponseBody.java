// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetTranslateReportResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>{&quot;result&quot;:[{&quot;time&quot;:&quot;2021-10-21 00:00:00&quot;,&quot;total&quot;:100}]}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>86D18195-D89C-4C8C-9DC4-5FCE789CE6D5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetTranslateReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTranslateReportResponseBody self = new GetTranslateReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTranslateReportResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetTranslateReportResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetTranslateReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTranslateReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

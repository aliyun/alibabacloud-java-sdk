// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.documentautoml20221229.models;

import com.aliyun.tea.*;

public class PredictPreTrainModelResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PredictPreTrainModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PredictPreTrainModelResponseBody self = new PredictPreTrainModelResponseBody();
        return TeaModel.build(map, self);
    }

    public PredictPreTrainModelResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public PredictPreTrainModelResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public PredictPreTrainModelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PredictPreTrainModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

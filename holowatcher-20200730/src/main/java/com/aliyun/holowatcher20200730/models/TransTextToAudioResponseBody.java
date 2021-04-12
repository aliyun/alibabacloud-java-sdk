// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class TransTextToAudioResponseBody extends TeaModel {
    // msgInfo
    @NameInMap("MsgInfo")
    public String msgInfo;

    // msgCode
    @NameInMap("MsgCode")
    public String msgCode;

    // error
    @NameInMap("Error")
    public String error;

    // traceId
    @NameInMap("TraceId")
    public String traceId;

    // data
    @NameInMap("Data")
    public String data;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static TransTextToAudioResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransTextToAudioResponseBody self = new TransTextToAudioResponseBody();
        return TeaModel.build(map, self);
    }

    public TransTextToAudioResponseBody setMsgInfo(String msgInfo) {
        this.msgInfo = msgInfo;
        return this;
    }
    public String getMsgInfo() {
        return this.msgInfo;
    }

    public TransTextToAudioResponseBody setMsgCode(String msgCode) {
        this.msgCode = msgCode;
        return this;
    }
    public String getMsgCode() {
        return this.msgCode;
    }

    public TransTextToAudioResponseBody setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

    public TransTextToAudioResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public TransTextToAudioResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public TransTextToAudioResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

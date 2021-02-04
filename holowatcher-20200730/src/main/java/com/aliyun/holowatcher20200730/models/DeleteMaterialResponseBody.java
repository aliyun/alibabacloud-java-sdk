// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DeleteMaterialResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MsgInfo")
    public String msgInfo;

    @NameInMap("MsgCode")
    public String msgCode;

    @NameInMap("Error")
    public String error;

    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteMaterialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMaterialResponseBody self = new DeleteMaterialResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMaterialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMaterialResponseBody setMsgInfo(String msgInfo) {
        this.msgInfo = msgInfo;
        return this;
    }
    public String getMsgInfo() {
        return this.msgInfo;
    }

    public DeleteMaterialResponseBody setMsgCode(String msgCode) {
        this.msgCode = msgCode;
        return this;
    }
    public String getMsgCode() {
        return this.msgCode;
    }

    public DeleteMaterialResponseBody setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

    public DeleteMaterialResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public DeleteMaterialResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

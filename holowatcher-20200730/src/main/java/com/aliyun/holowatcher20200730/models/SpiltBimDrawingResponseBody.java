// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class SpiltBimDrawingResponseBody extends TeaModel {
    @NameInMap("Datas")
    public Boolean datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SpiltBimDrawingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SpiltBimDrawingResponseBody self = new SpiltBimDrawingResponseBody();
        return TeaModel.build(map, self);
    }

    public SpiltBimDrawingResponseBody setDatas(Boolean datas) {
        this.datas = datas;
        return this;
    }
    public Boolean getDatas() {
        return this.datas;
    }

    public SpiltBimDrawingResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public SpiltBimDrawingResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public SpiltBimDrawingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SpiltBimDrawingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimDrawingDetailResponseBody extends TeaModel {
    @NameInMap("Datas")
    public java.util.Map<String, ?> datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetBimDrawingDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBimDrawingDetailResponseBody self = new GetBimDrawingDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBimDrawingDetailResponseBody setDatas(java.util.Map<String, ?> datas) {
        this.datas = datas;
        return this;
    }
    public java.util.Map<String, ?> getDatas() {
        return this.datas;
    }

    public GetBimDrawingDetailResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public GetBimDrawingDetailResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetBimDrawingDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBimDrawingDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

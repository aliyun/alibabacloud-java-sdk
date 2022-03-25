// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UpdateBimStandardSlabInfoResponseBody extends TeaModel {
    @NameInMap("Datas")
    public Long datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateBimStandardSlabInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateBimStandardSlabInfoResponseBody self = new UpdateBimStandardSlabInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateBimStandardSlabInfoResponseBody setDatas(Long datas) {
        this.datas = datas;
        return this;
    }
    public Long getDatas() {
        return this.datas;
    }

    public UpdateBimStandardSlabInfoResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public UpdateBimStandardSlabInfoResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public UpdateBimStandardSlabInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateBimStandardSlabInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

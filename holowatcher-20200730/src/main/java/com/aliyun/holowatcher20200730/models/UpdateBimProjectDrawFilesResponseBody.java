// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UpdateBimProjectDrawFilesResponseBody extends TeaModel {
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

    public static UpdateBimProjectDrawFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateBimProjectDrawFilesResponseBody self = new UpdateBimProjectDrawFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateBimProjectDrawFilesResponseBody setDatas(Long datas) {
        this.datas = datas;
        return this;
    }
    public Long getDatas() {
        return this.datas;
    }

    public UpdateBimProjectDrawFilesResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public UpdateBimProjectDrawFilesResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public UpdateBimProjectDrawFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateBimProjectDrawFilesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class UpdateSnapshotInstanceJoinOptionWithBatchResponseBody extends TeaModel {
    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static UpdateSnapshotInstanceJoinOptionWithBatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSnapshotInstanceJoinOptionWithBatchResponseBody self = new UpdateSnapshotInstanceJoinOptionWithBatchResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSnapshotInstanceJoinOptionWithBatchResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public UpdateSnapshotInstanceJoinOptionWithBatchResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public UpdateSnapshotInstanceJoinOptionWithBatchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

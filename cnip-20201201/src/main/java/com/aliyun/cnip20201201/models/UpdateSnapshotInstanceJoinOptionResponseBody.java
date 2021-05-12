// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class UpdateSnapshotInstanceJoinOptionResponseBody extends TeaModel {
    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static UpdateSnapshotInstanceJoinOptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSnapshotInstanceJoinOptionResponseBody self = new UpdateSnapshotInstanceJoinOptionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSnapshotInstanceJoinOptionResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public UpdateSnapshotInstanceJoinOptionResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public UpdateSnapshotInstanceJoinOptionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

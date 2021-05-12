// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class CreateSnapshotResponseBody extends TeaModel {
    @NameInMap("data")
    public CreateSnapshotResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static CreateSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSnapshotResponseBody self = new CreateSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSnapshotResponseBody setData(CreateSnapshotResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSnapshotResponseBodyData getData() {
        return this.data;
    }

    public CreateSnapshotResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public CreateSnapshotResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public CreateSnapshotResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateSnapshotResponseBodyData extends TeaModel {
        @NameInMap("uid")
        public String uid;

        public static CreateSnapshotResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateSnapshotResponseBodyData self = new CreateSnapshotResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateSnapshotResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}

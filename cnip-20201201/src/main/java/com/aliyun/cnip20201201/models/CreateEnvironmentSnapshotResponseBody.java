// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class CreateEnvironmentSnapshotResponseBody extends TeaModel {
    @NameInMap("data")
    public CreateEnvironmentSnapshotResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static CreateEnvironmentSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvironmentSnapshotResponseBody self = new CreateEnvironmentSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEnvironmentSnapshotResponseBody setData(CreateEnvironmentSnapshotResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateEnvironmentSnapshotResponseBodyData getData() {
        return this.data;
    }

    public CreateEnvironmentSnapshotResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public CreateEnvironmentSnapshotResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public CreateEnvironmentSnapshotResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateEnvironmentSnapshotResponseBodyData extends TeaModel {
        @NameInMap("uid")
        public String uid;

        public static CreateEnvironmentSnapshotResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateEnvironmentSnapshotResponseBodyData self = new CreateEnvironmentSnapshotResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateEnvironmentSnapshotResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}

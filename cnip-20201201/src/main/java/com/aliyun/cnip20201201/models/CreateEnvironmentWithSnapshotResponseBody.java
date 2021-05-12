// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class CreateEnvironmentWithSnapshotResponseBody extends TeaModel {
    @NameInMap("data")
    public CreateEnvironmentWithSnapshotResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static CreateEnvironmentWithSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvironmentWithSnapshotResponseBody self = new CreateEnvironmentWithSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEnvironmentWithSnapshotResponseBody setData(CreateEnvironmentWithSnapshotResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateEnvironmentWithSnapshotResponseBodyData getData() {
        return this.data;
    }

    public CreateEnvironmentWithSnapshotResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public CreateEnvironmentWithSnapshotResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public CreateEnvironmentWithSnapshotResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateEnvironmentWithSnapshotResponseBodyData extends TeaModel {
        @NameInMap("uid")
        public String uid;

        public static CreateEnvironmentWithSnapshotResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateEnvironmentWithSnapshotResponseBodyData self = new CreateEnvironmentWithSnapshotResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateEnvironmentWithSnapshotResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}

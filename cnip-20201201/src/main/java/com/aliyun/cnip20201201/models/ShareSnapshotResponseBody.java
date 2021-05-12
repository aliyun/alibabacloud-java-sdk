// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ShareSnapshotResponseBody extends TeaModel {
    @NameInMap("data")
    public ShareSnapshotResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static ShareSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ShareSnapshotResponseBody self = new ShareSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public ShareSnapshotResponseBody setData(ShareSnapshotResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ShareSnapshotResponseBodyData getData() {
        return this.data;
    }

    public ShareSnapshotResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ShareSnapshotResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public ShareSnapshotResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ShareSnapshotResponseBodyData extends TeaModel {
        @NameInMap("newSnapshotUID")
        public String newSnapshotUID;

        public static ShareSnapshotResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ShareSnapshotResponseBodyData self = new ShareSnapshotResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ShareSnapshotResponseBodyData setNewSnapshotUID(String newSnapshotUID) {
            this.newSnapshotUID = newSnapshotUID;
            return this;
        }
        public String getNewSnapshotUID() {
            return this.newSnapshotUID;
        }

    }

}

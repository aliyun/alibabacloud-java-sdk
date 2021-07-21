// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetProductVersionPackageResponseBody extends TeaModel {
    @NameInMap("data")
    public GetProductVersionPackageResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static GetProductVersionPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionPackageResponseBody self = new GetProductVersionPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductVersionPackageResponseBody setData(GetProductVersionPackageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProductVersionPackageResponseBodyData getData() {
        return this.data;
    }

    public GetProductVersionPackageResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetProductVersionPackageResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetProductVersionPackageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetProductVersionPackageResponseBodyData extends TeaModel {
        @NameInMap("packageUID")
        public String packageUID;

        @NameInMap("packageStatus")
        public String packageStatus;

        public static GetProductVersionPackageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProductVersionPackageResponseBodyData self = new GetProductVersionPackageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProductVersionPackageResponseBodyData setPackageUID(String packageUID) {
            this.packageUID = packageUID;
            return this;
        }
        public String getPackageUID() {
            return this.packageUID;
        }

        public GetProductVersionPackageResponseBodyData setPackageStatus(String packageStatus) {
            this.packageStatus = packageStatus;
            return this;
        }
        public String getPackageStatus() {
            return this.packageStatus;
        }

    }

}

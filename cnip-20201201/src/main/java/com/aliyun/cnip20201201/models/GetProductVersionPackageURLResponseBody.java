// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetProductVersionPackageURLResponseBody extends TeaModel {
    @NameInMap("data")
    public GetProductVersionPackageURLResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static GetProductVersionPackageURLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionPackageURLResponseBody self = new GetProductVersionPackageURLResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductVersionPackageURLResponseBody setData(GetProductVersionPackageURLResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProductVersionPackageURLResponseBodyData getData() {
        return this.data;
    }

    public GetProductVersionPackageURLResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetProductVersionPackageURLResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetProductVersionPackageURLResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetProductVersionPackageURLResponseBodyData extends TeaModel {
        @NameInMap("packageURL")
        public String packageURL;

        public static GetProductVersionPackageURLResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProductVersionPackageURLResponseBodyData self = new GetProductVersionPackageURLResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProductVersionPackageURLResponseBodyData setPackageURL(String packageURL) {
            this.packageURL = packageURL;
            return this;
        }
        public String getPackageURL() {
            return this.packageURL;
        }

    }

}

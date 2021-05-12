// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetEnvironmentPackageResponseBody extends TeaModel {
    @NameInMap("data")
    public GetEnvironmentPackageResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static GetEnvironmentPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEnvironmentPackageResponseBody self = new GetEnvironmentPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEnvironmentPackageResponseBody setData(GetEnvironmentPackageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEnvironmentPackageResponseBodyData getData() {
        return this.data;
    }

    public GetEnvironmentPackageResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetEnvironmentPackageResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetEnvironmentPackageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetEnvironmentPackageResponseBodyData extends TeaModel {
        @NameInMap("packageURL")
        public String packageURL;

        public static GetEnvironmentPackageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentPackageResponseBodyData self = new GetEnvironmentPackageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentPackageResponseBodyData setPackageURL(String packageURL) {
            this.packageURL = packageURL;
            return this;
        }
        public String getPackageURL() {
            return this.packageURL;
        }

    }

}

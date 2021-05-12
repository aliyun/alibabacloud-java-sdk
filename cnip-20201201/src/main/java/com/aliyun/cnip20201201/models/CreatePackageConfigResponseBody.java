// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class CreatePackageConfigResponseBody extends TeaModel {
    @NameInMap("data")
    public CreatePackageConfigResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static CreatePackageConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePackageConfigResponseBody self = new CreatePackageConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePackageConfigResponseBody setData(CreatePackageConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreatePackageConfigResponseBodyData getData() {
        return this.data;
    }

    public CreatePackageConfigResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public CreatePackageConfigResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public CreatePackageConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreatePackageConfigResponseBodyData extends TeaModel {
        @NameInMap("uid")
        public String uid;

        public static CreatePackageConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreatePackageConfigResponseBodyData self = new CreatePackageConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreatePackageConfigResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}

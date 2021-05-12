// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class CreateLatestProductVersionResponseBody extends TeaModel {
    @NameInMap("data")
    public CreateLatestProductVersionResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static CreateLatestProductVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLatestProductVersionResponseBody self = new CreateLatestProductVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLatestProductVersionResponseBody setData(CreateLatestProductVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateLatestProductVersionResponseBodyData getData() {
        return this.data;
    }

    public CreateLatestProductVersionResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public CreateLatestProductVersionResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public CreateLatestProductVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateLatestProductVersionResponseBodyData extends TeaModel {
        @NameInMap("uid")
        public String uid;

        public static CreateLatestProductVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateLatestProductVersionResponseBodyData self = new CreateLatestProductVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateLatestProductVersionResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}

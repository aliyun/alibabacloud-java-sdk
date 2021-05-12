// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetProductResponseBody extends TeaModel {
    @NameInMap("data")
    public GetProductResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static GetProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductResponseBody self = new GetProductResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductResponseBody setData(GetProductResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProductResponseBodyData getData() {
        return this.data;
    }

    public GetProductResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetProductResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetProductResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetProductResponseBodyData extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("name")
        public String name;

        @NameInMap("provider")
        public String provider;

        @NameInMap("uid")
        public String uid;

        public static GetProductResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProductResponseBodyData self = new GetProductResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProductResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProductResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProductResponseBodyData setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public GetProductResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}

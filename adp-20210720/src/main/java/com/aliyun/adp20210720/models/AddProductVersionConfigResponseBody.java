// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class AddProductVersionConfigResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("code")
    public String code;

    @NameInMap("msg")
    public String msg;

    @NameInMap("data")
    public AddProductVersionConfigResponseBodyData data;

    public static AddProductVersionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddProductVersionConfigResponseBody self = new AddProductVersionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public AddProductVersionConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddProductVersionConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddProductVersionConfigResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public AddProductVersionConfigResponseBody setData(AddProductVersionConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddProductVersionConfigResponseBodyData getData() {
        return this.data;
    }

    public static class AddProductVersionConfigResponseBodyData extends TeaModel {
        // product version config uid
        @NameInMap("uid")
        public String uid;

        public static AddProductVersionConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddProductVersionConfigResponseBodyData self = new AddProductVersionConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddProductVersionConfigResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateProductVersionResponseBody extends TeaModel {
    @NameInMap("data")
    public CreateProductVersionResponseBodyData data;

    @NameInMap("code")
    public String code;

    @NameInMap("msg")
    public String msg;

    public static CreateProductVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProductVersionResponseBody self = new CreateProductVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProductVersionResponseBody setData(CreateProductVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateProductVersionResponseBodyData getData() {
        return this.data;
    }

    public CreateProductVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateProductVersionResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class CreateProductVersionResponseBodyData extends TeaModel {
        @NameInMap("uid")
        public String uid;

        public static CreateProductVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateProductVersionResponseBodyData self = new CreateProductVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateProductVersionResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}

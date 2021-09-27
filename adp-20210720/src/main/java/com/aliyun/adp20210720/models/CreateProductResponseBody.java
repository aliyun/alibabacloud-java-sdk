// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateProductResponseBody extends TeaModel {
    @NameInMap("data")
    public CreateProductResponseBodyData data;

    @NameInMap("code")
    public String code;

    @NameInMap("msg")
    public String msg;

    public static CreateProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProductResponseBody self = new CreateProductResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProductResponseBody setData(CreateProductResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateProductResponseBodyData getData() {
        return this.data;
    }

    public CreateProductResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateProductResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class CreateProductResponseBodyData extends TeaModel {
        @NameInMap("uid")
        public String uid;

        public static CreateProductResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateProductResponseBodyData self = new CreateProductResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateProductResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}

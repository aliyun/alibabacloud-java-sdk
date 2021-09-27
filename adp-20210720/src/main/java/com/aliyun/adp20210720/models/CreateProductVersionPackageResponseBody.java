// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateProductVersionPackageResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("msg")
    public String msg;

    @NameInMap("data")
    public CreateProductVersionPackageResponseBodyData data;

    public static CreateProductVersionPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProductVersionPackageResponseBody self = new CreateProductVersionPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProductVersionPackageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateProductVersionPackageResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public CreateProductVersionPackageResponseBody setData(CreateProductVersionPackageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateProductVersionPackageResponseBodyData getData() {
        return this.data;
    }

    public static class CreateProductVersionPackageResponseBodyData extends TeaModel {
        @NameInMap("uid")
        public String uid;

        public static CreateProductVersionPackageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateProductVersionPackageResponseBodyData self = new CreateProductVersionPackageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateProductVersionPackageResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}

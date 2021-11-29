// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class AddProductComponentVersionResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public AddProductComponentVersionResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    public static AddProductComponentVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddProductComponentVersionResponseBody self = new AddProductComponentVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public AddProductComponentVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddProductComponentVersionResponseBody setData(AddProductComponentVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddProductComponentVersionResponseBodyData getData() {
        return this.data;
    }

    public AddProductComponentVersionResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class AddProductComponentVersionResponseBodyData extends TeaModel {
        @NameInMap("uid")
        public String uid;

        public static AddProductComponentVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddProductComponentVersionResponseBodyData self = new AddProductComponentVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddProductComponentVersionResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}

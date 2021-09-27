// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class PutProductInstanceConfigResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("msg")
    public String msg;

    @NameInMap("data")
    public PutProductInstanceConfigResponseBodyData data;

    public static PutProductInstanceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutProductInstanceConfigResponseBody self = new PutProductInstanceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public PutProductInstanceConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PutProductInstanceConfigResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public PutProductInstanceConfigResponseBody setData(PutProductInstanceConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PutProductInstanceConfigResponseBodyData getData() {
        return this.data;
    }

    public static class PutProductInstanceConfigResponseBodyData extends TeaModel {
        @NameInMap("uid")
        public String uid;

        public static PutProductInstanceConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PutProductInstanceConfigResponseBodyData self = new PutProductInstanceConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PutProductInstanceConfigResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}

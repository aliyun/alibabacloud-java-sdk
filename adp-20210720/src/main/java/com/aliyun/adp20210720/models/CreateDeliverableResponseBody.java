// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateDeliverableResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateDeliverableResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    public static CreateDeliverableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeliverableResponseBody self = new CreateDeliverableResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeliverableResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDeliverableResponseBody setData(CreateDeliverableResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDeliverableResponseBodyData getData() {
        return this.data;
    }

    public CreateDeliverableResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class CreateDeliverableResponseBodyData extends TeaModel {
        @NameInMap("uid")
        public String uid;

        public static CreateDeliverableResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDeliverableResponseBodyData self = new CreateDeliverableResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDeliverableResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}

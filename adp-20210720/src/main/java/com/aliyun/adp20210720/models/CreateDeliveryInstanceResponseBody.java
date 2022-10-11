// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateDeliveryInstanceResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateDeliveryInstanceResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    public static CreateDeliveryInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeliveryInstanceResponseBody self = new CreateDeliveryInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeliveryInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDeliveryInstanceResponseBody setData(CreateDeliveryInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDeliveryInstanceResponseBodyData getData() {
        return this.data;
    }

    public CreateDeliveryInstanceResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class CreateDeliveryInstanceResponseBodyData extends TeaModel {
        @NameInMap("uid")
        public String uid;

        public static CreateDeliveryInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDeliveryInstanceResponseBodyData self = new CreateDeliveryInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDeliveryInstanceResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}

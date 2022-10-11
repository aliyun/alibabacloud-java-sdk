// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateDeliveryPackageResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateDeliveryPackageResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    public static CreateDeliveryPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeliveryPackageResponseBody self = new CreateDeliveryPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeliveryPackageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDeliveryPackageResponseBody setData(CreateDeliveryPackageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDeliveryPackageResponseBodyData getData() {
        return this.data;
    }

    public CreateDeliveryPackageResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class CreateDeliveryPackageResponseBodyData extends TeaModel {
        @NameInMap("uid")
        public String uid;

        public static CreateDeliveryPackageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDeliveryPackageResponseBodyData self = new CreateDeliveryPackageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDeliveryPackageResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}

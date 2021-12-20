// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateFoundationReferenceResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateFoundationReferenceResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    public static CreateFoundationReferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFoundationReferenceResponseBody self = new CreateFoundationReferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFoundationReferenceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateFoundationReferenceResponseBody setData(CreateFoundationReferenceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateFoundationReferenceResponseBodyData getData() {
        return this.data;
    }

    public CreateFoundationReferenceResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class CreateFoundationReferenceResponseBodyData extends TeaModel {
        @NameInMap("uid")
        public String uid;

        public static CreateFoundationReferenceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateFoundationReferenceResponseBodyData self = new CreateFoundationReferenceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateFoundationReferenceResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}

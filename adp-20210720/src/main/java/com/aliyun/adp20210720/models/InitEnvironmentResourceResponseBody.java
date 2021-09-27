// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class InitEnvironmentResourceResponseBody extends TeaModel {
    @NameInMap("data")
    public InitEnvironmentResourceResponseBodyData data;

    @NameInMap("code")
    public String code;

    @NameInMap("msg")
    public String msg;

    public static InitEnvironmentResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitEnvironmentResourceResponseBody self = new InitEnvironmentResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public InitEnvironmentResourceResponseBody setData(InitEnvironmentResourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InitEnvironmentResourceResponseBodyData getData() {
        return this.data;
    }

    public InitEnvironmentResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InitEnvironmentResourceResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class InitEnvironmentResourceResponseBodyData extends TeaModel {
        @NameInMap("status")
        public String status;

        public static InitEnvironmentResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InitEnvironmentResourceResponseBodyData self = new InitEnvironmentResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InitEnvironmentResourceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateProductDeploymentResponseBody extends TeaModel {
    // 错误码
    @NameInMap("code")
    public String code;

    // 数据
    @NameInMap("data")
    public CreateProductDeploymentResponseBodyData data;

    // 错误信息
    @NameInMap("msg")
    public String msg;

    public static CreateProductDeploymentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProductDeploymentResponseBody self = new CreateProductDeploymentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProductDeploymentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateProductDeploymentResponseBody setData(CreateProductDeploymentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateProductDeploymentResponseBodyData getData() {
        return this.data;
    }

    public CreateProductDeploymentResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class CreateProductDeploymentResponseBodyData extends TeaModel {
        // 部署uid
        @NameInMap("uid")
        public String uid;

        public static CreateProductDeploymentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateProductDeploymentResponseBodyData self = new CreateProductDeploymentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateProductDeploymentResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ModifyProjectResponseBody extends TeaModel {
    // 业务处理结果Code
    @NameInMap("Code")
    public String code;

    // 业务对象
    @NameInMap("Data")
    public ModifyProjectResponseBodyData data;

    // 业务处理消息摘要
    @NameInMap("Message")
    public String message;

    // 操作请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 业务处理是否成功
    @NameInMap("Success")
    public Boolean success;

    public static ModifyProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyProjectResponseBody self = new ModifyProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyProjectResponseBody setData(ModifyProjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyProjectResponseBodyData getData() {
        return this.data;
    }

    public ModifyProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModifyProjectResponseBodyData extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        public static ModifyProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyProjectResponseBodyData self = new ModifyProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyProjectResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}

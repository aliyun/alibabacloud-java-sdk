// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateClassResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // API请求的返回结果结构体。
    @NameInMap("Result")
    public CreateClassResponseBodyResult result;

    public static CreateClassResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClassResponseBody self = new CreateClassResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateClassResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateClassResponseBody setResult(CreateClassResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateClassResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateClassResponseBodyResult extends TeaModel {
        // 课堂唯一标识。
        @NameInMap("ClassId")
        public String classId;

        public static CreateClassResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateClassResponseBodyResult self = new CreateClassResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateClassResponseBodyResult setClassId(String classId) {
            this.classId = classId;
            return this;
        }
        public String getClassId() {
            return this.classId;
        }

    }

}

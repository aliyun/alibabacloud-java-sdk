// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class CreateBodyInstanceResponseBody extends TeaModel {
    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    // 实例id
    @NameInMap("Data")
    public CreateBodyInstanceResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    public static CreateBodyInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBodyInstanceResponseBody self = new CreateBodyInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBodyInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBodyInstanceResponseBody setData(CreateBodyInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateBodyInstanceResponseBodyData getData() {
        return this.data;
    }

    public CreateBodyInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateBodyInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class CreateBodyInstanceResponseBodyData extends TeaModel {
        // 实例ID
        @NameInMap("Id")
        public Long id;

        public static CreateBodyInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateBodyInstanceResponseBodyData self = new CreateBodyInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateBodyInstanceResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}

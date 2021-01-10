// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateDepartmentResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CreateDepartmentResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static CreateDepartmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDepartmentResponseBody self = new CreateDepartmentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDepartmentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDepartmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDepartmentResponseBody setData(CreateDepartmentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDepartmentResponseBodyData getData() {
        return this.data;
    }

    public CreateDepartmentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class CreateDepartmentResponseBodyData extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static CreateDepartmentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDepartmentResponseBodyData self = new CreateDepartmentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDepartmentResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateDepartmentResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateDepartmentResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDepartmentResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}

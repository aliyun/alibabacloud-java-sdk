// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateDepartmentResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public CreateDepartmentResponseData data;

    public static CreateDepartmentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDepartmentResponse self = new CreateDepartmentResponse();
        return TeaModel.build(map, self);
    }

    public CreateDepartmentResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDepartmentResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDepartmentResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDepartmentResponse setData(CreateDepartmentResponseData data) {
        this.data = data;
        return this;
    }
    public CreateDepartmentResponseData getData() {
        return this.data;
    }

    public static class CreateDepartmentResponseData extends TeaModel {
        @NameInMap("CreatedAt")
        @Validation(required = true)
        public String createdAt;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static CreateDepartmentResponseData build(java.util.Map<String, ?> map) throws Exception {
            CreateDepartmentResponseData self = new CreateDepartmentResponseData();
            return TeaModel.build(map, self);
        }

        public CreateDepartmentResponseData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateDepartmentResponseData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateDepartmentResponseData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateDepartmentResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}

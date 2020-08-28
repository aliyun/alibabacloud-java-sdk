// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetDepartmentResponse extends TeaModel {
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
    public GetDepartmentResponseData data;

    public static GetDepartmentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDepartmentResponse self = new GetDepartmentResponse();
        return TeaModel.build(map, self);
    }

    public GetDepartmentResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDepartmentResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDepartmentResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDepartmentResponse setData(GetDepartmentResponseData data) {
        this.data = data;
        return this;
    }
    public GetDepartmentResponseData getData() {
        return this.data;
    }

    public static class GetDepartmentResponseData extends TeaModel {
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

        @NameInMap("UpdatedAt")
        @Validation(required = true)
        public String updatedAt;

        public static GetDepartmentResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetDepartmentResponseData self = new GetDepartmentResponseData();
            return TeaModel.build(map, self);
        }

        public GetDepartmentResponseData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetDepartmentResponseData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDepartmentResponseData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetDepartmentResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDepartmentResponseData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}

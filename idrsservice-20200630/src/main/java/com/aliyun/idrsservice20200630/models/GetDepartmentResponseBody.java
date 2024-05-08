// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetDepartmentResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDepartmentResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDepartmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDepartmentResponseBody self = new GetDepartmentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDepartmentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDepartmentResponseBody setData(GetDepartmentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDepartmentResponseBodyData getData() {
        return this.data;
    }

    public GetDepartmentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDepartmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDepartmentResponseBodyData extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Description")
        public String description;

        /**
         * <p>ID</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        public static GetDepartmentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDepartmentResponseBodyData self = new GetDepartmentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDepartmentResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetDepartmentResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDepartmentResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetDepartmentResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDepartmentResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}

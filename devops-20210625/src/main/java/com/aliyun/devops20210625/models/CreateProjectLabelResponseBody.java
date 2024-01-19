// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateProjectLabelResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CreateProjectLabelResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static CreateProjectLabelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectLabelResponseBody self = new CreateProjectLabelResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProjectLabelResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateProjectLabelResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateProjectLabelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateProjectLabelResponseBody setResult(CreateProjectLabelResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateProjectLabelResponseBodyResult getResult() {
        return this.result;
    }

    public CreateProjectLabelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateProjectLabelResponseBodyResult extends TeaModel {
        @NameInMap("color")
        public String color;

        @NameInMap("description")
        public String description;

        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        public static CreateProjectLabelResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectLabelResponseBodyResult self = new CreateProjectLabelResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateProjectLabelResponseBodyResult setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public CreateProjectLabelResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateProjectLabelResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectLabelResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}

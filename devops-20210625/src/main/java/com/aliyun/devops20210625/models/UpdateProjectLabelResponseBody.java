// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateProjectLabelResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public UpdateProjectLabelResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static UpdateProjectLabelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectLabelResponseBody self = new UpdateProjectLabelResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProjectLabelResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateProjectLabelResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateProjectLabelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateProjectLabelResponseBody setResult(UpdateProjectLabelResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateProjectLabelResponseBodyResult getResult() {
        return this.result;
    }

    public UpdateProjectLabelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateProjectLabelResponseBodyResult extends TeaModel {
        @NameInMap("color")
        public String color;

        @NameInMap("description")
        public String description;

        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        public static UpdateProjectLabelResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateProjectLabelResponseBodyResult self = new UpdateProjectLabelResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateProjectLabelResponseBodyResult setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public UpdateProjectLabelResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateProjectLabelResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateProjectLabelResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}

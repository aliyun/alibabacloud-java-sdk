// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateProjectLabelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SYSTEM_UNKNOWN_ERROR</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>F7B85D1B-D1C2-140F-A039-341859F130B9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public UpdateProjectLabelResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>#EF433B</p>
         */
        @NameInMap("color")
        public String color;

        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>8d84d73cf315473683400760f02dbfc1</p>
         */
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

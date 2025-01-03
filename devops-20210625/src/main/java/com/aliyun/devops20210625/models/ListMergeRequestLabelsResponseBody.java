// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListMergeRequestLabelsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Invalid.IdNotFound</p>
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
     * <p>4D6AF7CC-B43B-5454-86AB-023D25E44868</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListMergeRequestLabelsResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListMergeRequestLabelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMergeRequestLabelsResponseBody self = new ListMergeRequestLabelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMergeRequestLabelsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListMergeRequestLabelsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListMergeRequestLabelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMergeRequestLabelsResponseBody setResult(java.util.List<ListMergeRequestLabelsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListMergeRequestLabelsResponseBodyResult> getResult() {
        return this.result;
    }

    public ListMergeRequestLabelsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMergeRequestLabelsResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>#A16AD7</p>
         */
        @NameInMap("color")
        public String color;

        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>f2bf0e0b4ce34a348b2d971c69a1d11f</p>
         */
        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        public static ListMergeRequestLabelsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestLabelsResponseBodyResult self = new ListMergeRequestLabelsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestLabelsResponseBodyResult setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public ListMergeRequestLabelsResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMergeRequestLabelsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListMergeRequestLabelsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}

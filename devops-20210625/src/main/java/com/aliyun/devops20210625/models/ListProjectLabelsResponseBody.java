// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListProjectLabelsResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListProjectLabelsResponseBodyResult> result;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("total")
    public Long total;

    public static ListProjectLabelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectLabelsResponseBody self = new ListProjectLabelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectLabelsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListProjectLabelsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListProjectLabelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectLabelsResponseBody setResult(java.util.List<ListProjectLabelsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListProjectLabelsResponseBodyResult> getResult() {
        return this.result;
    }

    public ListProjectLabelsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListProjectLabelsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListProjectLabelsResponseBodyResult extends TeaModel {
        @NameInMap("color")
        public String color;

        @NameInMap("description")
        public String description;

        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        @NameInMap("openMergeRequestsCount")
        public Long openMergeRequestsCount;

        public static ListProjectLabelsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListProjectLabelsResponseBodyResult self = new ListProjectLabelsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListProjectLabelsResponseBodyResult setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public ListProjectLabelsResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProjectLabelsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListProjectLabelsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectLabelsResponseBodyResult setOpenMergeRequestsCount(Long openMergeRequestsCount) {
            this.openMergeRequestsCount = openMergeRequestsCount;
            return this;
        }
        public Long getOpenMergeRequestsCount() {
            return this.openMergeRequestsCount;
        }

    }

}

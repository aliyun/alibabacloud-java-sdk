// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListModelingClassificationsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public ListModelingClassificationsResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListModelingClassificationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelingClassificationsResponseBody self = new ListModelingClassificationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelingClassificationsResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListModelingClassificationsResponseBody setData(ListModelingClassificationsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListModelingClassificationsResponseBodyData getData() {
        return this.data;
    }

    public ListModelingClassificationsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListModelingClassificationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListModelingClassificationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListModelingClassificationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListModelingClassificationsResponseBodyDataContent extends TeaModel {
        @NameInMap("ClassificationId")
        public Long classificationId;

        @NameInMap("ClassificationName")
        public String classificationName;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtModified")
        public String gmtModified;

        public static ListModelingClassificationsResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListModelingClassificationsResponseBodyDataContent self = new ListModelingClassificationsResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListModelingClassificationsResponseBodyDataContent setClassificationId(Long classificationId) {
            this.classificationId = classificationId;
            return this;
        }
        public Long getClassificationId() {
            return this.classificationId;
        }

        public ListModelingClassificationsResponseBodyDataContent setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

        public ListModelingClassificationsResponseBodyDataContent setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListModelingClassificationsResponseBodyDataContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

    }

    public static class ListModelingClassificationsResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public java.util.List<ListModelingClassificationsResponseBodyDataContent> content;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListModelingClassificationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListModelingClassificationsResponseBodyData self = new ListModelingClassificationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListModelingClassificationsResponseBodyData setContent(java.util.List<ListModelingClassificationsResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListModelingClassificationsResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListModelingClassificationsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListModelingClassificationsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}

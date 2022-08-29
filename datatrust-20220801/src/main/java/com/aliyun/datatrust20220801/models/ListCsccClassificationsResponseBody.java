// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccClassificationsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<ListCsccClassificationsResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListCsccClassificationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCsccClassificationsResponseBody self = new ListCsccClassificationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCsccClassificationsResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListCsccClassificationsResponseBody setData(java.util.List<ListCsccClassificationsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCsccClassificationsResponseBodyData> getData() {
        return this.data;
    }

    public ListCsccClassificationsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCsccClassificationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCsccClassificationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCsccClassificationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCsccClassificationsResponseBodyData extends TeaModel {
        @NameInMap("ClassificationId")
        public Long classificationId;

        @NameInMap("ClassificationName")
        public String classificationName;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtModified")
        public String gmtModified;

        public static ListCsccClassificationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCsccClassificationsResponseBodyData self = new ListCsccClassificationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCsccClassificationsResponseBodyData setClassificationId(Long classificationId) {
            this.classificationId = classificationId;
            return this;
        }
        public Long getClassificationId() {
            return this.classificationId;
        }

        public ListCsccClassificationsResponseBodyData setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

        public ListCsccClassificationsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCsccClassificationsResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

    }

}

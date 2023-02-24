// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListServiceQAResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("Page")
    public ListServiceQAResponseBodyPage page;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListServiceQAResponseBodyResult> result;

    @NameInMap("StatusCode")
    public Integer statusCode;

    public static ListServiceQAResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceQAResponseBody self = new ListServiceQAResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceQAResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListServiceQAResponseBody setPage(ListServiceQAResponseBodyPage page) {
        this.page = page;
        return this;
    }
    public ListServiceQAResponseBodyPage getPage() {
        return this.page;
    }

    public ListServiceQAResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceQAResponseBody setResult(java.util.List<ListServiceQAResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListServiceQAResponseBodyResult> getResult() {
        return this.result;
    }

    public ListServiceQAResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static class ListServiceQAResponseBodyPage extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static ListServiceQAResponseBodyPage build(java.util.Map<String, ?> map) throws Exception {
            ListServiceQAResponseBodyPage self = new ListServiceQAResponseBodyPage();
            return TeaModel.build(map, self);
        }

        public ListServiceQAResponseBodyPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListServiceQAResponseBodyPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListServiceQAResponseBodyPage setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class ListServiceQAResponseBodyResult extends TeaModel {
        @NameInMap("Active")
        public Boolean active;

        @NameInMap("Answer")
        public String answer;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Question")
        public String question;

        @NameInMap("ServiceQAId")
        public Long serviceQAId;

        @NameInMap("Templates")
        public String templates;

        public static ListServiceQAResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListServiceQAResponseBodyResult self = new ListServiceQAResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListServiceQAResponseBodyResult setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public ListServiceQAResponseBodyResult setAnswer(String answer) {
            this.answer = answer;
            return this;
        }
        public String getAnswer() {
            return this.answer;
        }

        public ListServiceQAResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListServiceQAResponseBodyResult setQuestion(String question) {
            this.question = question;
            return this;
        }
        public String getQuestion() {
            return this.question;
        }

        public ListServiceQAResponseBodyResult setServiceQAId(Long serviceQAId) {
            this.serviceQAId = serviceQAId;
            return this;
        }
        public Long getServiceQAId() {
            return this.serviceQAId;
        }

        public ListServiceQAResponseBodyResult setTemplates(String templates) {
            this.templates = templates;
            return this;
        }
        public String getTemplates() {
            return this.templates;
        }

    }

}

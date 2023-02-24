// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListCustomQAResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("Page")
    public ListCustomQAResponseBodyPage page;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListCustomQAResponseBodyResult> result;

    @NameInMap("StatusCode")
    public Integer statusCode;

    public static ListCustomQAResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomQAResponseBody self = new ListCustomQAResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomQAResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCustomQAResponseBody setPage(ListCustomQAResponseBodyPage page) {
        this.page = page;
        return this;
    }
    public ListCustomQAResponseBodyPage getPage() {
        return this.page;
    }

    public ListCustomQAResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomQAResponseBody setResult(java.util.List<ListCustomQAResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListCustomQAResponseBodyResult> getResult() {
        return this.result;
    }

    public ListCustomQAResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static class ListCustomQAResponseBodyPage extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static ListCustomQAResponseBodyPage build(java.util.Map<String, ?> map) throws Exception {
            ListCustomQAResponseBodyPage self = new ListCustomQAResponseBodyPage();
            return TeaModel.build(map, self);
        }

        public ListCustomQAResponseBodyPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCustomQAResponseBodyPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCustomQAResponseBodyPage setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class ListCustomQAResponseBodyResult extends TeaModel {
        @NameInMap("Answers")
        public String answers;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CustomQAId")
        public String customQAId;

        @NameInMap("HotelId")
        public String hotelId;

        @NameInMap("KeyWords")
        public String keyWords;

        @NameInMap("MajorQuestion")
        public String majorQuestion;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SupplementaryQuestion")
        public String supplementaryQuestion;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListCustomQAResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListCustomQAResponseBodyResult self = new ListCustomQAResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListCustomQAResponseBodyResult setAnswers(String answers) {
            this.answers = answers;
            return this;
        }
        public String getAnswers() {
            return this.answers;
        }

        public ListCustomQAResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListCustomQAResponseBodyResult setCustomQAId(String customQAId) {
            this.customQAId = customQAId;
            return this;
        }
        public String getCustomQAId() {
            return this.customQAId;
        }

        public ListCustomQAResponseBodyResult setHotelId(String hotelId) {
            this.hotelId = hotelId;
            return this;
        }
        public String getHotelId() {
            return this.hotelId;
        }

        public ListCustomQAResponseBodyResult setKeyWords(String keyWords) {
            this.keyWords = keyWords;
            return this;
        }
        public String getKeyWords() {
            return this.keyWords;
        }

        public ListCustomQAResponseBodyResult setMajorQuestion(String majorQuestion) {
            this.majorQuestion = majorQuestion;
            return this;
        }
        public String getMajorQuestion() {
            return this.majorQuestion;
        }

        public ListCustomQAResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListCustomQAResponseBodyResult setSupplementaryQuestion(String supplementaryQuestion) {
            this.supplementaryQuestion = supplementaryQuestion;
            return this;
        }
        public String getSupplementaryQuestion() {
            return this.supplementaryQuestion;
        }

        public ListCustomQAResponseBodyResult setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}

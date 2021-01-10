// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryPictureSearchAiboxesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryPictureSearchAiboxesResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryPictureSearchAiboxesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPictureSearchAiboxesResponseBody self = new QueryPictureSearchAiboxesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPictureSearchAiboxesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPictureSearchAiboxesResponseBody setData(QueryPictureSearchAiboxesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryPictureSearchAiboxesResponseBodyData getData() {
        return this.data;
    }

    public QueryPictureSearchAiboxesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryPictureSearchAiboxesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPictureSearchAiboxesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryPictureSearchAiboxesResponseBodyDataPageData extends TeaModel {
        @NameInMap("NickName")
        public String nickName;

        @NameInMap("IotId")
        public String iotId;

        public static QueryPictureSearchAiboxesResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureSearchAiboxesResponseBodyDataPageData self = new QueryPictureSearchAiboxesResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public QueryPictureSearchAiboxesResponseBodyDataPageData setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public QueryPictureSearchAiboxesResponseBodyDataPageData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

    public static class QueryPictureSearchAiboxesResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageData")
        public java.util.List<QueryPictureSearchAiboxesResponseBodyDataPageData> pageData;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("PageCount")
        public Integer pageCount;

        public static QueryPictureSearchAiboxesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureSearchAiboxesResponseBodyData self = new QueryPictureSearchAiboxesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryPictureSearchAiboxesResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryPictureSearchAiboxesResponseBodyData setPageData(java.util.List<QueryPictureSearchAiboxesResponseBodyDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<QueryPictureSearchAiboxesResponseBodyDataPageData> getPageData() {
            return this.pageData;
        }

        public QueryPictureSearchAiboxesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryPictureSearchAiboxesResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryPictureSearchAiboxesResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

    }

}

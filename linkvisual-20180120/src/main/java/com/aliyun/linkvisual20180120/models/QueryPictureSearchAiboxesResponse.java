// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryPictureSearchAiboxesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryPictureSearchAiboxesResponseData data;

    public static QueryPictureSearchAiboxesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPictureSearchAiboxesResponse self = new QueryPictureSearchAiboxesResponse();
        return TeaModel.build(map, self);
    }

    public QueryPictureSearchAiboxesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPictureSearchAiboxesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryPictureSearchAiboxesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPictureSearchAiboxesResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryPictureSearchAiboxesResponse setData(QueryPictureSearchAiboxesResponseData data) {
        this.data = data;
        return this;
    }
    public QueryPictureSearchAiboxesResponseData getData() {
        return this.data;
    }

    public static class QueryPictureSearchAiboxesResponseDataPageData extends TeaModel {
        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        @NameInMap("NickName")
        @Validation(required = true)
        public String nickName;

        public static QueryPictureSearchAiboxesResponseDataPageData build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureSearchAiboxesResponseDataPageData self = new QueryPictureSearchAiboxesResponseDataPageData();
            return TeaModel.build(map, self);
        }

        public QueryPictureSearchAiboxesResponseDataPageData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryPictureSearchAiboxesResponseDataPageData setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

    }

    public static class QueryPictureSearchAiboxesResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("PageCount")
        @Validation(required = true)
        public Integer pageCount;

        @NameInMap("CurrentPage")
        @Validation(required = true)
        public Integer currentPage;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("PageData")
        @Validation(required = true)
        public java.util.List<QueryPictureSearchAiboxesResponseDataPageData> pageData;

        public static QueryPictureSearchAiboxesResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureSearchAiboxesResponseData self = new QueryPictureSearchAiboxesResponseData();
            return TeaModel.build(map, self);
        }

        public QueryPictureSearchAiboxesResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryPictureSearchAiboxesResponseData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryPictureSearchAiboxesResponseData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryPictureSearchAiboxesResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryPictureSearchAiboxesResponseData setPageData(java.util.List<QueryPictureSearchAiboxesResponseDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<QueryPictureSearchAiboxesResponseDataPageData> getPageData() {
            return this.pageData;
        }

    }

}

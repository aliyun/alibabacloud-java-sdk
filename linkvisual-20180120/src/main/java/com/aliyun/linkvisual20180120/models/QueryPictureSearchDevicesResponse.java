// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryPictureSearchDevicesResponse extends TeaModel {
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
    public QueryPictureSearchDevicesResponseData data;

    public static QueryPictureSearchDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPictureSearchDevicesResponse self = new QueryPictureSearchDevicesResponse();
        return TeaModel.build(map, self);
    }

    public QueryPictureSearchDevicesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPictureSearchDevicesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryPictureSearchDevicesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPictureSearchDevicesResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryPictureSearchDevicesResponse setData(QueryPictureSearchDevicesResponseData data) {
        this.data = data;
        return this;
    }
    public QueryPictureSearchDevicesResponseData getData() {
        return this.data;
    }

    public static class QueryPictureSearchDevicesResponseDataPageData extends TeaModel {
        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        @NameInMap("NickName")
        @Validation(required = true)
        public String nickName;

        public static QueryPictureSearchDevicesResponseDataPageData build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureSearchDevicesResponseDataPageData self = new QueryPictureSearchDevicesResponseDataPageData();
            return TeaModel.build(map, self);
        }

        public QueryPictureSearchDevicesResponseDataPageData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryPictureSearchDevicesResponseDataPageData setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

    }

    public static class QueryPictureSearchDevicesResponseData extends TeaModel {
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
        public java.util.List<QueryPictureSearchDevicesResponseDataPageData> pageData;

        public static QueryPictureSearchDevicesResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureSearchDevicesResponseData self = new QueryPictureSearchDevicesResponseData();
            return TeaModel.build(map, self);
        }

        public QueryPictureSearchDevicesResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryPictureSearchDevicesResponseData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryPictureSearchDevicesResponseData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryPictureSearchDevicesResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryPictureSearchDevicesResponseData setPageData(java.util.List<QueryPictureSearchDevicesResponseDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<QueryPictureSearchDevicesResponseDataPageData> getPageData() {
            return this.pageData;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryPictureSearchDevicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryPictureSearchDevicesResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryPictureSearchDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPictureSearchDevicesResponseBody self = new QueryPictureSearchDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPictureSearchDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPictureSearchDevicesResponseBody setData(QueryPictureSearchDevicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryPictureSearchDevicesResponseBodyData getData() {
        return this.data;
    }

    public QueryPictureSearchDevicesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryPictureSearchDevicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPictureSearchDevicesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryPictureSearchDevicesResponseBodyDataPageData extends TeaModel {
        @NameInMap("NickName")
        public String nickName;

        @NameInMap("IotId")
        public String iotId;

        public static QueryPictureSearchDevicesResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureSearchDevicesResponseBodyDataPageData self = new QueryPictureSearchDevicesResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public QueryPictureSearchDevicesResponseBodyDataPageData setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public QueryPictureSearchDevicesResponseBodyDataPageData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

    public static class QueryPictureSearchDevicesResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageData")
        public java.util.List<QueryPictureSearchDevicesResponseBodyDataPageData> pageData;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("PageCount")
        public Integer pageCount;

        public static QueryPictureSearchDevicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureSearchDevicesResponseBodyData self = new QueryPictureSearchDevicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryPictureSearchDevicesResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryPictureSearchDevicesResponseBodyData setPageData(java.util.List<QueryPictureSearchDevicesResponseBodyDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<QueryPictureSearchDevicesResponseBodyDataPageData> getPageData() {
            return this.pageData;
        }

        public QueryPictureSearchDevicesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryPictureSearchDevicesResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryPictureSearchDevicesResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

    }

}

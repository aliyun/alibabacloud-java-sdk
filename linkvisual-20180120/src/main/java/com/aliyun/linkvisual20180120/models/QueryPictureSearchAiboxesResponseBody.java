// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryPictureSearchAiboxesResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <ul>
     * <li><strong>200</strong>: The call was successful.</li>
     * <li>Other values: an error code. For more information, see <a href="https://help.aliyun.com/document_detail/288314.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned when the call is successful.</p>
     */
    @NameInMap("Data")
    public QueryPictureSearchAiboxesResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Specified parameter CurrentPage is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DF7DC571-FE48-4C25-8BE0-B13C3038C85B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryPictureSearchAiboxesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPictureSearchAiboxesResponseBody self = new QueryPictureSearchAiboxesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPictureSearchAiboxesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
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

    public QueryPictureSearchAiboxesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPictureSearchAiboxesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryPictureSearchAiboxesResponseBodyDataPageData extends TeaModel {
        /**
         * <p>The device ID of the V-series edge all-in-one machine.</p>
         * 
         * <strong>example:</strong>
         * <p>VrJwPGjC1sJlqPjZA3cxg4****</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <p>The device alias of the V-series edge all-in-one machine.</p>
         * 
         * <strong>example:</strong>
         * <p>box015</p>
         */
        @NameInMap("NickName")
        public String nickName;

        public static QueryPictureSearchAiboxesResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureSearchAiboxesResponseBodyDataPageData self = new QueryPictureSearchAiboxesResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public QueryPictureSearchAiboxesResponseBodyDataPageData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryPictureSearchAiboxesResponseBodyDataPageData setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

    }

    public static class QueryPictureSearchAiboxesResponseBodyData extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageCount")
        public Integer pageCount;

        /**
         * <p>The list of V-series edge all-in-one machines.</p>
         */
        @NameInMap("PageData")
        public java.util.List<QueryPictureSearchAiboxesResponseBodyDataPageData> pageData;

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Integer total;

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

        public QueryPictureSearchAiboxesResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
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

    }

}

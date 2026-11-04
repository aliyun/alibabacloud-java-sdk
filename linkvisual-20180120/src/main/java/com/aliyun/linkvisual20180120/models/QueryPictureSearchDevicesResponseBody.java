// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryPictureSearchDevicesResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/145071.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public QueryPictureSearchDevicesResponseBodyData data;

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

    public static QueryPictureSearchDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPictureSearchDevicesResponseBody self = new QueryPictureSearchDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPictureSearchDevicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
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

    public QueryPictureSearchDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPictureSearchDevicesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryPictureSearchDevicesResponseBodyDataPageData extends TeaModel {
        /**
         * <p>The ID of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>VrJwPGjC1sJlqPjZA3cxg4****</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <p>The alias of the device.</p>
         * <blockquote>
         * <p>This parameter is returned only for IPC devices.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>camera1</p>
         */
        @NameInMap("NickName")
        public String nickName;

        public static QueryPictureSearchDevicesResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureSearchDevicesResponseBodyDataPageData self = new QueryPictureSearchDevicesResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public QueryPictureSearchDevicesResponseBodyDataPageData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryPictureSearchDevicesResponseBodyDataPageData setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

    }

    public static class QueryPictureSearchDevicesResponseBodyData extends TeaModel {
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
         * <p>The list of applications.</p>
         */
        @NameInMap("PageData")
        public java.util.List<QueryPictureSearchDevicesResponseBodyDataPageData> pageData;

        /**
         * <p>The number of entries returned per page.</p>
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

        public QueryPictureSearchDevicesResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
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

    }

}

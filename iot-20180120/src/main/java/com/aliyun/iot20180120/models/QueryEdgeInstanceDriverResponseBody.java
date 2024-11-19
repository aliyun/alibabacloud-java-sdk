// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceDriverResponseBody extends TeaModel {
    /**
     * <p>The return code of the operation. A value of Success indicates that the call was successful. Other values indicate that specific errors occurred. For more information, see <a href="https://help.aliyun.com/document_detail/135200.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data that is returned if the call was successful.</p>
     */
    @NameInMap("Data")
    public QueryEdgeInstanceDriverResponseBodyData data;

    /**
     * <p>The error message that is returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>request parameter error</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>77F540BC-A0EF-46A4-ABDE-18644C69AAF5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. A value of true indicates that the call was successful. A value of false indicates that the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryEdgeInstanceDriverResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceDriverResponseBody self = new QueryEdgeInstanceDriverResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceDriverResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEdgeInstanceDriverResponseBody setData(QueryEdgeInstanceDriverResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryEdgeInstanceDriverResponseBodyData getData() {
        return this.data;
    }

    public QueryEdgeInstanceDriverResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEdgeInstanceDriverResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEdgeInstanceDriverResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryEdgeInstanceDriverResponseBodyDataDriverList extends TeaModel {
        /**
         * <p>The ID of the driver.</p>
         * 
         * <strong>example:</strong>
         * <p>9c1ae7bd59f1469abbdccc959228****</p>
         */
        @NameInMap("DriverId")
        public String driverId;

        /**
         * <p>The version number of the driver.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("DriverVersion")
        public String driverVersion;

        /**
         * <p>The time when the driver was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-06-26 17:22:25</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The last time when the driver was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-06-26 17:22:25</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>11123458765423</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        public static QueryEdgeInstanceDriverResponseBodyDataDriverList build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceDriverResponseBodyDataDriverList self = new QueryEdgeInstanceDriverResponseBodyDataDriverList();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceDriverResponseBodyDataDriverList setDriverId(String driverId) {
            this.driverId = driverId;
            return this;
        }
        public String getDriverId() {
            return this.driverId;
        }

        public QueryEdgeInstanceDriverResponseBodyDataDriverList setDriverVersion(String driverVersion) {
            this.driverVersion = driverVersion;
            return this;
        }
        public String getDriverVersion() {
            return this.driverVersion;
        }

        public QueryEdgeInstanceDriverResponseBodyDataDriverList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryEdgeInstanceDriverResponseBodyDataDriverList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryEdgeInstanceDriverResponseBodyDataDriverList setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

    public static class QueryEdgeInstanceDriverResponseBodyData extends TeaModel {
        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The list of drivers.</p>
         */
        @NameInMap("DriverList")
        public java.util.List<QueryEdgeInstanceDriverResponseBodyDataDriverList> driverList;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The number of drivers.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static QueryEdgeInstanceDriverResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceDriverResponseBodyData self = new QueryEdgeInstanceDriverResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceDriverResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryEdgeInstanceDriverResponseBodyData setDriverList(java.util.List<QueryEdgeInstanceDriverResponseBodyDataDriverList> driverList) {
            this.driverList = driverList;
            return this;
        }
        public java.util.List<QueryEdgeInstanceDriverResponseBodyDataDriverList> getDriverList() {
            return this.driverList;
        }

        public QueryEdgeInstanceDriverResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEdgeInstanceDriverResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}

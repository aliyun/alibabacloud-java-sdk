// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeDriverResponseBody extends TeaModel {
    /**
     * <p>The error code. Success indicates that the call was successful. Other values indicate that specific errors occurred. For more information, see <a href="https://help.aliyun.com/document_detail/135200.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned if the call was successful.</p>
     */
    @NameInMap("Data")
    public QueryEdgeDriverResponseBodyData data;

    /**
     * <p>The error message returned if the call failed.</p>
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
     * <p>E0BD540E-DCFE-4602-B6D1-D208E8594BF7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. true indicates that the call was successful. false indicates that the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryEdgeDriverResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeDriverResponseBody self = new QueryEdgeDriverResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEdgeDriverResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEdgeDriverResponseBody setData(QueryEdgeDriverResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryEdgeDriverResponseBodyData getData() {
        return this.data;
    }

    public QueryEdgeDriverResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEdgeDriverResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEdgeDriverResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryEdgeDriverResponseBodyDataDriverList extends TeaModel {
        /**
         * <p>The CPU architecture that the driver supports. Valid values:</p>
         * <ul>
         * <li>ARMv7</li>
         * <li>ARMv7-HF</li>
         * <li>AArch64</li>
         * <li>x86-64</li>
         * <li>x86</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>x86-64</p>
         */
        @NameInMap("CpuArch")
        public String cpuArch;

        /**
         * <p>The ID of the driver.</p>
         * 
         * <strong>example:</strong>
         * <p>fec565038d7544978d9aed5c1a******</p>
         */
        @NameInMap("DriverId")
        public String driverId;

        /**
         * <p>The name of the driver.</p>
         * 
         * <strong>example:</strong>
         * <p>MyLedDriver</p>
         */
        @NameInMap("DriverName")
        public String driverName;

        /**
         * <p>The communications protocol that the driver uses. Valid values:</p>
         * <ul>
         * <li>modbus: Modbus protocol</li>
         * <li>opc-ua: OPC UA protocol</li>
         * <li>customize: custom protocol</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>customize</p>
         */
        @NameInMap("DriverProtocol")
        public String driverProtocol;

        /**
         * <p>The time when the driver was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1581912859713</p>
         */
        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        /**
         * <p>The time when the driver was last modified. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1581912859713</p>
         */
        @NameInMap("GmtModifiedTimestamp")
        public Long gmtModifiedTimestamp;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsApply")
        public Boolean isApply;

        /**
         * <p>Indicates whether the driver is a built-in driver.</p>
         * <ul>
         * <li>true: indicates that the driver is a built-in driver, that is, the driver code is pre-configured on the gateway device.</li>
         * <li>false: indicates that the driver is not a built-in driver.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsBuiltIn")
        public Boolean isBuiltIn;

        /**
         * <p>The language in which the driver is programmed. Valid values:</p>
         * <ul>
         * <li>nodejs8: Node.js v8</li>
         * <li>python3: Python v3.5</li>
         * <li>c: C</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>c</p>
         */
        @NameInMap("Runtime")
        public String runtime;

        /**
         * <p>The type of the driver. Valid values:</p>
         * <ul>
         * <li>0: official driver</li>
         * <li>1: custom driver</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static QueryEdgeDriverResponseBodyDataDriverList build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeDriverResponseBodyDataDriverList self = new QueryEdgeDriverResponseBodyDataDriverList();
            return TeaModel.build(map, self);
        }

        public QueryEdgeDriverResponseBodyDataDriverList setCpuArch(String cpuArch) {
            this.cpuArch = cpuArch;
            return this;
        }
        public String getCpuArch() {
            return this.cpuArch;
        }

        public QueryEdgeDriverResponseBodyDataDriverList setDriverId(String driverId) {
            this.driverId = driverId;
            return this;
        }
        public String getDriverId() {
            return this.driverId;
        }

        public QueryEdgeDriverResponseBodyDataDriverList setDriverName(String driverName) {
            this.driverName = driverName;
            return this;
        }
        public String getDriverName() {
            return this.driverName;
        }

        public QueryEdgeDriverResponseBodyDataDriverList setDriverProtocol(String driverProtocol) {
            this.driverProtocol = driverProtocol;
            return this;
        }
        public String getDriverProtocol() {
            return this.driverProtocol;
        }

        public QueryEdgeDriverResponseBodyDataDriverList setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public QueryEdgeDriverResponseBodyDataDriverList setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
            this.gmtModifiedTimestamp = gmtModifiedTimestamp;
            return this;
        }
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        public QueryEdgeDriverResponseBodyDataDriverList setIsApply(Boolean isApply) {
            this.isApply = isApply;
            return this;
        }
        public Boolean getIsApply() {
            return this.isApply;
        }

        public QueryEdgeDriverResponseBodyDataDriverList setIsBuiltIn(Boolean isBuiltIn) {
            this.isBuiltIn = isBuiltIn;
            return this;
        }
        public Boolean getIsBuiltIn() {
            return this.isBuiltIn;
        }

        public QueryEdgeDriverResponseBodyDataDriverList setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public QueryEdgeDriverResponseBodyDataDriverList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class QueryEdgeDriverResponseBodyData extends TeaModel {
        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The information about each driver.</p>
         */
        @NameInMap("DriverList")
        public java.util.List<QueryEdgeDriverResponseBodyDataDriverList> driverList;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of official or custom drivers found.</p>
         * <ul>
         * <li>If the value of Type is 0, the value of this parameter is the total number of official drivers found.</li>
         * <li>If the value of Type is 1, the value of this parameter is the total number of custom drivers found.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static QueryEdgeDriverResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeDriverResponseBodyData self = new QueryEdgeDriverResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryEdgeDriverResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryEdgeDriverResponseBodyData setDriverList(java.util.List<QueryEdgeDriverResponseBodyDataDriverList> driverList) {
            this.driverList = driverList;
            return this;
        }
        public java.util.List<QueryEdgeDriverResponseBodyDataDriverList> getDriverList() {
            return this.driverList;
        }

        public QueryEdgeDriverResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEdgeDriverResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class PageServiceCustomerResponseBody extends TeaModel {
    /**
     * <p>Interface return code.</p>
     * 
     * <strong>example:</strong>
     * <p>System error or openapi error</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data query results.</p>
     */
    @NameInMap("Data")
    public java.util.List<PageServiceCustomerResponseBodyData> data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Return message. When the request is successful, it returns a success message; when the request fails, it returns the reason for the failure.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Pagination information.</p>
     */
    @NameInMap("PageInfo")
    public PageServiceCustomerResponseBodyPageInfo pageInfo;

    /**
     * <p>Request ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>808A307F-9513-5099-AAA5-98D4EF199140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Request return status.</p>
     * <ul>
     * <li>true: Success.</li>
     * <li>false: Failure.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static PageServiceCustomerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PageServiceCustomerResponseBody self = new PageServiceCustomerResponseBody();
        return TeaModel.build(map, self);
    }

    public PageServiceCustomerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PageServiceCustomerResponseBody setData(java.util.List<PageServiceCustomerResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PageServiceCustomerResponseBodyData> getData() {
        return this.data;
    }

    public PageServiceCustomerResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public PageServiceCustomerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PageServiceCustomerResponseBody setPageInfo(PageServiceCustomerResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageServiceCustomerResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public PageServiceCustomerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PageServiceCustomerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PageServiceCustomerResponseBodyData extends TeaModel {
        /**
         * <p>Customer UID.</p>
         * 
         * <strong>example:</strong>
         * <p>1667751131382856</p>
         */
        @NameInMap("Aliuid")
        public String aliuid;

        /**
         * <p>Authorization status.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AuthStatus")
        public Integer authStatus;

        /**
         * <p>Cloud Monitoring - Alert authorization status.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CmAuthStatus")
        public Integer cmAuthStatus;

        /**
         * <p>End time. The format is a Unix timestamp, which is the number of milliseconds since January 1, 1970.</p>
         * 
         * <strong>example:</strong>
         * <p>1710123149222</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>Customer level.</p>
         * 
         * <strong>example:</strong>
         * <p>GC1</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>Cloud Security - Alert authorization status.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MonitorAuthStatus")
        public Integer monitorAuthStatus;

        /**
         * <p>Customer name.</p>
         * 
         * <strong>example:</strong>
         * <p>中国工程院</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Owner name.</p>
         * 
         * <strong>example:</strong>
         * <p>常温</p>
         */
        @NameInMap("OwnId")
        public String ownId;

        /**
         * <p>Start time. The format is a Unix timestamp, which is the number of milliseconds since January 1, 1970.</p>
         * 
         * <strong>example:</strong>
         * <p>1710123149000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>Customer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1667751131382856</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>Version information.</p>
         * 
         * <strong>example:</strong>
         * <p>企业版</p>
         */
        @NameInMap("Version")
        public String version;

        public static PageServiceCustomerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PageServiceCustomerResponseBodyData self = new PageServiceCustomerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PageServiceCustomerResponseBodyData setAliuid(String aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public String getAliuid() {
            return this.aliuid;
        }

        public PageServiceCustomerResponseBodyData setAuthStatus(Integer authStatus) {
            this.authStatus = authStatus;
            return this;
        }
        public Integer getAuthStatus() {
            return this.authStatus;
        }

        public PageServiceCustomerResponseBodyData setCmAuthStatus(Integer cmAuthStatus) {
            this.cmAuthStatus = cmAuthStatus;
            return this;
        }
        public Integer getCmAuthStatus() {
            return this.cmAuthStatus;
        }

        public PageServiceCustomerResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public PageServiceCustomerResponseBodyData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public PageServiceCustomerResponseBodyData setMonitorAuthStatus(Integer monitorAuthStatus) {
            this.monitorAuthStatus = monitorAuthStatus;
            return this;
        }
        public Integer getMonitorAuthStatus() {
            return this.monitorAuthStatus;
        }

        public PageServiceCustomerResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PageServiceCustomerResponseBodyData setOwnId(String ownId) {
            this.ownId = ownId;
            return this;
        }
        public String getOwnId() {
            return this.ownId;
        }

        public PageServiceCustomerResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public PageServiceCustomerResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public PageServiceCustomerResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class PageServiceCustomerResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The current page number in pagination queries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>Number of items per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Total number of query results.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static PageServiceCustomerResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            PageServiceCustomerResponseBodyPageInfo self = new PageServiceCustomerResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public PageServiceCustomerResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public PageServiceCustomerResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public PageServiceCustomerResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}

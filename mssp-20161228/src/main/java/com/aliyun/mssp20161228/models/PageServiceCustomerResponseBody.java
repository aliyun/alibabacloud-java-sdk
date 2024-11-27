// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class PageServiceCustomerResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<PageServiceCustomerResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageInfo")
    public PageServiceCustomerResponseBodyPageInfo pageInfo;

    /**
     * <p>Id of the request</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Aliuid")
        public String aliuid;

        @NameInMap("AuthStatus")
        public Integer authStatus;

        @NameInMap("CmAuthStatus")
        public Integer cmAuthStatus;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Level")
        public String level;

        @NameInMap("MonitorAuthStatus")
        public Integer monitorAuthStatus;

        @NameInMap("Name")
        public String name;

        @NameInMap("OwnId")
        public String ownId;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("UserId")
        public String userId;

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
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

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

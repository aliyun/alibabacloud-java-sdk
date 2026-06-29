// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDataServiceApiCallStatisticsResponseBody extends TeaModel {
    /**
     * <p>Backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Backend error details.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Paginated query result.</p>
     */
    @NameInMap("PageResult")
    public ListDataServiceApiCallStatisticsResponseBodyPageResult pageResult;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDataServiceApiCallStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApiCallStatisticsResponseBody self = new ListDataServiceApiCallStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataServiceApiCallStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDataServiceApiCallStatisticsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDataServiceApiCallStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDataServiceApiCallStatisticsResponseBody setPageResult(ListDataServiceApiCallStatisticsResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListDataServiceApiCallStatisticsResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListDataServiceApiCallStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataServiceApiCallStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataServiceApiCallStatisticsResponseBodyPageResultCallStatisticsList extends TeaModel {
        /**
         * <p>API ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1003</p>
         */
        @NameInMap("ApiId")
        public Long apiId;

        /**
         * <p>API name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>Authorized application names.</p>
         */
        @NameInMap("AppNameList")
        public java.util.List<String> appNameList;

        /**
         * <p>Number of authorized applications.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AuthorizedAppCount")
        public Integer authorizedAppCount;

        /**
         * <p>Average response time, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("AvgResponseTime")
        public Double avgResponseTime;

        /**
         * <p>Number of calls.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CallCount")
        public Long callCount;

        /**
         * <p>Creator.</p>
         * 
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>Number of call errors.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("ErrorCount")
        public String errorCount;

        /**
         * <p>Error rate.</p>
         * 
         * <strong>example:</strong>
         * <p>23.2%</p>
         */
        @NameInMap("ErrorRate")
        public String errorRate;

        /**
         * <p>Last call time. Format: yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 08:00:00</p>
         */
        @NameInMap("LastCallTime")
        public String lastCallTime;

        /**
         * <p>Offline percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>23.2%</p>
         */
        @NameInMap("OfflineRate")
        public String offlineRate;

        /**
         * <p>Data service project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>101201</p>
         */
        @NameInMap("ProjectId")
        public Integer projectId;

        /**
         * <p>Data service project.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>SQL table primary key.</p>
         * 
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("SqlId")
        public Integer sqlId;

        public static ListDataServiceApiCallStatisticsResponseBodyPageResultCallStatisticsList build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApiCallStatisticsResponseBodyPageResultCallStatisticsList self = new ListDataServiceApiCallStatisticsResponseBodyPageResultCallStatisticsList();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApiCallStatisticsResponseBodyPageResultCallStatisticsList setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public ListDataServiceApiCallStatisticsResponseBodyPageResultCallStatisticsList setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public ListDataServiceApiCallStatisticsResponseBodyPageResultCallStatisticsList setAppNameList(java.util.List<String> appNameList) {
            this.appNameList = appNameList;
            return this;
        }
        public java.util.List<String> getAppNameList() {
            return this.appNameList;
        }

        public ListDataServiceApiCallStatisticsResponseBodyPageResultCallStatisticsList setAuthorizedAppCount(Integer authorizedAppCount) {
            this.authorizedAppCount = authorizedAppCount;
            return this;
        }
        public Integer getAuthorizedAppCount() {
            return this.authorizedAppCount;
        }

        public ListDataServiceApiCallStatisticsResponseBodyPageResultCallStatisticsList setAvgResponseTime(Double avgResponseTime) {
            this.avgResponseTime = avgResponseTime;
            return this;
        }
        public Double getAvgResponseTime() {
            return this.avgResponseTime;
        }

        public ListDataServiceApiCallStatisticsResponseBodyPageResultCallStatisticsList setCallCount(Long callCount) {
            this.callCount = callCount;
            return this;
        }
        public Long getCallCount() {
            return this.callCount;
        }

        public ListDataServiceApiCallStatisticsResponseBodyPageResultCallStatisticsList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListDataServiceApiCallStatisticsResponseBodyPageResultCallStatisticsList setErrorCount(String errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public String getErrorCount() {
            return this.errorCount;
        }

        public ListDataServiceApiCallStatisticsResponseBodyPageResultCallStatisticsList setErrorRate(String errorRate) {
            this.errorRate = errorRate;
            return this;
        }
        public String getErrorRate() {
            return this.errorRate;
        }

        public ListDataServiceApiCallStatisticsResponseBodyPageResultCallStatisticsList setLastCallTime(String lastCallTime) {
            this.lastCallTime = lastCallTime;
            return this;
        }
        public String getLastCallTime() {
            return this.lastCallTime;
        }

        public ListDataServiceApiCallStatisticsResponseBodyPageResultCallStatisticsList setOfflineRate(String offlineRate) {
            this.offlineRate = offlineRate;
            return this;
        }
        public String getOfflineRate() {
            return this.offlineRate;
        }

        public ListDataServiceApiCallStatisticsResponseBodyPageResultCallStatisticsList setProjectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }
        public Integer getProjectId() {
            return this.projectId;
        }

        public ListDataServiceApiCallStatisticsResponseBodyPageResultCallStatisticsList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListDataServiceApiCallStatisticsResponseBodyPageResultCallStatisticsList setSqlId(Integer sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public Integer getSqlId() {
            return this.sqlId;
        }

    }

    public static class ListDataServiceApiCallStatisticsResponseBodyPageResult extends TeaModel {
        /**
         * <p>API call statistics list.</p>
         */
        @NameInMap("CallStatisticsList")
        public java.util.List<ListDataServiceApiCallStatisticsResponseBodyPageResultCallStatisticsList> callStatisticsList;

        /**
         * <p>Total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDataServiceApiCallStatisticsResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApiCallStatisticsResponseBodyPageResult self = new ListDataServiceApiCallStatisticsResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApiCallStatisticsResponseBodyPageResult setCallStatisticsList(java.util.List<ListDataServiceApiCallStatisticsResponseBodyPageResultCallStatisticsList> callStatisticsList) {
            this.callStatisticsList = callStatisticsList;
            return this;
        }
        public java.util.List<ListDataServiceApiCallStatisticsResponseBodyPageResultCallStatisticsList> getCallStatisticsList() {
            return this.callStatisticsList;
        }

        public ListDataServiceApiCallStatisticsResponseBodyPageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDataServiceApiImpactsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("PageResult")
    public ListDataServiceApiImpactsResponseBodyPageResult pageResult;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListDataServiceApiImpactsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApiImpactsResponseBody self = new ListDataServiceApiImpactsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataServiceApiImpactsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDataServiceApiImpactsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDataServiceApiImpactsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDataServiceApiImpactsResponseBody setPageResult(ListDataServiceApiImpactsResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListDataServiceApiImpactsResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListDataServiceApiImpactsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataServiceApiImpactsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataServiceApiImpactsResponseBodyPageResultImpactList extends TeaModel {
        /**
         * <p>apiNo</p>
         * 
         * <strong>example:</strong>
         * <p>2011</p>
         */
        @NameInMap("ApiId")
        public Long apiId;

        /**
         * <p>appKey</p>
         * 
         * <strong>example:</strong>
         * <p>1101</p>
         */
        @NameInMap("AppKey")
        public Long appKey;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("CallCount")
        public Long callCount;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ClientFailCount")
        public Long clientFailCount;

        /**
         * <strong>example:</strong>
         * <p>192.168.1.1</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ErrorApiCount")
        public Long errorApiCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ErrorCount")
        public Long errorCount;

        /**
         * <strong>example:</strong>
         * <p>10.0</p>
         */
        @NameInMap("ErrorRate")
        public String errorRate;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 08:00:00</p>
         */
        @NameInMap("LastCallTime")
        public String lastCallTime;

        /**
         * <strong>example:</strong>
         * <p>2025_0611_1011</p>
         */
        @NameInMap("Minute")
        public String minute;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OfflineCount")
        public Long offlineCount;

        /**
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("SuccessTimeCost")
        public String successTimeCost;

        /**
         * <strong>example:</strong>
         * <p>88</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <strong>example:</strong>
         * <p>231</p>
         */
        @NameInMap("TotalTimeCost")
        public String totalTimeCost;

        public static ListDataServiceApiImpactsResponseBodyPageResultImpactList build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApiImpactsResponseBodyPageResultImpactList self = new ListDataServiceApiImpactsResponseBodyPageResultImpactList();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApiImpactsResponseBodyPageResultImpactList setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public ListDataServiceApiImpactsResponseBodyPageResultImpactList setAppKey(Long appKey) {
            this.appKey = appKey;
            return this;
        }
        public Long getAppKey() {
            return this.appKey;
        }

        public ListDataServiceApiImpactsResponseBodyPageResultImpactList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListDataServiceApiImpactsResponseBodyPageResultImpactList setCallCount(Long callCount) {
            this.callCount = callCount;
            return this;
        }
        public Long getCallCount() {
            return this.callCount;
        }

        public ListDataServiceApiImpactsResponseBodyPageResultImpactList setClientFailCount(Long clientFailCount) {
            this.clientFailCount = clientFailCount;
            return this;
        }
        public Long getClientFailCount() {
            return this.clientFailCount;
        }

        public ListDataServiceApiImpactsResponseBodyPageResultImpactList setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public ListDataServiceApiImpactsResponseBodyPageResultImpactList setErrorApiCount(Long errorApiCount) {
            this.errorApiCount = errorApiCount;
            return this;
        }
        public Long getErrorApiCount() {
            return this.errorApiCount;
        }

        public ListDataServiceApiImpactsResponseBodyPageResultImpactList setErrorCount(Long errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Long getErrorCount() {
            return this.errorCount;
        }

        public ListDataServiceApiImpactsResponseBodyPageResultImpactList setErrorRate(String errorRate) {
            this.errorRate = errorRate;
            return this;
        }
        public String getErrorRate() {
            return this.errorRate;
        }

        public ListDataServiceApiImpactsResponseBodyPageResultImpactList setLastCallTime(String lastCallTime) {
            this.lastCallTime = lastCallTime;
            return this;
        }
        public String getLastCallTime() {
            return this.lastCallTime;
        }

        public ListDataServiceApiImpactsResponseBodyPageResultImpactList setMinute(String minute) {
            this.minute = minute;
            return this;
        }
        public String getMinute() {
            return this.minute;
        }

        public ListDataServiceApiImpactsResponseBodyPageResultImpactList setOfflineCount(Long offlineCount) {
            this.offlineCount = offlineCount;
            return this;
        }
        public Long getOfflineCount() {
            return this.offlineCount;
        }

        public ListDataServiceApiImpactsResponseBodyPageResultImpactList setSuccessTimeCost(String successTimeCost) {
            this.successTimeCost = successTimeCost;
            return this;
        }
        public String getSuccessTimeCost() {
            return this.successTimeCost;
        }

        public ListDataServiceApiImpactsResponseBodyPageResultImpactList setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListDataServiceApiImpactsResponseBodyPageResultImpactList setTotalTimeCost(String totalTimeCost) {
            this.totalTimeCost = totalTimeCost;
            return this;
        }
        public String getTotalTimeCost() {
            return this.totalTimeCost;
        }

    }

    public static class ListDataServiceApiImpactsResponseBodyPageResult extends TeaModel {
        @NameInMap("ImpactList")
        public java.util.List<ListDataServiceApiImpactsResponseBodyPageResultImpactList> impactList;

        /**
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDataServiceApiImpactsResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApiImpactsResponseBodyPageResult self = new ListDataServiceApiImpactsResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApiImpactsResponseBodyPageResult setImpactList(java.util.List<ListDataServiceApiImpactsResponseBodyPageResultImpactList> impactList) {
            this.impactList = impactList;
            return this;
        }
        public java.util.List<ListDataServiceApiImpactsResponseBodyPageResultImpactList> getImpactList() {
            return this.impactList;
        }

        public ListDataServiceApiImpactsResponseBodyPageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}

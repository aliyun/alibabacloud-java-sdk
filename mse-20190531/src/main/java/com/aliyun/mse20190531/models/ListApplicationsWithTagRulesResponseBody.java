// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListApplicationsWithTagRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListApplicationsWithTagRulesResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListApplicationsWithTagRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsWithTagRulesResponseBody self = new ListApplicationsWithTagRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationsWithTagRulesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListApplicationsWithTagRulesResponseBody setData(ListApplicationsWithTagRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListApplicationsWithTagRulesResponseBodyData getData() {
        return this.data;
    }

    public ListApplicationsWithTagRulesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListApplicationsWithTagRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListApplicationsWithTagRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationsWithTagRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListApplicationsWithTagRulesResponseBodyDataResultRouteRules extends TeaModel {
        @NameInMap("CarryData")
        public Boolean carryData;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceNum")
        public Integer instanceNum;

        @NameInMap("Name")
        public String name;

        @NameInMap("Rate")
        public Integer rate;

        @NameInMap("Remove")
        public Boolean remove;

        @NameInMap("Rules")
        public String rules;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Tag")
        public String tag;

        public static ListApplicationsWithTagRulesResponseBodyDataResultRouteRules build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsWithTagRulesResponseBodyDataResultRouteRules self = new ListApplicationsWithTagRulesResponseBodyDataResultRouteRules();
            return TeaModel.build(map, self);
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRules setCarryData(Boolean carryData) {
            this.carryData = carryData;
            return this;
        }
        public Boolean getCarryData() {
            return this.carryData;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRules setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRules setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRules setInstanceNum(Integer instanceNum) {
            this.instanceNum = instanceNum;
            return this;
        }
        public Integer getInstanceNum() {
            return this.instanceNum;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRules setRate(Integer rate) {
            this.rate = rate;
            return this;
        }
        public Integer getRate() {
            return this.rate;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRules setRemove(Boolean remove) {
            this.remove = remove;
            return this;
        }
        public Boolean getRemove() {
            return this.remove;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRules setRules(String rules) {
            this.rules = rules;
            return this;
        }
        public String getRules() {
            return this.rules;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRules setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResultRouteRules setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

    public static class ListApplicationsWithTagRulesResponseBodyDataResult extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("RouteRules")
        public java.util.List<ListApplicationsWithTagRulesResponseBodyDataResultRouteRules> routeRules;

        @NameInMap("RouteStatus")
        public Long routeStatus;

        public static ListApplicationsWithTagRulesResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsWithTagRulesResponseBodyDataResult self = new ListApplicationsWithTagRulesResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListApplicationsWithTagRulesResponseBodyDataResult setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResult setRouteRules(java.util.List<ListApplicationsWithTagRulesResponseBodyDataResultRouteRules> routeRules) {
            this.routeRules = routeRules;
            return this;
        }
        public java.util.List<ListApplicationsWithTagRulesResponseBodyDataResultRouteRules> getRouteRules() {
            return this.routeRules;
        }

        public ListApplicationsWithTagRulesResponseBodyDataResult setRouteStatus(Long routeStatus) {
            this.routeStatus = routeStatus;
            return this;
        }
        public Long getRouteStatus() {
            return this.routeStatus;
        }

    }

    public static class ListApplicationsWithTagRulesResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Result")
        public java.util.List<ListApplicationsWithTagRulesResponseBodyDataResult> result;

        @NameInMap("TotalSize")
        public Integer totalSize;

        public static ListApplicationsWithTagRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsWithTagRulesResponseBodyData self = new ListApplicationsWithTagRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListApplicationsWithTagRulesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListApplicationsWithTagRulesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListApplicationsWithTagRulesResponseBodyData setResult(java.util.List<ListApplicationsWithTagRulesResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListApplicationsWithTagRulesResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ListApplicationsWithTagRulesResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}

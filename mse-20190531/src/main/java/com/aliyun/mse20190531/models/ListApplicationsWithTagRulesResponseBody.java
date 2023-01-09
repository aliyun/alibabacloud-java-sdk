// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListApplicationsWithTagRulesResponseBody extends TeaModel {
    // The status code returned.
    @NameInMap("Code")
    public Integer code;

    // The details of the data.
    @NameInMap("Data")
    public ListApplicationsWithTagRulesResponseBodyData data;

    // The HTTP status code returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The message returned.
    // 
    // *   If the request is successful, a success message is returned.
    // *   If the request fails, an error message is returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful. Valid values: -\[unk]true\[unk]: The request is successful. -\[unk]false\[unk]: The request fails.
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
        // Indicates whether the field is a primary key.
        @NameInMap("CarryData")
        public Boolean carryData;

        // Indicates whether the alert rule is enabled. Valid values:
        // 
        // *   `true`: enabled
        // *   `false`: disabled
        @NameInMap("Enable")
        public Boolean enable;

        // The modification time.
        @NameInMap("GmtModified")
        public String gmtModified;

        // The ID of the rule.
        @NameInMap("Id")
        public Long id;

        // The number of instances.
        @NameInMap("InstanceNum")
        public Integer instanceNum;

        // The name of the rule.
        @NameInMap("Name")
        public String name;

        // The rate.
        @NameInMap("Rate")
        public Integer rate;

        // Indicates whether the routing rule is deleted.
        @NameInMap("Remove")
        public Boolean remove;

        // The details of the routing rule.
        @NameInMap("Rules")
        public String rules;

        // The status.
        @NameInMap("Status")
        public Integer status;

        // The tag.
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
        // The ID of the application.
        @NameInMap("AppId")
        public String appId;

        // The name of the application.
        @NameInMap("AppName")
        public String appName;

        // An array that consists of the rules.
        @NameInMap("RouteRules")
        public java.util.List<ListApplicationsWithTagRulesResponseBodyDataResultRouteRules> routeRules;

        // The status of the route. Valid values: -0: disabled. -1: enabled.
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
        // The page number of the returned page.
        @NameInMap("PageNumber")
        public Integer pageNumber;

        // The number of entries returned per page.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The data structure.
        @NameInMap("Result")
        public java.util.List<ListApplicationsWithTagRulesResponseBodyDataResult> result;

        // The total number of entries returned.
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListApplicationsWithTagRulesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The details of the data.</p>
     */
    @NameInMap("Data")
    public ListApplicationsWithTagRulesResponseBodyData data;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>*   If the request is successful, a success message is returned.</p>
     * <p>*   If the request fails, an error message is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
     */
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
        /**
         * <p>Indicates whether the field is a primary key.</p>
         */
        @NameInMap("CarryData")
        public Boolean carryData;

        /**
         * <p>Indicates whether the alert rule is enabled. Valid value:</p>
         * <br>
         * <p>*   `true`: enabled.</p>
         * <p>*   `false`: disabled.</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The modification time.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the rule.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The number of instances.</p>
         */
        @NameInMap("InstanceNum")
        public Integer instanceNum;

        /**
         * <p>The name of the rule.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The rate.</p>
         */
        @NameInMap("Rate")
        public Integer rate;

        /**
         * <p>Indicates whether the routing rule is deleted.</p>
         */
        @NameInMap("Remove")
        public Boolean remove;

        /**
         * <p>The details of the routing rule.</p>
         */
        @NameInMap("Rules")
        public String rules;

        /**
         * <p>The status.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The tag.</p>
         */
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
        /**
         * <p>The application ID.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>应用所属的MSE命名空间。</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The information about the rules.</p>
         */
        @NameInMap("RouteRules")
        public java.util.List<ListApplicationsWithTagRulesResponseBodyDataResultRouteRules> routeRules;

        /**
         * <p>The status of the route. Valid values: -0: disabled. -1: enabled.</p>
         */
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

        public ListApplicationsWithTagRulesResponseBodyDataResult setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
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
        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The data structure.</p>
         */
        @NameInMap("Result")
        public java.util.List<ListApplicationsWithTagRulesResponseBodyDataResult> result;

        /**
         * <p>The total number of entries returned.</p>
         */
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

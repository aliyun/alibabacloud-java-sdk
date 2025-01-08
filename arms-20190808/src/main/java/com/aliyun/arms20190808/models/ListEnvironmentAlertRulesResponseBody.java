// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvironmentAlertRulesResponseBody extends TeaModel {
    /**
     * <p>The status code. The status code 200 indicates that the request was successful. Other status codes indicate that the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The struct returned.</p>
     */
    @NameInMap("Data")
    public ListEnvironmentAlertRulesResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4C518054-852F-4023-ABC1-4AF95FF7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListEnvironmentAlertRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentAlertRulesResponseBody self = new ListEnvironmentAlertRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentAlertRulesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListEnvironmentAlertRulesResponseBody setData(ListEnvironmentAlertRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEnvironmentAlertRulesResponseBodyData getData() {
        return this.data;
    }

    public ListEnvironmentAlertRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEnvironmentAlertRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEnvironmentAlertRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListEnvironmentAlertRulesResponseBodyDataRules extends TeaModel {
        /**
         * <p>The ID of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>9502571</p>
         */
        @NameInMap("AlertId")
        public Long alertId;

        /**
         * <p>The name of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql-CS-MySQLInnoDBLogWaits_lu</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListEnvironmentAlertRulesResponseBodyDataRules build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentAlertRulesResponseBodyDataRules self = new ListEnvironmentAlertRulesResponseBodyDataRules();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentAlertRulesResponseBodyDataRules setAlertId(Long alertId) {
            this.alertId = alertId;
            return this;
        }
        public Long getAlertId() {
            return this.alertId;
        }

        public ListEnvironmentAlertRulesResponseBodyDataRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListEnvironmentAlertRulesResponseBodyData extends TeaModel {
        /**
         * <p>The queried alert groups.</p>
         */
        @NameInMap("Groups")
        public java.util.List<String> groups;

        /**
         * <p>The queried rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<ListEnvironmentAlertRulesResponseBodyDataRules> rules;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>26</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListEnvironmentAlertRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentAlertRulesResponseBodyData self = new ListEnvironmentAlertRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentAlertRulesResponseBodyData setGroups(java.util.List<String> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<String> getGroups() {
            return this.groups;
        }

        public ListEnvironmentAlertRulesResponseBodyData setRules(java.util.List<ListEnvironmentAlertRulesResponseBodyDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<ListEnvironmentAlertRulesResponseBodyDataRules> getRules() {
            return this.rules;
        }

        public ListEnvironmentAlertRulesResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}

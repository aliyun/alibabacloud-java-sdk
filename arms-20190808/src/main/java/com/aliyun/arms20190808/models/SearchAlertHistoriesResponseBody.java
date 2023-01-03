// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchAlertHistoriesResponseBody extends TeaModel {
    // The struct returned.
    @NameInMap("PageBean")
    public SearchAlertHistoriesResponseBodyPageBean pageBean;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static SearchAlertHistoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchAlertHistoriesResponseBody self = new SearchAlertHistoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchAlertHistoriesResponseBody setPageBean(SearchAlertHistoriesResponseBodyPageBean pageBean) {
        this.pageBean = pageBean;
        return this;
    }
    public SearchAlertHistoriesResponseBodyPageBean getPageBean() {
        return this.pageBean;
    }

    public SearchAlertHistoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SearchAlertHistoriesResponseBodyPageBeanAlarmHistories extends TeaModel {
        // The content of the alert notification.
        @NameInMap("AlarmContent")
        public String alarmContent;

        // The response code returned after the alert notification was sent.
        @NameInMap("AlarmResponseCode")
        public Integer alarmResponseCode;

        // The webhook URL used for the alert contact, such as that of a DingTalk chatbot.
        @NameInMap("AlarmSources")
        public String alarmSources;

        // The time when the alert notification was sent.
        @NameInMap("AlarmTime")
        public Long alarmTime;

        // The type of the alert rule. Default value: 4. Valid values:
        // 
        // *   `1`: custom alert rules to monitor drill-down data sets
        // *   `3`: custom alert rules to monitor tiled data sets
        // *   `4`: alert rules to monitor the frontend, including the default frontend alert rules
        // *   `5`: alert rules to monitor applications, including the default application alert rules
        // *   `6`: the default frontend alert rules
        // *   `7`: the default application alert rules
        // *   `8`: Tracing Analysis alert rules
        // *   `101`: Prometheus alert rules
        @NameInMap("AlarmType")
        public Integer alarmType;

        // The email address of the alert contact.
        @NameInMap("Emails")
        public String emails;

        // The ID of the alert notification.
        @NameInMap("Id")
        public Long id;

        // The mobile number of the alert contact.
        @NameInMap("Phones")
        public String phones;

        // An internal parameter.
        @NameInMap("StrategyId")
        public String strategyId;

        // An internal parameter.
        @NameInMap("Target")
        public String target;

        // The ID of the user.
        @NameInMap("UserId")
        public String userId;

        public static SearchAlertHistoriesResponseBodyPageBeanAlarmHistories build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertHistoriesResponseBodyPageBeanAlarmHistories self = new SearchAlertHistoriesResponseBodyPageBeanAlarmHistories();
            return TeaModel.build(map, self);
        }

        public SearchAlertHistoriesResponseBodyPageBeanAlarmHistories setAlarmContent(String alarmContent) {
            this.alarmContent = alarmContent;
            return this;
        }
        public String getAlarmContent() {
            return this.alarmContent;
        }

        public SearchAlertHistoriesResponseBodyPageBeanAlarmHistories setAlarmResponseCode(Integer alarmResponseCode) {
            this.alarmResponseCode = alarmResponseCode;
            return this;
        }
        public Integer getAlarmResponseCode() {
            return this.alarmResponseCode;
        }

        public SearchAlertHistoriesResponseBodyPageBeanAlarmHistories setAlarmSources(String alarmSources) {
            this.alarmSources = alarmSources;
            return this;
        }
        public String getAlarmSources() {
            return this.alarmSources;
        }

        public SearchAlertHistoriesResponseBodyPageBeanAlarmHistories setAlarmTime(Long alarmTime) {
            this.alarmTime = alarmTime;
            return this;
        }
        public Long getAlarmTime() {
            return this.alarmTime;
        }

        public SearchAlertHistoriesResponseBodyPageBeanAlarmHistories setAlarmType(Integer alarmType) {
            this.alarmType = alarmType;
            return this;
        }
        public Integer getAlarmType() {
            return this.alarmType;
        }

        public SearchAlertHistoriesResponseBodyPageBeanAlarmHistories setEmails(String emails) {
            this.emails = emails;
            return this;
        }
        public String getEmails() {
            return this.emails;
        }

        public SearchAlertHistoriesResponseBodyPageBeanAlarmHistories setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SearchAlertHistoriesResponseBodyPageBeanAlarmHistories setPhones(String phones) {
            this.phones = phones;
            return this;
        }
        public String getPhones() {
            return this.phones;
        }

        public SearchAlertHistoriesResponseBodyPageBeanAlarmHistories setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public SearchAlertHistoriesResponseBodyPageBeanAlarmHistories setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public SearchAlertHistoriesResponseBodyPageBeanAlarmHistories setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class SearchAlertHistoriesResponseBodyPageBean extends TeaModel {
        // The information about alert records.
        @NameInMap("AlarmHistories")
        public java.util.List<SearchAlertHistoriesResponseBodyPageBeanAlarmHistories> alarmHistories;

        // The page number of the returned page.
        @NameInMap("PageNumber")
        public Integer pageNumber;

        // The number of entries returned per page.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The total number of entries returned.
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static SearchAlertHistoriesResponseBodyPageBean build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertHistoriesResponseBodyPageBean self = new SearchAlertHistoriesResponseBodyPageBean();
            return TeaModel.build(map, self);
        }

        public SearchAlertHistoriesResponseBodyPageBean setAlarmHistories(java.util.List<SearchAlertHistoriesResponseBodyPageBeanAlarmHistories> alarmHistories) {
            this.alarmHistories = alarmHistories;
            return this;
        }
        public java.util.List<SearchAlertHistoriesResponseBodyPageBeanAlarmHistories> getAlarmHistories() {
            return this.alarmHistories;
        }

        public SearchAlertHistoriesResponseBodyPageBean setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public SearchAlertHistoriesResponseBodyPageBean setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public SearchAlertHistoriesResponseBodyPageBean setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}

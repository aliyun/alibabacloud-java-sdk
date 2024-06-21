// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchAlertHistoriesResponseBody extends TeaModel {
    /**
     * <p>The returned struct.</p>
     */
    @NameInMap("PageBean")
    public SearchAlertHistoriesResponseBodyPageBean pageBean;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2FC13182-B9AF-4E6B-BE51-72669B7C****</p>
     */
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
        /**
         * <p>The content of the alert notification.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;Alert name: Alert1\nAlert time: 2020-07-24 12:14:00\nAlert content: A total of four alerts are triggered: \<em>\</em>\<em>\</em>&quot;</p>
         */
        @NameInMap("AlarmContent")
        public String alarmContent;

        /**
         * <p>The response code returned after the alert notification was sent.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("AlarmResponseCode")
        public Integer alarmResponseCode;

        /**
         * <p>The webhook URL, such as the webhook URL of a DingTalk chatbot.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=91f2f65002fefe0ab9b71e6590c5ca504348cad742ff01e9c8ab204439ca">https://oapi.dingtalk.com/robot/send?access_token=91f2f65002fefe0ab9b71e6590c5ca504348cad742ff01e9c8ab204439ca</a>****</p>
         */
        @NameInMap("AlarmSources")
        public String alarmSources;

        /**
         * <p>The time when the alert notification was sent.</p>
         * 
         * <strong>example:</strong>
         * <p>1595564179000</p>
         */
        @NameInMap("AlarmTime")
        public Long alarmTime;

        /**
         * <p>The type of the alert rule. Default value: 4. Valid values:</p>
         * <ul>
         * <li><code>1</code>: a custom alert rule that is used to monitor drill-down data sets</li>
         * <li><code>3</code>: a custom alert rule that is used to monitor tiled data sets</li>
         * <li><code>4</code>: an alert rule that is used to monitor web pages, including the default alert rule for browser monitoring</li>
         * <li><code>5</code>: an alert rule that is used to monitor applications, including the default alert rule for application monitoring</li>
         * <li><code>6</code>: the default alert rule for browser monitoring</li>
         * <li><code>7</code>: the default alert rule for application monitoring</li>
         * <li><code>8</code>: a Tracing Analysis alert rule</li>
         * <li><code>101</code>: a Prometheus alert rule</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("AlarmType")
        public Integer alarmType;

        /**
         * <p>The email address of the alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:someone@example.com">someone@example.com</a></p>
         */
        @NameInMap("Emails")
        public String emails;

        /**
         * <p>The ID of the alert notification.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The mobile phone number of the alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p>1381111****</p>
         */
        @NameInMap("Phones")
        public String phones;

        /**
         * <p>The internal fields.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("StrategyId")
        public String strategyId;

        /**
         * <p>The internal fields.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>113197164949****</p>
         */
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
        /**
         * <p>The information about alert records.</p>
         */
        @NameInMap("AlarmHistories")
        public java.util.List<SearchAlertHistoriesResponseBodyPageBeanAlarmHistories> alarmHistories;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
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

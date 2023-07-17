// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class SearchAlertHistoriesResponseBody extends TeaModel {
    @NameInMap("PageBean")
    public SearchAlertHistoriesResponseBodyPageBean pageBean;

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
        @NameInMap("AlarmContent")
        public String alarmContent;

        @NameInMap("AlarmResponseCode")
        public Integer alarmResponseCode;

        @NameInMap("AlarmSources")
        public String alarmSources;

        @NameInMap("AlarmTime")
        public Long alarmTime;

        @NameInMap("AlarmType")
        public Integer alarmType;

        @NameInMap("Emails")
        public String emails;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Phones")
        public String phones;

        @NameInMap("StrategyId")
        public String strategyId;

        @NameInMap("Target")
        public String target;

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
        @NameInMap("AlarmHistories")
        public java.util.List<SearchAlertHistoriesResponseBodyPageBeanAlarmHistories> alarmHistories;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

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

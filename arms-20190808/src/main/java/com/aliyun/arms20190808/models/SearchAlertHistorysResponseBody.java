// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchAlertHistorysResponseBody extends TeaModel {
    @NameInMap("PageBean")
    public SearchAlertHistorysResponseBodyPageBean pageBean;

    @NameInMap("RequestId")
    public String requestId;

    public static SearchAlertHistorysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchAlertHistorysResponseBody self = new SearchAlertHistorysResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchAlertHistorysResponseBody setPageBean(SearchAlertHistorysResponseBodyPageBean pageBean) {
        this.pageBean = pageBean;
        return this;
    }
    public SearchAlertHistorysResponseBodyPageBean getPageBean() {
        return this.pageBean;
    }

    public SearchAlertHistorysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SearchAlertHistorysResponseBodyPageBeanAlertHistory extends TeaModel {
        @NameInMap("AlarmContent")
        public String alarmContent;

        @NameInMap("AlarmResponseCode")
        public String alarmResponseCode;

        @NameInMap("AlarmTime")
        public Long alarmTime;

        @NameInMap("AlarmType")
        public Integer alarmType;

        @NameInMap("AlertId")
        public Long alertId;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("Phones")
        public String phones;

        @NameInMap("Tenant")
        public String tenant;

        public static SearchAlertHistorysResponseBodyPageBeanAlertHistory build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertHistorysResponseBodyPageBeanAlertHistory self = new SearchAlertHistorysResponseBodyPageBeanAlertHistory();
            return TeaModel.build(map, self);
        }

        public SearchAlertHistorysResponseBodyPageBeanAlertHistory setAlarmContent(String alarmContent) {
            this.alarmContent = alarmContent;
            return this;
        }
        public String getAlarmContent() {
            return this.alarmContent;
        }

        public SearchAlertHistorysResponseBodyPageBeanAlertHistory setAlarmResponseCode(String alarmResponseCode) {
            this.alarmResponseCode = alarmResponseCode;
            return this;
        }
        public String getAlarmResponseCode() {
            return this.alarmResponseCode;
        }

        public SearchAlertHistorysResponseBodyPageBeanAlertHistory setAlarmTime(Long alarmTime) {
            this.alarmTime = alarmTime;
            return this;
        }
        public Long getAlarmTime() {
            return this.alarmTime;
        }

        public SearchAlertHistorysResponseBodyPageBeanAlertHistory setAlarmType(Integer alarmType) {
            this.alarmType = alarmType;
            return this;
        }
        public Integer getAlarmType() {
            return this.alarmType;
        }

        public SearchAlertHistorysResponseBodyPageBeanAlertHistory setAlertId(Long alertId) {
            this.alertId = alertId;
            return this;
        }
        public Long getAlertId() {
            return this.alertId;
        }

        public SearchAlertHistorysResponseBodyPageBeanAlertHistory setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public SearchAlertHistorysResponseBodyPageBeanAlertHistory setPhones(String phones) {
            this.phones = phones;
            return this;
        }
        public String getPhones() {
            return this.phones;
        }

        public SearchAlertHistorysResponseBodyPageBeanAlertHistory setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

    }

    public static class SearchAlertHistorysResponseBodyPageBean extends TeaModel {
        @NameInMap("AlertHistory")
        public java.util.List<SearchAlertHistorysResponseBodyPageBeanAlertHistory> alertHistory;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static SearchAlertHistorysResponseBodyPageBean build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertHistorysResponseBodyPageBean self = new SearchAlertHistorysResponseBodyPageBean();
            return TeaModel.build(map, self);
        }

        public SearchAlertHistorysResponseBodyPageBean setAlertHistory(java.util.List<SearchAlertHistorysResponseBodyPageBeanAlertHistory> alertHistory) {
            this.alertHistory = alertHistory;
            return this;
        }
        public java.util.List<SearchAlertHistorysResponseBodyPageBeanAlertHistory> getAlertHistory() {
            return this.alertHistory;
        }

        public SearchAlertHistorysResponseBodyPageBean setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public SearchAlertHistorysResponseBodyPageBean setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public SearchAlertHistorysResponseBodyPageBean setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}

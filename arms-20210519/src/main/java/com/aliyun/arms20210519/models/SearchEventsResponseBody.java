// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class SearchEventsResponseBody extends TeaModel {
    @NameInMap("IsTrigger")
    public Integer isTrigger;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageBean")
    public SearchEventsResponseBodyPageBean pageBean;

    public static SearchEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchEventsResponseBody self = new SearchEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchEventsResponseBody setIsTrigger(Integer isTrigger) {
        this.isTrigger = isTrigger;
        return this;
    }
    public Integer getIsTrigger() {
        return this.isTrigger;
    }

    public SearchEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchEventsResponseBody setPageBean(SearchEventsResponseBodyPageBean pageBean) {
        this.pageBean = pageBean;
        return this;
    }
    public SearchEventsResponseBodyPageBean getPageBean() {
        return this.pageBean;
    }

    public static class SearchEventsResponseBodyPageBeanEvent extends TeaModel {
        @NameInMap("EventTime")
        public Long eventTime;

        @NameInMap("EventLevel")
        public String eventLevel;

        @NameInMap("AlertRule")
        public String alertRule;

        @NameInMap("Message")
        public String message;

        @NameInMap("AlertType")
        public Integer alertType;

        @NameInMap("AlertName")
        public String alertName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("AlertId")
        public Long alertId;

        @NameInMap("Links")
        public java.util.List<String> links;

        public static SearchEventsResponseBodyPageBeanEvent build(java.util.Map<String, ?> map) throws Exception {
            SearchEventsResponseBodyPageBeanEvent self = new SearchEventsResponseBodyPageBeanEvent();
            return TeaModel.build(map, self);
        }

        public SearchEventsResponseBodyPageBeanEvent setEventTime(Long eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public Long getEventTime() {
            return this.eventTime;
        }

        public SearchEventsResponseBodyPageBeanEvent setEventLevel(String eventLevel) {
            this.eventLevel = eventLevel;
            return this;
        }
        public String getEventLevel() {
            return this.eventLevel;
        }

        public SearchEventsResponseBodyPageBeanEvent setAlertRule(String alertRule) {
            this.alertRule = alertRule;
            return this;
        }
        public String getAlertRule() {
            return this.alertRule;
        }

        public SearchEventsResponseBodyPageBeanEvent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SearchEventsResponseBodyPageBeanEvent setAlertType(Integer alertType) {
            this.alertType = alertType;
            return this;
        }
        public Integer getAlertType() {
            return this.alertType;
        }

        public SearchEventsResponseBodyPageBeanEvent setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public SearchEventsResponseBodyPageBeanEvent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SearchEventsResponseBodyPageBeanEvent setAlertId(Long alertId) {
            this.alertId = alertId;
            return this;
        }
        public Long getAlertId() {
            return this.alertId;
        }

        public SearchEventsResponseBodyPageBeanEvent setLinks(java.util.List<String> links) {
            this.links = links;
            return this;
        }
        public java.util.List<String> getLinks() {
            return this.links;
        }

    }

    public static class SearchEventsResponseBodyPageBean extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Event")
        public java.util.List<SearchEventsResponseBodyPageBeanEvent> event;

        public static SearchEventsResponseBodyPageBean build(java.util.Map<String, ?> map) throws Exception {
            SearchEventsResponseBodyPageBean self = new SearchEventsResponseBodyPageBean();
            return TeaModel.build(map, self);
        }

        public SearchEventsResponseBodyPageBean setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public SearchEventsResponseBodyPageBean setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public SearchEventsResponseBodyPageBean setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public SearchEventsResponseBodyPageBean setEvent(java.util.List<SearchEventsResponseBodyPageBeanEvent> event) {
            this.event = event;
            return this;
        }
        public java.util.List<SearchEventsResponseBodyPageBeanEvent> getEvent() {
            return this.event;
        }

    }

}

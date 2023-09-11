// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchEventsResponseBody extends TeaModel {
    /**
     * <p>Specifies whether the alert event is triggered. If you do not set this parameter, all alert events are queried. Valid values:</p>
     * <br>
     * <p>*   `1`: The event is triggered.</p>
     * <p>*   `0`: The event is not triggered.</p>
     */
    @NameInMap("IsTrigger")
    public Integer isTrigger;

    /**
     * <p>The struct returned.</p>
     */
    @NameInMap("PageBean")
    public SearchEventsResponseBodyPageBean pageBean;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public SearchEventsResponseBody setPageBean(SearchEventsResponseBodyPageBean pageBean) {
        this.pageBean = pageBean;
        return this;
    }
    public SearchEventsResponseBodyPageBean getPageBean() {
        return this.pageBean;
    }

    public SearchEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SearchEventsResponseBodyPageBeanEvent extends TeaModel {
        /**
         * <p>The ID of the alert rule that is associated with the event.</p>
         */
        @NameInMap("AlertId")
        public Long alertId;

        /**
         * <p>The name of the alert rule that is associated with the event.</p>
         */
        @NameInMap("AlertName")
        public String alertName;

        /**
         * <p>The condition of the alert rule.</p>
         */
        @NameInMap("AlertRule")
        public String alertRule;

        /**
         * <p>The type of the alert rule. This parameter is not returned. Valid values:</p>
         * <br>
         * <p>*   `1`: custom alert rules to monitor drill-down data sets</p>
         * <p>*   `3`: custom alert rules to monitor tiled data sets</p>
         * <p>*   `4`: alert rules to monitor the frontend, including the default frontend alert rules</p>
         * <p>*   `5`: alert rules to monitor applications, including the default application alert rules</p>
         * <p>*   `6`: the default frontend alert rules</p>
         * <p>*   `7`: the default application alert rules</p>
         * <p>*   `8`: Tracing Analysis alert rules</p>
         * <p>*   `101`: Prometheus alert rules</p>
         */
        @NameInMap("AlertType")
        public Integer alertType;

        /**
         * <p>The severity of the event.</p>
         */
        @NameInMap("EventLevel")
        public String eventLevel;

        /**
         * <p>The timestamp when the event occurred.</p>
         */
        @NameInMap("EventTime")
        public Long eventTime;

        /**
         * <p>The ID of the event record.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The list of event URLs.</p>
         */
        @NameInMap("Links")
        public java.util.List<String> links;

        /**
         * <p>The event content. The parameter value is a JSON string. Each key indicates a dimension and each value indicates the alert content in the dimension.</p>
         */
        @NameInMap("Message")
        public String message;

        public static SearchEventsResponseBodyPageBeanEvent build(java.util.Map<String, ?> map) throws Exception {
            SearchEventsResponseBodyPageBeanEvent self = new SearchEventsResponseBodyPageBeanEvent();
            return TeaModel.build(map, self);
        }

        public SearchEventsResponseBodyPageBeanEvent setAlertId(Long alertId) {
            this.alertId = alertId;
            return this;
        }
        public Long getAlertId() {
            return this.alertId;
        }

        public SearchEventsResponseBodyPageBeanEvent setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public SearchEventsResponseBodyPageBeanEvent setAlertRule(String alertRule) {
            this.alertRule = alertRule;
            return this;
        }
        public String getAlertRule() {
            return this.alertRule;
        }

        public SearchEventsResponseBodyPageBeanEvent setAlertType(Integer alertType) {
            this.alertType = alertType;
            return this;
        }
        public Integer getAlertType() {
            return this.alertType;
        }

        public SearchEventsResponseBodyPageBeanEvent setEventLevel(String eventLevel) {
            this.eventLevel = eventLevel;
            return this;
        }
        public String getEventLevel() {
            return this.eventLevel;
        }

        public SearchEventsResponseBodyPageBeanEvent setEventTime(Long eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public Long getEventTime() {
            return this.eventTime;
        }

        public SearchEventsResponseBodyPageBeanEvent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SearchEventsResponseBodyPageBeanEvent setLinks(java.util.List<String> links) {
            this.links = links;
            return this;
        }
        public java.util.List<String> getLinks() {
            return this.links;
        }

        public SearchEventsResponseBodyPageBeanEvent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class SearchEventsResponseBodyPageBean extends TeaModel {
        /**
         * <p>The information about the alert events.</p>
         */
        @NameInMap("Event")
        public java.util.List<SearchEventsResponseBodyPageBeanEvent> event;

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
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static SearchEventsResponseBodyPageBean build(java.util.Map<String, ?> map) throws Exception {
            SearchEventsResponseBodyPageBean self = new SearchEventsResponseBodyPageBean();
            return TeaModel.build(map, self);
        }

        public SearchEventsResponseBodyPageBean setEvent(java.util.List<SearchEventsResponseBodyPageBeanEvent> event) {
            this.event = event;
            return this;
        }
        public java.util.List<SearchEventsResponseBodyPageBeanEvent> getEvent() {
            return this.event;
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

    }

}

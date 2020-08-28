// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchEventsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("IsTrigger")
    @Validation(required = true)
    public Integer isTrigger;

    @NameInMap("PageBean")
    @Validation(required = true)
    public SearchEventsResponsePageBean pageBean;

    public static SearchEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchEventsResponse self = new SearchEventsResponse();
        return TeaModel.build(map, self);
    }

    public static class SearchEventsResponsePageBeanEvent extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("EventTime")
        @Validation(required = true)
        public Long eventTime;

        @NameInMap("AlertType")
        @Validation(required = true)
        public Integer alertType;

        @NameInMap("EventLevel")
        @Validation(required = true)
        public Integer eventLevel;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("AlertId")
        @Validation(required = true)
        public Long alertId;

        @NameInMap("AlertName")
        @Validation(required = true)
        public String alertName;

        @NameInMap("AlertRule")
        @Validation(required = true)
        public String alertRule;

        @NameInMap("Links")
        @Validation(required = true)
        public java.util.List<String> links;

        public static SearchEventsResponsePageBeanEvent build(java.util.Map<String, ?> map) throws Exception {
            SearchEventsResponsePageBeanEvent self = new SearchEventsResponsePageBeanEvent();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchEventsResponsePageBean extends TeaModel {
        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("Event")
        @Validation(required = true)
        public java.util.List<SearchEventsResponsePageBeanEvent> event;

        public static SearchEventsResponsePageBean build(java.util.Map<String, ?> map) throws Exception {
            SearchEventsResponsePageBean self = new SearchEventsResponsePageBean();
            return TeaModel.build(map, self);
        }

    }

}

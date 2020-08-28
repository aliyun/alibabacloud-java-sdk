// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchAlertHistoriesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageBean")
    @Validation(required = true)
    public SearchAlertHistoriesResponsePageBean pageBean;

    public static SearchAlertHistoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchAlertHistoriesResponse self = new SearchAlertHistoriesResponse();
        return TeaModel.build(map, self);
    }

    public static class SearchAlertHistoriesResponsePageBeanAlarmHistories extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("StrategyId")
        @Validation(required = true)
        public String strategyId;

        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("Target")
        @Validation(required = true)
        public String target;

        @NameInMap("Phones")
        @Validation(required = true)
        public String phones;

        @NameInMap("Emails")
        @Validation(required = true)
        public String emails;

        @NameInMap("AlarmTime")
        @Validation(required = true)
        public Long alarmTime;

        @NameInMap("AlarmType")
        @Validation(required = true)
        public Integer alarmType;

        @NameInMap("AlarmResponseCode")
        @Validation(required = true)
        public Integer alarmResponseCode;

        @NameInMap("AlarmContent")
        @Validation(required = true)
        public String alarmContent;

        @NameInMap("AlarmSources")
        @Validation(required = true)
        public String alarmSources;

        public static SearchAlertHistoriesResponsePageBeanAlarmHistories build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertHistoriesResponsePageBeanAlarmHistories self = new SearchAlertHistoriesResponsePageBeanAlarmHistories();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchAlertHistoriesResponsePageBean extends TeaModel {
        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("AlarmHistories")
        @Validation(required = true)
        public java.util.List<SearchAlertHistoriesResponsePageBeanAlarmHistories> alarmHistories;

        public static SearchAlertHistoriesResponsePageBean build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertHistoriesResponsePageBean self = new SearchAlertHistoriesResponsePageBean();
            return TeaModel.build(map, self);
        }

    }

}

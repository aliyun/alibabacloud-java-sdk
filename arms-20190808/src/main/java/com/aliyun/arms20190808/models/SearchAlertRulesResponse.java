// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchAlertRulesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageBean")
    @Validation(required = true)
    public SearchAlertRulesResponsePageBean pageBean;

    public static SearchAlertRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchAlertRulesResponse self = new SearchAlertRulesResponse();
        return TeaModel.build(map, self);
    }

    public static class SearchAlertRulesResponsePageBeanAlertRulesAlarmContext extends TeaModel {
        @NameInMap("AlarmContentTemplate")
        @Validation(required = true)
        public String alarmContentTemplate;

        @NameInMap("AlarmContentSubTitle")
        @Validation(required = true)
        public String alarmContentSubTitle;

        public static SearchAlertRulesResponsePageBeanAlertRulesAlarmContext build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertRulesResponsePageBeanAlertRulesAlarmContext self = new SearchAlertRulesResponsePageBeanAlertRulesAlarmContext();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchAlertRulesResponsePageBeanAlertRulesAlertRuleRules extends TeaModel {
        @NameInMap("Aggregates")
        @Validation(required = true)
        public String aggregates;

        @NameInMap("Alias")
        @Validation(required = true)
        public String alias;

        @NameInMap("Measure")
        @Validation(required = true)
        public String measure;

        @NameInMap("NValue")
        @Validation(required = true)
        public Integer NValue;

        @NameInMap("Operator")
        @Validation(required = true)
        public String operator;

        @NameInMap("Value")
        @Validation(required = true)
        public Double value;

        public static SearchAlertRulesResponsePageBeanAlertRulesAlertRuleRules build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertRulesResponsePageBeanAlertRulesAlertRuleRules self = new SearchAlertRulesResponsePageBeanAlertRulesAlertRuleRules();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchAlertRulesResponsePageBeanAlertRulesAlertRule extends TeaModel {
        @NameInMap("Operator")
        @Validation(required = true)
        public String operator;

        @NameInMap("Rules")
        @Validation(required = true)
        public java.util.List<SearchAlertRulesResponsePageBeanAlertRulesAlertRuleRules> rules;

        public static SearchAlertRulesResponsePageBeanAlertRulesAlertRule build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertRulesResponsePageBeanAlertRulesAlertRule self = new SearchAlertRulesResponsePageBeanAlertRulesAlertRule();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchAlertRulesResponsePageBeanAlertRulesMetricParamDimensions extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static SearchAlertRulesResponsePageBeanAlertRulesMetricParamDimensions build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertRulesResponsePageBeanAlertRulesMetricParamDimensions self = new SearchAlertRulesResponsePageBeanAlertRulesMetricParamDimensions();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchAlertRulesResponsePageBeanAlertRulesMetricParam extends TeaModel {
        @NameInMap("AppGroupId")
        @Validation(required = true)
        public String appGroupId;

        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("Pid")
        @Validation(required = true)
        public String pid;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Dimensions")
        @Validation(required = true)
        public java.util.List<SearchAlertRulesResponsePageBeanAlertRulesMetricParamDimensions> dimensions;

        public static SearchAlertRulesResponsePageBeanAlertRulesMetricParam build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertRulesResponsePageBeanAlertRulesMetricParam self = new SearchAlertRulesResponsePageBeanAlertRulesMetricParam();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchAlertRulesResponsePageBeanAlertRulesNotice extends TeaModel {
        @NameInMap("EndTime")
        @Validation(required = true)
        public Long endTime;

        @NameInMap("NoticeEndTime")
        @Validation(required = true)
        public Long noticeEndTime;

        @NameInMap("NoticeStartTime")
        @Validation(required = true)
        public Long noticeStartTime;

        @NameInMap("StartTime")
        @Validation(required = true)
        public Long startTime;

        public static SearchAlertRulesResponsePageBeanAlertRulesNotice build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertRulesResponsePageBeanAlertRulesNotice self = new SearchAlertRulesResponsePageBeanAlertRulesNotice();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchAlertRulesResponsePageBeanAlertRules extends TeaModel {
        @NameInMap("AlertTitle")
        @Validation(required = true)
        public String alertTitle;

        @NameInMap("AlertLevel")
        @Validation(required = true)
        public String alertLevel;

        @NameInMap("AlertType")
        @Validation(required = true)
        public Integer alertType;

        @NameInMap("AlertVersion")
        @Validation(required = true)
        public Integer alertVersion;

        @NameInMap("Config")
        @Validation(required = true)
        public String config;

        @NameInMap("ContactGroupIdList")
        @Validation(required = true)
        public String contactGroupIdList;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("TaskId")
        @Validation(required = true)
        public Long taskId;

        @NameInMap("TaskStatus")
        @Validation(required = true)
        public String taskStatus;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public Long updateTime;

        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("AlarmContext")
        @Validation(required = true)
        public SearchAlertRulesResponsePageBeanAlertRulesAlarmContext alarmContext;

        @NameInMap("AlertRule")
        @Validation(required = true)
        public SearchAlertRulesResponsePageBeanAlertRulesAlertRule alertRule;

        @NameInMap("MetricParam")
        @Validation(required = true)
        public SearchAlertRulesResponsePageBeanAlertRulesMetricParam metricParam;

        @NameInMap("Notice")
        @Validation(required = true)
        public SearchAlertRulesResponsePageBeanAlertRulesNotice notice;

        @NameInMap("AlertWays")
        @Validation(required = true)
        public java.util.List<String> alertWays;

        public static SearchAlertRulesResponsePageBeanAlertRules build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertRulesResponsePageBeanAlertRules self = new SearchAlertRulesResponsePageBeanAlertRules();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchAlertRulesResponsePageBean extends TeaModel {
        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("AlertRules")
        @Validation(required = true)
        public java.util.List<SearchAlertRulesResponsePageBeanAlertRules> alertRules;

        public static SearchAlertRulesResponsePageBean build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertRulesResponsePageBean self = new SearchAlertRulesResponsePageBean();
            return TeaModel.build(map, self);
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListAlertRulesResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListAlertRulesResponseBodyPagingInfo pagingInfo;

    /**
     * <strong>example:</strong>
     * <p>A6C6B486-E3A2-5D52-9E76-D9380485D946</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAlertRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlertRulesResponseBody self = new ListAlertRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlertRulesResponseBody setPagingInfo(ListAlertRulesResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListAlertRulesResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListAlertRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionCycleUnfinishedCycleAndTime extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CycleId")
        public Integer cycleId;

        /**
         * <strong>example:</strong>
         * <p>01:00</p>
         */
        @NameInMap("Time")
        public String time;

        public static ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionCycleUnfinishedCycleAndTime build(java.util.Map<String, ?> map) throws Exception {
            ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionCycleUnfinishedCycleAndTime self = new ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionCycleUnfinishedCycleAndTime();
            return TeaModel.build(map, self);
        }

        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionCycleUnfinishedCycleAndTime setCycleId(Integer cycleId) {
            this.cycleId = cycleId;
            return this;
        }
        public Integer getCycleId() {
            return this.cycleId;
        }

        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionCycleUnfinishedCycleAndTime setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionCycleUnfinished extends TeaModel {
        @NameInMap("CycleAndTime")
        public java.util.List<ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionCycleUnfinishedCycleAndTime> cycleAndTime;

        public static ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionCycleUnfinished build(java.util.Map<String, ?> map) throws Exception {
            ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionCycleUnfinished self = new ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionCycleUnfinished();
            return TeaModel.build(map, self);
        }

        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionCycleUnfinished setCycleAndTime(java.util.List<ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionCycleUnfinishedCycleAndTime> cycleAndTime) {
            this.cycleAndTime = cycleAndTime;
            return this;
        }
        public java.util.List<ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionCycleUnfinishedCycleAndTime> getCycleAndTime() {
            return this.cycleAndTime;
        }

    }

    public static class ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionError extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoRerunAlert")
        public Boolean autoRerunAlert;

        @NameInMap("StreamTaskIds")
        public java.util.List<Long> streamTaskIds;

        public static ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionError build(java.util.Map<String, ?> map) throws Exception {
            ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionError self = new ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionError();
            return TeaModel.build(map, self);
        }

        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionError setAutoRerunAlert(Boolean autoRerunAlert) {
            this.autoRerunAlert = autoRerunAlert;
            return this;
        }
        public Boolean getAutoRerunAlert() {
            return this.autoRerunAlert;
        }

        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionError setStreamTaskIds(java.util.List<Long> streamTaskIds) {
            this.streamTaskIds = streamTaskIds;
            return this;
        }
        public java.util.List<Long> getStreamTaskIds() {
            return this.streamTaskIds;
        }

    }

    public static class ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionInstanceErrorCount extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Integer count;

        public static ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionInstanceErrorCount build(java.util.Map<String, ?> map) throws Exception {
            ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionInstanceErrorCount self = new ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionInstanceErrorCount();
            return TeaModel.build(map, self);
        }

        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionInstanceErrorCount setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionInstanceErrorPercentage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Percentage")
        public Integer percentage;

        public static ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionInstanceErrorPercentage build(java.util.Map<String, ?> map) throws Exception {
            ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionInstanceErrorPercentage self = new ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionInstanceErrorPercentage();
            return TeaModel.build(map, self);
        }

        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionInstanceErrorPercentage setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

    }

    public static class ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionInstanceTransferFluctuate extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Percentage")
        public Integer percentage;

        /**
         * <strong>example:</strong>
         * <p>abs</p>
         */
        @NameInMap("Trend")
        public String trend;

        public static ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionInstanceTransferFluctuate build(java.util.Map<String, ?> map) throws Exception {
            ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionInstanceTransferFluctuate self = new ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionInstanceTransferFluctuate();
            return TeaModel.build(map, self);
        }

        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionInstanceTransferFluctuate setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionInstanceTransferFluctuate setTrend(String trend) {
            this.trend = trend;
            return this;
        }
        public String getTrend() {
            return this.trend;
        }

    }

    public static class ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionTimeout extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TimeoutInMinutes")
        public Integer timeoutInMinutes;

        public static ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionTimeout build(java.util.Map<String, ?> map) throws Exception {
            ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionTimeout self = new ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionTimeout();
            return TeaModel.build(map, self);
        }

        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionTimeout setTimeoutInMinutes(Integer timeoutInMinutes) {
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }
        public Integer getTimeoutInMinutes() {
            return this.timeoutInMinutes;
        }

    }

    public static class ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionUnFinished extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12:00</p>
         */
        @NameInMap("UnFinishedTime")
        public String unFinishedTime;

        public static ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionUnFinished build(java.util.Map<String, ?> map) throws Exception {
            ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionUnFinished self = new ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionUnFinished();
            return TeaModel.build(map, self);
        }

        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionUnFinished setUnFinishedTime(String unFinishedTime) {
            this.unFinishedTime = unFinishedTime;
            return this;
        }
        public String getUnFinishedTime() {
            return this.unFinishedTime;
        }

    }

    public static class ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtension extends TeaModel {
        @NameInMap("CycleUnfinished")
        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionCycleUnfinished cycleUnfinished;

        @NameInMap("Error")
        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionError error;

        @NameInMap("InstanceErrorCount")
        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionInstanceErrorCount instanceErrorCount;

        @NameInMap("InstanceErrorPercentage")
        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionInstanceErrorPercentage instanceErrorPercentage;

        @NameInMap("InstanceTransferFluctuate")
        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionInstanceTransferFluctuate instanceTransferFluctuate;

        @NameInMap("Timeout")
        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionTimeout timeout;

        @NameInMap("UnFinished")
        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionUnFinished unFinished;

        public static ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtension build(java.util.Map<String, ?> map) throws Exception {
            ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtension self = new ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtension();
            return TeaModel.build(map, self);
        }

        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtension setCycleUnfinished(ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionCycleUnfinished cycleUnfinished) {
            this.cycleUnfinished = cycleUnfinished;
            return this;
        }
        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionCycleUnfinished getCycleUnfinished() {
            return this.cycleUnfinished;
        }

        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtension setError(ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionError error) {
            this.error = error;
            return this;
        }
        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionError getError() {
            return this.error;
        }

        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtension setInstanceErrorCount(ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionInstanceErrorCount instanceErrorCount) {
            this.instanceErrorCount = instanceErrorCount;
            return this;
        }
        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionInstanceErrorCount getInstanceErrorCount() {
            return this.instanceErrorCount;
        }

        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtension setInstanceErrorPercentage(ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionInstanceErrorPercentage instanceErrorPercentage) {
            this.instanceErrorPercentage = instanceErrorPercentage;
            return this;
        }
        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionInstanceErrorPercentage getInstanceErrorPercentage() {
            return this.instanceErrorPercentage;
        }

        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtension setInstanceTransferFluctuate(ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionInstanceTransferFluctuate instanceTransferFluctuate) {
            this.instanceTransferFluctuate = instanceTransferFluctuate;
            return this;
        }
        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionInstanceTransferFluctuate getInstanceTransferFluctuate() {
            return this.instanceTransferFluctuate;
        }

        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtension setTimeout(ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionTimeout timeout) {
            this.timeout = timeout;
            return this;
        }
        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionTimeout getTimeout() {
            return this.timeout;
        }

        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtension setUnFinished(ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionUnFinished unFinished) {
            this.unFinished = unFinished;
            return this;
        }
        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionUnFinished getUnFinished() {
            return this.unFinished;
        }

    }

    public static class ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionTarget extends TeaModel {
        @NameInMap("AllowTasks")
        public java.util.List<Long> allowTasks;

        @NameInMap("Ids")
        public java.util.List<Long> ids;

        /**
         * <strong>example:</strong>
         * <p>Task</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionTarget build(java.util.Map<String, ?> map) throws Exception {
            ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionTarget self = new ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionTarget();
            return TeaModel.build(map, self);
        }

        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionTarget setAllowTasks(java.util.List<Long> allowTasks) {
            this.allowTasks = allowTasks;
            return this;
        }
        public java.util.List<Long> getAllowTasks() {
            return this.allowTasks;
        }

        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionTarget setIds(java.util.List<Long> ids) {
            this.ids = ids;
            return this;
        }
        public java.util.List<Long> getIds() {
            return this.ids;
        }

        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerCondition extends TeaModel {
        @NameInMap("Extension")
        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtension extension;

        @NameInMap("Target")
        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionTarget target;

        /**
         * <strong>example:</strong>
         * <p>Error</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerCondition build(java.util.Map<String, ?> map) throws Exception {
            ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerCondition self = new ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerCondition();
            return TeaModel.build(map, self);
        }

        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerCondition setExtension(ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtension extension) {
            this.extension = extension;
            return this;
        }
        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtension getExtension() {
            return this.extension;
        }

        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerCondition setTarget(ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionTarget target) {
            this.target = target;
            return this;
        }
        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionTarget getTarget() {
            return this.target;
        }

        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerCondition setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAlertRulesResponseBodyPagingInfoAlertRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <strong>example:</strong>
         * <p>22125</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>error_test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1933790683****</p>
         */
        @NameInMap("Owner")
        public String owner;

        @NameInMap("TriggerCondition")
        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerCondition triggerCondition;

        public static ListAlertRulesResponseBodyPagingInfoAlertRules build(java.util.Map<String, ?> map) throws Exception {
            ListAlertRulesResponseBodyPagingInfoAlertRules self = new ListAlertRulesResponseBodyPagingInfoAlertRules();
            return TeaModel.build(map, self);
        }

        public ListAlertRulesResponseBodyPagingInfoAlertRules setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListAlertRulesResponseBodyPagingInfoAlertRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAlertRulesResponseBodyPagingInfoAlertRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAlertRulesResponseBodyPagingInfoAlertRules setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListAlertRulesResponseBodyPagingInfoAlertRules setTriggerCondition(ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerCondition triggerCondition) {
            this.triggerCondition = triggerCondition;
            return this;
        }
        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerCondition getTriggerCondition() {
            return this.triggerCondition;
        }

    }

    public static class ListAlertRulesResponseBodyPagingInfo extends TeaModel {
        @NameInMap("AlertRules")
        public java.util.List<ListAlertRulesResponseBodyPagingInfoAlertRules> alertRules;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAlertRulesResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAlertRulesResponseBodyPagingInfo self = new ListAlertRulesResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListAlertRulesResponseBodyPagingInfo setAlertRules(java.util.List<ListAlertRulesResponseBodyPagingInfoAlertRules> alertRules) {
            this.alertRules = alertRules;
            return this;
        }
        public java.util.List<ListAlertRulesResponseBodyPagingInfoAlertRules> getAlertRules() {
            return this.alertRules;
        }

        public ListAlertRulesResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListAlertRulesResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAlertRulesResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}

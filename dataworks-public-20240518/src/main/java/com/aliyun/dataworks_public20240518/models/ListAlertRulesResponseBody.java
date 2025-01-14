// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListAlertRulesResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListAlertRulesResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID.</p>
     * 
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
         * <p>The ID of the scheduling cycle of the instance. Valid values: [1,288].</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CycleId")
        public Integer cycleId;

        /**
         * <p>The latest completion time of the instance within the scheduling cycle. The time is in the hh:mm format. Valid values of hh: [0,47]. Valid values of mm: [0,59].</p>
         * 
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
        /**
         * <p>The configurations of the scheduling cycle and timeout period of the instance.</p>
         */
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
        @NameInMap("AutoRerunAlertEnabled")
        public Boolean autoRerunAlertEnabled;

        /**
         * <p>The IDs of the real-time computing tasks. This parameter is required when you monitor real-time computing tasks.</p>
         */
        @NameInMap("StreamTaskIds")
        public java.util.List<Long> streamTaskIds;

        public static ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionError build(java.util.Map<String, ?> map) throws Exception {
            ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionError self = new ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionError();
            return TeaModel.build(map, self);
        }

        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionError setAutoRerunAlertEnabled(Boolean autoRerunAlertEnabled) {
            this.autoRerunAlertEnabled = autoRerunAlertEnabled;
            return this;
        }
        public Boolean getAutoRerunAlertEnabled() {
            return this.autoRerunAlertEnabled;
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
         * <p>The maximum number of instances on which an error occurs. Valid values: [1,10000].</p>
         * 
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
         * <p>The maximum percentage of instances on which an error occurs in the workspace to the total number of instances. Valid values: [1-100].</p>
         * 
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
         * <p>The maximum percentage of fluctuation in the number of auto triggered node instances that are generated in your workspace. Valid values: [1-100].</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Percentage")
        public Integer percentage;

        /**
         * <p>The way in which the number of auto triggered node instances that are generated in your workspace fluctuates. Valid values:</p>
         * <ul>
         * <li>abs: the absolute value. The number of instances increases or decreases.</li>
         * <li>increase: The number of instances increases.</li>
         * <li>decrease: The number of instances decreases.</li>
         * </ul>
         * 
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
         * <p>The timeout period. Unit: minutes.</p>
         * 
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
         * <p>The latest completion time of the instance. The period is in the hh:mm format. Valid values of hh: [0,47]. Valid values of mm: [0,59].</p>
         * 
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
        /**
         * <p>The configuration for an alert of the CycleUnfinished type.</p>
         */
        @NameInMap("CycleUnfinished")
        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionCycleUnfinished cycleUnfinished;

        /**
         * <p>The configuration for an alert of the Error type.</p>
         */
        @NameInMap("Error")
        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionError error;

        /**
         * <p>The configuration for an alert of the InstanceErrorCount type.</p>
         */
        @NameInMap("InstanceErrorCount")
        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionInstanceErrorCount instanceErrorCount;

        /**
         * <p>The configuration for an alert of the InstanceErrorPercentage type.</p>
         */
        @NameInMap("InstanceErrorPercentage")
        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionInstanceErrorPercentage instanceErrorPercentage;

        /**
         * <p>The configuration for an alert of the InstanceTransferFluctuate type.</p>
         */
        @NameInMap("InstanceTransferFluctuate")
        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionInstanceTransferFluctuate instanceTransferFluctuate;

        /**
         * <p>The configuration for an alert of the Timeout type.</p>
         */
        @NameInMap("Timeout")
        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtensionTimeout timeout;

        /**
         * <p>The configuration for an alert of the UnFinished type.</p>
         */
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
        /**
         * <p>The nodes that are not to be monitored.</p>
         */
        @NameInMap("AllowTasks")
        public java.util.List<Long> allowTasks;

        /**
         * <p>The IDs of monitored objects.</p>
         */
        @NameInMap("Ids")
        public java.util.List<Long> ids;

        /**
         * <p>The type of the monitored objects. Valid values:</p>
         * <ul>
         * <li>Task: node</li>
         * <li>Baseline: baseline</li>
         * <li>Projec: workspace</li>
         * <li>BizProcess: workflow</li>
         * </ul>
         * 
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
        /**
         * <p>The extended information about the rule. This parameter is required for specific types of alerts.</p>
         */
        @NameInMap("Extension")
        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionExtension extension;

        /**
         * <p>The monitored objects.</p>
         */
        @NameInMap("Target")
        public ListAlertRulesResponseBodyPagingInfoAlertRulesTriggerConditionTarget target;

        /**
         * <p>The alert type. Valid values:</p>
         * <ul>
         * <li>Finished: An instance is successfully run.</li>
         * <li>UnFinished: An instance does not finish running before a specified point in time.</li>
         * <li>Error: An error occurs on an instance.</li>
         * <li>CycleUnfinished: An instance does not finish running as expected within a specific cycle.</li>
         * <li>Timeout: An instance times out.</li>
         * <li>InstanceTransferComplete: An instance is generated by the auto triggered node.</li>
         * <li>InstanceTransferFluctuate: The number of generated instances fluctuates.</li>
         * <li>ExhaustedError: An error persists after an instance is automatically rerun.</li>
         * <li>InstanceKeyword: An instance with errors contains specified keywords.</li>
         * <li>InstanceErrorCount: The number of instances on which an error occurs reaches a specified threshold.</li>
         * <li>InstanceErrorPercentage: The proportion of instances on which an error occurs in the workspace to the total number of instances reaches a specified threshold.</li>
         * <li>ResourceGroupPercentage: The usage rate of the resource group reaches a specified threshold.</li>
         * <li>ResourceGroupWaitCount: The number of instances that are waiting for resources in the resource group reaches a specified threshold.</li>
         * </ul>
         * 
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
         * <p>Indicates whether the rule is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22125</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>error_test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the Alibaba Cloud account used by the owner of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1933790683****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The alert triggering condition.</p>
         */
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
        /**
         * <p>The rules.</p>
         */
        @NameInMap("AlertRules")
        public java.util.List<ListAlertRulesResponseBodyPagingInfoAlertRules> alertRules;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
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

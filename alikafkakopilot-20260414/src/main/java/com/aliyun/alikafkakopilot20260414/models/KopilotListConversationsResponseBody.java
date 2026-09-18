// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkakopilot20260414.models;

import com.aliyun.tea.*;

public class KopilotListConversationsResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The data returned when the call is successful.</p>
     */
    @NameInMap("Data")
    public KopilotListConversationsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2DF166F2-F581-5254-AAB6-B482083FA7B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static KopilotListConversationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        KopilotListConversationsResponseBody self = new KopilotListConversationsResponseBody();
        return TeaModel.build(map, self);
    }

    public KopilotListConversationsResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public KopilotListConversationsResponseBody setData(KopilotListConversationsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public KopilotListConversationsResponseBodyData getData() {
        return this.data;
    }

    public KopilotListConversationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public KopilotListConversationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class KopilotListConversationsResponseBodyDataAutomationOverviewDestinationQuota extends TeaModel {
        /**
         * <p>The maximum number of tasks or channels allowed, subject to the actual configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Limit")
        public Integer limit;

        /**
         * <p>The remaining quota, calculated as the limit minus the used quantity. The minimum value is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Remaining")
        public Long remaining;

        /**
         * <p>The number of non-deleted notification channels. Disabled channels still consume quota.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Used")
        public Long used;

        public static KopilotListConversationsResponseBodyDataAutomationOverviewDestinationQuota build(java.util.Map<String, ?> map) throws Exception {
            KopilotListConversationsResponseBodyDataAutomationOverviewDestinationQuota self = new KopilotListConversationsResponseBodyDataAutomationOverviewDestinationQuota();
            return TeaModel.build(map, self);
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewDestinationQuota setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }
        public Integer getLimit() {
            return this.limit;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewDestinationQuota setRemaining(Long remaining) {
            this.remaining = remaining;
            return this;
        }
        public Long getRemaining() {
            return this.remaining;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewDestinationQuota setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

    }

    public static class KopilotListConversationsResponseBodyDataAutomationOverviewDestinationsItemsLastDelivery extends TeaModel {
        /**
         * <p>The time when the notification service accepted the delivery, in UTC ISO 8601 format. This field is empty if the delivery has not been accepted.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-17T12:01:00Z</p>
         */
        @NameInMap("AcceptedAt")
        public String acceptedAt;

        /**
         * <p>The time when the record was created, in UTC ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-17T12:00:00Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The unique identifier of the delivery record.</p>
         * 
         * <strong>example:</strong>
         * <p>dlv_0123456789abcdef0123456789abcdef</p>
         */
        @NameInMap("DeliveryId")
        public String deliveryId;

        /**
         * <p>The time of the most recent delivery attempt, in UTC ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-17T12:01:00Z</p>
         */
        @NameInMap("LastAttemptAt")
        public String lastAttemptAt;

        /**
         * <p>The delivery type. Valid values:</p>
         * <ul>
         * <li>AUTO: automatic delivery.</li>
         * <li>MANUAL: manual delivery.</li>
         * <li>TEST: connectivity test.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AUTO</p>
         */
        @NameInMap("SendKind")
        public String sendKind;

        /**
         * <p>The most recent delivery status. ACCEPTED indicates that the notification service has accepted the delivery, but does not mean the recipient has read it.</p>
         * 
         * <strong>example:</strong>
         * <p>ACCEPTED</p>
         */
        @NameInMap("Status")
        public String status;

        public static KopilotListConversationsResponseBodyDataAutomationOverviewDestinationsItemsLastDelivery build(java.util.Map<String, ?> map) throws Exception {
            KopilotListConversationsResponseBodyDataAutomationOverviewDestinationsItemsLastDelivery self = new KopilotListConversationsResponseBodyDataAutomationOverviewDestinationsItemsLastDelivery();
            return TeaModel.build(map, self);
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewDestinationsItemsLastDelivery setAcceptedAt(String acceptedAt) {
            this.acceptedAt = acceptedAt;
            return this;
        }
        public String getAcceptedAt() {
            return this.acceptedAt;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewDestinationsItemsLastDelivery setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewDestinationsItemsLastDelivery setDeliveryId(String deliveryId) {
            this.deliveryId = deliveryId;
            return this;
        }
        public String getDeliveryId() {
            return this.deliveryId;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewDestinationsItemsLastDelivery setLastAttemptAt(String lastAttemptAt) {
            this.lastAttemptAt = lastAttemptAt;
            return this;
        }
        public String getLastAttemptAt() {
            return this.lastAttemptAt;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewDestinationsItemsLastDelivery setSendKind(String sendKind) {
            this.sendKind = sendKind;
            return this;
        }
        public String getSendKind() {
            return this.sendKind;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewDestinationsItemsLastDelivery setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class KopilotListConversationsResponseBodyDataAutomationOverviewDestinationsItems extends TeaModel {
        /**
         * <p>The time when the record was created, in UTC ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-17T12:00:00Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The unique identifier of the notification channel.</p>
         * 
         * <strong>example:</strong>
         * <p>dst_0123456789abcdef0123456789abcdef</p>
         */
        @NameInMap("DestinationId")
        public String destinationId;

        /**
         * <p>The most recent delivery record. This field is empty if no delivery has been made.</p>
         */
        @NameInMap("LastDelivery")
        public KopilotListConversationsResponseBodyDataAutomationOverviewDestinationsItemsLastDelivery lastDelivery;

        /**
         * <p>The name of the notification channel.</p>
         * 
         * <strong>example:</strong>
         * <p>Inspection Notification Group</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The configuration status of the channel. Valid values:</p>
         * <ul>
         * <li>ACTIVE: enabled.</li>
         * <li>DISABLED: disabled.
         * Being enabled does not indicate that a delivery has been successfully sent.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the notification channel. DINGTALK_WEBHOOK indicates a DingTalk custom chatbot.</p>
         * 
         * <strong>example:</strong>
         * <p>DINGTALK_WEBHOOK</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The time when the record was last updated, in UTC ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-17T12:00:00Z</p>
         */
        @NameInMap("UpdatedAt")
        public String updatedAt;

        /**
         * <p>The version number used for concurrent update verification of the record.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Long version;

        public static KopilotListConversationsResponseBodyDataAutomationOverviewDestinationsItems build(java.util.Map<String, ?> map) throws Exception {
            KopilotListConversationsResponseBodyDataAutomationOverviewDestinationsItems self = new KopilotListConversationsResponseBodyDataAutomationOverviewDestinationsItems();
            return TeaModel.build(map, self);
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewDestinationsItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewDestinationsItems setDestinationId(String destinationId) {
            this.destinationId = destinationId;
            return this;
        }
        public String getDestinationId() {
            return this.destinationId;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewDestinationsItems setLastDelivery(KopilotListConversationsResponseBodyDataAutomationOverviewDestinationsItemsLastDelivery lastDelivery) {
            this.lastDelivery = lastDelivery;
            return this;
        }
        public KopilotListConversationsResponseBodyDataAutomationOverviewDestinationsItemsLastDelivery getLastDelivery() {
            return this.lastDelivery;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewDestinationsItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewDestinationsItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewDestinationsItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewDestinationsItems setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewDestinationsItems setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

    public static class KopilotListConversationsResponseBodyDataAutomationOverviewDestinations extends TeaModel {
        /**
         * <p>Indicates whether more pages are available.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasMore")
        public Boolean hasMore;

        /**
         * <p>The list of tasks or notification channels on the current page.</p>
         */
        @NameInMap("Items")
        public java.util.List<KopilotListConversationsResponseBodyDataAutomationOverviewDestinationsItems> items;

        /**
         * <p>The cursor for the next page. This field is empty if no more pages are available.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("NextCursor")
        public String nextCursor;

        /**
         * <p>The total number of non-deleted records in the list.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Long total;

        public static KopilotListConversationsResponseBodyDataAutomationOverviewDestinations build(java.util.Map<String, ?> map) throws Exception {
            KopilotListConversationsResponseBodyDataAutomationOverviewDestinations self = new KopilotListConversationsResponseBodyDataAutomationOverviewDestinations();
            return TeaModel.build(map, self);
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewDestinations setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewDestinations setItems(java.util.List<KopilotListConversationsResponseBodyDataAutomationOverviewDestinationsItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<KopilotListConversationsResponseBodyDataAutomationOverviewDestinationsItems> getItems() {
            return this.items;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewDestinations setNextCursor(String nextCursor) {
            this.nextCursor = nextCursor;
            return this;
        }
        public String getNextCursor() {
            return this.nextCursor;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewDestinations setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class KopilotListConversationsResponseBodyDataAutomationOverviewQuota extends TeaModel {
        /**
         * <p>The maximum number of tasks or channels allowed, subject to the actual configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Limit")
        public Integer limit;

        /**
         * <p>The remaining quota, calculated as the limit minus the used quantity. The minimum value is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Remaining")
        public Long remaining;

        /**
         * <p>The number of task quota slots consumed. Tasks in DRAFT, ENABLED, PAUSED, or NEEDS_AUTH status are counted. Completed and deleted tasks do not consume quota.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Used")
        public Long used;

        public static KopilotListConversationsResponseBodyDataAutomationOverviewQuota build(java.util.Map<String, ?> map) throws Exception {
            KopilotListConversationsResponseBodyDataAutomationOverviewQuota self = new KopilotListConversationsResponseBodyDataAutomationOverviewQuota();
            return TeaModel.build(map, self);
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewQuota setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }
        public Integer getLimit() {
            return this.limit;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewQuota setRemaining(Long remaining) {
            this.remaining = remaining;
            return this;
        }
        public Long getRemaining() {
            return this.remaining;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewQuota setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

    }

    public static class KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsActiveRun extends TeaModel {
        /**
         * <p>The error code of a failed run. This field is empty if no error occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>UPSTREAM_TIMEOUT</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The user-facing failure reason. This field is empty if no error occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>Model or tool calling invoke timed out. Try again later</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The time when the run finished, in UTC ISO 8601 format. This field is typically empty for queued or running executions.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-17T12:01:00Z</p>
         */
        @NameInMap("FinishedAt")
        public String finishedAt;

        /**
         * <p>The unique identifier of a single run.</p>
         * 
         * <strong>example:</strong>
         * <p>run_0123456789abcdef0123456789abcdef</p>
         */
        @NameInMap("RunId")
        public String runId;

        /**
         * <p>The status of a single run. Valid values:</p>
         * <ul>
         * <li>QUEUED: queued.</li>
         * <li>RUNNING: running.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        public static KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsActiveRun build(java.util.Map<String, ?> map) throws Exception {
            KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsActiveRun self = new KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsActiveRun();
            return TeaModel.build(map, self);
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsActiveRun setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsActiveRun setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsActiveRun setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsActiveRun setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsActiveRun setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsConfiguration extends TeaModel {
        /**
         * <p>The six-field cron expression with the seconds field fixed to 0. This field is used only for the CRON schedule type.</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>The list of notification channel IDs that receive task results. A maximum of 3 IDs are supported.</p>
         */
        @NameInMap("DestinationIds")
        public java.util.List<String> destinationIds;

        /**
         * <p>The list of instance IDs within the query scope.</p>
         */
        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        /**
         * <p>The instruction for the scheduled task execution.</p>
         * 
         * <strong>example:</strong>
         * <p>Query the current risks of the specified instances and summarize the results</p>
         */
        @NameInMap("Instruction")
        public String instruction;

        /**
         * <p>The fixed interval in seconds. Valid values: 900 to 31536000. This field is used only for the FIXED_INTERVAL schedule type.</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        @NameInMap("IntervalSeconds")
        public Integer intervalSeconds;

        /**
         * <p>The time budget for a single task run, in seconds. Default value: 600. Valid values: 30 to 1800.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("MaxRunSeconds")
        public Integer maxRunSeconds;

        /**
         * <p>The token budget for a single task run. Default value: 3000000. Valid values: 1000 to 10000000.</p>
         * 
         * <strong>example:</strong>
         * <p>3000000</p>
         */
        @NameInMap("MaxTokens")
        public Long maxTokens;

        /**
         * <p>The name of the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>Kafka Resource Inspection</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The region where the queried resources reside.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource scope mode. Valid values:</p>
         * <ul>
         * <li>ACCOUNT: account-level query.</li>
         * <li>NONE: no resource task.</li>
         * <li>EXPLICIT: specified instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACCOUNT</p>
         */
        @NameInMap("ResourceMode")
        public String resourceMode;

        /**
         * <p>The one-time execution time in ISO 8601 format with time zone. This field is used only for the ONCE schedule type.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-18T12:00:00Z</p>
         */
        @NameInMap("RunAt")
        public String runAt;

        /**
         * <p>The schedule type. Valid values:</p>
         * <ul>
         * <li>ONCE: one-time execution.</li>
         * <li>CRON: cron expression.</li>
         * <li>FIXED_INTERVAL: fixed interval.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FIXED_INTERVAL</p>
         */
        @NameInMap("ScheduleType")
        public String scheduleType;

        /**
         * <p>The session mode for displaying results. Valid values:</p>
         * <ul>
         * <li>SHARED: shared session.</li>
         * <li>PER_RUN: independent session for each run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SHARED</p>
         */
        @NameInMap("SessionMode")
        public String sessionMode;

        /**
         * <p>The ID of the target session that stores run results in shared mode.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000-0000-4000-8000-000000000001</p>
         */
        @NameInMap("TargetSessionId")
        public String targetSessionId;

        /**
         * <p>The scheduling time zone. Default value: Asia/Shanghai.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("Timezone")
        public String timezone;

        public static KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsConfiguration build(java.util.Map<String, ?> map) throws Exception {
            KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsConfiguration self = new KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsConfiguration();
            return TeaModel.build(map, self);
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsConfiguration setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsConfiguration setDestinationIds(java.util.List<String> destinationIds) {
            this.destinationIds = destinationIds;
            return this;
        }
        public java.util.List<String> getDestinationIds() {
            return this.destinationIds;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsConfiguration setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsConfiguration setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsConfiguration setIntervalSeconds(Integer intervalSeconds) {
            this.intervalSeconds = intervalSeconds;
            return this;
        }
        public Integer getIntervalSeconds() {
            return this.intervalSeconds;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsConfiguration setMaxRunSeconds(Integer maxRunSeconds) {
            this.maxRunSeconds = maxRunSeconds;
            return this;
        }
        public Integer getMaxRunSeconds() {
            return this.maxRunSeconds;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsConfiguration setMaxTokens(Long maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Long getMaxTokens() {
            return this.maxTokens;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsConfiguration setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsConfiguration setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsConfiguration setResourceMode(String resourceMode) {
            this.resourceMode = resourceMode;
            return this;
        }
        public String getResourceMode() {
            return this.resourceMode;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsConfiguration setRunAt(String runAt) {
            this.runAt = runAt;
            return this;
        }
        public String getRunAt() {
            return this.runAt;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsConfiguration setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsConfiguration setSessionMode(String sessionMode) {
            this.sessionMode = sessionMode;
            return this;
        }
        public String getSessionMode() {
            return this.sessionMode;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsConfiguration setTargetSessionId(String targetSessionId) {
            this.targetSessionId = targetSessionId;
            return this;
        }
        public String getTargetSessionId() {
            return this.targetSessionId;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsConfiguration setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

    }

    public static class KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsLastCompletedRun extends TeaModel {
        /**
         * <p>The error code of a failed run. This field is empty if no error occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>UPSTREAM_TIMEOUT</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The user-facing failure reason. This field is empty if no error occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>Model or tool calling invoke timed out. Try again later</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The time when the run finished, in UTC ISO 8601 format. This field is empty if the run has not finished.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-17T12:01:00Z</p>
         */
        @NameInMap("FinishedAt")
        public String finishedAt;

        /**
         * <p>The unique identifier of a single run.</p>
         * 
         * <strong>example:</strong>
         * <p>run_0123456789abcdef0123456789abcdef</p>
         */
        @NameInMap("RunId")
        public String runId;

        /**
         * <p>The status of the most recent completed run. For example, SUCCEEDED indicates success and FAILED indicates failure.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        @NameInMap("Status")
        public String status;

        public static KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsLastCompletedRun build(java.util.Map<String, ?> map) throws Exception {
            KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsLastCompletedRun self = new KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsLastCompletedRun();
            return TeaModel.build(map, self);
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsLastCompletedRun setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsLastCompletedRun setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsLastCompletedRun setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsLastCompletedRun setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsLastCompletedRun setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class KopilotListConversationsResponseBodyDataAutomationOverviewTasksItems extends TeaModel {
        /**
         * <p>The currently queued or running execution record. This field is empty if no active run exists.</p>
         */
        @NameInMap("ActiveRun")
        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsActiveRun activeRun;

        /**
         * <p>The task execution configuration.</p>
         */
        @NameInMap("Configuration")
        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsConfiguration configuration;

        /**
         * <p>The time when the record was created, in UTC ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-17T12:00:00Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The most recent completed run record, including failed runs. This field is empty if no record exists.</p>
         */
        @NameInMap("LastCompletedRun")
        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsLastCompletedRun lastCompletedRun;

        /**
         * <p>The name of the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>Kafka Resource Inspection</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The next scheduled execution time, in UTC ISO 8601 format. This field is empty if no next run is scheduled.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-17T12:15:00Z</p>
         */
        @NameInMap("NextRunAt")
        public String nextRunAt;

        /**
         * <p>The human-readable description of the execution schedule.</p>
         * 
         * <strong>example:</strong>
         * <p>Every 900 seconds</p>
         */
        @NameInMap("ScheduleDescription")
        public String scheduleDescription;

        /**
         * <p>The session mode for displaying results. Valid values:</p>
         * <ul>
         * <li>SHARED: shared session.</li>
         * <li>PER_RUN: independent session for each run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SHARED</p>
         */
        @NameInMap("SessionMode")
        public String sessionMode;

        /**
         * <p>The ID of the source session from which the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000-0000-4000-8000-000000000001</p>
         */
        @NameInMap("SourceSessionId")
        public String sourceSessionId;

        /**
         * <p>The status of the scheduled task. Valid values:</p>
         * <ul>
         * <li>DRAFT: Draft.</li>
         * <li>ENABLED: Enabled.</li>
         * <li>PAUSED: Paused.</li>
         * <li>NEEDS_AUTH: Pending authorization.</li>
         * <li>COMPLETED: Completed.</li>
         * </ul>
         * <p>This status is independent of the running status.</p>
         * 
         * <strong>example:</strong>
         * <p>ENABLED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the target session that stores run results in shared mode.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000-0000-4000-8000-000000000001</p>
         */
        @NameInMap("TargetSessionId")
        public String targetSessionId;

        /**
         * <p>The unique identifier of the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>task_0123456789abcdef0123456789abcdef</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The time when the record was last updated, in UTC ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-17T12:00:00Z</p>
         */
        @NameInMap("UpdatedAt")
        public String updatedAt;

        /**
         * <p>The version number used for concurrent update verification of the current record.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Long version;

        public static KopilotListConversationsResponseBodyDataAutomationOverviewTasksItems build(java.util.Map<String, ?> map) throws Exception {
            KopilotListConversationsResponseBodyDataAutomationOverviewTasksItems self = new KopilotListConversationsResponseBodyDataAutomationOverviewTasksItems();
            return TeaModel.build(map, self);
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItems setActiveRun(KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsActiveRun activeRun) {
            this.activeRun = activeRun;
            return this;
        }
        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsActiveRun getActiveRun() {
            return this.activeRun;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItems setConfiguration(KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }
        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsConfiguration getConfiguration() {
            return this.configuration;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItems setLastCompletedRun(KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsLastCompletedRun lastCompletedRun) {
            this.lastCompletedRun = lastCompletedRun;
            return this;
        }
        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItemsLastCompletedRun getLastCompletedRun() {
            return this.lastCompletedRun;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItems setNextRunAt(String nextRunAt) {
            this.nextRunAt = nextRunAt;
            return this;
        }
        public String getNextRunAt() {
            return this.nextRunAt;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItems setScheduleDescription(String scheduleDescription) {
            this.scheduleDescription = scheduleDescription;
            return this;
        }
        public String getScheduleDescription() {
            return this.scheduleDescription;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItems setSessionMode(String sessionMode) {
            this.sessionMode = sessionMode;
            return this;
        }
        public String getSessionMode() {
            return this.sessionMode;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItems setSourceSessionId(String sourceSessionId) {
            this.sourceSessionId = sourceSessionId;
            return this;
        }
        public String getSourceSessionId() {
            return this.sourceSessionId;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItems setTargetSessionId(String targetSessionId) {
            this.targetSessionId = targetSessionId;
            return this;
        }
        public String getTargetSessionId() {
            return this.targetSessionId;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItems setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasksItems setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

    public static class KopilotListConversationsResponseBodyDataAutomationOverviewTasks extends TeaModel {
        /**
         * <p>Indicates whether more pages are available.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasMore")
        public Boolean hasMore;

        /**
         * <p>The list of tasks or notification channels on the current page.</p>
         */
        @NameInMap("Items")
        public java.util.List<KopilotListConversationsResponseBodyDataAutomationOverviewTasksItems> items;

        /**
         * <p>The cursor for the next page. This field is empty if no more pages are available.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("NextCursor")
        public String nextCursor;

        /**
         * <p>The total number of non-deleted records in the list.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Long total;

        public static KopilotListConversationsResponseBodyDataAutomationOverviewTasks build(java.util.Map<String, ?> map) throws Exception {
            KopilotListConversationsResponseBodyDataAutomationOverviewTasks self = new KopilotListConversationsResponseBodyDataAutomationOverviewTasks();
            return TeaModel.build(map, self);
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasks setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasks setItems(java.util.List<KopilotListConversationsResponseBodyDataAutomationOverviewTasksItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<KopilotListConversationsResponseBodyDataAutomationOverviewTasksItems> getItems() {
            return this.items;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasks setNextCursor(String nextCursor) {
            this.nextCursor = nextCursor;
            return this;
        }
        public String getNextCursor() {
            return this.nextCursor;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverviewTasks setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class KopilotListConversationsResponseBodyDataAutomationOverview extends TeaModel {
        /**
         * <p>The time when the overview was generated, in UTC ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-17T12:00:00Z</p>
         */
        @NameInMap("AsOf")
        public String asOf;

        /**
         * <p>The quota for the number of notification channels of the current primary account in this environment, counted across regions.</p>
         */
        @NameInMap("DestinationQuota")
        public KopilotListConversationsResponseBodyDataAutomationOverviewDestinationQuota destinationQuota;

        /**
         * <p>The paginated results of notification channels. Webhook URLs and signing keys are not returned.</p>
         */
        @NameInMap("Destinations")
        public KopilotListConversationsResponseBodyDataAutomationOverviewDestinations destinations;

        /**
         * <p>The home region for tasks and notification channels.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("HomeRegion")
        public String homeRegion;

        /**
         * <p>The quota for the number of scheduled tasks of the current primary account in this environment, counted across regions.</p>
         */
        @NameInMap("Quota")
        public KopilotListConversationsResponseBodyDataAutomationOverviewQuota quota;

        /**
         * <p>The paginated results of scheduled tasks for the account.</p>
         */
        @NameInMap("Tasks")
        public KopilotListConversationsResponseBodyDataAutomationOverviewTasks tasks;

        public static KopilotListConversationsResponseBodyDataAutomationOverview build(java.util.Map<String, ?> map) throws Exception {
            KopilotListConversationsResponseBodyDataAutomationOverview self = new KopilotListConversationsResponseBodyDataAutomationOverview();
            return TeaModel.build(map, self);
        }

        public KopilotListConversationsResponseBodyDataAutomationOverview setAsOf(String asOf) {
            this.asOf = asOf;
            return this;
        }
        public String getAsOf() {
            return this.asOf;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverview setDestinationQuota(KopilotListConversationsResponseBodyDataAutomationOverviewDestinationQuota destinationQuota) {
            this.destinationQuota = destinationQuota;
            return this;
        }
        public KopilotListConversationsResponseBodyDataAutomationOverviewDestinationQuota getDestinationQuota() {
            return this.destinationQuota;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverview setDestinations(KopilotListConversationsResponseBodyDataAutomationOverviewDestinations destinations) {
            this.destinations = destinations;
            return this;
        }
        public KopilotListConversationsResponseBodyDataAutomationOverviewDestinations getDestinations() {
            return this.destinations;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverview setHomeRegion(String homeRegion) {
            this.homeRegion = homeRegion;
            return this;
        }
        public String getHomeRegion() {
            return this.homeRegion;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverview setQuota(KopilotListConversationsResponseBodyDataAutomationOverviewQuota quota) {
            this.quota = quota;
            return this;
        }
        public KopilotListConversationsResponseBodyDataAutomationOverviewQuota getQuota() {
            return this.quota;
        }

        public KopilotListConversationsResponseBodyDataAutomationOverview setTasks(KopilotListConversationsResponseBodyDataAutomationOverviewTasks tasks) {
            this.tasks = tasks;
            return this;
        }
        public KopilotListConversationsResponseBodyDataAutomationOverviewTasks getTasks() {
            return this.tasks;
        }

    }

    public static class KopilotListConversationsResponseBodyDataScheduledTaskQuota extends TeaModel {
        /**
         * <p>The maximum number of tasks or channels allowed, subject to the actual configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Limit")
        public Integer limit;

        /**
         * <p>The remaining quota, calculated as the limit minus the used quantity. The minimum value is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Remaining")
        public Long remaining;

        /**
         * <p>The number of task quota slots consumed. Tasks in DRAFT, ENABLED, PAUSED, or NEEDS_AUTH status are counted. Completed and deleted tasks do not consume quota.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Used")
        public Long used;

        public static KopilotListConversationsResponseBodyDataScheduledTaskQuota build(java.util.Map<String, ?> map) throws Exception {
            KopilotListConversationsResponseBodyDataScheduledTaskQuota self = new KopilotListConversationsResponseBodyDataScheduledTaskQuota();
            return TeaModel.build(map, self);
        }

        public KopilotListConversationsResponseBodyDataScheduledTaskQuota setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }
        public Integer getLimit() {
            return this.limit;
        }

        public KopilotListConversationsResponseBodyDataScheduledTaskQuota setRemaining(Long remaining) {
            this.remaining = remaining;
            return this;
        }
        public Long getRemaining() {
            return this.remaining;
        }

        public KopilotListConversationsResponseBodyDataScheduledTaskQuota setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

    }

    public static class KopilotListConversationsResponseBodyData extends TeaModel {
        /**
         * <p>The overview of tasks, notification channels, and quotas for the current account. Returned only when the request includes the overview and the feature is available.</p>
         */
        @NameInMap("AutomationOverview")
        public KopilotListConversationsResponseBodyDataAutomationOverview automationOverview;

        /**
         * <p>The list of session IDs.</p>
         */
        @NameInMap("ConversationIds")
        public java.util.List<String> conversationIds;

        /**
         * <p>The number of entries returned on the current page in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>A mapping that uses session IDs as keys and associated task summaries as values.</p>
         */
        @NameInMap("ScheduledTaskInfoBySessionId")
        public java.util.Map<String, DataScheduledTaskInfoBySessionIdValue> scheduledTaskInfoBySessionId;

        /**
         * <p>The quota for the number of scheduled tasks of the current primary account in this environment, counted across regions.</p>
         */
        @NameInMap("ScheduledTaskQuota")
        public KopilotListConversationsResponseBodyDataScheduledTaskQuota scheduledTaskQuota;

        /**
         * <p>The number of entries on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Total")
        public Long total;

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPages")
        public Integer totalPages;

        /**
         * <p>The user UID.</p>
         * 
         * <strong>example:</strong>
         * <p>1734455674565</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static KopilotListConversationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            KopilotListConversationsResponseBodyData self = new KopilotListConversationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public KopilotListConversationsResponseBodyData setAutomationOverview(KopilotListConversationsResponseBodyDataAutomationOverview automationOverview) {
            this.automationOverview = automationOverview;
            return this;
        }
        public KopilotListConversationsResponseBodyDataAutomationOverview getAutomationOverview() {
            return this.automationOverview;
        }

        public KopilotListConversationsResponseBodyData setConversationIds(java.util.List<String> conversationIds) {
            this.conversationIds = conversationIds;
            return this;
        }
        public java.util.List<String> getConversationIds() {
            return this.conversationIds;
        }

        public KopilotListConversationsResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public KopilotListConversationsResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public KopilotListConversationsResponseBodyData setScheduledTaskInfoBySessionId(java.util.Map<String, DataScheduledTaskInfoBySessionIdValue> scheduledTaskInfoBySessionId) {
            this.scheduledTaskInfoBySessionId = scheduledTaskInfoBySessionId;
            return this;
        }
        public java.util.Map<String, DataScheduledTaskInfoBySessionIdValue> getScheduledTaskInfoBySessionId() {
            return this.scheduledTaskInfoBySessionId;
        }

        public KopilotListConversationsResponseBodyData setScheduledTaskQuota(KopilotListConversationsResponseBodyDataScheduledTaskQuota scheduledTaskQuota) {
            this.scheduledTaskQuota = scheduledTaskQuota;
            return this;
        }
        public KopilotListConversationsResponseBodyDataScheduledTaskQuota getScheduledTaskQuota() {
            return this.scheduledTaskQuota;
        }

        public KopilotListConversationsResponseBodyData setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public KopilotListConversationsResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public KopilotListConversationsResponseBodyData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public KopilotListConversationsResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}

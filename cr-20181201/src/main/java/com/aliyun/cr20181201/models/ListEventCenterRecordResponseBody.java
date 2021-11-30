// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListEventCenterRecordResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Records")
    public java.util.List<ListEventCenterRecordResponseBodyRecords> records;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListEventCenterRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEventCenterRecordResponseBody self = new ListEventCenterRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEventCenterRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListEventCenterRecordResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListEventCenterRecordResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListEventCenterRecordResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEventCenterRecordResponseBody setRecords(java.util.List<ListEventCenterRecordResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ListEventCenterRecordResponseBodyRecords> getRecords() {
        return this.records;
    }

    public ListEventCenterRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEventCenterRecordResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListEventCenterRecordResponseBodyRecords extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("EventChannel")
        public String eventChannel;

        @NameInMap("EventNotifyId")
        public String eventNotifyId;

        @NameInMap("EventNotifyMethod")
        public String eventNotifyMethod;

        @NameInMap("EventType")
        public String eventType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("RecordId")
        public String recordId;

        @NameInMap("RepoName")
        public String repoName;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListEventCenterRecordResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            ListEventCenterRecordResponseBodyRecords self = new ListEventCenterRecordResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public ListEventCenterRecordResponseBodyRecords setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListEventCenterRecordResponseBodyRecords setEventChannel(String eventChannel) {
            this.eventChannel = eventChannel;
            return this;
        }
        public String getEventChannel() {
            return this.eventChannel;
        }

        public ListEventCenterRecordResponseBodyRecords setEventNotifyId(String eventNotifyId) {
            this.eventNotifyId = eventNotifyId;
            return this;
        }
        public String getEventNotifyId() {
            return this.eventNotifyId;
        }

        public ListEventCenterRecordResponseBodyRecords setEventNotifyMethod(String eventNotifyMethod) {
            this.eventNotifyMethod = eventNotifyMethod;
            return this;
        }
        public String getEventNotifyMethod() {
            return this.eventNotifyMethod;
        }

        public ListEventCenterRecordResponseBodyRecords setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public ListEventCenterRecordResponseBodyRecords setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListEventCenterRecordResponseBodyRecords setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListEventCenterRecordResponseBodyRecords setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public ListEventCenterRecordResponseBodyRecords setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public ListEventCenterRecordResponseBodyRecords setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public ListEventCenterRecordResponseBodyRecords setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListEventCenterRecordResponseBodyRecords setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListEventCenterRecordResponseBodyRecords setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}

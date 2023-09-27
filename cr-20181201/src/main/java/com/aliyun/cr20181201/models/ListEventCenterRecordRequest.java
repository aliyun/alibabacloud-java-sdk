// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListEventCenterRecordRequest extends TeaModel {
    /**
     * <p>The type of the event. Valid values:</p>
     * <br>
     * <p>*   `cr:Artifact:DeliveryChainCompleted`: The delivery chain is processed.</p>
     * <p>*   `cr:Artifact:SynchronizationCompleted`: The image is replicated.</p>
     * <p>*   `cr:Artifact:BuildCompleted`: The image is built.</p>
     * <p>*   `cr:Artifact:ScanCompleted`: The image is scanned.</p>
     * <p>*   `cr:Artifact:SigningCompleted`: The image is signed.</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the event notification rule.</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    public static ListEventCenterRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEventCenterRecordRequest self = new ListEventCenterRecordRequest();
        return TeaModel.build(map, self);
    }

    public ListEventCenterRecordRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public ListEventCenterRecordRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListEventCenterRecordRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListEventCenterRecordRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEventCenterRecordRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}

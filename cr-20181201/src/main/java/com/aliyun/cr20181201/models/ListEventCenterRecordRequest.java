// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListEventCenterRecordRequest extends TeaModel {
    /**
     * <p>The event type. Valid values:</p>
     * <ul>
     * <li><code>cr:Artifact:DeliveryChainCompleted</code>: Delivery chain processing completed.</li>
     * <li><code>cr:Artifact:SynchronizationCompleted</code>: Image synchronization completed.</li>
     * <li><code>cr:Artifact:BuildCompleted</code>: Image building completed.</li>
     * <li><code>cr:Artifact:ScanCompleted</code>: Image scanning completed.</li>
     * <li><code>cr:Artifact:SigningCompleted</code>: Image signing completed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cr:Artifact:DeliveryChainCompleted</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-kmsiwlxxdcva****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The repository name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The repository namespace name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RepoNamespaceName")
    public String repoNamespaceName;

    /**
     * <p>The event rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>crecr-n6pbhgjxtla***</p>
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

    public ListEventCenterRecordRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public ListEventCenterRecordRequest setRepoNamespaceName(String repoNamespaceName) {
        this.repoNamespaceName = repoNamespaceName;
        return this;
    }
    public String getRepoNamespaceName() {
        return this.repoNamespaceName;
    }

    public ListEventCenterRecordRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}

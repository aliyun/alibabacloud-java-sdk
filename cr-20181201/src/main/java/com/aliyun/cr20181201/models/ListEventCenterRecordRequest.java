// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListEventCenterRecordRequest extends TeaModel {
    /**
     * <p>The type of the event. Valid values:</p>
     * <ul>
     * <li><code>cr:Artifact:DeliveryChainCompleted</code>: The delivery chain is processed.</li>
     * <li><code>cr:Artifact:SynchronizationCompleted</code>: The image is replicated.</li>
     * <li><code>cr:Artifact:BuildCompleted</code>: The image is built.</li>
     * <li><code>cr:Artifact:ScanCompleted</code>: The image is scanned.</li>
     * <li><code>cr:Artifact:SigningCompleted</code>: The image is signed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cr:Artifact:DeliveryChainCompleted</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-kmsiwlxxdcva****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the repository.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The name of the namespace to which the repository belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RepoNamespaceName")
    public String repoNamespaceName;

    /**
     * <p>The ID of the event notification rule.</p>
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

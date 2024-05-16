// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListTopicsRequest extends TeaModel {
    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-dd\\"T\\"HH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BeginTime")
    public String beginTime;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-dd\\"T\\"HH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the node instance that triggers the events. You can configure either this parameter or the NodeId parameter.</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    /**
     * <p>The ID of the node that triggers the events. You can configure either this parameter or the InstanceId parameter.</p>
     */
    @NameInMap("NodeId")
    public Long nodeId;

    /**
     * <p>The ID of the Alibaba Cloud account used by the owner of the events.</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The number of the page to return. Valid values: 1 to 30. Default value: 1.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The status of the events. Valid values: IGNORE, NEW, FIXING, and RECOVER. The value IGNORE indicates that the events are ignored. The value NEW indicates that the events are new events. The value FIXING indicates that the events are being processed. The value RECOVER indicates that the events are processed. You can specify multiple states. Separate them with commas (,).</p>
     */
    @NameInMap("TopicStatuses")
    public String topicStatuses;

    /**
     * <p>The types of the events. Valid values: SLOW and ERROR. The value SLOW indicates that the running duration of the node in the current scheduling cycle is significantly longer than the average running duration of the node in previous scheduling cycles. The value ERROR indicates that the node fails to run. You can specify multiple types. Separate them with commas (,).</p>
     */
    @NameInMap("TopicTypes")
    public String topicTypes;

    public static ListTopicsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTopicsRequest self = new ListTopicsRequest();
        return TeaModel.build(map, self);
    }

    public ListTopicsRequest setBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public String getBeginTime() {
        return this.beginTime;
    }

    public ListTopicsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListTopicsRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public ListTopicsRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

    public ListTopicsRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListTopicsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTopicsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTopicsRequest setTopicStatuses(String topicStatuses) {
        this.topicStatuses = topicStatuses;
        return this;
    }
    public String getTopicStatuses() {
        return this.topicStatuses;
    }

    public ListTopicsRequest setTopicTypes(String topicTypes) {
        this.topicTypes = topicTypes;
        return this;
    }
    public String getTopicTypes() {
        return this.topicTypes;
    }

}

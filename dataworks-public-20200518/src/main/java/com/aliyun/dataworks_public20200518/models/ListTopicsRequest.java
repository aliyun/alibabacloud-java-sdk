// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListTopicsRequest extends TeaModel {
    /**
     * <p>The start time for discovery. Specify the time in UTC format (yyyy-MM-dd\&quot;T\&quot;HH:mm:ssZ).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-03-24T00:00:00+0800</p>
     */
    @NameInMap("BeginTime")
    public String beginTime;

    /**
     * <p>The end time for discovery. Specify the time in UTC format (yyyy-MM-dd\&quot;T\&quot;HH:mm:ssZ).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-03-25T23:00:00+0800</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The instance ID associated with the event. This parameter is mutually exclusive with NodeId.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    /**
     * <p>The ID of the node associated with the event. This parameter is mutually exclusive with InstanceId.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("NodeId")
    public Long nodeId;

    /**
     * <p>The Alibaba Cloud UID of the event owner.</p>
     * 
     * <strong>example:</strong>
     * <p>952795****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The page number. Default value: 1. Minimum value: 1. Maximum value: 30.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The status of the event. Valid values: IGNORE (ignored), NEW (newly discovered), FIXING (being processed), and RECOVER (recovered). Separate multiple event statuses with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>IGNORE,NEW,FIXING,RECOVER</p>
     */
    @NameInMap("TopicStatuses")
    public String topicStatuses;

    /**
     * <p>The type of the event. Valid values: SLOW (slow) and ERROR (error). Separate multiple event types with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>ERROR,SLOW</p>
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

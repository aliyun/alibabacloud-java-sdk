// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceEventRequest extends TeaModel {
    /**
     * <p>The end time of the query range, in UTC. The default value is the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>2006-01-02 15:04:05</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The event type. Valid values:</p>
     * <ul>
     * <li><p>Normal: a normal event.</p>
     * </li>
     * <li><p>Warning: a warning event.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The name of the service instance. To obtain this name, see <a href="https://help.aliyun.com/document_detail/412108.html">ListServiceInstances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>echo-test-784xxxx85d-hhnd8</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The page number to return. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public String pageNum;

    /**
     * <p>The number of events to return per page. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The start time of the query range, in UTC. The default value is 7 days ago.</p>
     * 
     * <strong>example:</strong>
     * <p>2006-01-02 15:04:05</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeServiceEventRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceEventRequest self = new DescribeServiceEventRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceEventRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeServiceEventRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeServiceEventRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeServiceEventRequest setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

    public DescribeServiceEventRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeServiceEventRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}

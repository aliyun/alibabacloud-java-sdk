// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSystemEventCountRequest extends TeaModel {
    /**
     * <p>The timestamp of the end time for the event query. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1635993921000</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The event type.</p>
     * <p>Call the DescribeSystemEventMetaList operation to obtain the value of the <code>EventType</code> response parameter, which provides the event types for all Alibaba Cloud services under the current Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>StatusNotification</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The application group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>17285****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The event level. Valid values:</p>
     * <ul>
     * <li><p>Critical: critical.</p>
     * </li>
     * <li><p>Warn: warning.</p>
     * </li>
     * <li><p>Info: information.</p>
     * </li>
     * </ul>
     * <p>Call the DescribeSystemEventMetaList operation to obtain the value of the <code>Level</code> response parameter, which provides the event levels for all Alibaba Cloud services under the current Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Info</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The event name.</p>
     * <p>Call the DescribeSystemEventMetaList operation to obtain the value of the <code>Name</code> response parameter, which provides the event names for all Alibaba Cloud services under the current Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance:StateChange</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The name of the Alibaba Cloud service.</p>
     * <p>Call the DescribeSystemEventMetaList operation to obtain the value of the <code>Product</code> response parameter, which provides the Alibaba Cloud service names for all events under the current Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("Product")
    public String product;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The keywords contained in the event content for searching. Valid values:</p>
     * <ul>
     * <li><p>To search for event content that contains both a and b, search for <code>a and b</code>.</p>
     * </li>
     * <li><p>To search for event content that contains either a or b, search for <code>a or b</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("SearchKeywords")
    public String searchKeywords;

    /**
     * <p>The timestamp of the start time for the event query. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1635993541000</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The event status.</p>
     * <p>Call the DescribeSystemEventMetaList operation to obtain the value of the <code>Status</code> response parameter, which provides the event statuses for all Alibaba Cloud services under the current Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeSystemEventCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemEventCountRequest self = new DescribeSystemEventCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSystemEventCountRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSystemEventCountRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeSystemEventCountRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeSystemEventCountRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public DescribeSystemEventCountRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeSystemEventCountRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public DescribeSystemEventCountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSystemEventCountRequest setSearchKeywords(String searchKeywords) {
        this.searchKeywords = searchKeywords;
        return this;
    }
    public String getSearchKeywords() {
        return this.searchKeywords;
    }

    public DescribeSystemEventCountRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSystemEventCountRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSystemEventCountRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1635993921000</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The type of the system event.</p>
     * <p>You can call the DescribeSystemEventMetaList operation to obtain the value of the response parameter <code>EventType</code>. The value of the EventType parameter indicates the types of system events that occurred for all cloud services in your Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>StatusNotification</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The ID of the application group.</p>
     * 
     * <strong>example:</strong>
     * <p>17285****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The level of the system event. Valid values:</p>
     * <ul>
     * <li>Critical</li>
     * <li>Warn</li>
     * <li>Info</li>
     * </ul>
     * <p>You can call the DescribeSystemEventMetaList operation to obtain the value of the response parameter <code>Level</code>. The value of the Level parameter indicates the levels of system events that occurred for all cloud services in your Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Info</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The name of the system event.</p>
     * <p>You can call the DescribeSystemEventMetaList operation to obtain the value of the response parameter <code>Name</code>. The value of the Name parameter indicates the names of system events that occurred for all cloud services in your Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance:StateChange</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The name of the cloud service.</p>
     * <p>You can call the DescribeSystemEventMetaList operation to obtain the value of the response parameter <code>Product</code>. The value of the Product parameter indicates the names of all cloud services in which the system events of your Alibaba Cloud account occurred. For more information, see <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("Product")
    public String product;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The keywords that are used to search for the system event. Valid values:</p>
     * <ul>
     * <li>If you want to search for the system event whose content contains a and b, set the value to <code>a and b</code>.</li>
     * <li>If you want to search for the system event whose content contains a or b, set the value to <code>a or b</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("SearchKeywords")
    public String searchKeywords;

    /**
     * <p>The beginning of the time range to query. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1635993541000</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the system event.</p>
     * <p>You can call the DescribeSystemEventMetaList operation to obtain the value of the response parameter <code>Status</code>. The value of the Status parameter indicates the status of system events that occurred for all cloud services in your Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a>.</p>
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

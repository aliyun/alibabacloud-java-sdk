// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSystemEventHistogramRequest extends TeaModel {
    /**
     * <p>The end time.</p>
     * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1552220485596</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The event type.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a> operation to query the types of system events.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Exception</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The ID of the application group.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The level of the event. Valid values:</p>
     * <ul>
     * <li>CRITICAL</li>
     * <li>WARN</li>
     * <li>INFO</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CRITICAL</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The event name.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a> operation to query the names of system events.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>BucketIngressBandwidth</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The abbreviation of the service name.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a> operation to query the abbreviations of service names.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
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
     * <p>cms</p>
     */
    @NameInMap("SearchKeywords")
    public String searchKeywords;

    /**
     * <p>The start time.</p>
     * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1552209685596</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The event status.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a> operation to query the status of system events.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeSystemEventHistogramRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemEventHistogramRequest self = new DescribeSystemEventHistogramRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSystemEventHistogramRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSystemEventHistogramRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeSystemEventHistogramRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeSystemEventHistogramRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public DescribeSystemEventHistogramRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeSystemEventHistogramRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public DescribeSystemEventHistogramRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSystemEventHistogramRequest setSearchKeywords(String searchKeywords) {
        this.searchKeywords = searchKeywords;
        return this;
    }
    public String getSearchKeywords() {
        return this.searchKeywords;
    }

    public DescribeSystemEventHistogramRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSystemEventHistogramRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}

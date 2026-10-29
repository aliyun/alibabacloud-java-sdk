// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSystemEventAttributeRequest extends TeaModel {
    /**
     * <p>The end time.</p>
     * <p>The value is a UNIX timestamp that represents the number of milliseconds that have elapsed since January 1, 1970.</p>
     * 
     * <strong>example:</strong>
     * <p>1552221584949</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The event type.</p>
     * <blockquote>
     * <p>For more information about valid values for the event type, see <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a>.</p>
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
     * <p>12346</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The event level. Valid values:</p>
     * <ul>
     * <li>CRITICAL: critical.</li>
     * <li>WARN: warning.</li>
     * <li>INFO: information.</li>
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
     * <p>For more information about valid values for the event name, see <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>BucketIngressBandwidth</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number.</p>
     * <p>Valid values: 1 to 100000000.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The abbreviation of the product name.</p>
     * <blockquote>
     * <p>For more information about valid values for the product name abbreviation, see <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("Product")
    public String product;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The keywords used to search event content. Valid values:</p>
     * <ul>
     * <li><p>If the event content you want to search for includes both a and b, you can search for <code>a and b</code>.</p>
     * </li>
     * <li><p>If the event content you want to search for includes either a or b, you can search for <code>a or b</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cms</p>
     */
    @NameInMap("SearchKeywords")
    public String searchKeywords;

    /**
     * <p>The start time.</p>
     * <p>The value is a UNIX timestamp that represents the number of milliseconds that have elapsed since January 1, 1970.</p>
     * 
     * <strong>example:</strong>
     * <p>1552199984949</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The event status.</p>
     * <blockquote>
     * <p>For more information about valid values for the event status, see <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeSystemEventAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemEventAttributeRequest self = new DescribeSystemEventAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSystemEventAttributeRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSystemEventAttributeRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeSystemEventAttributeRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeSystemEventAttributeRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public DescribeSystemEventAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeSystemEventAttributeRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSystemEventAttributeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSystemEventAttributeRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public DescribeSystemEventAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSystemEventAttributeRequest setSearchKeywords(String searchKeywords) {
        this.searchKeywords = searchKeywords;
        return this;
    }
    public String getSearchKeywords() {
        return this.searchKeywords;
    }

    public DescribeSystemEventAttributeRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSystemEventAttributeRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}

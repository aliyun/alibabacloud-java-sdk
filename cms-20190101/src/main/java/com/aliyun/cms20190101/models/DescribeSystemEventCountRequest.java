// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSystemEventCountRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("EventType")
    public String eventType;

    @NameInMap("Name")
    public String name;

    @NameInMap("Level")
    public String level;

    @NameInMap("Status")
    public String status;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SearchKeywords")
    public String searchKeywords;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    public static DescribeSystemEventCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemEventCountRequest self = new DescribeSystemEventCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSystemEventCountRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public DescribeSystemEventCountRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeSystemEventCountRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeSystemEventCountRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public DescribeSystemEventCountRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeSystemEventCountRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
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

    public DescribeSystemEventCountRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}

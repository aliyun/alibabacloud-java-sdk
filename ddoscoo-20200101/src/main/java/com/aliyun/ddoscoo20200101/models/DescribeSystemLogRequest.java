// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeSystemLogRequest extends TeaModel {
    /**
     * <p>The end time to query bills of burstable clean bandwidth that are generated before the specified time. This value is a timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1640966400000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The IP address of the Anti-DDoS instance to query.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/91490.html">DescribeInstanceDetails</a> to query the IP addresses of Anti-DDoS instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>203.107.XX.XX</p>
     */
    @NameInMap("EntityObject")
    public String entityObject;

    /**
     * <p>The type of system logs to query. The value is fixed at <strong>20</strong>, which indicates the billing logs of burstable clean bandwidth.</p>
     * <blockquote>
     * <p>You must set this parameter. Otherwise, the call fails.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("EntityType")
    public Integer entityType;

    /**
     * <p>The page number of the returned page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of logs to return on each page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start time to query bills of burstable clean bandwidth that are generated after the specified time. This value is a timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1609430400000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeSystemLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemLogRequest self = new DescribeSystemLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSystemLogRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeSystemLogRequest setEntityObject(String entityObject) {
        this.entityObject = entityObject;
        return this;
    }
    public String getEntityObject() {
        return this.entityObject;
    }

    public DescribeSystemLogRequest setEntityType(Integer entityType) {
        this.entityType = entityType;
        return this;
    }
    public Integer getEntityType() {
        return this.entityType;
    }

    public DescribeSystemLogRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSystemLogRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSystemLogRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}

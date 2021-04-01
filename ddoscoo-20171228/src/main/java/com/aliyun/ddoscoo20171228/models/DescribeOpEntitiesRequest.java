// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeOpEntitiesRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("EntityType")
    public Integer entityType;

    @NameInMap("EntityObject")
    public String entityObject;

    @NameInMap("StartTime")
    @Validation(required = true)
    public Long startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public Long endTime;

    @NameInMap("PageNo")
    @Validation(required = true)
    public Integer pageNo;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    public static DescribeOpEntitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpEntitiesRequest self = new DescribeOpEntitiesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOpEntitiesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeOpEntitiesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeOpEntitiesRequest setEntityType(Integer entityType) {
        this.entityType = entityType;
        return this;
    }
    public Integer getEntityType() {
        return this.entityType;
    }

    public DescribeOpEntitiesRequest setEntityObject(String entityObject) {
        this.entityObject = entityObject;
        return this;
    }
    public String getEntityObject() {
        return this.entityObject;
    }

    public DescribeOpEntitiesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeOpEntitiesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeOpEntitiesRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeOpEntitiesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListRecentCallDetailRecordsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;phoneNumber&quot;:&quot;1312121****&quot;,&quot;callingNumber&quot;:&quot;1312121****&quot;,&quot;calledNumber&quot;:&quot;1312121****&quot;}</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <strong>example:</strong>
     * <p>1604639129000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>1604638129000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListRecentCallDetailRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRecentCallDetailRecordsRequest self = new ListRecentCallDetailRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListRecentCallDetailRecordsRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

    public ListRecentCallDetailRecordsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListRecentCallDetailRecordsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListRecentCallDetailRecordsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRecentCallDetailRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRecentCallDetailRecordsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}

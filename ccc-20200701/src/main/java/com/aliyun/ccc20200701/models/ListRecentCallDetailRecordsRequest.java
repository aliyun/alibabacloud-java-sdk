// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListRecentCallDetailRecordsRequest extends TeaModel {
    /**
     * <p>Fuzzy search criteria in JSON object format. The object contains three properties that can be combined arbitrarily: phoneNumber (fuzzy search by calling or called number), callingNumber (fuzzy search by calling number), and calledNumber (fuzzy search by called number).</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;phoneNumber&quot;:&quot;1312121****&quot;,&quot;callingNumber&quot;:&quot;1312121****&quot;,&quot;calledNumber&quot;:&quot;1312121****&quot;}</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>End UNIX timestamp. The default value is the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>1604639129000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Page ordinal number, ranging from 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size, ranging from 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Start UNIX timestamp. The default value is the start time of the current day. The earliest allowed time is 180 days before the current time.</p>
     * 
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListVoicemailsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>073xxxx7539</p>
     */
    @NameInMap("Caller")
    public String caller;

    /**
     * <strong>example:</strong>
     * <p>job-125152394144124921</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    /**
     * <strong>example:</strong>
     * <p>1532707199000</p>
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
     * <strong>example:</strong>
     * <p>voicemail-test</p>
     */
    @NameInMap("Name")
    @Deprecated
    public String name;

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
     * <p>1532448000000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListVoicemailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVoicemailsRequest self = new ListVoicemailsRequest();
        return TeaModel.build(map, self);
    }

    public ListVoicemailsRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public ListVoicemailsRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public ListVoicemailsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListVoicemailsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListVoicemailsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListVoicemailsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListVoicemailsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListVoicemailsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}

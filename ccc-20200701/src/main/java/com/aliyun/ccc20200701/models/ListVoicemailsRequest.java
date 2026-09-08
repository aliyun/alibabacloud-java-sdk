// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListVoicemailsRequest extends TeaModel {
    /**
     * <p>The calling number.</p>
     * 
     * <strong>example:</strong>
     * <p>073xxxx7539</p>
     */
    @NameInMap("Caller")
    public String caller;

    /**
     * <p>The ID of the call. You can use this parameter to query the record of a specific call. You can obtain the contact ID from the softphone SDK during a call. If you specify this parameter, other query parameters are ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>job-125152394144124921</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    /**
     * <p>The end time of the query range. This is a UNIX timestamp in milliseconds. The default value is the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>1532707199000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the Cloud Contact Center (CC) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the voicemail.</p>
     * 
     * <strong>example:</strong>
     * <p>voicemail-test</p>
     */
    @NameInMap("Name")
    @Deprecated
    public String name;

    /**
     * <p>The page number. Valid values: 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start time of the query range. This is a UNIX timestamp in milliseconds. The default value is 00:00 on the current day.</p>
     * 
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

    @Deprecated
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

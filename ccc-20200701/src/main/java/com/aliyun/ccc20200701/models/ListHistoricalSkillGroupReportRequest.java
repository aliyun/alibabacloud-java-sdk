// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListHistoricalSkillGroupReportRequest extends TeaModel {
    /**
     * <p>End time of the historical data to retrieve, formatted as a UNIX timestamp in milliseconds. This parameter is optional. The default value is the current time. The time precision for statistics is hourly, rounded down to the previous hour, and uses an open interval. For example, if the start time is 11:12:20 and the end time is 11:45:50, the aligned input time range becomes [11:00:00, 12:00:00), meaning greater than or equal to 11:00:00 and less than 12:00:00.</p>
     * 
     * <strong>example:</strong>
     * <p>1532707199000</p>
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
     * <p>Media type. The default value is Audio. Other valid values include Chat and Video.</p>
     * 
     * <strong>example:</strong>
     * <p>VIDEO</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <p>Page number, ranging from 1 to 100.</p>
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
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>List of skill group IDs to query, provided as a JSON array string. Each array element is a skill group ID. This parameter is optional. The default value is empty, which means all skill groups in the current page are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;skillgroup1@ccc-test&quot;, &quot;skillgroup2@ccc-test2&quot;]</p>
     */
    @NameInMap("SkillGroupIdList")
    public String skillGroupIdList;

    /**
     * <p>Start time of the historical data to retrieve, formatted as a UNIX timestamp in milliseconds. This parameter is optional. The default value is 00:00:00 of the current day. The earliest allowed value is 180 days before the current time. The time precision for statistics is hourly, rounded down to the previous hour, and uses a closed interval.</p>
     * 
     * <strong>example:</strong>
     * <p>1532448000000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListHistoricalSkillGroupReportRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHistoricalSkillGroupReportRequest self = new ListHistoricalSkillGroupReportRequest();
        return TeaModel.build(map, self);
    }

    public ListHistoricalSkillGroupReportRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListHistoricalSkillGroupReportRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListHistoricalSkillGroupReportRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public ListHistoricalSkillGroupReportRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHistoricalSkillGroupReportRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHistoricalSkillGroupReportRequest setSkillGroupIdList(String skillGroupIdList) {
        this.skillGroupIdList = skillGroupIdList;
        return this;
    }
    public String getSkillGroupIdList() {
        return this.skillGroupIdList;
    }

    public ListHistoricalSkillGroupReportRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}

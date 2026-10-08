// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListHistoricalSkillGroupReportRequest extends TeaModel {
    /**
     * <p>The end time of the historical data to retrieve. Specify a UNIX timestamp in milliseconds. This parameter is optional. Default value: the current time. The statistical time precision is in hours. The end time is rounded up to the nearest hour, and the interval is open. For example, if the start time is 11:12:20 and the end time is 11:45:50, the aligned time range is [11:00:00, 12:00:00), which means greater than or equal to 11:00:00 and less than 12:00:00.</p>
     * 
     * <strong>example:</strong>
     * <p>1532707199000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The media type. Default value: Audio. Valid values: Audio, Chat, and Video.</p>
     * 
     * <strong>example:</strong>
     * <p>VIDEO</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

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
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The list of skill group IDs to query. The value is a character string in the JSON array format, where each array element is a skill group ID. This parameter is optional. Default value: empty. An empty value indicates that all skill groups in the current paging are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;skillgroup1@ccc-test&quot;, &quot;skillgroup2@ccc-test2&quot;]</p>
     */
    @NameInMap("SkillGroupIdList")
    public String skillGroupIdList;

    /**
     * <p>The start time of the historical data to retrieve. Specify a UNIX timestamp in milliseconds. This parameter is optional. Default value: 00:00:00 on the current day. The earliest allowed time is 180 days before the current time. The statistical time precision is in hours. The start time is rounded down to the nearest hour, and the interval is closed.</p>
     * 
     * <strong>example:</strong>
     * <p>1532448000000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>Specifies whether to aggregate data by instance ID.</p>
     */
    @NameInMap("SummarizeByInstanceId")
    public Boolean summarizeByInstanceId;

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

    public ListHistoricalSkillGroupReportRequest setSummarizeByInstanceId(Boolean summarizeByInstanceId) {
        this.summarizeByInstanceId = summarizeByInstanceId;
        return this;
    }
    public Boolean getSummarizeByInstanceId() {
        return this.summarizeByInstanceId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListRtcMPUEventSubRecordRequest extends TeaModel {
    /**
     * <p>The ID of the subscribed application. You can view your application IDs by navigating to <strong>ApsaraVideo Live &gt; Live+ &gt; ApsaraVideo Real-time Communication &gt; Application Management</strong>.</p>
     * <blockquote>
     * <ul>
     * <li>The application ID consists of uppercase and lowercase letters, digits, underscores, and hyphens (-), with a maximum of 64 characters.</li>
     * <li>You must first call CreateRtcMPUEventSub to create a stream mixing and forwarding event subscription for this application ID.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourAppId</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The end time of the query.
     * Format: yyyy-MM-ddTHH:mm:ssZ (UTC). The value cannot be later than the current time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1970-01-01T00:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of records per page. Valid values: 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start time of the query.
     * Format: yyyy-MM-ddTHH:mm:ssZ (UTC). The value cannot be earlier than seven days before the current time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1970-01-01T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The callback ID of the subscription.</p>
     * 
     * <strong>example:</strong>
     * <p>yourSubId</p>
     */
    @NameInMap("SubId")
    public String subId;

    public static ListRtcMPUEventSubRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRtcMPUEventSubRecordRequest self = new ListRtcMPUEventSubRecordRequest();
        return TeaModel.build(map, self);
    }

    public ListRtcMPUEventSubRecordRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListRtcMPUEventSubRecordRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListRtcMPUEventSubRecordRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListRtcMPUEventSubRecordRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRtcMPUEventSubRecordRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListRtcMPUEventSubRecordRequest setSubId(String subId) {
        this.subId = subId;
        return this;
    }
    public String getSubId() {
        return this.subId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeMeterLiveBypassDurationRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can view the application ID on the <a href="https://help.aliyun.com/document_detail/2355593.html">Applications</a> page in the ApsaraVideo Real-time Communication (ARTC) section of the ApsaraVideo Live console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4346289a-a790-4869-9e23-22766d5e****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. The end time must be later than the start time. The time range that can be specified is greater than or equal to 5 minutes and less than or equal to 31 days.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-10-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time granularity of the query. Unit: seconds. Valid values:</p>
     * <ul>
     * <li>300</li>
     * <li>3600</li>
     * <li>86400</li>
     * </ul>
     * <p>If you specify an invalid value or do not specify this parameter, the default value 3600 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-10-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeMeterLiveBypassDurationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterLiveBypassDurationRequest self = new DescribeMeterLiveBypassDurationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMeterLiveBypassDurationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeMeterLiveBypassDurationRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeMeterLiveBypassDurationRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeMeterLiveBypassDurationRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}

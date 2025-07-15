// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveStreamMonitorRequest extends TeaModel {
    /**
     * <p>The ID of the monitoring session.</p>
     * <blockquote>
     * <p> You can obtain the monitoring session ID from the response parameter <strong>MonitorId</strong> of the <a href="https://help.aliyun.com/document_detail/2848129.html">CreateLiveStreamMonitor</a> operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
     */
    @NameInMap("MonitorId")
    public String monitorId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteLiveStreamMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveStreamMonitorRequest self = new DeleteLiveStreamMonitorRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveStreamMonitorRequest setMonitorId(String monitorId) {
        this.monitorId = monitorId;
        return this;
    }
    public String getMonitorId() {
        return this.monitorId;
    }

    public DeleteLiveStreamMonitorRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteLiveStreamMonitorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

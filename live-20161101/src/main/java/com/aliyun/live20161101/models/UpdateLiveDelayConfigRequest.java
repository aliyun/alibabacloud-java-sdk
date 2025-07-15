// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveDelayConfigRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs. You can specify an asterisk (\*) as the value to match all applications that belong to the domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("App")
    public String app;

    /**
     * <p>The duration for which the playback of the live stream is delayed. The value must be an integer. Valid values: 16 to 3600. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("DelayTime")
    public Integer delayTime;

    /**
     * <p>The main streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the live stream. You can use the wildcard (\*) to specify all streams of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveStream****</p>
     */
    @NameInMap("Stream")
    public String stream;

    /**
     * <p>The trigger mode. Valid values:</p>
     * <ul>
     * <li><strong>PUBLISH_ONLY</strong>: Stream delay can be triggered only by specifying the stream delay parameter in the ingest URL.</li>
     * <li><strong>CONFIG_ONLY</strong>: Stream delay can be triggered only by the stream delay configuration.</li>
     * <li><strong>PUBLISH_CONFIG</strong>: Stream delay can be triggered by the stream delay parameter in the ingest URL or the stream delay configuration. The stream delay parameter takes precedence over the stream delay configuration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLISH_ONLY</p>
     */
    @NameInMap("TaskTriggerMode")
    public String taskTriggerMode;

    public static UpdateLiveDelayConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveDelayConfigRequest self = new UpdateLiveDelayConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveDelayConfigRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public UpdateLiveDelayConfigRequest setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
        return this;
    }
    public Integer getDelayTime() {
        return this.delayTime;
    }

    public UpdateLiveDelayConfigRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public UpdateLiveDelayConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateLiveDelayConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateLiveDelayConfigRequest setStream(String stream) {
        this.stream = stream;
        return this;
    }
    public String getStream() {
        return this.stream;
    }

    public UpdateLiveDelayConfigRequest setTaskTriggerMode(String taskTriggerMode) {
        this.taskTriggerMode = taskTriggerMode;
        return this;
    }
    public String getTaskTriggerMode() {
        return this.taskTriggerMode;
    }

}

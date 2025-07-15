// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class OpenLiveShiftRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs. You can specify an asterisk (\*) as the value to match all applications under the domain name. You can view the application name on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page of the ApsaraVideo Live console.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The length of a TS segment for HTTP Live Streaming (HLS). Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>Specifies whether to disable time shifting for the transcoded stream. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: disables time shifting for the transcoded stream.</li>
     * <li><strong>false</strong>: enables time shifting for the transcoded stream.</li>
     * </ul>
     * <p>Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IgnoreTranscode")
    public Boolean ignoreTranscode;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the live stream. You can specify an asterisk (\*) as the value to match all streams in the application. You can view the stream name on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page of the ApsaraVideo Live console.</p>
     * 
     * <strong>example:</strong>
     * <p>liveStream****</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    /**
     * <p>The duration for which data is retained. Default value: 7. Unit: day.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Vision")
    public Integer vision;

    public static OpenLiveShiftRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenLiveShiftRequest self = new OpenLiveShiftRequest();
        return TeaModel.build(map, self);
    }

    public OpenLiveShiftRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public OpenLiveShiftRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public OpenLiveShiftRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public OpenLiveShiftRequest setIgnoreTranscode(Boolean ignoreTranscode) {
        this.ignoreTranscode = ignoreTranscode;
        return this;
    }
    public Boolean getIgnoreTranscode() {
        return this.ignoreTranscode;
    }

    public OpenLiveShiftRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public OpenLiveShiftRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public OpenLiveShiftRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public OpenLiveShiftRequest setVision(Integer vision) {
        this.vision = vision;
        return this;
    }
    public Integer getVision() {
        return this.vision;
    }

}

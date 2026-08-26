// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class OpenLiveShiftRequest extends TeaModel {
    /**
     * <p>The name of the application. The wildcard character (\<em>) is supported. An asterisk (\</em>) represents all applications under the specified domain name. For more information, see <a href="https://help.aliyun.com/document_detail/197397.html">Stream management</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The streaming domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The duration of an HTTP Live Streaming (HLS) transport stream (TS) segment. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>Specifies whether to enable time shifting for transcoded streams. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Time shifting is disabled for transcoded streams.</p>
     * </li>
     * <li><p><strong>false</strong>: Time shifting is enabled for transcoded streams.</p>
     * </li>
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

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the stream. The wildcard character (\<em>) is supported. An asterisk (\</em>) represents all streams under the specified application. For more information, see <a href="https://help.aliyun.com/document_detail/197397.html">Stream management</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>liveStream****</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    /**
     * <p>The data retention period. The default value is 7. Unit: days.</p>
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

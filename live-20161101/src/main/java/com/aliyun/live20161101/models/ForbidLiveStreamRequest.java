// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ForbidLiveStreamRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs. You can view the application name on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page of the ApsaraVideo Live console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The ingest domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Specifies whether the live stream is ingested by a streamer or played by a viewer. Set the value to <strong>publisher</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>publisher</p>
     */
    @NameInMap("LiveStreamType")
    public String liveStreamType;

    /**
     * <p>Specifies whether to only interrupt the live stream without adding the ingest URL of the live stream to the blacklist. Valid values:</p>
     * <ul>
     * <li><strong>yes</strong>: interrupts the live stream but does not add the ingest URL of the live stream to the blacklist. This value is available only when the live stream is ingested or played in the upstream.</li>
     * <li><strong>no</strong>: disables the live stream and adds the ingest URL of the live stream to the blacklist.</li>
     * </ul>
     * <blockquote>
     * <p> If you do not specify this parameter, the default value no is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>yes</p>
     */
    @NameInMap("Oneshot")
    public String oneshot;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The time when the live stream is resumed. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If you set the <strong>Oneshot</strong> parameter to <strong>no</strong> and do not specify this parameter, the live stream is disabled for six months by default.</p>
     * </li>
     * <li><p>If you specify this parameter, the live stream is resumed at the specified point in time.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2015-12-01T10:37:00Z</p>
     */
    @NameInMap("ResumeTime")
    public String resumeTime;

    /**
     * <p>The name of the ingested stream. You can view the stream name on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page of the ApsaraVideo Live console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveStream****</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    public static ForbidLiveStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        ForbidLiveStreamRequest self = new ForbidLiveStreamRequest();
        return TeaModel.build(map, self);
    }

    public ForbidLiveStreamRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ForbidLiveStreamRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ForbidLiveStreamRequest setLiveStreamType(String liveStreamType) {
        this.liveStreamType = liveStreamType;
        return this;
    }
    public String getLiveStreamType() {
        return this.liveStreamType;
    }

    public ForbidLiveStreamRequest setOneshot(String oneshot) {
        this.oneshot = oneshot;
        return this;
    }
    public String getOneshot() {
        return this.oneshot;
    }

    public ForbidLiveStreamRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ForbidLiveStreamRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ForbidLiveStreamRequest setResumeTime(String resumeTime) {
        this.resumeTime = resumeTime;
        return this;
    }
    public String getResumeTime() {
        return this.resumeTime;
    }

    public ForbidLiveStreamRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

}

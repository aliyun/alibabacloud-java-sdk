// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ForbidLiveStreamRequest extends TeaModel {
    /**
     * <p>The name of the application to which the ingest stream belongs. You can view the AppName on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page.</p>
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
     * <p>Specifies whether to disable stream ingest or streaming. Currently, only disabling stream ingest is supported: <strong>publisher</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>publisher</p>
     */
    @NameInMap("LiveStreamType")
    public String liveStreamType;

    /**
     * <p>Specifies whether to only interrupt the stream without adding it to the blacklist. Valid values:</p>
     * <ul>
     * <li><p><strong>yes</strong>: Only interrupts the stream without adding it to the blacklist (supports upstream ingest or upstream streaming).</p>
     * </li>
     * <li><p><strong>no</strong>: Interrupts the stream and adds it to the blacklist.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Default value: no.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>yes</p>
     */
    @NameInMap("Oneshot")
    public String oneshot;

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
     * <p>The time to resume the stream. Format: yyyy-MM-ddTHH:mm:ssZ (UTC).</p>
     * <blockquote>
     * <ul>
     * <li>If the <strong>Oneshot</strong> parameter is set to <strong>no</strong> and ResumeTime is not specified, the live stream is disabled for 6 months by default.</li>
     * <li>If a value is specified, the restriction is lifted at the time specified by ResumeTime and the live stream is resumed.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2015-12-01T10:37:00Z</p>
     */
    @NameInMap("ResumeTime")
    public String resumeTime;

    /**
     * <p>The name of the ingest stream. You can view the StreamName on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page.</p>
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

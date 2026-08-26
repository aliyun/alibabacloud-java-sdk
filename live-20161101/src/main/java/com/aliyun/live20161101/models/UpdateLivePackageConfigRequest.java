// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLivePackageConfigRequest extends TeaModel {
    /**
     * <p>The application name. The template applies only when this AppName matches the application name in the ingest URL. The AppName can be up to 255 characters and can contain digits, letters, hyphens (-), and underscores (_). It cannot start with a hyphen or an underscore. Set this parameter to an asterisk (\*) to match all application names.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AppName</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The primary domain name for live streaming playback.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Specifies whether to ignore transcoded streams. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong> (default): Ignore transcoded streams.</p>
     * </li>
     * <li><p><strong>false</strong>: Do not ignore transcoded streams.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IgnoreTranscode")
    public Boolean ignoreTranscode;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The duration of a part segment in milliseconds.</p>
     * <blockquote>
     * <p>This parameter is required if you set \<code>Protocol\\</code> to \<code>LLHLS_\\*\\</code>.</p>
     * </blockquote>
     * <ul>
     * <li><p>If SegmentDuration is 1 s, the value can range from 100 to 500 ms.</p>
     * </li>
     * <li><p>If SegmentDuration is 2 s, the value can range from 100 to 1000 ms.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>350</p>
     */
    @NameInMap("PartDuration")
    public Integer partDuration;

    /**
     * <p>The protocol and container format for live streaming. Valid values:</p>
     * <ul>
     * <li><p><strong>HLS_CMAF</strong></p>
     * </li>
     * <li><p><strong>LLHLS_TS</strong> (low latency)</p>
     * </li>
     * <li><p><strong>LLHLS_CMAF</strong> (low latency)</p>
     * </li>
     * <li><p><strong>DASH_CMAF</strong></p>
     * </li>
     * <li><p><strong>HLSDASH_CMAF</strong></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HLS_CMAF</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The segment duration in seconds.</p>
     * <ul>
     * <li><p>If you set Protocol to HLS_CMAF, the value can range from 1 to 10 s.</p>
     * </li>
     * <li><p>If you set Protocol to LLHLS_\*, the value can range from 1 to 2 s.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SegmentDuration")
    public Integer segmentDuration;

    /**
     * <p>The number of M3U8 segments. The value must be an integer from 3 to 10.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SegmentNum")
    public Integer segmentNum;

    /**
     * <p>The stream name. The template applies only when this StreamName matches the stream name in the ingest URL. The StreamName can be up to 255 characters and can contain digits, letters, hyphens (-), and underscores (_). It cannot start with a hyphen or an underscore. Set this parameter to an asterisk (\*) to match all stream names.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>StreamName</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    public static UpdateLivePackageConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLivePackageConfigRequest self = new UpdateLivePackageConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLivePackageConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateLivePackageConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateLivePackageConfigRequest setIgnoreTranscode(Boolean ignoreTranscode) {
        this.ignoreTranscode = ignoreTranscode;
        return this;
    }
    public Boolean getIgnoreTranscode() {
        return this.ignoreTranscode;
    }

    public UpdateLivePackageConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateLivePackageConfigRequest setPartDuration(Integer partDuration) {
        this.partDuration = partDuration;
        return this;
    }
    public Integer getPartDuration() {
        return this.partDuration;
    }

    public UpdateLivePackageConfigRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public UpdateLivePackageConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateLivePackageConfigRequest setSegmentDuration(Integer segmentDuration) {
        this.segmentDuration = segmentDuration;
        return this;
    }
    public Integer getSegmentDuration() {
        return this.segmentDuration;
    }

    public UpdateLivePackageConfigRequest setSegmentNum(Integer segmentNum) {
        this.segmentNum = segmentNum;
        return this;
    }
    public Integer getSegmentNum() {
        return this.segmentNum;
    }

    public UpdateLivePackageConfigRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLivePackageConfigRequest extends TeaModel {
    /**
     * <p>The AppName must match the AppName in the ingest URL for the template to take effect. The AppName can be up to 255 characters in length and can contain digits, uppercase letters, lowercase letters, hyphens (-), and underscores (_). A hyphen or an underscore cannot be the first character. You can also set this parameter to a single asterisk (\*) to match all AppNames.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AppName</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The live streaming domain name. This is the primary playback domain name.</p>
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
     * <p>The length of the part segment, in milliseconds.</p>
     * <ul>
     * <li><p>If SegmentDuration is 1 s, the valid values are 100 to 500. The default value is 350.</p>
     * </li>
     * <li><p>If SegmentDuration is 2 s, the valid values are 100 to 1000. The default value is 700.</p>
     * </li>
     * <li><p>This parameter is valid only when you set Protocol to LLHLS_\*.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>350</p>
     */
    @NameInMap("PartDuration")
    public Integer partDuration;

    /**
     * <p>The live streaming protocol and container format. Valid values:</p>
     * <ul>
     * <li><p><strong>HLS_CMAF</strong></p>
     * </li>
     * <li><p><strong>LLHLS_TS</strong>
     * (low latency)</p>
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
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The segment length, in seconds.</p>
     * <ul>
     * <li><p>If you set Protocol to HLS_CMAF, the valid values are 1 to 10. The default value is 5.</p>
     * </li>
     * <li><p>If you set Protocol to LLHLS_\*, the valid values are 1 to 2. The default value is 1.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SegmentDuration")
    public Integer segmentDuration;

    /**
     * <p>The number of M3U8 segments for live streaming.</p>
     * <ul>
     * <li><p>Valid values: 3 to 10.</p>
     * </li>
     * <li><p>Default value: 3.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SegmentNum")
    public Integer segmentNum;

    /**
     * <p>The StreamName must match the StreamName in the ingest URL for the template to take effect. The StreamName can be up to 255 characters in length and can contain digits, uppercase letters, lowercase letters, hyphens (-), and underscores (_). A hyphen or an underscore cannot be the first character. You can also set this parameter to a single asterisk (\*) to match all StreamNames.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>StreamName</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    public static AddLivePackageConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLivePackageConfigRequest self = new AddLivePackageConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddLivePackageConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddLivePackageConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddLivePackageConfigRequest setIgnoreTranscode(Boolean ignoreTranscode) {
        this.ignoreTranscode = ignoreTranscode;
        return this;
    }
    public Boolean getIgnoreTranscode() {
        return this.ignoreTranscode;
    }

    public AddLivePackageConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddLivePackageConfigRequest setPartDuration(Integer partDuration) {
        this.partDuration = partDuration;
        return this;
    }
    public Integer getPartDuration() {
        return this.partDuration;
    }

    public AddLivePackageConfigRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public AddLivePackageConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddLivePackageConfigRequest setSegmentDuration(Integer segmentDuration) {
        this.segmentDuration = segmentDuration;
        return this;
    }
    public Integer getSegmentDuration() {
        return this.segmentDuration;
    }

    public AddLivePackageConfigRequest setSegmentNum(Integer segmentNum) {
        this.segmentNum = segmentNum;
        return this;
    }
    public Integer getSegmentNum() {
        return this.segmentNum;
    }

    public AddLivePackageConfigRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

}

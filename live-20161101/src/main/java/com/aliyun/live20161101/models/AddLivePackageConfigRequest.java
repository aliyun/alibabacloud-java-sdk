// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLivePackageConfigRequest extends TeaModel {
    /**
     * <p>The application name. The value of this parameter must be the same as the application name that is specified in the ingest URL. Otherwise, the configuration does not take effect. The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (<em>). The name cannot start with a hyphen (-) or underscore (</em>). You can also specify an asterisk (\*) as the value to match all applications.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AppName</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The main streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Specifies whether to ignore the transcoded stream. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default)</li>
     * <li><strong>false</strong></li>
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
     * <p>The part length. Unit: milliseconds.</p>
     * <ul>
     * <li>If the value of SegmentDuration is 1, the valid values of this parameter are 100 to 500 and the default value of this parameter is 350.</li>
     * <li>If the value of SegmentDuration is 2, the valid values of this parameter are 100 to 1000 and the default value of this parameter is 700.</li>
     * <li>This parameter takes effect only if Protocol is set to LLHLS_TS or LLHLS_CMAF.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>350</p>
     */
    @NameInMap("PartDuration")
    public Integer partDuration;

    /**
     * <p>The streaming protocol and encapsulation format. Valid values:</p>
     * <ul>
     * <li><strong>HLS_CMAF</strong></li>
     * <li><strong>LLHLS_TS</strong> (low latency)</li>
     * <li><strong>LLHLS_CMAF</strong> (low latency)</li>
     * <li><strong>DASH_CMAF</strong></li>
     * <li><strong>HLSDASH_CMAF</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HLS_CMAF</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The segment length. Unit: seconds.</p>
     * <ul>
     * <li>If Protocol is set to HLS_CMAF: Valid values: 1 to 10. Default value: 5.</li>
     * <li>If Protocol is set to LLHLS_TS or LLHLS_CMAF: Valid values: 1 to 2. Default value: 1.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SegmentDuration")
    public Integer segmentDuration;

    /**
     * <p>The number of segments.</p>
     * <ul>
     * <li>Valid values: 3 to 10.</li>
     * <li>Default value: 3.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SegmentNum")
    public Integer segmentNum;

    /**
     * <p>The stream name. The value of this parameter must be the same as the stream name that is specified in the ingest URL. Otherwise, the configuration does not take effect. The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (<em>). The name cannot start with a hyphen (-) or underscore (</em>). You can also specify an asterisk (\*) as the value to match all streams.</p>
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

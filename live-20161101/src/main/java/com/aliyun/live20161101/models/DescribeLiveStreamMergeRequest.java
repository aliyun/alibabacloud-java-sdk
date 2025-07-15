// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamMergeRequest extends TeaModel {
    /**
     * <p>The name of the application that generates the output stream. You can view the application name on the <a href="https://help.aliyun.com/document_detail/606583.html">Primary/Secondary Stream Mixing Settings</a> page of the ApsaraVideo Live console.</p>
     * 
     * <strong>example:</strong>
     * <p>app</p>
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

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The streaming protocol. Valid values:</p>
     * <ul>
     * <li><strong>rtmp</strong>: This is the default value.</li>
     * <li><strong>rtc</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rtmp</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the output stream. You can view the stream name on the <a href="https://help.aliyun.com/document_detail/606583.html">Primary/Secondary Stream Mixing Settings</a> page of the ApsaraVideo Live console.</p>
     * 
     * <strong>example:</strong>
     * <p>StreamName</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    public static DescribeLiveStreamMergeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamMergeRequest self = new DescribeLiveStreamMergeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamMergeRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeLiveStreamMergeRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveStreamMergeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveStreamMergeRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public DescribeLiveStreamMergeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLiveStreamMergeRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

}

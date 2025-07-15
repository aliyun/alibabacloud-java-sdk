// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveStreamMergeRequest extends TeaModel {
    /**
     * <p>The name of the application that generates the output stream. You can view the application name on the <a href="https://help.aliyun.com/document_detail/606583.html">Primary/Secondary Stream Mixing</a> page of the ApsaraVideo Live console.</p>
     * <p>This parameter is required.</p>
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

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the output stream. You can view the stream name on the <a href="https://help.aliyun.com/document_detail/606583.html">Primary/Secondary Stream Mixing</a> page of the ApsaraVideo Live console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>StreamName</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    public static DeleteLiveStreamMergeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveStreamMergeRequest self = new DeleteLiveStreamMergeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveStreamMergeRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeleteLiveStreamMergeRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DeleteLiveStreamMergeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteLiveStreamMergeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteLiveStreamMergeRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

}

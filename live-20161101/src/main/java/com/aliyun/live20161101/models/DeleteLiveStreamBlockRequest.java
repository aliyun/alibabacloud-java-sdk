// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveStreamBlockRequest extends TeaModel {
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
     * <p>The name of the live stream. You can view the stream name on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page of the ApsaraVideo Live console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveStream****</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    public static DeleteLiveStreamBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveStreamBlockRequest self = new DeleteLiveStreamBlockRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveStreamBlockRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeleteLiveStreamBlockRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DeleteLiveStreamBlockRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteLiveStreamBlockRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteLiveStreamBlockRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

}

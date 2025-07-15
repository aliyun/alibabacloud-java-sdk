// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveDomainMultiStreamMasterRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testapp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The main streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The name of the live stream.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>teststream</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    /**
     * <p>The unique identifier of the stream ingest.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>teststream_***</p>
     */
    @NameInMap("UpstreamSequence")
    public String upstreamSequence;

    public static SetLiveDomainMultiStreamMasterRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLiveDomainMultiStreamMasterRequest self = new SetLiveDomainMultiStreamMasterRequest();
        return TeaModel.build(map, self);
    }

    public SetLiveDomainMultiStreamMasterRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SetLiveDomainMultiStreamMasterRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public SetLiveDomainMultiStreamMasterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetLiveDomainMultiStreamMasterRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public SetLiveDomainMultiStreamMasterRequest setUpstreamSequence(String upstreamSequence) {
        this.upstreamSequence = upstreamSequence;
        return this;
    }
    public String getUpstreamSequence() {
        return this.upstreamSequence;
    }

}

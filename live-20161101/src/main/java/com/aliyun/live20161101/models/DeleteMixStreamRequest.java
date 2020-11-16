// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteMixStreamRequest extends TeaModel {
    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("StreamName")
    public String streamName;

    @NameInMap("MixStreamId")
    @Validation(required = true)
    public String mixStreamId;

    public static DeleteMixStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMixStreamRequest self = new DeleteMixStreamRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMixStreamRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DeleteMixStreamRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeleteMixStreamRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public DeleteMixStreamRequest setMixStreamId(String mixStreamId) {
        this.mixStreamId = mixStreamId;
        return this;
    }
    public String getMixStreamId() {
        return this.mixStreamId;
    }

}

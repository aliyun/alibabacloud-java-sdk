// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveEdgeTransferRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("HttpDns")
    public String httpDns;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("StreamName")
    public String streamName;

    @NameInMap("TargetDomainList")
    public String targetDomainList;

    @NameInMap("TransferArgs")
    public String transferArgs;

    public static SetLiveEdgeTransferRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLiveEdgeTransferRequest self = new SetLiveEdgeTransferRequest();
        return TeaModel.build(map, self);
    }

    public SetLiveEdgeTransferRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SetLiveEdgeTransferRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetLiveEdgeTransferRequest setHttpDns(String httpDns) {
        this.httpDns = httpDns;
        return this;
    }
    public String getHttpDns() {
        return this.httpDns;
    }

    public SetLiveEdgeTransferRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetLiveEdgeTransferRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public SetLiveEdgeTransferRequest setTargetDomainList(String targetDomainList) {
        this.targetDomainList = targetDomainList;
        return this;
    }
    public String getTargetDomainList() {
        return this.targetDomainList;
    }

    public SetLiveEdgeTransferRequest setTransferArgs(String transferArgs) {
        this.transferArgs = transferArgs;
        return this;
    }
    public String getTransferArgs() {
        return this.transferArgs;
    }

}

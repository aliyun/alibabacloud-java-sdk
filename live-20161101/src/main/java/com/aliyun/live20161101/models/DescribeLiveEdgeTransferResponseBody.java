// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveEdgeTransferResponseBody extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("HttpDns")
    public String httpDns;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StreamName")
    public String streamName;

    @NameInMap("TargetDomainList")
    public String targetDomainList;

    @NameInMap("TransferArgs")
    public String transferArgs;

    public static DescribeLiveEdgeTransferResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveEdgeTransferResponseBody self = new DescribeLiveEdgeTransferResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveEdgeTransferResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeLiveEdgeTransferResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveEdgeTransferResponseBody setHttpDns(String httpDns) {
        this.httpDns = httpDns;
        return this;
    }
    public String getHttpDns() {
        return this.httpDns;
    }

    public DescribeLiveEdgeTransferResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveEdgeTransferResponseBody setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public DescribeLiveEdgeTransferResponseBody setTargetDomainList(String targetDomainList) {
        this.targetDomainList = targetDomainList;
        return this;
    }
    public String getTargetDomainList() {
        return this.targetDomainList;
    }

    public DescribeLiveEdgeTransferResponseBody setTransferArgs(String transferArgs) {
        this.transferArgs = transferArgs;
        return this;
    }
    public String getTransferArgs() {
        return this.transferArgs;
    }

}

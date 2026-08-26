// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveEdgeTransferResponseBody extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The ingest domain.</p>
     * 
     * <strong>example:</strong>
     * <p>demo.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The URL of the HTTPDNS service used to resolve the addresses of the target domains.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://developer.aliyundoc.com/">http://developer.aliyundoc.com/</a>****</p>
     */
    @NameInMap("HttpDns")
    public String httpDns;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>53FCB985-C67C-467B-B2B3-398430A21E14</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the ingested live stream.</p>
     * 
     * <strong>example:</strong>
     * <p>liveStream****</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    /**
     * <p>A comma-separated list of the target domains where the stream is forwarded.</p>
     * 
     * <strong>example:</strong>
     * <p>learn.aliyundoc.com,guide.aliyundoc.com</p>
     */
    @NameInMap("TargetDomainList")
    public String targetDomainList;

    /**
     * <p>Indicates whether the query parameters from the original ingest URL are passed through to the target URL.</p>
     * <ul>
     * <li><p><strong>yes</strong>: The parameters are passed through.</p>
     * </li>
     * <li><p><strong>no</strong>: The parameters are not passed through.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>yes</p>
     */
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

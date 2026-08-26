// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveEdgeTransferRequest extends TeaModel {
    /**
     * <p>The application name to which the live stream belongs. Regular expressions are supported for configuration with exceptions. For more information, see <strong>AppName and StreamName Parameter Configuration Instructions</strong> below. For example: liveApp****[1,2,3] indicates that the three apps liveApp<strong><strong>1, liveApp</strong></strong>2, and liveApp****3 are allowed for stream relay.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter only takes effect for the TargetDomainList in the request parameters.</li>
     * <li>When configuring the <code>AppName</code> parameter value using regular expressions, the ^ or $ characters cannot be used, otherwise stream relay will fail.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The ingest domain name. Live stream relay is configured at the granularity of the ingest DomainName. Each domain can have only one live stream relay configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The HTTPDNS interface for obtaining the stream relay target address. The request must contain one of the <code>TargetDomainList</code> and <code>HttpDns</code> parameters, and the two are mutually exclusive.</p>
     * <blockquote>
     * <p>If <code>HttpDns</code> is set in the request parameters, the <code>TargetDomainList</code> parameter cannot be set, and the <code>AppName</code> and <code>StreamName</code> restrictions do not take effect.</p>
     * </blockquote>
     * <p>Live stream relay has requirements for the message structure returned by the HTTPDNS interface. For more information, see <strong>HTTPDNS Instructions</strong> below.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://developer.aliyundoc.com">http://developer.aliyundoc.com</a></p>
     */
    @NameInMap("HttpDns")
    public String httpDns;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The stream name. Regular expressions are supported for configuration with exceptions. For more information, see <strong>AppName and StreamName Parameter Configuration Instructions</strong> below. For example: liveStream****[1,2,3] indicates that the three streams liveStream<strong><strong>1, liveStream</strong></strong>2, and liveStream****3 are allowed for stream relay.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter only takes effect for the TargetDomainList in the request parameters.</li>
     * <li>When configuring the <code>StreamName</code> parameter value using regular expressions, the ^ or $ characters cannot be used, otherwise stream relay will fail.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>liveStream****</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    /**
     * <p>The list of target domains specified by the user for stream relay. Multiple domains are separated by commas (,). The request must contain one of the <code>TargetDomainList</code> and <code>HttpDns</code> parameters, and the two are mutually exclusive.</p>
     * <blockquote>
     * <ul>
     * <li>When <code>TargetDomainList</code> is set in the request parameters, the <code>AppName</code> and <code>StreamName</code> parameters take effect.</li>
     * <li>When <code>TargetDomainList</code> is set in the request parameters, the <code>HttpDns</code> parameter cannot be set.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>learn.aliyundoc.com,guide.aliyundoc.com</p>
     */
    @NameInMap("TargetDomainList")
    public String targetDomainList;

    /**
     * <p>Specifies whether to pass through ingest parameters. Valid values:</p>
     * <ul>
     * <li><strong>yes</strong>: Ingest parameters are passed through.</li>
     * <li><strong>no</strong> (default): Ingest parameters are not passed through.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>yes</p>
     */
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

    public SetLiveEdgeTransferRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

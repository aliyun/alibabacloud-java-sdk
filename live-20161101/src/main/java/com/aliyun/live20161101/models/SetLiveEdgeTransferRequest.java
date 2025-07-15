// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveEdgeTransferRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs. Regular expressions are supported, with a few limits. For more information, see the <strong>Description about the AppName and StreamName parameters</strong> section. For example, a value of <strong>liveApp\<em>\</em>\<em>\</em>[1,2,3]</strong> specifies that stream relay is configured for three applications: liveApp\<em>\</em>\<em>\<em>1, liveApp\</em>\</em>\<em>\<em>2, and liveApp\</em>\</em>\<em>\<em>3.</em></em>**</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter takes effect for only destination domain names that are specified by the TargetDomainList parameter.</p>
     * </li>
     * <li><p>You cannot use a caret (^) or a dollar sign ($) in a regular expression to configure the <code>AppName</code> parameter. Otherwise, stream relay fails.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The ingest domain. Stream relay is configured based on the ingest domain. Only one stream relay configuration can be set for an ingest domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The HTTPDNS API that is used to obtain the destination URLs. The request must contain the <code>TargetDomainList</code> parameter or the <code>HttpDns</code> parameter. The two parameters are mutually exclusive.</p>
     * <blockquote>
     * <p> If the <code>HttpDns</code> parameter is configured, you cannot configure the <code>TargetDomainList</code> parameter, and the <code>AppName</code> and <code>StreamName</code> parameters do not take effect.</p>
     * </blockquote>
     * <p>For information about the requirements on the structure of messages that are returned by the HTTPDNS API, see the <strong>Description about the HTTPDNS API</strong> section.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://developer.aliyundoc.com">http://developer.aliyundoc.com</a></p>
     */
    @NameInMap("HttpDns")
    public String httpDns;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the ingested stream. Regular expressions are supported, with a few limits. For more information, see the <strong>Description about the AppName and StreamName parameters</strong> section. For example, a value of <strong>liveStream\<em>\</em>\<em>\</em>[1,2,3]</strong> specifies that stream relay is configured for three streams: liveStream\<em>\</em>\<em>\<em>1, liveStream\</em>\</em>\<em>\<em>2, and liveStream\</em>\</em>\<em>\<em>3.</em></em>**</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter takes effect for only destination domain names that are specified by the TargetDomainList parameter.</p>
     * </li>
     * <li><p>You cannot use a caret (^) or a dollar sign ($) in a regular expression to configure the <code>StreamName</code> parameter. Otherwise, stream relay fails.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>liveStream****</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    /**
     * <p>The destination domain names to which you want to relay the ingested stream. Separate multiple domain names with commas (,). The request must contain the <code>TargetDomainList</code> parameter or the <code>HttpDns</code> parameter. The two parameters are mutually exclusive.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The <code>AppName</code> and <code>StreamName</code> parameters take effect only when the <code>TargetDomainList</code> parameter is configured.</p>
     * </li>
     * <li><p>If the <code>TargetDomainList</code> parameter is configured, you cannot configure the <code>HttpDns</code> parameter.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>learn.aliyundoc.com,guide.aliyundoc.com</p>
     */
    @NameInMap("TargetDomainList")
    public String targetDomainList;

    /**
     * <p>Specifies whether to pass through stream ingest parameters. Valid values:</p>
     * <ul>
     * <li><strong>yes</strong>: passes through stream ingest parameters.</li>
     * <li><strong>no</strong>: does not pass through stream ingest parameters.</li>
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

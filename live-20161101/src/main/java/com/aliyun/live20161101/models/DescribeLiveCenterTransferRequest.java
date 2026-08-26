// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveCenterTransferRequest extends TeaModel {
    /**
     * <p>The name of the live stream application. The AppName you enter must match the AppName of the live stream to be relayed for the configuration to take effect. You can view the AppName on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page.</p>
     * 
     * <strong>example:</strong>
     * <p>testapp</p>
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

    /**
     * <p>The third-party live streaming URL to which the stream is relayed.</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp://push.example2.aliyunlive.com/testapp1/teststream2</p>
     */
    @NameInMap("DstUrl")
    public String dstUrl;

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
     * <p>The name of the live stream. You can view the StreamName on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page.</p>
     * 
     * <strong>example:</strong>
     * <p>teststream</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    public static DescribeLiveCenterTransferRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveCenterTransferRequest self = new DescribeLiveCenterTransferRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveCenterTransferRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeLiveCenterTransferRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveCenterTransferRequest setDstUrl(String dstUrl) {
        this.dstUrl = dstUrl;
        return this;
    }
    public String getDstUrl() {
        return this.dstUrl;
    }

    public DescribeLiveCenterTransferRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveCenterTransferRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLiveCenterTransferRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

}

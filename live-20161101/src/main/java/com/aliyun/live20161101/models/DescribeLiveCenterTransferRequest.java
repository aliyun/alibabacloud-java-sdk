// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveCenterTransferRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs. The value of this parameter must be the same as the application name for the live stream that you want to relay. Otherwise, the configuration does not take effect. You can view the application name on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page of the ApsaraVideo Live console.</p>
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
     * <p>The third-party URL to which the live stream is relayed.</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp://push.example2.aliyunlive.com/testapp1/teststream2</p>
     */
    @NameInMap("DstUrl")
    public String dstUrl;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the live stream. You can view the stream name on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page of the ApsaraVideo Live console.</p>
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

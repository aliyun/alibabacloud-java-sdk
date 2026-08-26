// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveCenterTransferRequest extends TeaModel {
    /**
     * <p>The name of the live stream application. The AppName you enter must be the same as the AppName of the live stream to be relayed for the configuration to take effect. You can view the AppName on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page.</p>
     * <p>This parameter is required.</p>
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
     * <p>The third-party live streaming address for relay. You can add up to one address.</p>
     * <blockquote>
     * <p>The protocol of the destination address must be the same as the protocol of the live stream to be relayed. Only RTMP and SRT relay addresses are supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp://push.example2.aliyunlive.com/testapp1/teststream2</p>
     */
    @NameInMap("DstUrl")
    public String dstUrl;

    /**
     * <p>The end time of the relay. The date format follows the ISO 8601 notation and uses UTC+0 time. The format is yyyy-MM-ddTHH:mm:ssZ.</p>
     * <blockquote>
     * <p>The end time must be later than the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2017-12-22T08:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

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
     * <p>The start time of the relay. The date format follows the ISO 8601 notation and uses UTC+0 time. The format is yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-21T10:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the live stream. You can view the StreamName on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>teststream</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    /**
     * <p>The validity period of the relay. Valid values:</p>
     * <ul>
     * <li><p><strong>always</strong>: permanently effective.</p>
     * </li>
     * <li><p><strong>time</strong>: effective within the specified time period.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If the value is <strong>time</strong>, <strong>StartTime</strong> and <strong>EndTime</strong> are required.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>always</p>
     */
    @NameInMap("TransferArgs")
    public String transferArgs;

    public static AddLiveCenterTransferRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveCenterTransferRequest self = new AddLiveCenterTransferRequest();
        return TeaModel.build(map, self);
    }

    public AddLiveCenterTransferRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddLiveCenterTransferRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddLiveCenterTransferRequest setDstUrl(String dstUrl) {
        this.dstUrl = dstUrl;
        return this;
    }
    public String getDstUrl() {
        return this.dstUrl;
    }

    public AddLiveCenterTransferRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public AddLiveCenterTransferRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddLiveCenterTransferRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddLiveCenterTransferRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public AddLiveCenterTransferRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public AddLiveCenterTransferRequest setTransferArgs(String transferArgs) {
        this.transferArgs = transferArgs;
        return this;
    }
    public String getTransferArgs() {
        return this.transferArgs;
    }

}

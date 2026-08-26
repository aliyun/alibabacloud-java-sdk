// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveCenterTransferRequest extends TeaModel {
    /**
     * <p>The name of the live stream application. The AppName you enter must match the AppName of the live stream to be transferred for the configuration to take effect. You can view the AppName on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page.</p>
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
     * <p>The third-party live streaming address to transfer to. A maximum of one address is supported.</p>
     * <blockquote>
     * <p>The protocol of the destination address must match the protocol of the live stream being transferred. Only RTMP and SRT protocols are supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp://push.example2.aliyunlive.com/testapp1/teststream2</p>
     */
    @NameInMap("DstUrl")
    public String dstUrl;

    /**
     * <p>The end time of the transfer. The date format follows ISO 8601 and uses UTC+0 time in the format yyyy-MM-ddTHH:mm:ssZ.</p>
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
     * <p>The start time of the transfer. The date format follows ISO 8601 and uses UTC+0 time in the format yyyy-MM-ddTHH:mm:ssZ.</p>
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
     * <p>The transfer validity period. Valid values:</p>
     * <ul>
     * <li><p><strong>always</strong>: Permanently effective.</p>
     * </li>
     * <li><p><strong>time</strong>: Effective within a specified time range.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you set this parameter to <strong>time</strong>, <strong>StartTime</strong> and <strong>EndTime</strong> are required.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>always</p>
     */
    @NameInMap("TransferArgs")
    public String transferArgs;

    public static UpdateLiveCenterTransferRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveCenterTransferRequest self = new UpdateLiveCenterTransferRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveCenterTransferRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateLiveCenterTransferRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateLiveCenterTransferRequest setDstUrl(String dstUrl) {
        this.dstUrl = dstUrl;
        return this;
    }
    public String getDstUrl() {
        return this.dstUrl;
    }

    public UpdateLiveCenterTransferRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UpdateLiveCenterTransferRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateLiveCenterTransferRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateLiveCenterTransferRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public UpdateLiveCenterTransferRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public UpdateLiveCenterTransferRequest setTransferArgs(String transferArgs) {
        this.transferArgs = transferArgs;
        return this;
    }
    public String getTransferArgs() {
        return this.transferArgs;
    }

}

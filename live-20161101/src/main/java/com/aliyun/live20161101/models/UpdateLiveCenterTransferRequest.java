// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveCenterTransferRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs. The value of this parameter must be the same as the application name for the live stream that you want to relay. Otherwise, the configuration does not take effect. You can view the application name on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page of the ApsaraVideo Live console.</p>
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
     * <p>The third-party URL to which the live stream is relayed. You can add only one URL.</p>
     * <blockquote>
     * <p> The protocol that the URL uses must be the same as the protocol of the live stream. Only URLs over RTMP and SRT are supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp://push.example2.aliyunlive.com/testapp1/teststream2</p>
     */
    @NameInMap("DstUrl")
    public String dstUrl;

    /**
     * <p>The end time of stream relay. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p> The end time must be later than the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2017-12-22T08:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start time of stream relay. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-21T10:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the live stream. You can view the stream name on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page of the ApsaraVideo Live console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>teststream</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    /**
     * <p>The validity period of stream relay. Valid values:</p>
     * <ul>
     * <li><strong>always</strong>: The stream can always be relayed.</li>
     * <li><strong>time</strong>: The stream can be relayed in a specified time period.</li>
     * </ul>
     * <blockquote>
     * <p> If the value is <strong>time</strong>, <strong>StartTime</strong> and <strong>EndTime</strong> are required.</p>
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

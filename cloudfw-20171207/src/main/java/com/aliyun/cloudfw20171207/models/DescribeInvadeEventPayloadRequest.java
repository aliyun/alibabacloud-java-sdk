// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInvadeEventPayloadRequest extends TeaModel {
    /**
     * <p>The instance ID of the asset where the intrusion event occurred.</p>
     * 
     * <strong>example:</strong>
     * <p>i-uf6faknmuby7ezht****</p>
     */
    @NameInMap("AssetsInstanceId")
    public String assetsInstanceId;

    /**
     * <p>The end time of the time range during which the event occurred. The value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1731551104</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The UUID of the event.</p>
     * 
     * <strong>example:</strong>
     * <p>92498578-7c42-4845-8c73-7e824782****</p>
     */
    @NameInMap("EventUuid")
    public String eventUuid;

    /**
     * <p>The language of the request and response. Valid values: - <strong>zh</strong>: Chinese. - <strong>en</strong>: English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The private IP address of the asset where the intrusion event occurred.</p>
     * 
     * <strong>example:</strong>
     * <p>10.200.33.XXX</p>
     */
    @NameInMap("PrivateIP")
    public String privateIP;

    /**
     * <p>The public IP address of the asset where the intrusion event occurred.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("PublicIP")
    public String publicIP;

    /**
     * <p>The source IP address of the caller.</p>
     * 
     * <strong>example:</strong>
     * <p>58.34.174.194</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The start time of the time range during which the event occurred. The value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1656837360</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeInvadeEventPayloadRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvadeEventPayloadRequest self = new DescribeInvadeEventPayloadRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInvadeEventPayloadRequest setAssetsInstanceId(String assetsInstanceId) {
        this.assetsInstanceId = assetsInstanceId;
        return this;
    }
    public String getAssetsInstanceId() {
        return this.assetsInstanceId;
    }

    public DescribeInvadeEventPayloadRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeInvadeEventPayloadRequest setEventUuid(String eventUuid) {
        this.eventUuid = eventUuid;
        return this;
    }
    public String getEventUuid() {
        return this.eventUuid;
    }

    public DescribeInvadeEventPayloadRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeInvadeEventPayloadRequest setPrivateIP(String privateIP) {
        this.privateIP = privateIP;
        return this;
    }
    public String getPrivateIP() {
        return this.privateIP;
    }

    public DescribeInvadeEventPayloadRequest setPublicIP(String publicIP) {
        this.publicIP = publicIP;
        return this;
    }
    public String getPublicIP() {
        return this.publicIP;
    }

    public DescribeInvadeEventPayloadRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeInvadeEventPayloadRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}

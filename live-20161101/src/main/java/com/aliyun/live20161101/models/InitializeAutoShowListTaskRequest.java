// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class InitializeAutoShowListTaskRequest extends TeaModel {
    /**
     * <p>The callback URL.</p>
     * 
     * <strong>example:</strong>
     * <p>http://***.com/callback</p>
     */
    @NameInMap("CallBackUrl")
    public String callBackUrl;

    /**
     * <p>The production studio configuration. This includes:</p>
     * <ul>
     * <li><p>(Required) CasterTemplate: the output resolution of the production studio.</p>
     * </li>
     * <li><p>(Optional) LiveTemplate: the list of output transcoding tasks.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>A JSON-formatted string. Use upper camel case (PascalCase) for the field names within the struct.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;CasterTemplate&quot;: &quot;lp_ld&quot;,&quot;LiveTemplates&quot;:[&quot;lhd&quot;, &quot;lsd&quot;,&quot;lud&quot;]}</p>
     */
    @NameInMap("CasterConfig")
    public String casterConfig;

    /**
     * <p>The output streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end timestamp. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1645688994000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

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
     * <p>The list of video-on-demand media asset file IDs in the playlist. Currently, only MP4 video files from the video-on-demand platform are supported.</p>
     * <p>A maximum of three programs are supported. Each program is played in the order of the list until EndTime, at which point playback automatically ends. This parameter is required. If it is missing, a MissingParameter error is returned.</p>
     * <blockquote>
     * <ul>
     * <li>You can obtain the video file ID from the console or from the response parameters of an API operation. For more information, see <a href="https://help.aliyun.com/document_detail/86057.html">Media asset management</a> or <a href="https://help.aliyun.com/document_detail/55407.html">Obtain the upload URL and credential for audio and video files</a>.- If all programs finish playing before EndTime, the last frame of the last program is displayed until the scheduled end time.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;89e02xxxxfb349axxxxa0c350d****  &quot;,&quot;6ae0xxxxxb349axxxxa0c350a****&quot;]</p>
     */
    @NameInMap("ResourceIds")
    public String resourceIds;

    /**
     * <p>The start timestamp. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1645688994000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static InitializeAutoShowListTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        InitializeAutoShowListTaskRequest self = new InitializeAutoShowListTaskRequest();
        return TeaModel.build(map, self);
    }

    public InitializeAutoShowListTaskRequest setCallBackUrl(String callBackUrl) {
        this.callBackUrl = callBackUrl;
        return this;
    }
    public String getCallBackUrl() {
        return this.callBackUrl;
    }

    public InitializeAutoShowListTaskRequest setCasterConfig(String casterConfig) {
        this.casterConfig = casterConfig;
        return this;
    }
    public String getCasterConfig() {
        return this.casterConfig;
    }

    public InitializeAutoShowListTaskRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public InitializeAutoShowListTaskRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public InitializeAutoShowListTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public InitializeAutoShowListTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public InitializeAutoShowListTaskRequest setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public String getResourceIds() {
        return this.resourceIds;
    }

    public InitializeAutoShowListTaskRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}

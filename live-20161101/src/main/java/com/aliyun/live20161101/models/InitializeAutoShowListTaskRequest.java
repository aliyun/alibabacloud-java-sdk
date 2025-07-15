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
     * <p>The configurations of the production studio. The following configurations are involved:</p>
     * <ul>
     * <li>CasterTemplate: required. The output resolution.</li>
     * <li>LiveTemplate: optional. The templates to be used for transcoding.</li>
     * </ul>
     * <blockquote>
     * <p> Set the value to a JSON string. Use upper camel case for fields of the string.</p>
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

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of on-demand media asset files in the playlist. Only on-demand video files are supported. You can specify up to three video files in the playlist. The video files in the playlist are automatically played in sequence. The playback stops at the point in time specified by the EndTime parameter.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You can obtain the ID of a video file in the ApsaraVideo Live console or by calling an API operation. For more information, see <a href="https://help.aliyun.com/document_detail/86057.html">Media asset management</a> or <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a>. - If the video files are all played before the time specified by EndTime, the final frame of the final video file is played until the time specified by EndTime arrives.</li>
     * </ul>
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

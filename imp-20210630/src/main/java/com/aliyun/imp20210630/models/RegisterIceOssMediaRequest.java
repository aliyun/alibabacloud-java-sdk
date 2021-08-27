// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class RegisterIceOssMediaRequest extends TeaModel {
    // 工程ID
    @NameInMap("ProjectId")
    public String projectId;

    // appId
    @NameInMap("AppId")
    public String appId;

    // 回放cdn域名
    @NameInMap("PlaybackUrlDomain")
    public String playbackUrlDomain;

    // oss bucket
    @NameInMap("OssBucket")
    public String ossBucket;

    // oss域名
    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    // 回放地址的区域ID
    @NameInMap("UrlRegionId")
    public String urlRegionId;

    // 待注册的媒资在相应系统中的地址
    @NameInMap("MediaUrl")
    public String mediaUrl;

    // 来源的服务
    @NameInMap("FromType")
    public String fromType;

    // 媒资标题
    @NameInMap("MediaTitle")
    public String mediaTitle;

    // 唯一ID，比如直播uuid
    @NameInMap("LiveId")
    public String liveId;

    public static RegisterIceOssMediaRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterIceOssMediaRequest self = new RegisterIceOssMediaRequest();
        return TeaModel.build(map, self);
    }

    public RegisterIceOssMediaRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public RegisterIceOssMediaRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RegisterIceOssMediaRequest setPlaybackUrlDomain(String playbackUrlDomain) {
        this.playbackUrlDomain = playbackUrlDomain;
        return this;
    }
    public String getPlaybackUrlDomain() {
        return this.playbackUrlDomain;
    }

    public RegisterIceOssMediaRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public RegisterIceOssMediaRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public RegisterIceOssMediaRequest setUrlRegionId(String urlRegionId) {
        this.urlRegionId = urlRegionId;
        return this;
    }
    public String getUrlRegionId() {
        return this.urlRegionId;
    }

    public RegisterIceOssMediaRequest setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
        return this;
    }
    public String getMediaUrl() {
        return this.mediaUrl;
    }

    public RegisterIceOssMediaRequest setFromType(String fromType) {
        this.fromType = fromType;
        return this;
    }
    public String getFromType() {
        return this.fromType;
    }

    public RegisterIceOssMediaRequest setMediaTitle(String mediaTitle) {
        this.mediaTitle = mediaTitle;
        return this;
    }
    public String getMediaTitle() {
        return this.mediaTitle;
    }

    public RegisterIceOssMediaRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

}

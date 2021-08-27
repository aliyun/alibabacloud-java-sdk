// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateIceProjectRequest extends TeaModel {
    // appId
    @NameInMap("AppId")
    public String appId;

    // 回放地址的地址
    @NameInMap("UrlRegionId")
    public String urlRegionId;

    // 工程标题
    @NameInMap("ProjectTitle")
    public String projectTitle;

    // 封面
    @NameInMap("CoverURL")
    public String coverURL;

    // 唯一ID，比如直播uuid
    @NameInMap("LiveId")
    public String liveId;

    public static CreateIceProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIceProjectRequest self = new CreateIceProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateIceProjectRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateIceProjectRequest setUrlRegionId(String urlRegionId) {
        this.urlRegionId = urlRegionId;
        return this;
    }
    public String getUrlRegionId() {
        return this.urlRegionId;
    }

    public CreateIceProjectRequest setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
        return this;
    }
    public String getProjectTitle() {
        return this.projectTitle;
    }

    public CreateIceProjectRequest setCoverURL(String coverURL) {
        this.coverURL = coverURL;
        return this;
    }
    public String getCoverURL() {
        return this.coverURL;
    }

    public CreateIceProjectRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

}

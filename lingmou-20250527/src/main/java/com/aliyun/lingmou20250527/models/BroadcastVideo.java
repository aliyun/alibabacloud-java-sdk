// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class BroadcastVideo extends TeaModel {
    @NameInMap("alignmentFileURL")
    public String alignmentFileURL;

    @NameInMap("captionURL")
    public String captionURL;

    @NameInMap("coverURL")
    public String coverURL;

    @NameInMap("createTime")
    public String createTime;

    @NameInMap("id")
    public String id;

    @NameInMap("modifiedTime")
    public String modifiedTime;

    @NameInMap("name")
    public String name;

    @NameInMap("status")
    public String status;

    @NameInMap("videoURL")
    public String videoURL;

    public static BroadcastVideo build(java.util.Map<String, ?> map) throws Exception {
        BroadcastVideo self = new BroadcastVideo();
        return TeaModel.build(map, self);
    }

    public BroadcastVideo setAlignmentFileURL(String alignmentFileURL) {
        this.alignmentFileURL = alignmentFileURL;
        return this;
    }
    public String getAlignmentFileURL() {
        return this.alignmentFileURL;
    }

    public BroadcastVideo setCaptionURL(String captionURL) {
        this.captionURL = captionURL;
        return this;
    }
    public String getCaptionURL() {
        return this.captionURL;
    }

    public BroadcastVideo setCoverURL(String coverURL) {
        this.coverURL = coverURL;
        return this;
    }
    public String getCoverURL() {
        return this.coverURL;
    }

    public BroadcastVideo setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public BroadcastVideo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public BroadcastVideo setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public BroadcastVideo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BroadcastVideo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public BroadcastVideo setVideoURL(String videoURL) {
        this.videoURL = videoURL;
        return this;
    }
    public String getVideoURL() {
        return this.videoURL;
    }

}

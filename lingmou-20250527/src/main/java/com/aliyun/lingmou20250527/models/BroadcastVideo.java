// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class BroadcastVideo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://online-avatar-property.oss-cn-beijing.aliyuncs.com/aigc_material/OUTPUT_BROADCAST_SHORT_VIDEO/Mt.CQEYXYQW4MQU2/alignment.json">https://online-avatar-property.oss-cn-beijing.aliyuncs.com/aigc_material/OUTPUT_BROADCAST_SHORT_VIDEO/Mt.CQEYXYQW4MQU2/alignment.json</a></p>
     */
    @NameInMap("alignmentFileURL")
    public String alignmentFileURL;

    /**
     * <strong>example:</strong>
     * <p><a href="https://online-avatar-property.oss-cn-beijing.aliyuncs.com/aigc_material/OUTPUT_BROADCAST_SHORT_VIDEO/Mt.CQEYXYQW4MQU2/result.srt">https://online-avatar-property.oss-cn-beijing.aliyuncs.com/aigc_material/OUTPUT_BROADCAST_SHORT_VIDEO/Mt.CQEYXYQW4MQU2/result.srt</a></p>
     */
    @NameInMap("captionURL")
    public String captionURL;

    /**
     * <strong>example:</strong>
     * <p><a href="https://online-avatar-property.oss-cn-beijing.aliyuncs.com/aigc_material/OUTPUT_BROADCAST_SHORT_VIDEO/Mt.CQEYXYQW4MQU2/cover.jpg">https://online-avatar-property.oss-cn-beijing.aliyuncs.com/aigc_material/OUTPUT_BROADCAST_SHORT_VIDEO/Mt.CQEYXYQW4MQU2/cover.jpg</a></p>
     */
    @NameInMap("coverURL")
    public String coverURL;

    /**
     * <strong>example:</strong>
     * <p>2025-11-28T13:40:33</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>M1k3So6n9IlrDV69sr3jDa3g</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>2025-11-28T13:41:31</p>
     */
    @NameInMap("modifiedTime")
    public String modifiedTime;

    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p><a href="https://online-avatar-property.oss-cn-beijing.aliyuncs.com/aigc_material/OUTPUT_BROADCAST_SHORT_VIDEO/Mt.CQEYXYQW4MQU2/result.mp4">https://online-avatar-property.oss-cn-beijing.aliyuncs.com/aigc_material/OUTPUT_BROADCAST_SHORT_VIDEO/Mt.CQEYXYQW4MQU2/result.mp4</a></p>
     */
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

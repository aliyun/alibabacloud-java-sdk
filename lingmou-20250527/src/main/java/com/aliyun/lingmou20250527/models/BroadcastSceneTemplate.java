// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class BroadcastSceneTemplate extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://online-avatar-property.oss-cn-beijing.aliyuncs.com/aigc_material/OUTPUT_BROADCAST_SHORT_VIDEO/Mt.CSNSAsOIDZQU2/cover.jpg">https://online-avatar-property.oss-cn-beijing.aliyuncs.com/aigc_material/OUTPUT_BROADCAST_SHORT_VIDEO/Mt.CSNSAsOIDZQU2/cover.jpg</a></p>
     */
    @NameInMap("coverURL")
    public String coverURL;

    /**
     * <strong>example:</strong>
     * <p>2026-01-06T07:00:02Z</p>
     */
    @NameInMap("createTime")
    public String createTime;

    @NameInMap("desc")
    public String desc;

    /**
     * <strong>example:</strong>
     * <p>BS1tneDiuOOjJmI2qOHGw1urA</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>2026-01-06T07:00:02Z</p>
     */
    @NameInMap("modifiedTime")
    public String modifiedTime;

    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p><a href="https://online-avatar-property.oss-cn-beijing.aliyuncs.com/aigc_material/OUTPUT_BROADCAST_SHORT_VIDEO/Mt.CSNSAsOIDZQU2/result.mp4">https://online-avatar-property.oss-cn-beijing.aliyuncs.com/aigc_material/OUTPUT_BROADCAST_SHORT_VIDEO/Mt.CSNSAsOIDZQU2/result.mp4</a></p>
     */
    @NameInMap("previewURL")
    public String previewURL;

    /**
     * <strong>example:</strong>
     * <p>9:16</p>
     */
    @NameInMap("ratio")
    public String ratio;

    /**
     * <strong>example:</strong>
     * <p><a href="https://online-avatar-property.oss-cn-beijing.aliyuncs.com/aigc_material/OUTPUT_BROADCAST_SHORT_VIDEO/Mt.CSNSAsOIDZQU2/result_preview.mp4">https://online-avatar-property.oss-cn-beijing.aliyuncs.com/aigc_material/OUTPUT_BROADCAST_SHORT_VIDEO/Mt.CSNSAsOIDZQU2/result_preview.mp4</a></p>
     */
    @NameInMap("shortVideoURL")
    public String shortVideoURL;

    @NameInMap("tags")
    public java.util.List<String> tags;

    /**
     * <strong>example:</strong>
     * <p><a href="https://online-avatar-property.oss-cn-beijing.aliyuncs.com/aigc_material/OUTPUT_BROADCAST_SHORT_VIDEO/Mt.CSNSAsOIDZQU2/thumbnail.jpg">https://online-avatar-property.oss-cn-beijing.aliyuncs.com/aigc_material/OUTPUT_BROADCAST_SHORT_VIDEO/Mt.CSNSAsOIDZQU2/thumbnail.jpg</a></p>
     */
    @NameInMap("thumbnailURL")
    public String thumbnailURL;

    public static BroadcastSceneTemplate build(java.util.Map<String, ?> map) throws Exception {
        BroadcastSceneTemplate self = new BroadcastSceneTemplate();
        return TeaModel.build(map, self);
    }

    public BroadcastSceneTemplate setCoverURL(String coverURL) {
        this.coverURL = coverURL;
        return this;
    }
    public String getCoverURL() {
        return this.coverURL;
    }

    public BroadcastSceneTemplate setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public BroadcastSceneTemplate setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public BroadcastSceneTemplate setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public BroadcastSceneTemplate setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public BroadcastSceneTemplate setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BroadcastSceneTemplate setPreviewURL(String previewURL) {
        this.previewURL = previewURL;
        return this;
    }
    public String getPreviewURL() {
        return this.previewURL;
    }

    public BroadcastSceneTemplate setRatio(String ratio) {
        this.ratio = ratio;
        return this;
    }
    public String getRatio() {
        return this.ratio;
    }

    public BroadcastSceneTemplate setShortVideoURL(String shortVideoURL) {
        this.shortVideoURL = shortVideoURL;
        return this;
    }
    public String getShortVideoURL() {
        return this.shortVideoURL;
    }

    public BroadcastSceneTemplate setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public BroadcastSceneTemplate setThumbnailURL(String thumbnailURL) {
        this.thumbnailURL = thumbnailURL;
        return this;
    }
    public String getThumbnailURL() {
        return this.thumbnailURL;
    }

}

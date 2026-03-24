// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class BroadcastScene extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("clipInfo")
    public String clipInfo;

    /**
     * <strong>example:</strong>
     * <p><a href="https://online-avatar-property.oss-cn-beijing.aliyuncs.com/aigc_material/OUTPUT_BROADCAST_SHORT_VIDEO/BS1CQEYXYQW4MQU2/cover.jpg">https://online-avatar-property.oss-cn-beijing.aliyuncs.com/aigc_material/OUTPUT_BROADCAST_SHORT_VIDEO/BS1CQEYXYQW4MQU2/cover.jpg</a></p>
     */
    @NameInMap("coverURL")
    public String coverURL;

    /**
     * <strong>example:</strong>
     * <p>2026-03-24T11:21:27.691732</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p><a href="https://online-avatar-property.oss-cn-beijing.aliyuncs.com/aigc_material/OUTPUT_BROADCAST_SHORT_VIDEO/BS1CQEYXYQW4MQU2/result.mp4">https://online-avatar-property.oss-cn-beijing.aliyuncs.com/aigc_material/OUTPUT_BROADCAST_SHORT_VIDEO/BS1CQEYXYQW4MQU2/result.mp4</a></p>
     */
    @NameInMap("downloadURL")
    public String downloadURL;

    /**
     * <strong>example:</strong>
     * <p>BS1WgG5zb-N1GI8nId3r6wo8g</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>2026-03-24T11:21:27.691732</p>
     */
    @NameInMap("modifiedTime")
    public String modifiedTime;

    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p><a href="https://online-avatar-property.oss-cn-beijing.aliyuncs.com/aigc_material/OUTPUT_BROADCAST_SHORT_VIDEO/BS1CQEYXYQW4MQU2/preview.mp4">https://online-avatar-property.oss-cn-beijing.aliyuncs.com/aigc_material/OUTPUT_BROADCAST_SHORT_VIDEO/BS1CQEYXYQW4MQU2/preview.mp4</a></p>
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
     * <p>300</p>
     */
    @NameInMap("remainSeconds")
    public Long remainSeconds;

    /**
     * <strong>example:</strong>
     * <p><a href="https://online-avatar-property.oss-cn-beijing.aliyuncs.com/aigc_material/OUTPUT_BROADCAST_SHORT_VIDEO/BS1CQEYXYQW4MQU2/result.mp4">https://online-avatar-property.oss-cn-beijing.aliyuncs.com/aigc_material/OUTPUT_BROADCAST_SHORT_VIDEO/BS1CQEYXYQW4MQU2/result.mp4</a></p>
     */
    @NameInMap("shortVideoURL")
    public String shortVideoURL;

    /**
     * <strong>example:</strong>
     * <p>DRAFT</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p><a href="https://online-avatar-property.oss-cn-beijing.aliyuncs.com/aigc_material/OUTPUT_BROADCAST_SHORT_VIDEO/BS1CQEYXYQW4MQU2/thumbnail.jpg">https://online-avatar-property.oss-cn-beijing.aliyuncs.com/aigc_material/OUTPUT_BROADCAST_SHORT_VIDEO/BS1CQEYXYQW4MQU2/thumbnail.jpg</a></p>
     */
    @NameInMap("thumbnailURL")
    public String thumbnailURL;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("version")
    public Long version;

    public static BroadcastScene build(java.util.Map<String, ?> map) throws Exception {
        BroadcastScene self = new BroadcastScene();
        return TeaModel.build(map, self);
    }

    public BroadcastScene setClipInfo(String clipInfo) {
        this.clipInfo = clipInfo;
        return this;
    }
    public String getClipInfo() {
        return this.clipInfo;
    }

    public BroadcastScene setCoverURL(String coverURL) {
        this.coverURL = coverURL;
        return this;
    }
    public String getCoverURL() {
        return this.coverURL;
    }

    public BroadcastScene setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public BroadcastScene setDownloadURL(String downloadURL) {
        this.downloadURL = downloadURL;
        return this;
    }
    public String getDownloadURL() {
        return this.downloadURL;
    }

    public BroadcastScene setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public BroadcastScene setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public BroadcastScene setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BroadcastScene setPreviewURL(String previewURL) {
        this.previewURL = previewURL;
        return this;
    }
    public String getPreviewURL() {
        return this.previewURL;
    }

    public BroadcastScene setRatio(String ratio) {
        this.ratio = ratio;
        return this;
    }
    public String getRatio() {
        return this.ratio;
    }

    public BroadcastScene setRemainSeconds(Long remainSeconds) {
        this.remainSeconds = remainSeconds;
        return this;
    }
    public Long getRemainSeconds() {
        return this.remainSeconds;
    }

    public BroadcastScene setShortVideoURL(String shortVideoURL) {
        this.shortVideoURL = shortVideoURL;
        return this;
    }
    public String getShortVideoURL() {
        return this.shortVideoURL;
    }

    public BroadcastScene setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public BroadcastScene setThumbnailURL(String thumbnailURL) {
        this.thumbnailURL = thumbnailURL;
        return this;
    }
    public String getThumbnailURL() {
        return this.thumbnailURL;
    }

    public BroadcastScene setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

}

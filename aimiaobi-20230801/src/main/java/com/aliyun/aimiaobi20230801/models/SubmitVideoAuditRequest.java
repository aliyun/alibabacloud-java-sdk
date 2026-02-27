// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitVideoAuditRequest extends TeaModel {
    /**
     * <p>扩展参数JSON字符串</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Ext")
    public String ext;

    /**
     * <p>OSS文件Key，与url参数二选一</p>
     * 
     * <strong>example:</strong>
     * <p>video/test.mp4</p>
     */
    @NameInMap("FileKey")
    public String fileKey;

    /**
     * <p>抽帧间隔时间（秒）</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("SnapshotInterval")
    public Double snapshotInterval;

    /**
     * <p>视频URL地址，与fileKey参数二选一</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/video.mp4">https://example.com/video.mp4</a></p>
     */
    @NameInMap("Url")
    public String url;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xxxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SubmitVideoAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoAuditRequest self = new SubmitVideoAuditRequest();
        return TeaModel.build(map, self);
    }

    public SubmitVideoAuditRequest setExt(String ext) {
        this.ext = ext;
        return this;
    }
    public String getExt() {
        return this.ext;
    }

    public SubmitVideoAuditRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public SubmitVideoAuditRequest setSnapshotInterval(Double snapshotInterval) {
        this.snapshotInterval = snapshotInterval;
        return this;
    }
    public Double getSnapshotInterval() {
        return this.snapshotInterval;
    }

    public SubmitVideoAuditRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public SubmitVideoAuditRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

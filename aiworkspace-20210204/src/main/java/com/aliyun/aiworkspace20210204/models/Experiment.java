// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class Experiment extends TeaModel {
    /**
     * <p>The visibility of the experiment. PRIVATE indicates that the experiment is visible only to the creator and their Alibaba Cloud account. PUBLIC indicates that the experiment is visible to all users.</p>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The default artifact output path for tasks associated with the experiment. Currently, only OSS paths are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket.oss-cn-hangzhou.aliyuncs.com/test</p>
     */
    @NameInMap("ArtifactUri")
    public String artifactUri;

    /**
     * <p>The experiment ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exp-1zpfthdx******</p>
     */
    @NameInMap("ExperimentId")
    public String experimentId;

    /**
     * <p>The time when the experiment was created.</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The time when the experiment was last modified.</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The list of experiment labels.</p>
     */
    @NameInMap("Labels")
    public java.util.List<ExperimentLabel> labels;

    /**
     * <p>The information about the latest run associated with the experiment.</p>
     */
    @NameInMap("LatestRun")
    public Run latestRun;

    /**
     * <p>The experiment name.</p>
     * 
     * <strong>example:</strong>
     * <p>exp-test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The Alibaba Cloud account ID of the experiment owner.</p>
     * 
     * <strong>example:</strong>
     * <p>1631044****3440</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0C6835C5-A424-5AFB-ACC2-F1E3CA1ABF7C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The default OSS storage path for TensorBoard logs of each trial in the experiment.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket.oss-cn-hangzhou.aliyuncs.com/tensorboard/</p>
     */
    @NameInMap("TensorboardLogUri")
    public String tensorboardLogUri;

    /**
     * <p>The user ID of the experiment creator.</p>
     * 
     * <strong>example:</strong>
     * <p>1557702098******</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The ID of the workspace to which the experiment belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>1517**</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static Experiment build(java.util.Map<String, ?> map) throws Exception {
        Experiment self = new Experiment();
        return TeaModel.build(map, self);
    }

    public Experiment setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public Experiment setArtifactUri(String artifactUri) {
        this.artifactUri = artifactUri;
        return this;
    }
    public String getArtifactUri() {
        return this.artifactUri;
    }

    public Experiment setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public Experiment setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public Experiment setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public Experiment setLabels(java.util.List<ExperimentLabel> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<ExperimentLabel> getLabels() {
        return this.labels;
    }

    public Experiment setLatestRun(Run latestRun) {
        this.latestRun = latestRun;
        return this;
    }
    public Run getLatestRun() {
        return this.latestRun;
    }

    public Experiment setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Experiment setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public Experiment setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Experiment setTensorboardLogUri(String tensorboardLogUri) {
        this.tensorboardLogUri = tensorboardLogUri;
        return this;
    }
    public String getTensorboardLogUri() {
        return this.tensorboardLogUri;
    }

    public Experiment setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public Experiment setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

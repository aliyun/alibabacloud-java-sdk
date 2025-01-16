// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitProjectExportJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BaseTimeline</p>
     */
    @NameInMap("ExportType")
    public String exportType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;Bucket&quot;: &quot;example-bucket&quot;,
     *     &quot;Prefix&quot;: &quot;example_prefix&quot;
     * }</p>
     */
    @NameInMap("OutputMediaConfig")
    public String outputMediaConfig;

    /**
     * <strong>example:</strong>
     * <p><em><strong><strong>67ae06542b9b93e0d1c387</strong></strong></em></p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;VideoTracks&quot;:[{&quot;VideoTrackClips&quot;:[{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;},{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;}]}]}</p>
     */
    @NameInMap("Timeline")
    public String timeline;

    /**
     * <strong>example:</strong>
     * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22,%22Key%22:%22Valuexxx%22%7D">http://xx.xx.xxx&quot;,&quot;Key&quot;:&quot;Valuexxx&quot;}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitProjectExportJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitProjectExportJobRequest self = new SubmitProjectExportJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitProjectExportJobRequest setExportType(String exportType) {
        this.exportType = exportType;
        return this;
    }
    public String getExportType() {
        return this.exportType;
    }

    public SubmitProjectExportJobRequest setOutputMediaConfig(String outputMediaConfig) {
        this.outputMediaConfig = outputMediaConfig;
        return this;
    }
    public String getOutputMediaConfig() {
        return this.outputMediaConfig;
    }

    public SubmitProjectExportJobRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SubmitProjectExportJobRequest setTimeline(String timeline) {
        this.timeline = timeline;
        return this;
    }
    public String getTimeline() {
        return this.timeline;
    }

    public SubmitProjectExportJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}

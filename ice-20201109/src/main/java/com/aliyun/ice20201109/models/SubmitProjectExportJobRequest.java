// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitProjectExportJobRequest extends TeaModel {
    /**
     * <p>The export type. Valid values:</p>
     * <ul>
     * <li><strong>BaseTimeline</strong>: exports the timeline.</li>
     * <li><strong>AdobePremierePro</strong>: exports an Adobe Premiere Pro project.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BaseTimeline</p>
     */
    @NameInMap("ExportType")
    public String exportType;

    /**
     * <p>The output path for the exported project and generated intermediate files, in JSON format. The export destination only supports OSS. Path fields:</p>
     * <ul>
     * <li><strong>Bucket</strong>: Required. The OSS bucket name.</li>
     * <li><strong>Prefix</strong>: Optional. The path prefix. If not specified, it defaults to the root directory.</li>
     * <li><strong>Width</strong>: Optional. The width of the output. The value must be a positive integer. If not provided, the system automatically calculates the value based on the input project or timeline.</li>
     * <li><strong>Height</strong>: Optional. The height of the output. The value must be a positive integer. If not provided, the system automatically calculates the value based on the input project or timeline.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;Bucket&quot;: &quot;example-bucket&quot;,
     *         &quot;Prefix&quot;: &quot;example_prefix&quot;,
     *         &quot;Width&quot;: 1920,
     *         &quot;Height&quot;: 1080
     * }</p>
     */
    @NameInMap("OutputMediaConfig")
    public String outputMediaConfig;

    /**
     * <p>The ID of the online editing project.</p>
     * <blockquote>
     * <p>Notice: Either ProjectId or Timeline must be provided.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><em><strong><strong>67ae06542b9b93e0d1c387</strong></strong></em></p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The timeline of the online editing job. For data structure, see <a href="https://help.aliyun.com/document_detail/198823.html">Timeline</a>.</p>
     * <blockquote>
     * <p>Notice: Either ProjectId or Timeline must be provided.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;VideoTracks&quot;:[{&quot;VideoTrackClips&quot;:[{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;},{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;}]}]}</p>
     */
    @NameInMap("Timeline")
    public String timeline;

    /**
     * <p>The user-defined data in the JSON format.</p>
     * 
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

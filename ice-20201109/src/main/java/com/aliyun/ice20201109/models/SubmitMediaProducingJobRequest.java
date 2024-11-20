// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMediaProducingJobRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>12e8864746a0a398</strong></strong></p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The material parameters of the template, in the JSON format. If TemplateId is specified, ClipsParam must also be specified. For more information, see <a href="https://help.aliyun.com/document_detail/328557.html">Create and use a regular template</a> and <a href="https://help.aliyun.com/document_detail/291418.html">Create and use advanced templates</a>.</p>
     */
    @NameInMap("ClipsParam")
    public String clipsParam;

    /**
     * <p>The parameters for editing and production. For more information, see <a href="https://help.aliyun.com/document_detail/357745.html#title-10z-t9u-n69">EditingProduceConfig</a>.</p>
     * <blockquote>
     * <p> If no thumbnail is specified in EditingProduceConfig, the first frame of the video is used as the thumbnail.</p>
     * </blockquote>
     * <ul>
     * <li>AutoRegisterInputVodMedia: specifies whether to automatically register the ApsaraVideo VOD media assets in your timeline with IMS. Default value: true.</li>
     * <li>OutputWebmTransparentChannel: specifies whether the output video contains alpha channels. Default value: false.</li>
     * <li>CoverConfig: the custom thumbnail parameters.</li>
     * <li></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;AutoRegisterInputVodMedia&quot;: &quot;true&quot;,
     *       &quot;OutputWebmTransparentChannel&quot;: &quot;true&quot;
     * }</p>
     */
    @NameInMap("EditingProduceConfig")
    public String editingProduceConfig;

    /**
     * <p>The metadata of the produced video, in the JSON format. For more information about the parameters, see <a href="https://help.aliyun.com/document_detail/357745.html?spm=a2c4g.445712.0.0.49a716dbA8hgdz#97ff26d0e3c28">MediaMetadata</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;Title&quot;:&quot;test-title&quot;,
     *       &quot;Tags&quot;:&quot;test-tags1,tags2&quot;
     * }</p>
     */
    @NameInMap("MediaMetadata")
    public String mediaMetadata;

    /**
     * <p>The configurations of the output file, in the JSON format. You can specify an OSS URL or a storage location in a storage bucket of ApsaraVideo VOD.</p>
     * <p>To store the output file in OSS, you must specify MediaURL. To store the output file in ApsaraVideo VOD, you must specify StorageLocation and FileName.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/357745.html#title-4j6-ve7-g31">OutputMediaConfig</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MediaURL&quot;:&quot;<a href="https://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4%22%7D">https://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4&quot;}</a></p>
     */
    @NameInMap("OutputMediaConfig")
    public String outputMediaConfig;

    /**
     * <p>The type of the output file. Valid values:</p>
     * <ul>
     * <li>oss-object: OSS object in an OSS bucket.</li>
     * <li>vod-media: media asset in ApsaraVideo VOD.</li>
     * <li>S3: output file based on the Amazon Simple Storage Service (S3) protocol.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oss-object</p>
     */
    @NameInMap("OutputMediaTarget")
    public String outputMediaTarget;

    /**
     * <p>The ID of the editing project.</p>
     * <blockquote>
     * <p>: You must specify one of ProgectId, Timeline, and TempalteId and leave the other two parameters empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>xxxxxfb2101cb318xxxxx</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The metadata of the editing project, in the JSON format. For more information about the parameters, see <a href="https://help.aliyun.com/document_detail/357745.html#title-yvp-81k-wff">ProjectMetadata</a>.</p>
     */
    @NameInMap("ProjectMetadata")
    public String projectMetadata;

    /**
     * <p>The source of the editing and production request. Valid values:</p>
     * <ul>
     * <li>OpenAPI</li>
     * <li>AliyunConsole</li>
     * <li>WebSDK</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OPENAPI</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The template ID. The template is used to build a timeline with ease.</p>
     * <blockquote>
     * <p>: You must specify one of ProgectId, Timeline, and TempalteId and leave the other two parameters empty. If TemplateId is specified, ClipsParam must also be specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("Timeline")
    public String timeline;

    /**
     * <p>The user-defined data in the JSON format, which can be up to 512 bytes in length. You can specify a custom callback URL. For more information, see <a href="https://help.aliyun.com/document_detail/451631.html">Configure a callback upon editing completion</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;NotifyAddress&quot;:&quot;<a href="https://xx.com/xx%22,%22RegisterMediaNotifyAddress%22:%22https://xxx.com/xx%22%7D">https://xx.com/xx&quot;,&quot;RegisterMediaNotifyAddress&quot;:&quot;https://xxx.com/xx&quot;}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitMediaProducingJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaProducingJobRequest self = new SubmitMediaProducingJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitMediaProducingJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SubmitMediaProducingJobRequest setClipsParam(String clipsParam) {
        this.clipsParam = clipsParam;
        return this;
    }
    public String getClipsParam() {
        return this.clipsParam;
    }

    public SubmitMediaProducingJobRequest setEditingProduceConfig(String editingProduceConfig) {
        this.editingProduceConfig = editingProduceConfig;
        return this;
    }
    public String getEditingProduceConfig() {
        return this.editingProduceConfig;
    }

    public SubmitMediaProducingJobRequest setMediaMetadata(String mediaMetadata) {
        this.mediaMetadata = mediaMetadata;
        return this;
    }
    public String getMediaMetadata() {
        return this.mediaMetadata;
    }

    public SubmitMediaProducingJobRequest setOutputMediaConfig(String outputMediaConfig) {
        this.outputMediaConfig = outputMediaConfig;
        return this;
    }
    public String getOutputMediaConfig() {
        return this.outputMediaConfig;
    }

    public SubmitMediaProducingJobRequest setOutputMediaTarget(String outputMediaTarget) {
        this.outputMediaTarget = outputMediaTarget;
        return this;
    }
    public String getOutputMediaTarget() {
        return this.outputMediaTarget;
    }

    public SubmitMediaProducingJobRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SubmitMediaProducingJobRequest setProjectMetadata(String projectMetadata) {
        this.projectMetadata = projectMetadata;
        return this;
    }
    public String getProjectMetadata() {
        return this.projectMetadata;
    }

    public SubmitMediaProducingJobRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public SubmitMediaProducingJobRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SubmitMediaProducingJobRequest setTimeline(String timeline) {
        this.timeline = timeline;
        return this;
    }
    public String getTimeline() {
        return this.timeline;
    }

    public SubmitMediaProducingJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}

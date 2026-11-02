// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMediaProducingJobRequest extends TeaModel {
    /**
     * <p>Ensures the idempotence of the request. You can generate a parameter value from your client to ensure that the parameter value is unique across different requests. ClientToken only supports ASCII characters and cannot exceed 64 characters.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>12e8864746a0a398</strong></strong></p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The material parameters corresponding to the template, in JSON format. When TemplateId is not empty, ClipsParam cannot be empty. For the specific format, see <a href="https://help.aliyun.com/document_detail/445399.html">Create and use common templates</a> and <a href="https://help.aliyun.com/document_detail/445389.html">Create and use advanced templates</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>See the template usage documentation</p>
     */
    @NameInMap("ClipsParam")
    public String clipsParam;

    /**
     * <p>The editing and producing parameters. For configuration details, see <a href="~~357745#section-8a4-pb2-hkv~~">EditingProduceConfig parameter details</a>.</p>
     * <blockquote>
     * <p>If no cover image is configured in EditingProduceConfig, the first frame of the video is used as the cover by default.</p>
     * </blockquote>
     * <ul>
     * <li><p>AutoRegisterInputVodMedia: specifies whether to automatically register the VOD media assets in your timeline to IMS. Default value: true.</p>
     * </li>
     * <li><p>OutputWebmTransparentChannel: specifies whether to output the video with a transparent channel. Default value: false.</p>
     * </li>
     * <li><p>CoverConfig: the custom cover image parameters.</p>
     * </li>
     * <li><p>...</p>
     * </li>
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
     * <p>The metadata of the produced video, in JSON format. For the specific structure definition, see <a href="~~357745#97ff26d0e3c28~~">MediaMetadata</a>.</p>
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
     * <p>The target configuration of the output product, in JSON format. You can set the URL of the output product in OSS or the storage location in the VOD bucket.</p>
     * <ul>
     * <li>When the output is to OSS, the MediaURL parameter of the output target is required.</li>
     * <li>When the output is to VOD, the StorageLocation and FileName parameters are required.</li>
     * </ul>
     * <p><a href="~~357745#title-4j6-ve7-g31~~">OutputMediaConfig parameter examples</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MediaURL&quot;:&quot;<a href="https://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4%22%7D">https://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4&quot;}</a></p>
     */
    @NameInMap("OutputMediaConfig")
    public String outputMediaConfig;

    /**
     * <p>The target type of the output product. Valid values:</p>
     * <ul>
     * <li><p>oss-object: an OSS object in an Alibaba Cloud OSS bucket.</p>
     * </li>
     * <li><p>vod-media: a media asset in Alibaba Cloud VOD.</p>
     * </li>
     * <li><p>S3: output based on the S3 protocol.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oss-object</p>
     */
    @NameInMap("OutputMediaTarget")
    public String outputMediaTarget;

    /**
     * <p>The ID of the editing project. You can call the <a href="https://help.aliyun.com/document_detail/441137.html">CreateEditingProject</a> operation to create an editing project and obtain the ProjectId parameter to submit an editing task.</p>
     * <blockquote>
     * <p>Notice: You must specify one of the ProjectId, Timeline, and TemplateId parameters, and leave the other two parameters empty.</notice></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>xxxxxfb2101cb318xxxxx</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The metadata information of the editing project, in JSON format. For the specific structure definition, see <a href="~~357745#title-yvp-81k-wff~~">ProjectMetadata</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Description&quot;:&quot;Edited video description&quot;,&quot;Title&quot;:&quot;Editing title test&quot;}</p>
     */
    @NameInMap("ProjectMetadata")
    public String projectMetadata;

    /**
     * <p>The source of the editing and producing request. Valid values:</p>
     * <ul>
     * <li><p>OpenAPI: direct API requests.</p>
     * </li>
     * <li><p>AliyunConsole: requests from the Alibaba Cloud Management Console.</p>
     * </li>
     * <li><p>WebSDK: requests from frontend pages integrated with WebSDK.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OPENAPI</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The ID of the template. This parameter is used to quickly build a timeline with a low threshold. Video editing based on common templates and advanced templates is supported.</p>
     * <ul>
     * <li><p>When you use a template ID to submit a media editing and producing job, you must provide the ClipsParam parameter to flexibly adjust or replace materials in the template.</p>
     * </li>
     * <li><p>You can invoke the <a href="https://help.aliyun.com/document_detail/441164.html">GetTemplate</a> operation to obtain template information.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notice: You must specify one of the ProjectId, Timeline, and TemplateId parameters, and leave the other two parameters empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The timeline of the cloud editing task. When you need to arrange materials and design special effects based on video ideas, you can manually construct the Timeline parameter.</p>
     * <ul>
     * <li>A timeline mainly includes three types of objects: tracks, materials, and effects. For more information, see <a href="https://help.aliyun.com/document_detail/198823.html">Timeline configurations</a>.</li>
     * <li>For more timeline configuration examples, see <a href="https://help.aliyun.com/document_detail/2766669.html">Best practices</a>.</li>
     * </ul>
     * <blockquote>
     * <p>Notice: You must specify one of the ProjectId, Timeline, and TemplateId parameters, and leave the other two parameters empty.</notice></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;VideoTracks&quot;:[{&quot;VideoTrackClips&quot;:[{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;},{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;}]}]}</p>
     */
    @NameInMap("Timeline")
    public String timeline;

    /**
     * <p>The custom settings, in JSON format. The maximum length is 512 bytes. <a href="https://help.aliyun.com/document_detail/451631.html">Task completion callback configurations</a> are supported. Parameters:</p>
     * <ul>
     * <li>NotifyAddress: the callback URL for task completion.</li>
     * <li>RegisterMediaNotifyAddress: the callback URL for the completion of produced media asset analysis.</li>
     * </ul>
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

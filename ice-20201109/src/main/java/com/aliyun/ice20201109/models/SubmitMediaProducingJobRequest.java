// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMediaProducingJobRequest extends TeaModel {
    /**
     * <p>A client-generated token that ensures request idempotence. This token must be a unique value of up to 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>12e8864746a0a398</strong></strong></p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The clip parameters that correspond to the template, in JSON format. If <code>TemplateId</code> is specified, this parameter is required. For details about the format, see <a href="https://help.aliyun.com/document_detail/445399.html">Create and use basic templates</a> and <a href="https://help.aliyun.com/document_detail/445389.html">Create and use advanced templates</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>See the template user guide.</p>
     */
    @NameInMap("ClipsParam")
    public String clipsParam;

    /**
     * <p>The parameters for the media producing job. For configuration details, see <a href="~~357745#section-8a4-pb2-hkv~~">EditingProduceConfig parameter details</a>.</p>
     * <blockquote>
     * <p>If a cover is not configured in <code>EditingProduceConfig</code>, the first frame of the video is used as the default cover.</p>
     * </blockquote>
     * <ul>
     * <li><p><code>AutoRegisterInputVodMedia</code>: Specifies whether to automatically register the VOD media assets in your timeline to IMS. Default value: true.</p>
     * </li>
     * <li><p><code>OutputWebmTransparentChannel</code>: Specifies whether to output a video with a transparent channel. Default value: false.</p>
     * </li>
     * <li><p><code>CoverConfig</code>: The parameters for a custom cover.</p>
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
     * <p>The metadata of the output video, in JSON format. For details about the structure, see <a href="~~357745#97ff26d0e3c28~~">MediaMetadata</a>.</p>
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
     * <p>The configuration for the output media target, in JSON format. You can set the URL for the output media in OSS or the storage location in a VOD bucket.</p>
     * <ul>
     * <li><p>When outputting to OSS, the <code>MediaURL</code> parameter is required.</p>
     * </li>
     * <li><p>When outputting to VOD, both the <code>StorageLocation</code> and <code>FileName</code> parameters are required.</p>
     * </li>
     * </ul>
     * <p>For more information, see <a href="~~357745#title-4j6-ve7-g31~~">OutputMediaConfig parameter examples</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MediaURL&quot;:&quot;<a href="https://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4%22%7D">https://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4&quot;}</a></p>
     */
    @NameInMap("OutputMediaConfig")
    public String outputMediaConfig;

    /**
     * <p>The target type for the output media. Valid values:</p>
     * <ul>
     * <li><p><code>oss-object</code>: An object in your Alibaba Cloud OSS bucket.</p>
     * </li>
     * <li><p><code>vod-media</code>: A media asset in Alibaba Cloud VOD.</p>
     * </li>
     * <li><p><code>S3</code>: A destination that supports the S3 protocol.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oss-object</p>
     */
    @NameInMap("OutputMediaTarget")
    public String outputMediaTarget;

    /**
     * <p>The ID of the editing project. Call the <a href="https://help.aliyun.com/document_detail/441137.html">CreateEditingProject</a> operation to create an editing project and obtain the <code>ProjectId</code> to submit a media producing job.</p>
     * <blockquote>
     * <p>Notice: You must specify one of the <code>ProjectId</code>, <code>Timeline</code>, or <code>TemplateId</code> parameters. The other two parameters must be left empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>xxxxxfb2101cb318xxxxx</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The metadata of the editing project, in JSON format. For details about the structure, see <a href="~~357745#title-yvp-81k-wff~~">ProjectMetadata</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Description&quot;:&quot;Video editing description&quot;,&quot;Title&quot;:&quot;Editing title test&quot;}</p>
     */
    @NameInMap("ProjectMetadata")
    public String projectMetadata;

    /**
     * <p>The source of the media producing job request. Valid values:</p>
     * <ul>
     * <li><p><code>OpenAPI</code>: A request initiated through an API call.</p>
     * </li>
     * <li><p><code>AliyunConsole</code>: A request that originates from the Alibaba Cloud console.</p>
     * </li>
     * <li><p><code>WebSDK</code>: A request sent from a front-end page that integrates the WebSDK.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OPENAPI</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The ID of a template for quickly building a timeline. You can use basic and advanced templates for video editing.</p>
     * <ul>
     * <li><p>When you submit a media producing job using a template ID, you must provide the <code>ClipsParam</code> parameter to adjust or replace clips in the template.</p>
     * </li>
     * <li><p>Call the <a href="https://help.aliyun.com/document_detail/441164.html">GetTemplate</a> operation to obtain template information.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>You must specify one of the <code>ProjectId</code>, <code>Timeline</code>, or <code>TemplateId</code> parameters. The other two parameters must be left empty.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The timeline for the cloud editing job. To arrange clips and design effects, manually construct the <code>Timeline</code> parameter.</p>
     * <ul>
     * <li><p>A timeline primarily consists of three types of objects: tracks, clips, and effects. For more information, see <a href="https://help.aliyun.com/document_detail/198823.html">Timeline configuration</a>.</p>
     * </li>
     * <li><p>For more examples of timeline configurations, see <a href="https://help.aliyun.com/document_detail/2766669.html">Best practices</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>You must specify one of the <code>ProjectId</code>, <code>Timeline</code>, or <code>TemplateId</code> parameters. The other two parameters must be left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;VideoTracks&quot;:[{&quot;VideoTrackClips&quot;:[{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;},{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;}]}]}</p>
     */
    @NameInMap("Timeline")
    public String timeline;

    /**
     * <p>Custom user data in JSON format. The value can be up to 512 bytes in length. This parameter supports <a href="https://help.aliyun.com/document_detail/451631.html">job completion callback configuration</a>. The fields include:</p>
     * <ul>
     * <li><p><code>NotifyAddress</code>: The callback for job completion.</p>
     * </li>
     * <li><p><code>RegisterMediaNotifyAddress</code>: The callback invoked when the analysis of the output media asset is complete.</p>
     * </li>
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

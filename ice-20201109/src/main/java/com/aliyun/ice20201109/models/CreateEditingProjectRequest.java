// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateEditingProjectRequest extends TeaModel {
    /**
     * <p>The business configuration of the project. This parameter can be ignored for general editing projects.</p>
     * <p>For a live stream editing project, observe the following rules: OutputMediaConfig.StorageLocation is required. OutputMediaConfig.Path is optional. If you do not specify this option, the live streaming clips are stored in the root directory by default.</p>
     * <p>Valid values of OutputMediaTarget include vod-media and oss-object. If you do not specify OutputMediaTarget, the default value oss-object is used.</p>
     * <p>If you set OutputMediaTarget to vod-media, the setting of OutputMediaConfig.Path does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;OutputMediaConfig&quot; : { &quot;StorageLocation&quot;: &quot;test-bucket.oss-cn-shanghai.aliyuncs.com&quot;, &quot;Path&quot;: &quot;test-path&quot; }, &quot;OutputMediaTarget&quot;: &quot;oss-object&quot;, &quot;ReservationTime&quot;: &quot;2021-06-21T08:05:00Z&quot; }</p>
     */
    @NameInMap("BusinessConfig")
    public String businessConfig;

    /**
     * <p>The material parameter corresponding to the template, in the JSON format. If TemplateId is specified, ClipsParam must also be specified. For more information&lt;props=&quot;china&quot;&gt;, see <a href="https://help.aliyun.com/document_detail/328557.html">Create and use a regular template</a> and <a href="https://help.aliyun.com/document_detail/291418.html">Create and use an advanced template</a>.</p>
     */
    @NameInMap("ClipsParam")
    public String clipsParam;

    /**
     * <p>The thumbnail URL of the online editing project.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/example.png">https://example.com/example.png</a></p>
     */
    @NameInMap("CoverURL")
    public String coverURL;

    /**
     * <p>The description of the online editing project.</p>
     * 
     * <strong>example:</strong>
     * <p>描述</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The material associated with the project. Separate multiple material IDs with commas (,). Each type supports up to 10 material IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;video&quot;:&quot;<em><strong><strong>2e057304fcd9b145c5cafc</strong></strong></em>&quot;, &quot;image&quot;:&quot;<strong><strong>8021a8d493da643c8acd98</strong></strong>*,<em><strong><strong>cb6307a4edea614d8b3f3c</strong></strong></em>&quot;, &quot;liveStream&quot;: &quot;[{\&quot;appName\&quot;:\&quot;testrecord\&quot;,\&quot;domainName\&quot;:\&quot;test.alivecdn.com\&quot;,\&quot;liveUrl\&quot;:\&quot;rtmp://test.alivecdn.com/testrecord/teststream\&quot;,\&quot;streamName\&quot;:\&quot;teststream\&quot;}]&quot;, &quot;editingProject&quot;: &quot;<em><strong><strong>9b145c5cafc2e057304fcd</strong></strong></em>&quot;}</p>
     */
    @NameInMap("MaterialMaps")
    public String materialMaps;

    /**
     * <p>The type of the editing project. Valid values: EditingProject and LiveEditingProject. A value of EditingProject indicates a regular editing project, and a value of LiveEditingProject indicates a live stream editing project.</p>
     * 
     * <strong>example:</strong>
     * <p>LiveEditingProject</p>
     */
    @NameInMap("ProjectType")
    public String projectType;

    /**
     * <p>The template ID. This parameter is used to quickly build a timeline with ease. Note: Only one of Timeline and TemplateId can be specified. If TemplateId is specified, ClipsParam must also be specified.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The template type. This parameter is required if you create a template-based online editing project. Default value: Timeline. Valid values:</p>
     * <ul>
     * <li>Timeline: a regular template.</li>
     * <li>VETemplate: an advanced template.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Timeline</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    /**
     * <strong>example:</strong>
     * <p>{&quot;VideoTracks&quot;:[{&quot;VideoTrackClips&quot;:[{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;},{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;}]}]}</p>
     */
    @NameInMap("Timeline")
    public String timeline;

    /**
     * <p>The title of the online editing project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Title")
    public String title;

    public static CreateEditingProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEditingProjectRequest self = new CreateEditingProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateEditingProjectRequest setBusinessConfig(String businessConfig) {
        this.businessConfig = businessConfig;
        return this;
    }
    public String getBusinessConfig() {
        return this.businessConfig;
    }

    public CreateEditingProjectRequest setClipsParam(String clipsParam) {
        this.clipsParam = clipsParam;
        return this;
    }
    public String getClipsParam() {
        return this.clipsParam;
    }

    public CreateEditingProjectRequest setCoverURL(String coverURL) {
        this.coverURL = coverURL;
        return this;
    }
    public String getCoverURL() {
        return this.coverURL;
    }

    public CreateEditingProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEditingProjectRequest setMaterialMaps(String materialMaps) {
        this.materialMaps = materialMaps;
        return this;
    }
    public String getMaterialMaps() {
        return this.materialMaps;
    }

    public CreateEditingProjectRequest setProjectType(String projectType) {
        this.projectType = projectType;
        return this;
    }
    public String getProjectType() {
        return this.projectType;
    }

    public CreateEditingProjectRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateEditingProjectRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public CreateEditingProjectRequest setTimeline(String timeline) {
        this.timeline = timeline;
        return this;
    }
    public String getTimeline() {
        return this.timeline;
    }

    public CreateEditingProjectRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}

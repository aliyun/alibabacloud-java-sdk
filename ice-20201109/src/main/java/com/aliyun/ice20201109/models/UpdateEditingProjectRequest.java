// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateEditingProjectRequest extends TeaModel {
    /**
     * <p>The business status of the project. This parameter can be ignored for general editing projects. You can modify the reservation status of the project. Valid values:</p>
     * <ul>
     * <li>Reserving: The project is being reserved.</li>
     * <li>ReservationCanceled: The reservation is canceled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Reserving</p>
     */
    @NameInMap("BusinessStatus")
    public String businessStatus;

    /**
     * <p>The material parameters for the template in JSON format. If TemplateId is specified, ClipsParam must also be specified.&lt;props=&quot;china&quot;&gt;For more information about the format, see <a href="https://help.aliyun.com/document_detail/328557.html">Create and use a common template</a> and <a href="https://help.aliyun.com/document_detail/291418.html">Create and use an advanced template</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>See the template user guide.</p>
     */
    @NameInMap("ClipsParam")
    public String clipsParam;

    /**
     * <p>The cover URL of the cloud editing project.</p>
     * 
     * <strong>example:</strong>
     * <p>https://<strong><strong>.com/6AB4D0E1E1C7446888</strong></strong>.png</p>
     */
    @NameInMap("CoverURL")
    public String coverURL;

    /**
     * <p>The description of the cloud editing project.</p>
     * 
     * <strong>example:</strong>
     * <p>testtimeline001desciption</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the cloud editing project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>4ee4b97e27b525142a6b2</strong></strong></p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The template ID, which is used to quickly build a timeline with minimal effort.&gt;Notice: Exactly one of ProjectId, Timeline, and TemplateId must be specified. If TemplateId is specified, ClipsParam must also be specified.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The timeline of the cloud editing project in JSON format.</p>
     */
    @NameInMap("Timeline")
    public String timeline;

    /**
     * <p>The title of the cloud editing project.</p>
     * 
     * <strong>example:</strong>
     * <p>testtimeline</p>
     */
    @NameInMap("Title")
    public String title;

    public static UpdateEditingProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEditingProjectRequest self = new UpdateEditingProjectRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEditingProjectRequest setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
        return this;
    }
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    public UpdateEditingProjectRequest setClipsParam(String clipsParam) {
        this.clipsParam = clipsParam;
        return this;
    }
    public String getClipsParam() {
        return this.clipsParam;
    }

    public UpdateEditingProjectRequest setCoverURL(String coverURL) {
        this.coverURL = coverURL;
        return this;
    }
    public String getCoverURL() {
        return this.coverURL;
    }

    public UpdateEditingProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateEditingProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateEditingProjectRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateEditingProjectRequest setTimeline(String timeline) {
        this.timeline = timeline;
        return this;
    }
    public String getTimeline() {
        return this.timeline;
    }

    public UpdateEditingProjectRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}

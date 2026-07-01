// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMediaCensorJobShrinkRequest extends TeaModel {
    /**
     * <p>The video barrages (on-screen comments).</p>
     * <blockquote>
     * <p>If specified, it overrides the barrages specified in the Media object.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hello world</p>
     */
    @NameInMap("Barrages")
    public String barrages;

    /**
     * <p>The Object Storage Service (OSS) files for the cover images, specified as a JSON array. You can specify up to five cover images.</p>
     * <blockquote>
     * <p>If specified, this parameter overrides the cover image information in the <strong>Media</strong> object.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Bucket&quot;:&quot;example-bucket-<strong><strong>&quot;,&quot;Location&quot;:&quot;oss-cn-shanghai&quot;,&quot;Object&quot;:&quot;example-</strong></strong>.jpeg&quot;,&quot;RoleArn&quot;:&quot;acs:ram::1997018457688683:role/AliyunICEDefaultRole&quot;}]</p>
     */
    @NameInMap("CoverImages")
    public String coverImages;

    /**
     * <p>The video description. The maximum length is 128 bytes.</p>
     * <blockquote>
     * <p>If specified, this parameter overrides the description specified in the Media object.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>example description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The input file to censor.</p>
     */
    @NameInMap("Input")
    public String inputShrink;

    /**
     * <p>The callback path. Both Message Service (MNS) and HTTP callbacks are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>mns://125340688170****.oss-cn-shanghai.aliyuncs.com/queues/example-pipeline</p>
     */
    @NameInMap("NotifyUrl")
    public String notifyUrl;

    /**
     * <p>The output location for screenshots. The censor job generates screenshots and a result JSON file in the OSS location specified by this parameter.</p>
     * <ul>
     * <li><p>Example format: <code>oss://bucket/snapshot-{Count}.jpg</code>, where <code>bucket</code> is the name of an OSS bucket in the same region as the project, and <code>{Count}</code> is a placeholder for the screenshot sequence number.</p>
     * </li>
     * <li><p>The detailed censor results are saved to a file named <code>{jobId}.output</code> in the same OSS folder as the value of <code>Output</code>. For information about the fields in the output file, see <a href="https://help.aliyun.com/document_detail/609211.html">Media censor result file fields</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oss://sashimi-cn-shanghai/censor/snapshot-{Count}.jpg</p>
     */
    @NameInMap("Output")
    public String output;

    /**
     * <p>The scheduling configuration.</p>
     */
    @NameInMap("ScheduleConfig")
    public String scheduleConfigShrink;

    /**
     * <p>The template ID. If this parameter is left empty, the service uses the default template for the censor job.</p>
     * 
     * <strong>example:</strong>
     * <p>S00000001-100060</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The video title. The maximum length is 64 bytes.</p>
     * <blockquote>
     * <p>If specified, this parameter overrides the title specified in the Media object.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Hello World</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The user-defined data. The maximum length is 128 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>UserDatatestid-001-****</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitMediaCensorJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaCensorJobShrinkRequest self = new SubmitMediaCensorJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitMediaCensorJobShrinkRequest setBarrages(String barrages) {
        this.barrages = barrages;
        return this;
    }
    public String getBarrages() {
        return this.barrages;
    }

    public SubmitMediaCensorJobShrinkRequest setCoverImages(String coverImages) {
        this.coverImages = coverImages;
        return this;
    }
    public String getCoverImages() {
        return this.coverImages;
    }

    public SubmitMediaCensorJobShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitMediaCensorJobShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

    public SubmitMediaCensorJobShrinkRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public SubmitMediaCensorJobShrinkRequest setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public SubmitMediaCensorJobShrinkRequest setScheduleConfigShrink(String scheduleConfigShrink) {
        this.scheduleConfigShrink = scheduleConfigShrink;
        return this;
    }
    public String getScheduleConfigShrink() {
        return this.scheduleConfigShrink;
    }

    public SubmitMediaCensorJobShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SubmitMediaCensorJobShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitMediaCensorJobShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}

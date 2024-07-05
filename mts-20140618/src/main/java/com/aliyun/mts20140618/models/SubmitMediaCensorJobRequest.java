// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitMediaCensorJobRequest extends TeaModel {
    /**
     * <p>The live comments.</p>
     * 
     * <strong>example:</strong>
     * <p>hello world</p>
     */
    @NameInMap("Barrages")
    public String barrages;

    /**
     * <p>The OSS URL of the image file that is used as the thumbnail. To view the OSS URL of the image file, you can log on to the <strong>MPS console</strong> and choose <strong>Media Management</strong> &gt; <strong>Media List</strong> in the left-side navigation pane. You can specify up to five thumbnails in a JSON array.</p>
     * <ul>
     * <li><p>Bucket: the name of the OSS bucket that stores the input file.</p>
     * </li>
     * <li><p>Location: the OSS region. The OSS region must be the same as the region in which your MPS service is activated.</p>
     * </li>
     * <li><p>Object: the OSS object to be moderated.</p>
     * <p>**</p>
     * <p><strong>Note</strong>The name of the object cannot start with a forward slash (/). Otherwise, the operation fails to be called.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Bucket&quot;:&quot;example-bucket-<strong><strong>&quot;,&quot;Location&quot;:&quot;oss-cn-shanghai&quot;,&quot;Object&quot;:&quot;example-</strong></strong>.jpeg&quot;}]</p>
     */
    @NameInMap("CoverImages")
    public String coverImages;

    /**
     * <p>The description of the video. The value can be up to 128 bytes in size.</p>
     * 
     * <strong>example:</strong>
     * <p>example description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The URL of the video.</p>
     */
    @NameInMap("ExternalUrl")
    public String externalUrl;

    /**
     * <p>The Object Storage Service (OSS) URL of the media file to be moderated. To view the OSS URL of the media file, you can log on to the <strong>MPS console</strong> and choose <strong>Media Management</strong> &gt; <strong>Media List</strong> in the left-side navigation pane. To moderate an image file, use the <code>CoverImage</code> parameter to specify the OSS URL of the image file. The value is a JSON object. For more information, see the &quot;Input&quot; section of the <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a> topic.</p>
     * <ul>
     * <li><p>Bucket: the name of the OSS bucket that stores the input file.</p>
     * </li>
     * <li><p>Location: the OSS region. The OSS region must be the same as the region in which your MPS service is activated.</p>
     * </li>
     * <li><p>Object: the OSS object to be moderated.</p>
     * <p>**</p>
     * <p><strong>Note</strong>The name of the object cannot start with a forward slash (/). Otherwise, the operation fails to be called.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Bucket&quot;:&quot;example-bucket-<strong><strong>&quot;,&quot;Location&quot;:&quot;oss-cn-shanghai&quot;,&quot;Object&quot;:&quot;example-</strong></strong>.flv&quot;}</p>
     */
    @NameInMap("Input")
    public String input;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the MPS queue. This ID can be used to associate the job with a notification method. To view the ID of the MPS queue, you can log on to the <strong>MPS console</strong> and choose <strong>Global Settings</strong> &gt; <strong>Pipelines</strong> in the left-side navigation pane. An empty string (&quot;&quot;) indicates that the default MPS queue is used to run the job. By default, an MPS queue can process a maximum of 10 concurrent content moderation jobs. To increase the limit, <a href="https://workorder-intl.console.aliyun.com/?spm=5176.12246746.top-nav.ditem-sub.35da7bbcitpQnr#/ticket/createIndex">submit a ticket</a>.</p>
     * <blockquote>
     * <p>MPS queues are automatically created by the system. For more information about how to query and update MPS queues, see the <a href="https://help.aliyun.com/document_detail/188374.html">UpdatePipeline</a> topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>b22c173cced04565b1f38f1ecc39****</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The title of the video. The value can be up to 64 bytes in size.</p>
     * 
     * <strong>example:</strong>
     * <p>Hello World</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The custom data. The value can be up to 128 bytes in size.</p>
     * 
     * <strong>example:</strong>
     * <p>UserDatatestid-001-****</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The video moderation configurations and the OSS URLs of the output snapshots. To view the OSS URL of the media file, you can log on to the <strong>MPS console</strong> and choose <strong>Media Management</strong> &gt; <strong>Media List</strong> in the left-side navigation pane.</p>
     * <p>The value is a JSON object.</p>
     * <ul>
     * <li><p>OutputFile:</p>
     * <ul>
     * <li>Bucket: the name of the OSS bucket that stores the output file.</li>
     * <li>Location: the OSS region. The OSS region must be the same as the region in which your MPS service is activated.</li>
     * <li>Object: the OSS object to be generated. In the value, {Count} indicates the sequence number of the frame snapshot.</li>
     * </ul>
     * </li>
     * <li><p>StoreVideoTimeline: specifies whether to generate the <code>{jobId}.video_timeline</code> file. The file is stored in OSS. A value of true indicates that the file is generated. A value of false indicates that the file is not generated. If you do not specify this parameter, the file is not generated by default. For more information about the format of the file, see the &quot;VideoTimelines&quot; parameter in the <a href="https://help.aliyun.com/document_detail/91779.html">QueryMediaCensorJobDetail</a> topic.</p>
     * </li>
     * <li><p>SaveType: the output mode. A value of abnormal indicates that snapshots are generated only for illegal frames. A value of all indicates that snapshots are generated for all frames.</p>
     * </li>
     * <li><p>Biztype: the moderation template. If you do not specify this parameter or set the value to common, the default template is used. You can submit a ticket to create a custom moderation template. Then, set this parameter to your user ID to use the custom moderation template.</p>
     * </li>
     * <li><p>Scenes: the moderation scenarios. You can specify the moderation scenarios that you want to use. If you do not specify this parameter, the terrorism and porn moderation scenarios are used by default. Valid values:</p>
     * <ul>
     * <li>porn: pornographic content detection</li>
     * <li>terrorism: terrorist content detection</li>
     * <li>ad: ad violation detection</li>
     * <li>live: undesirable scene detection</li>
     * <li>logo: special logo detection</li>
     * <li>audio: audio anti-spam</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If the input file contains audio tracks and the audio moderation scenario is specified, the audio tracks are moderated. If the input file does not contain audio tracks, you do not need to specify the audio moderation scenario.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Scenes&quot; : [&quot;porn&quot;], &quot;OutputFile&quot;:{&quot;Bucket&quot;: &quot;example-001&quot;,&quot;Location&quot;: &quot;oss-cn-hangzhou&quot;,&quot;Object&quot;: &quot;test/example-{Count}.jpg&quot;},&quot;SaveType&quot; : &quot;abnormal&quot;,&quot;BizType&quot;:&quot;common&quot;}</p>
     */
    @NameInMap("VideoCensorConfig")
    public String videoCensorConfig;

    public static SubmitMediaCensorJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaCensorJobRequest self = new SubmitMediaCensorJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitMediaCensorJobRequest setBarrages(String barrages) {
        this.barrages = barrages;
        return this;
    }
    public String getBarrages() {
        return this.barrages;
    }

    public SubmitMediaCensorJobRequest setCoverImages(String coverImages) {
        this.coverImages = coverImages;
        return this;
    }
    public String getCoverImages() {
        return this.coverImages;
    }

    public SubmitMediaCensorJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitMediaCensorJobRequest setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
        return this;
    }
    public String getExternalUrl() {
        return this.externalUrl;
    }

    public SubmitMediaCensorJobRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitMediaCensorJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SubmitMediaCensorJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitMediaCensorJobRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public SubmitMediaCensorJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitMediaCensorJobRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitMediaCensorJobRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitMediaCensorJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitMediaCensorJobRequest setVideoCensorConfig(String videoCensorConfig) {
        this.videoCensorConfig = videoCensorConfig;
        return this;
    }
    public String getVideoCensorConfig() {
        return this.videoCensorConfig;
    }

}

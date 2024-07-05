// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddMediaRequest extends TeaModel {
    /**
     * <p>The ID of the category to which the media file belongs. The value cannot be negative.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("CateId")
    public Long cateId;

    /**
     * <p>The URL of the thumbnail. To obtain the URL, you can log on to the <strong>MPS console</strong> and choose <strong>Workflows</strong> &gt; <strong>Media Buckets</strong>. Alternatively, you can log on to the <strong>OSS console</strong> and click <strong>My OSS Paths</strong>.</p>
     * <ul>
     * <li>The value can be up to 3,200 bytes in length.</li>
     * <li>The URL complies with RFC 2396 and is encoded in UTF-8, with reserved characters being percent-encoded. For more information, see <a href="https://help.aliyun.com/document_detail/423796.html">URL encoding</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="http://bucket.oss-cn-hangzhou.aliyuncs.com/example/1.png">http://bucket.oss-cn-hangzhou.aliyuncs.com/example/1.png</a></p>
     */
    @NameInMap("CoverURL")
    public String coverURL;

    /**
     * <p>The description of the media file.</p>
     * <ul>
     * <li>The description can be up to 1,024 bytes in length.</li>
     * <li>The value must be encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>A test video</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The path of the input file. You can query the path of the input file in the MPS or OSS console. For more information, see the <strong>Triggering and matching rules for a workflow</strong> section of this topic.</p>
     * <ul>
     * <li>The value can be up to 3,200 bytes in length.</li>
     * <li>The URL complies with RFC 2396 and is encoded in UTF-8, with reserved characters being percent-encoded. For more information, see <a href="https://help.aliyun.com/document_detail/423796.html">URL encoding</a>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://bucket.oss-cn-hangzhou.aliyuncs.com/A/B/C/test.mp4">http://bucket.oss-cn-hangzhou.aliyuncs.com/A/B/C/test.mp4</a></p>
     */
    @NameInMap("FileURL")
    public String fileURL;

    /**
     * <p>Specifies whether to check if the media workflow supports the specified input path. We recommend that you set this parameter to true to prevent errors that may result from invalid paths. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: checks whether the workflow supports the specified input path.</li>
     * <li><strong>false</strong>: does not check whether the workflow supports the specified input path.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("InputUnbind")
    public Boolean inputUnbind;

    /**
     * <p>The ID of the media workflow that you want to run for the media file. To query the ID of a media workflow, you can log on to the MPS console or call the <a href="https://help.aliyun.com/document_detail/44437.html">AddMediaWorkflow</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>07da6c65da7f458997336e0de192****</p>
     */
    @NameInMap("MediaWorkflowId")
    public String mediaWorkflowId;

    /**
     * <p>The custom data of the media workflow.</p>
     * <ul>
     * <li>The value can be up to 1,024 bytes in length.</li>
     * <li>The value must be encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("MediaWorkflowUserData")
    public String mediaWorkflowUserData;

    /**
     * <p>The subtitle settings that are used to overwrite the original settings.</p>
     * <ul>
     * <li>Example 1: Use <code>{&quot;WebVTTSubtitleOverrides&quot;,[{&quot;RefActivityName&quot;:&quot;subtitleNode&quot;,&quot;WebVTTSubtitleURL&quot;:&quot;http://test.oss-cn-hangzhou.aliyuncs.com/example1.vtt&quot;}]}</code> to overwrite the original subtitle settings during HTTP Live Streaming (HLS) packaging.</li>
     * <li>Example 2: Use <code>{&quot;subtitleTransNodeName&quot;:{&quot;InputConfig&quot;:{&quot;Format&quot;:&quot;stl&quot;,&quot;InputFile&quot;:{&quot;URL&quot;:&quot;http://subtitleBucket.oss-cn-hangzhou.aliyuncs.com/package/example/CENG.stl&quot;}}}}</code> to overwrite the original subtitle settings during Dynamic Adaptive Streaming over HTTP (DASH) packaging.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{“subtitleTransNodeName”:{“InputConfig”:{“Format”:”stl”,”InputFile”:{“URL”:”<a href="http://exampleBucket.oss-cn-hangzhou.aliyuncs.com/package/example/CENG.stl%22%7D%7D%7D%7D">http://exampleBucket.oss-cn-hangzhou.aliyuncs.com/package/example/CENG.stl&quot;}}}}</a></p>
     */
    @NameInMap("OverrideParams")
    public String overrideParams;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags that you want to add to the media file.</p>
     * <blockquote>
     * <p>In MPS, each tag that is specified for a media file is independent. You can search for all the media files that have the same tags in the Media Library.</p>
     * </blockquote>
     * <ul>
     * <li>You can specify up to 16 tags for a media file. Separate multiple tags with commas (,).</li>
     * <li>Each tag can be up to 32 bytes in size</li>
     * <li>The value must be encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tag1,tag2</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The title of the media file.</p>
     * <ul>
     * <li>The title can be up to 128 bytes in length.</li>
     * <li>The value must be encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>mytest</p>
     */
    @NameInMap("Title")
    public String title;

    public static AddMediaRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMediaRequest self = new AddMediaRequest();
        return TeaModel.build(map, self);
    }

    public AddMediaRequest setCateId(Long cateId) {
        this.cateId = cateId;
        return this;
    }
    public Long getCateId() {
        return this.cateId;
    }

    public AddMediaRequest setCoverURL(String coverURL) {
        this.coverURL = coverURL;
        return this;
    }
    public String getCoverURL() {
        return this.coverURL;
    }

    public AddMediaRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddMediaRequest setFileURL(String fileURL) {
        this.fileURL = fileURL;
        return this;
    }
    public String getFileURL() {
        return this.fileURL;
    }

    public AddMediaRequest setInputUnbind(Boolean inputUnbind) {
        this.inputUnbind = inputUnbind;
        return this;
    }
    public Boolean getInputUnbind() {
        return this.inputUnbind;
    }

    public AddMediaRequest setMediaWorkflowId(String mediaWorkflowId) {
        this.mediaWorkflowId = mediaWorkflowId;
        return this;
    }
    public String getMediaWorkflowId() {
        return this.mediaWorkflowId;
    }

    public AddMediaRequest setMediaWorkflowUserData(String mediaWorkflowUserData) {
        this.mediaWorkflowUserData = mediaWorkflowUserData;
        return this;
    }
    public String getMediaWorkflowUserData() {
        return this.mediaWorkflowUserData;
    }

    public AddMediaRequest setOverrideParams(String overrideParams) {
        this.overrideParams = overrideParams;
        return this;
    }
    public String getOverrideParams() {
        return this.overrideParams;
    }

    public AddMediaRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddMediaRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddMediaRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddMediaRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddMediaRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public AddMediaRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}

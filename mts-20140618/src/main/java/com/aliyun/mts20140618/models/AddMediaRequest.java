// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddMediaRequest extends TeaModel {
    /**
     * <p>The ID of the category to which the media file belongs. The value cannot be negative.</p>
     */
    @NameInMap("CateId")
    public Long cateId;

    /**
     * <p>The storage location of the thumbnail that you want to specify for the media file. To obtain the URL, you can log on to the **MPS console** and choose **Workflows** > **Media Buckets**. Alternatively, you can log on to the **OSS console** and click **My OSS Paths**.</p>
     * <br>
     * <p>*   The value can be up to 3,200 bytes in length.</p>
     * <p>*   The URL complies with RFC 2396 and is encoded in UTF-8, with reserved characters being percent-encoded.</p>
     */
    @NameInMap("CoverURL")
    public String coverURL;

    /**
     * <p>The description of the media file.</p>
     * <br>
     * <p>*   The description can be up to 1,024 bytes in length.</p>
     * <p>*   The value is encoded in UTF-8.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The path of the input file. You can query the path of the input file in the MPS or OSS console. For more information, see the **Triggering and matching rule for a workflow** section of this topic.</p>
     * <br>
     * <p>*   The value can be up to 3,200 bytes in length.</p>
     * <p>*   The URL complies with RFC 2396 and is encoded in UTF-8, with reserved characters being percent-encoded.</p>
     */
    @NameInMap("FileURL")
    public String fileURL;

    /**
     * <p>Specifies whether to check if the media workflow supports the specified input path. We recommend that you set this parameter to true to avoid errors that may result from invalid paths. Valid values:</p>
     * <br>
     * <p>*   **true**: checks whether the workflow supports the specified input path.</p>
     * <p>*   **false**: does not check whether the workflow supports the specified input path.</p>
     */
    @NameInMap("InputUnbind")
    public Boolean inputUnbind;

    /**
     * <p>The ID of the media workflow that you want to run for the media file. To query the ID of a media workflow, you can log on to the MPS console or call the [AddMediaWorkflow](~~44437~~) operation.</p>
     */
    @NameInMap("MediaWorkflowId")
    public String mediaWorkflowId;

    /**
     * <p>The custom data of the media workflow.</p>
     * <br>
     * <p>*   The value can be up to 1,024 bytes in length.</p>
     * <p>*   The value is encoded in UTF-8.</p>
     */
    @NameInMap("MediaWorkflowUserData")
    public String mediaWorkflowUserData;

    /**
     * <p>The subtitle settings that are used to overwrite the original settings.</p>
     * <br>
     * <p>*   Example 1: Use `{"WebVTTSubtitleOverrides",[{"RefActivityName":"subtitleNode","WebVTTSubtitleURL":"http://test.oss-cn-hangzhou.aliyuncs.com/example1.vtt"}]}` to overwrite the original subtitle settings during HTTP Live Streaming (HLS) packaging.</p>
     * <p>*   Example 2: Use `{"subtitleTransNodeName":{"InputConfig":{"Format":"stl","InputFile":{"URL":"http://subtitleBucket.oss-cn-hangzhou.aliyuncs.com/package/example/CENG.stl"}}}}` to overwrite the original subtitle settings during Dynamic Adaptive Streaming over HTTP (DASH) packaging.</p>
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
     * <p>The tags that you want to add for the media file.</p>
     * <br>
     * <p>>  In MPS, each tag that is specified for a media file is independent. You can search for all the media files that have the same tags in the Media Library.</p>
     * <br>
     * <p>*   Separate multiple tags with commas (,). You can specify up to 16 tags for a media file.</p>
     * <p>*   Each tag can be up to 32 bytes in length.</p>
     * <p>*   The value is encoded in UTF-8.</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The title of the media file.</p>
     * <br>
     * <p>*   The title can be up to 128 bytes in length.</p>
     * <p>*   The value is encoded in UTF-8.</p>
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

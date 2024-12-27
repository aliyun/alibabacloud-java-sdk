// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GenerateVideoPlaylistShrinkRequest extends TeaModel {
    /**
     * <p><strong>If you do not have special requirements, leave this parameter empty.</strong></p>
     * <p>The authorization chain settings. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use authorization chains to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    /**
     * <p>The OSS path of the master playlist.</p>
     * <p>The OSS path must be in the oss://${Bucket}/${Object} format. ${Bucket} specifies the name of the OSS bucket that is in the same region as the current project. ${Object} specifies the full path of the file that is suffixed with .m3u8.</p>
     * <blockquote>
     * <p> If a playlist contains subtitles or multiple outputs, the MasterURI parameter is required and the URI of subtitle files or outputs must be in the directory specified by the MasterURI parameter or its subdirectory.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oss://bucket/object/master.m3u8</p>
     */
    @NameInMap("MasterURI")
    public String masterURI;

    /**
     * <p>The notification settings. To view details, click Notification. For information about the asynchronous notification format, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous message examples</a>.</p>
     */
    @NameInMap("Notification")
    public String notificationShrink;

    /**
     * <p>The overwrite policy when the media playlist exists. Valid values:</p>
     * <ul>
     * <li>overwrite (default): overwrites an existing media playlist.</li>
     * <li>skip-existing: skips generation and retains the existing media playlist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>overwrite</p>
     */
    @NameInMap("OverwritePolicy")
    public String overwritePolicy;

    /**
     * <p>The project name.<a href="~~478153~~"></a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The period of time during which the playlist is generated. Unit: seconds.</p>
     * <ul>
     * <li>If you set this parameter to 0 (default) or leave this parameter empty, a playlist is generated until the end time of the source video.</li>
     * <li>If you set this parameter to a value greater than 0, a playlist is generated for the specified period of time from the start time that you specify.</li>
     * </ul>
     * <blockquote>
     * <p> If you set this parameter to a value that exceeds the end time of a source video, use the default value.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SourceDuration")
    public Float sourceDuration;

    /**
     * <p>The time when the playlist starts to generate. Unit: seconds.</p>
     * <ul>
     * <li>If you set this parameter to 0 (default) or leave this parameter empty, the start time of the source video is used as the time when a playlist starts to generate.</li>
     * <li>If you set this parameter to a value greater than 0, the time when a playlist starts to generate is the specified point in time.</li>
     * </ul>
     * <blockquote>
     * <p> If you use this parameter together with the <strong>SourceDuration</strong> parameter, a playlist can be generated based on the partial content of a source video.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SourceStartTime")
    public Float sourceStartTime;

    /**
     * <p>The subtitle files. By default, this parameter is left empty. Up to two subtitle files are supported.</p>
     */
    @NameInMap("SourceSubtitles")
    public String sourceSubtitlesShrink;

    /**
     * <p>The OSS path of the video file.</p>
     * <p>The OSS path must be in the oss://${Bucket}/${Object} format. ${Bucket} specifies the name of the OSS bucket that is in the same region as the current project. ${Object} specifies the full path of the file that contains the file name extension.</p>
     * <blockquote>
     * <p> Only OSS buckets of the Standard storage class are supported. OSS buckets for which hotlink protection whitelists are configured are not supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://imm-test/testcases/video.mp4</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <p>The <a href="https://help.aliyun.com/document_detail/106678.html">tags</a> that you want to add to a TS file in OSS. You can use tags to manage the lifecycles of TS files in OSS.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;: &quot;value1&quot;, &quot;key2&quot;: &quot;value2&quot;}</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>The live transcoding playlists. Up to 6 playlists are supported. Each output corresponds to at most one video media playlist and one or more subtitle media playlists.</p>
     * <blockquote>
     * <p> If more than one output is configured, the <strong>MasterURI</strong> parameter is required.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Targets")
    public String targetsShrink;

    /**
     * <p>The custom user information, which is returned in asynchronous notifications to help you handle the notifications in the system. The maximum length of a notification is 2048 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ID&quot;: &quot;user1&quot;,&quot;Name&quot;: &quot;test-user1&quot;,&quot;Avatar&quot;: &quot;<a href="http://example.com?id=user1%22%7D">http://example.com?id=user1&quot;}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static GenerateVideoPlaylistShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateVideoPlaylistShrinkRequest self = new GenerateVideoPlaylistShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GenerateVideoPlaylistShrinkRequest setCredentialConfigShrink(String credentialConfigShrink) {
        this.credentialConfigShrink = credentialConfigShrink;
        return this;
    }
    public String getCredentialConfigShrink() {
        return this.credentialConfigShrink;
    }

    public GenerateVideoPlaylistShrinkRequest setMasterURI(String masterURI) {
        this.masterURI = masterURI;
        return this;
    }
    public String getMasterURI() {
        return this.masterURI;
    }

    public GenerateVideoPlaylistShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public GenerateVideoPlaylistShrinkRequest setOverwritePolicy(String overwritePolicy) {
        this.overwritePolicy = overwritePolicy;
        return this;
    }
    public String getOverwritePolicy() {
        return this.overwritePolicy;
    }

    public GenerateVideoPlaylistShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GenerateVideoPlaylistShrinkRequest setSourceDuration(Float sourceDuration) {
        this.sourceDuration = sourceDuration;
        return this;
    }
    public Float getSourceDuration() {
        return this.sourceDuration;
    }

    public GenerateVideoPlaylistShrinkRequest setSourceStartTime(Float sourceStartTime) {
        this.sourceStartTime = sourceStartTime;
        return this;
    }
    public Float getSourceStartTime() {
        return this.sourceStartTime;
    }

    public GenerateVideoPlaylistShrinkRequest setSourceSubtitlesShrink(String sourceSubtitlesShrink) {
        this.sourceSubtitlesShrink = sourceSubtitlesShrink;
        return this;
    }
    public String getSourceSubtitlesShrink() {
        return this.sourceSubtitlesShrink;
    }

    public GenerateVideoPlaylistShrinkRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public GenerateVideoPlaylistShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public GenerateVideoPlaylistShrinkRequest setTargetsShrink(String targetsShrink) {
        this.targetsShrink = targetsShrink;
        return this;
    }
    public String getTargetsShrink() {
        return this.targetsShrink;
    }

    public GenerateVideoPlaylistShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}

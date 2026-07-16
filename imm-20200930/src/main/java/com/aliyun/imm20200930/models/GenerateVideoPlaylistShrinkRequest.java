// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GenerateVideoPlaylistShrinkRequest extends TeaModel {
    /**
     * <p><strong>Leave this parameter empty unless you have specific requirements.</strong></p>
     * <p>The China authorization configuration. This parameter is optional. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use Chinese authorization to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    /**
     * <p>The OSS URI of the Master Playlist.</p>
     * <p>The OSS URI follows the format oss://${Bucket}/${Object}, where ${Bucket} is the name of the OSS bucket in the same region as the current project, and ${Object} is the full path of the file with the &quot;.m3u8&quot; extension.</p>
     * <blockquote>
     * <p>If the playlist has subtitle input or multiple Target outputs, MasterURI is required. The subtitle URI or Target URI must be in the same directory as or a subdirectory of MasterURI.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-object/master.m3u8</p>
     */
    @NameInMap("MasterURI")
    public String masterURI;

    /**
     * <p>The message notification configuration. Click Notification for details. For the format of asynchronous notification messages, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message format</a>.</p>
     */
    @NameInMap("Notification")
    public String notificationShrink;

    /**
     * <p>The overwrite policy when a Media Playlist already exists. Valid values:</p>
     * <ul>
     * <li>overwrite (default): overwrites the existing Media Playlist.</li>
     * <li>skip-existing: skips generation and retains the existing Media Playlist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>overwrite</p>
     */
    @NameInMap("OverwritePolicy")
    public String overwritePolicy;

    /**
     * <p>The project name. For information about how to obtain the project name, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The duration for generating the playlist. Unit: seconds. Valid values:</p>
     * <ul>
     * <li><p>0 (default) or empty: continues until the end of the source video.</p>
     * </li>
     * <li><p>A value greater than 0: continues for the specified duration from the start time of the playlist.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If the time point corresponding to the specified parameter exceeds the end of the source video, the default value is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SourceDuration")
    public Float sourceDuration;

    /**
     * <p>The start time for generating the playlist. Unit: seconds. Valid values:</p>
     * <ul>
     * <li><p>0 (default) or empty: starts from the beginning of the source video.</p>
     * </li>
     * <li><p>A value greater than 0: starts from the specified time point in the source video.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can set this parameter together with <strong>SourceDuration</strong> to generate a playlist for a specific portion of the source video.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SourceStartTime")
    public Float sourceStartTime;

    /**
     * <p>The list of subtitles to add. This parameter is empty by default. A maximum of two subtitles are supported.</p>
     */
    @NameInMap("SourceSubtitles")
    public String sourceSubtitlesShrink;

    /**
     * <p>The OSS URI of the video.</p>
     * <p>The OSS URI follows the format oss://${Bucket}/${Object}, where ${Bucket} is the name of the OSS bucket in the same region as the current project, and ${Object} is the full path of the file including the file name extension.</p>
     * <blockquote>
     * <p>Only OSS buckets with Standard storage class are supported.
     * Buckets with hotlink protection whitelist configured are not supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-source-object/video.mp4</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <p>The OSS object <a href="https://help.aliyun.com/document_detail/106678.html">tags</a> to add to the generated TS files. You can use tags to control the lifecycle of OSS files.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;: &quot;value1&quot;, &quot;key2&quot;: &quot;value2&quot;}</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>The array of just-in-time transcoding playlists. The maximum array length is 6. Each Target corresponds to at most one video Media Playlist and one or more subtitle Media Playlists.</p>
     * <blockquote>
     * <p>If more than one Target is configured, the <strong>MasterURI</strong> parameter must not be empty.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Targets")
    public String targetsShrink;

    /**
     * <p>The custom information, which is returned in asynchronous message notifications. This allows you to associate message notifications with specific processes in your system. Maximum length: 2,048 bytes.</p>
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

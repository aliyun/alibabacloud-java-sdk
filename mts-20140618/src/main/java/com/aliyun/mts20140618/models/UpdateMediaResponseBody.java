// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateMediaResponseBody extends TeaModel {
    /**
     * <p>The detailed information about the media file.</p>
     */
    @NameInMap("Media")
    public UpdateMediaResponseBodyMedia media;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateMediaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaResponseBody self = new UpdateMediaResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMediaResponseBody setMedia(UpdateMediaResponseBodyMedia media) {
        this.media = media;
        return this;
    }
    public UpdateMediaResponseBodyMedia getMedia() {
        return this.media;
    }

    public UpdateMediaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateMediaResponseBodyMediaFile extends TeaModel {
        /**
         * <p>The status of the input file. Valid values:</p>
         * <br>
         * <p>*   **Normal**: The input file is normal.</p>
         * <p>*   **Deleted**: The input file is deleted.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The URL of the input file.</p>
         */
        @NameInMap("URL")
        public String URL;

        public static UpdateMediaResponseBodyMediaFile build(java.util.Map<String, ?> map) throws Exception {
            UpdateMediaResponseBodyMediaFile self = new UpdateMediaResponseBodyMediaFile();
            return TeaModel.build(map, self);
        }

        public UpdateMediaResponseBodyMediaFile setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateMediaResponseBodyMediaFile setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

    public static class UpdateMediaResponseBodyMediaRunIdList extends TeaModel {
        @NameInMap("RunId")
        public java.util.List<String> runId;

        public static UpdateMediaResponseBodyMediaRunIdList build(java.util.Map<String, ?> map) throws Exception {
            UpdateMediaResponseBodyMediaRunIdList self = new UpdateMediaResponseBodyMediaRunIdList();
            return TeaModel.build(map, self);
        }

        public UpdateMediaResponseBodyMediaRunIdList setRunId(java.util.List<String> runId) {
            this.runId = runId;
            return this;
        }
        public java.util.List<String> getRunId() {
            return this.runId;
        }

    }

    public static class UpdateMediaResponseBodyMediaTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<String> tag;

        public static UpdateMediaResponseBodyMediaTags build(java.util.Map<String, ?> map) throws Exception {
            UpdateMediaResponseBodyMediaTags self = new UpdateMediaResponseBodyMediaTags();
            return TeaModel.build(map, self);
        }

        public UpdateMediaResponseBodyMediaTags setTag(java.util.List<String> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<String> getTag() {
            return this.tag;
        }

    }

    public static class UpdateMediaResponseBodyMedia extends TeaModel {
        /**
         * <p>The bitrate of the media file.</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The ID of the category to which the media file belongs.</p>
         */
        @NameInMap("CateId")
        public Long cateId;

        /**
         * <p>The review status of the video. Valid values:</p>
         * <br>
         * <p>*   **Initiated**: The media file is uploaded but not reviewed.</p>
         * <p>*   **Pass**: The media file is uploaded and passes the review.</p>
         */
        @NameInMap("CensorState")
        public String censorState;

        /**
         * <p>The storage location of the media thumbnail.</p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <p>The time when the media file was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the media file.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The duration of the media file.</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The information about the input file.</p>
         */
        @NameInMap("File")
        public UpdateMediaResponseBodyMediaFile file;

        /**
         * <p>The format of the media file. Valid values: mov, mp4, m4a, 3gp, 3g2, and mj2.</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The frame rate of the media file.</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The height of the media file.</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The ID of the media file.</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The publishing status of the media file. Valid values:</p>
         * <br>
         * <p>*   **Initiated**: The media file is in the initial state.</p>
         * <p>*   **UnPublish**: The media file has not been published, and the playback permission on the OSS object is Private.</p>
         * <p>*   **Published**: The media file has been published, and the playback permission on the OSS object is Default.</p>
         * <p>*   **Deleted**: The media file is deleted.</p>
         */
        @NameInMap("PublishState")
        public String publishState;

        /**
         * <p>The IDs of the media workflow execution instances.</p>
         */
        @NameInMap("RunIdList")
        public UpdateMediaResponseBodyMediaRunIdList runIdList;

        /**
         * <p>The size of the media file.</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <p>The tags of the media file.</p>
         */
        @NameInMap("Tags")
        public UpdateMediaResponseBodyMediaTags tags;

        /**
         * <p>The title of the media file.</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The width of the media file.</p>
         */
        @NameInMap("Width")
        public String width;

        public static UpdateMediaResponseBodyMedia build(java.util.Map<String, ?> map) throws Exception {
            UpdateMediaResponseBodyMedia self = new UpdateMediaResponseBodyMedia();
            return TeaModel.build(map, self);
        }

        public UpdateMediaResponseBodyMedia setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public UpdateMediaResponseBodyMedia setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public UpdateMediaResponseBodyMedia setCensorState(String censorState) {
            this.censorState = censorState;
            return this;
        }
        public String getCensorState() {
            return this.censorState;
        }

        public UpdateMediaResponseBodyMedia setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public UpdateMediaResponseBodyMedia setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public UpdateMediaResponseBodyMedia setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateMediaResponseBodyMedia setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public UpdateMediaResponseBodyMedia setFile(UpdateMediaResponseBodyMediaFile file) {
            this.file = file;
            return this;
        }
        public UpdateMediaResponseBodyMediaFile getFile() {
            return this.file;
        }

        public UpdateMediaResponseBodyMedia setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public UpdateMediaResponseBodyMedia setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public UpdateMediaResponseBodyMedia setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public UpdateMediaResponseBodyMedia setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public UpdateMediaResponseBodyMedia setPublishState(String publishState) {
            this.publishState = publishState;
            return this;
        }
        public String getPublishState() {
            return this.publishState;
        }

        public UpdateMediaResponseBodyMedia setRunIdList(UpdateMediaResponseBodyMediaRunIdList runIdList) {
            this.runIdList = runIdList;
            return this;
        }
        public UpdateMediaResponseBodyMediaRunIdList getRunIdList() {
            return this.runIdList;
        }

        public UpdateMediaResponseBodyMedia setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public UpdateMediaResponseBodyMedia setTags(UpdateMediaResponseBodyMediaTags tags) {
            this.tags = tags;
            return this;
        }
        public UpdateMediaResponseBodyMediaTags getTags() {
            return this.tags;
        }

        public UpdateMediaResponseBodyMedia setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public UpdateMediaResponseBodyMedia setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

}

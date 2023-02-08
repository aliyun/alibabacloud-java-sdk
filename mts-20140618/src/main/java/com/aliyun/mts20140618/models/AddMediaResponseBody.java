// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddMediaResponseBody extends TeaModel {
    /**
     * <p>The detailed information about the media file.</p>
     */
    @NameInMap("Media")
    public AddMediaResponseBodyMedia media;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddMediaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMediaResponseBody self = new AddMediaResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMediaResponseBody setMedia(AddMediaResponseBodyMedia media) {
        this.media = media;
        return this;
    }
    public AddMediaResponseBodyMedia getMedia() {
        return this.media;
    }

    public AddMediaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddMediaResponseBodyMediaFile extends TeaModel {
        /**
         * <p>The status of the input file. The default value is **Normal**.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The URL of the input file.</p>
         */
        @NameInMap("URL")
        public String URL;

        public static AddMediaResponseBodyMediaFile build(java.util.Map<String, ?> map) throws Exception {
            AddMediaResponseBodyMediaFile self = new AddMediaResponseBodyMediaFile();
            return TeaModel.build(map, self);
        }

        public AddMediaResponseBodyMediaFile setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public AddMediaResponseBodyMediaFile setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

    public static class AddMediaResponseBodyMediaRunIdList extends TeaModel {
        @NameInMap("RunId")
        public java.util.List<String> runId;

        public static AddMediaResponseBodyMediaRunIdList build(java.util.Map<String, ?> map) throws Exception {
            AddMediaResponseBodyMediaRunIdList self = new AddMediaResponseBodyMediaRunIdList();
            return TeaModel.build(map, self);
        }

        public AddMediaResponseBodyMediaRunIdList setRunId(java.util.List<String> runId) {
            this.runId = runId;
            return this;
        }
        public java.util.List<String> getRunId() {
            return this.runId;
        }

    }

    public static class AddMediaResponseBodyMediaTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<String> tag;

        public static AddMediaResponseBodyMediaTags build(java.util.Map<String, ?> map) throws Exception {
            AddMediaResponseBodyMediaTags self = new AddMediaResponseBodyMediaTags();
            return TeaModel.build(map, self);
        }

        public AddMediaResponseBodyMediaTags setTag(java.util.List<String> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<String> getTag() {
            return this.tag;
        }

    }

    public static class AddMediaResponseBodyMedia extends TeaModel {
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
         * <p>The description of the media file. The value is no longer than 1,024 bytes.</p>
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
        public AddMediaResponseBodyMediaFile file;

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
         */
        @NameInMap("PublishState")
        public String publishState;

        /**
         * <p>The IDs of the executed workflow execution instances. The IDs are separated by commas (,).</p>
         */
        @NameInMap("RunIdList")
        public AddMediaResponseBodyMediaRunIdList runIdList;

        /**
         * <p>The size of the media file.</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <p>The tags of the media file.</p>
         */
        @NameInMap("Tags")
        public AddMediaResponseBodyMediaTags tags;

        /**
         * <p>The title of the media file. The title is no longer than 128 bytes.</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The width of the media file.</p>
         */
        @NameInMap("Width")
        public String width;

        public static AddMediaResponseBodyMedia build(java.util.Map<String, ?> map) throws Exception {
            AddMediaResponseBodyMedia self = new AddMediaResponseBodyMedia();
            return TeaModel.build(map, self);
        }

        public AddMediaResponseBodyMedia setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public AddMediaResponseBodyMedia setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public AddMediaResponseBodyMedia setCensorState(String censorState) {
            this.censorState = censorState;
            return this;
        }
        public String getCensorState() {
            return this.censorState;
        }

        public AddMediaResponseBodyMedia setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public AddMediaResponseBodyMedia setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public AddMediaResponseBodyMedia setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AddMediaResponseBodyMedia setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public AddMediaResponseBodyMedia setFile(AddMediaResponseBodyMediaFile file) {
            this.file = file;
            return this;
        }
        public AddMediaResponseBodyMediaFile getFile() {
            return this.file;
        }

        public AddMediaResponseBodyMedia setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public AddMediaResponseBodyMedia setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public AddMediaResponseBodyMedia setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public AddMediaResponseBodyMedia setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public AddMediaResponseBodyMedia setPublishState(String publishState) {
            this.publishState = publishState;
            return this;
        }
        public String getPublishState() {
            return this.publishState;
        }

        public AddMediaResponseBodyMedia setRunIdList(AddMediaResponseBodyMediaRunIdList runIdList) {
            this.runIdList = runIdList;
            return this;
        }
        public AddMediaResponseBodyMediaRunIdList getRunIdList() {
            return this.runIdList;
        }

        public AddMediaResponseBodyMedia setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public AddMediaResponseBodyMedia setTags(AddMediaResponseBodyMediaTags tags) {
            this.tags = tags;
            return this;
        }
        public AddMediaResponseBodyMediaTags getTags() {
            return this.tags;
        }

        public AddMediaResponseBodyMedia setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public AddMediaResponseBodyMedia setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

}

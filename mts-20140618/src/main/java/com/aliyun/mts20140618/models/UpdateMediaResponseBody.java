// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateMediaResponseBody extends TeaModel {
    /**
     * <p>The information about the media file.</p>
     */
    @NameInMap("Media")
    public UpdateMediaResponseBodyMedia media;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6A88246F-C91F-42BD-BABE-DB0DF993F960</p>
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
         * <p>The state of the input file. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: The input file is normal.</li>
         * <li><strong>Deleted</strong>: The input file is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The name of the OSS bucket in which the input media file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com//example-****.mp4">http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com//example-****.mp4</a></p>
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
         * 
         * <strong>example:</strong>
         * <p>2659.326</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The ID of the category to which the media file belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CateId")
        public Long cateId;

        /**
         * <p>The review state of the media file. Valid values:</p>
         * <ul>
         * <li><strong>Initiated</strong>: The media file is uploaded but not reviewed.</li>
         * <li><strong>Pass</strong>: The media file is uploaded and passes the review.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Initiated</p>
         */
        @NameInMap("CensorState")
        public String censorState;

        /**
         * <p>The URL of the thumbnail.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example-bucket-****.oss-cn-shanghai.aliyuncs.com/example-****.jpg">http://example-bucket-****.oss-cn-shanghai.aliyuncs.com/example-****.jpg</a></p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <p>The time when the media file was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-09-14T08:30:33Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the media file.</p>
         * 
         * <strong>example:</strong>
         * <p>example description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The duration of the media file.</p>
         * 
         * <strong>example:</strong>
         * <p>7.965000</p>
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
         * 
         * <strong>example:</strong>
         * <p>mov</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The frame rate of the media file.</p>
         * 
         * <strong>example:</strong>
         * <p>25.0</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The height of the media file.</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The ID of the media file.</p>
         * 
         * <strong>example:</strong>
         * <p>3e1cd21131a94525be55acf65888****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The publishing state of the media file. Valid values:</p>
         * <ul>
         * <li><strong>Initiated</strong>: The media file is in the initial state.</li>
         * <li><strong>UnPublish</strong>: The media file has not been published, and the playback permission on the OSS object is Private.</li>
         * <li><strong>Published</strong>: The media file has been published, and the playback permission on the OSS object is Default.</li>
         * <li><strong>Deleted</strong>: The media file is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Published</p>
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
         * 
         * <strong>example:</strong>
         * <p>2647692</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <p>The information about the tags.</p>
         */
        @NameInMap("Tags")
        public UpdateMediaResponseBodyMediaTags tags;

        /**
         * <p>The title of the media file.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The width of the media file.</p>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
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

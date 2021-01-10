// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateMediaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Media")
    public UpdateMediaResponseBodyMedia media;

    public static UpdateMediaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaResponseBody self = new UpdateMediaResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMediaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMediaResponseBody setMedia(UpdateMediaResponseBodyMedia media) {
        this.media = media;
        return this;
    }
    public UpdateMediaResponseBodyMedia getMedia() {
        return this.media;
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

    public static class UpdateMediaResponseBodyMediaFile extends TeaModel {
        @NameInMap("State")
        public String state;

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

    public static class UpdateMediaResponseBodyMedia extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("Height")
        public String height;

        @NameInMap("CensorState")
        public String censorState;

        @NameInMap("Tags")
        public UpdateMediaResponseBodyMediaTags tags;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("File")
        public UpdateMediaResponseBodyMediaFile file;

        @NameInMap("PublishState")
        public String publishState;

        @NameInMap("Description")
        public String description;

        @NameInMap("Width")
        public String width;

        @NameInMap("Size")
        public String size;

        @NameInMap("CoverURL")
        public String coverURL;

        @NameInMap("RunIdList")
        public UpdateMediaResponseBodyMediaRunIdList runIdList;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Title")
        public String title;

        @NameInMap("Format")
        public String format;

        public static UpdateMediaResponseBodyMedia build(java.util.Map<String, ?> map) throws Exception {
            UpdateMediaResponseBodyMedia self = new UpdateMediaResponseBodyMedia();
            return TeaModel.build(map, self);
        }

        public UpdateMediaResponseBodyMedia setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public UpdateMediaResponseBodyMedia setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public UpdateMediaResponseBodyMedia setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public UpdateMediaResponseBodyMedia setCensorState(String censorState) {
            this.censorState = censorState;
            return this;
        }
        public String getCensorState() {
            return this.censorState;
        }

        public UpdateMediaResponseBodyMedia setTags(UpdateMediaResponseBodyMediaTags tags) {
            this.tags = tags;
            return this;
        }
        public UpdateMediaResponseBodyMediaTags getTags() {
            return this.tags;
        }

        public UpdateMediaResponseBodyMedia setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public UpdateMediaResponseBodyMedia setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public UpdateMediaResponseBodyMedia setFile(UpdateMediaResponseBodyMediaFile file) {
            this.file = file;
            return this;
        }
        public UpdateMediaResponseBodyMediaFile getFile() {
            return this.file;
        }

        public UpdateMediaResponseBodyMedia setPublishState(String publishState) {
            this.publishState = publishState;
            return this;
        }
        public String getPublishState() {
            return this.publishState;
        }

        public UpdateMediaResponseBodyMedia setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateMediaResponseBodyMedia setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public UpdateMediaResponseBodyMedia setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public UpdateMediaResponseBodyMedia setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public UpdateMediaResponseBodyMedia setRunIdList(UpdateMediaResponseBodyMediaRunIdList runIdList) {
            this.runIdList = runIdList;
            return this;
        }
        public UpdateMediaResponseBodyMediaRunIdList getRunIdList() {
            return this.runIdList;
        }

        public UpdateMediaResponseBodyMedia setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public UpdateMediaResponseBodyMedia setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public UpdateMediaResponseBodyMedia setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public UpdateMediaResponseBodyMedia setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class UpdateMediaResponseBody extends TeaModel {
    @NameInMap("Media")
    public UpdateMediaResponseBodyMedia media;

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
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("CensorState")
        public String censorState;

        @NameInMap("CoverURL")
        public String coverURL;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("File")
        public UpdateMediaResponseBodyMediaFile file;

        @NameInMap("Format")
        public String format;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Height")
        public String height;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("PublishState")
        public String publishState;

        @NameInMap("RunIdList")
        public UpdateMediaResponseBodyMediaRunIdList runIdList;

        @NameInMap("Size")
        public String size;

        @NameInMap("Tags")
        public UpdateMediaResponseBodyMediaTags tags;

        @NameInMap("Title")
        public String title;

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

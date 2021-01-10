// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddMediaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Media")
    public AddMediaResponseBodyMedia media;

    public static AddMediaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMediaResponseBody self = new AddMediaResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMediaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddMediaResponseBody setMedia(AddMediaResponseBodyMedia media) {
        this.media = media;
        return this;
    }
    public AddMediaResponseBodyMedia getMedia() {
        return this.media;
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

    public static class AddMediaResponseBodyMediaFile extends TeaModel {
        @NameInMap("State")
        public String state;

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

    public static class AddMediaResponseBodyMedia extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("Height")
        public String height;

        @NameInMap("CensorState")
        public String censorState;

        @NameInMap("Tags")
        public AddMediaResponseBodyMediaTags tags;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("File")
        public AddMediaResponseBodyMediaFile file;

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
        public AddMediaResponseBodyMediaRunIdList runIdList;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Title")
        public String title;

        @NameInMap("Format")
        public String format;

        public static AddMediaResponseBodyMedia build(java.util.Map<String, ?> map) throws Exception {
            AddMediaResponseBodyMedia self = new AddMediaResponseBodyMedia();
            return TeaModel.build(map, self);
        }

        public AddMediaResponseBodyMedia setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public AddMediaResponseBodyMedia setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public AddMediaResponseBodyMedia setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public AddMediaResponseBodyMedia setCensorState(String censorState) {
            this.censorState = censorState;
            return this;
        }
        public String getCensorState() {
            return this.censorState;
        }

        public AddMediaResponseBodyMedia setTags(AddMediaResponseBodyMediaTags tags) {
            this.tags = tags;
            return this;
        }
        public AddMediaResponseBodyMediaTags getTags() {
            return this.tags;
        }

        public AddMediaResponseBodyMedia setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public AddMediaResponseBodyMedia setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public AddMediaResponseBodyMedia setFile(AddMediaResponseBodyMediaFile file) {
            this.file = file;
            return this;
        }
        public AddMediaResponseBodyMediaFile getFile() {
            return this.file;
        }

        public AddMediaResponseBodyMedia setPublishState(String publishState) {
            this.publishState = publishState;
            return this;
        }
        public String getPublishState() {
            return this.publishState;
        }

        public AddMediaResponseBodyMedia setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AddMediaResponseBodyMedia setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public AddMediaResponseBodyMedia setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public AddMediaResponseBodyMedia setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public AddMediaResponseBodyMedia setRunIdList(AddMediaResponseBodyMediaRunIdList runIdList) {
            this.runIdList = runIdList;
            return this;
        }
        public AddMediaResponseBodyMediaRunIdList getRunIdList() {
            return this.runIdList;
        }

        public AddMediaResponseBodyMedia setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public AddMediaResponseBodyMedia setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public AddMediaResponseBodyMedia setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public AddMediaResponseBodyMedia setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListMediaResponseBody extends TeaModel {
    @NameInMap("MediaList")
    public ListMediaResponseBodyMediaList mediaList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    public static ListMediaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMediaResponseBody self = new ListMediaResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMediaResponseBody setMediaList(ListMediaResponseBodyMediaList mediaList) {
        this.mediaList = mediaList;
        return this;
    }
    public ListMediaResponseBodyMediaList getMediaList() {
        return this.mediaList;
    }

    public ListMediaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMediaResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public static class ListMediaResponseBodyMediaListMediaTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<String> tag;

        public static ListMediaResponseBodyMediaListMediaTags build(java.util.Map<String, ?> map) throws Exception {
            ListMediaResponseBodyMediaListMediaTags self = new ListMediaResponseBodyMediaListMediaTags();
            return TeaModel.build(map, self);
        }

        public ListMediaResponseBodyMediaListMediaTags setTag(java.util.List<String> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<String> getTag() {
            return this.tag;
        }

    }

    public static class ListMediaResponseBodyMediaListMediaFile extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("URL")
        public String URL;

        public static ListMediaResponseBodyMediaListMediaFile build(java.util.Map<String, ?> map) throws Exception {
            ListMediaResponseBodyMediaListMediaFile self = new ListMediaResponseBodyMediaListMediaFile();
            return TeaModel.build(map, self);
        }

        public ListMediaResponseBodyMediaListMediaFile setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListMediaResponseBodyMediaListMediaFile setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

    public static class ListMediaResponseBodyMediaListMediaRunIdList extends TeaModel {
        @NameInMap("RunId")
        public java.util.List<String> runId;

        public static ListMediaResponseBodyMediaListMediaRunIdList build(java.util.Map<String, ?> map) throws Exception {
            ListMediaResponseBodyMediaListMediaRunIdList self = new ListMediaResponseBodyMediaListMediaRunIdList();
            return TeaModel.build(map, self);
        }

        public ListMediaResponseBodyMediaListMediaRunIdList setRunId(java.util.List<String> runId) {
            this.runId = runId;
            return this;
        }
        public java.util.List<String> getRunId() {
            return this.runId;
        }

    }

    public static class ListMediaResponseBodyMediaListMedia extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("Height")
        public String height;

        @NameInMap("CensorState")
        public String censorState;

        @NameInMap("Tags")
        public ListMediaResponseBodyMediaListMediaTags tags;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("File")
        public ListMediaResponseBodyMediaListMediaFile file;

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
        public ListMediaResponseBodyMediaListMediaRunIdList runIdList;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Title")
        public String title;

        @NameInMap("Format")
        public String format;

        public static ListMediaResponseBodyMediaListMedia build(java.util.Map<String, ?> map) throws Exception {
            ListMediaResponseBodyMediaListMedia self = new ListMediaResponseBodyMediaListMedia();
            return TeaModel.build(map, self);
        }

        public ListMediaResponseBodyMediaListMedia setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListMediaResponseBodyMediaListMedia setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public ListMediaResponseBodyMediaListMedia setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public ListMediaResponseBodyMediaListMedia setCensorState(String censorState) {
            this.censorState = censorState;
            return this;
        }
        public String getCensorState() {
            return this.censorState;
        }

        public ListMediaResponseBodyMediaListMedia setTags(ListMediaResponseBodyMediaListMediaTags tags) {
            this.tags = tags;
            return this;
        }
        public ListMediaResponseBodyMediaListMediaTags getTags() {
            return this.tags;
        }

        public ListMediaResponseBodyMediaListMedia setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public ListMediaResponseBodyMediaListMedia setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public ListMediaResponseBodyMediaListMedia setFile(ListMediaResponseBodyMediaListMediaFile file) {
            this.file = file;
            return this;
        }
        public ListMediaResponseBodyMediaListMediaFile getFile() {
            return this.file;
        }

        public ListMediaResponseBodyMediaListMedia setPublishState(String publishState) {
            this.publishState = publishState;
            return this;
        }
        public String getPublishState() {
            return this.publishState;
        }

        public ListMediaResponseBodyMediaListMedia setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMediaResponseBodyMediaListMedia setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public ListMediaResponseBodyMediaListMedia setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public ListMediaResponseBodyMediaListMedia setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public ListMediaResponseBodyMediaListMedia setRunIdList(ListMediaResponseBodyMediaListMediaRunIdList runIdList) {
            this.runIdList = runIdList;
            return this;
        }
        public ListMediaResponseBodyMediaListMediaRunIdList getRunIdList() {
            return this.runIdList;
        }

        public ListMediaResponseBodyMediaListMedia setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListMediaResponseBodyMediaListMedia setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public ListMediaResponseBodyMediaListMedia setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListMediaResponseBodyMediaListMedia setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class ListMediaResponseBodyMediaList extends TeaModel {
        @NameInMap("Media")
        public java.util.List<ListMediaResponseBodyMediaListMedia> media;

        public static ListMediaResponseBodyMediaList build(java.util.Map<String, ?> map) throws Exception {
            ListMediaResponseBodyMediaList self = new ListMediaResponseBodyMediaList();
            return TeaModel.build(map, self);
        }

        public ListMediaResponseBodyMediaList setMedia(java.util.List<ListMediaResponseBodyMediaListMedia> media) {
            this.media = media;
            return this;
        }
        public java.util.List<ListMediaResponseBodyMediaListMedia> getMedia() {
            return this.media;
        }

    }

}

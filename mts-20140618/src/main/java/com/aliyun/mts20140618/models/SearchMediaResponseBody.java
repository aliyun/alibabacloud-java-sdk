// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SearchMediaResponseBody extends TeaModel {
    @NameInMap("MediaList")
    public SearchMediaResponseBodyMediaList mediaList;

    @NameInMap("TotalNum")
    public Long totalNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    public static SearchMediaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaResponseBody self = new SearchMediaResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchMediaResponseBody setMediaList(SearchMediaResponseBodyMediaList mediaList) {
        this.mediaList = mediaList;
        return this;
    }
    public SearchMediaResponseBodyMediaList getMediaList() {
        return this.mediaList;
    }

    public SearchMediaResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public SearchMediaResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public SearchMediaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchMediaResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public static class SearchMediaResponseBodyMediaListMediaTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<String> tag;

        public static SearchMediaResponseBodyMediaListMediaTags build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaListMediaTags self = new SearchMediaResponseBodyMediaListMediaTags();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaListMediaTags setTag(java.util.List<String> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<String> getTag() {
            return this.tag;
        }

    }

    public static class SearchMediaResponseBodyMediaListMediaFile extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("URL")
        public String URL;

        public static SearchMediaResponseBodyMediaListMediaFile build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaListMediaFile self = new SearchMediaResponseBodyMediaListMediaFile();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaListMediaFile setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public SearchMediaResponseBodyMediaListMediaFile setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

    public static class SearchMediaResponseBodyMediaListMediaRunIdList extends TeaModel {
        @NameInMap("RunId")
        public java.util.List<String> runId;

        public static SearchMediaResponseBodyMediaListMediaRunIdList build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaListMediaRunIdList self = new SearchMediaResponseBodyMediaListMediaRunIdList();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaListMediaRunIdList setRunId(java.util.List<String> runId) {
            this.runId = runId;
            return this;
        }
        public java.util.List<String> getRunId() {
            return this.runId;
        }

    }

    public static class SearchMediaResponseBodyMediaListMedia extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("Height")
        public String height;

        @NameInMap("Tags")
        public SearchMediaResponseBodyMediaListMediaTags tags;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("File")
        public SearchMediaResponseBodyMediaListMediaFile file;

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
        public SearchMediaResponseBodyMediaListMediaRunIdList runIdList;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Title")
        public String title;

        @NameInMap("Format")
        public String format;

        public static SearchMediaResponseBodyMediaListMedia build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaListMedia self = new SearchMediaResponseBodyMediaListMedia();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaListMedia setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SearchMediaResponseBodyMediaListMedia setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public SearchMediaResponseBodyMediaListMedia setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SearchMediaResponseBodyMediaListMedia setTags(SearchMediaResponseBodyMediaListMediaTags tags) {
            this.tags = tags;
            return this;
        }
        public SearchMediaResponseBodyMediaListMediaTags getTags() {
            return this.tags;
        }

        public SearchMediaResponseBodyMediaListMedia setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SearchMediaResponseBodyMediaListMedia setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public SearchMediaResponseBodyMediaListMedia setFile(SearchMediaResponseBodyMediaListMediaFile file) {
            this.file = file;
            return this;
        }
        public SearchMediaResponseBodyMediaListMediaFile getFile() {
            return this.file;
        }

        public SearchMediaResponseBodyMediaListMedia setPublishState(String publishState) {
            this.publishState = publishState;
            return this;
        }
        public String getPublishState() {
            return this.publishState;
        }

        public SearchMediaResponseBodyMediaListMedia setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SearchMediaResponseBodyMediaListMedia setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public SearchMediaResponseBodyMediaListMedia setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public SearchMediaResponseBodyMediaListMedia setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public SearchMediaResponseBodyMediaListMedia setRunIdList(SearchMediaResponseBodyMediaListMediaRunIdList runIdList) {
            this.runIdList = runIdList;
            return this;
        }
        public SearchMediaResponseBodyMediaListMediaRunIdList getRunIdList() {
            return this.runIdList;
        }

        public SearchMediaResponseBodyMediaListMedia setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SearchMediaResponseBodyMediaListMedia setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public SearchMediaResponseBodyMediaListMedia setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public SearchMediaResponseBodyMediaListMedia setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class SearchMediaResponseBodyMediaList extends TeaModel {
        @NameInMap("Media")
        public java.util.List<SearchMediaResponseBodyMediaListMedia> media;

        public static SearchMediaResponseBodyMediaList build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaList self = new SearchMediaResponseBodyMediaList();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaList setMedia(java.util.List<SearchMediaResponseBodyMediaListMedia> media) {
            this.media = media;
            return this;
        }
        public java.util.List<SearchMediaResponseBodyMediaListMedia> getMedia() {
            return this.media;
        }

    }

}

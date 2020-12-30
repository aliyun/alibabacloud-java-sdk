// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class FetchAlbumTagPhotosResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<FetchAlbumTagPhotosResponseBodyResults> results;

    @NameInMap("Code")
    public String code;

    public static FetchAlbumTagPhotosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FetchAlbumTagPhotosResponseBody self = new FetchAlbumTagPhotosResponseBody();
        return TeaModel.build(map, self);
    }

    public FetchAlbumTagPhotosResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public FetchAlbumTagPhotosResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public FetchAlbumTagPhotosResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FetchAlbumTagPhotosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FetchAlbumTagPhotosResponseBody setResults(java.util.List<FetchAlbumTagPhotosResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<FetchAlbumTagPhotosResponseBodyResults> getResults() {
        return this.results;
    }

    public FetchAlbumTagPhotosResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class FetchAlbumTagPhotosResponseBodyResults extends TeaModel {
        @NameInMap("PhotoIdStr")
        public String photoIdStr;

        @NameInMap("Mtime")
        public Long mtime;

        @NameInMap("State")
        public String state;

        @NameInMap("PhotoId")
        public Long photoId;

        public static FetchAlbumTagPhotosResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            FetchAlbumTagPhotosResponseBodyResults self = new FetchAlbumTagPhotosResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public FetchAlbumTagPhotosResponseBodyResults setPhotoIdStr(String photoIdStr) {
            this.photoIdStr = photoIdStr;
            return this;
        }
        public String getPhotoIdStr() {
            return this.photoIdStr;
        }

        public FetchAlbumTagPhotosResponseBodyResults setMtime(Long mtime) {
            this.mtime = mtime;
            return this;
        }
        public Long getMtime() {
            return this.mtime;
        }

        public FetchAlbumTagPhotosResponseBodyResults setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public FetchAlbumTagPhotosResponseBodyResults setPhotoId(Long photoId) {
            this.photoId = photoId;
            return this;
        }
        public Long getPhotoId() {
            return this.photoId;
        }

    }

}

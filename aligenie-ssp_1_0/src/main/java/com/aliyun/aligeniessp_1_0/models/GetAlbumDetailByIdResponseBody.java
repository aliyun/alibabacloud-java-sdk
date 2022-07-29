// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetAlbumDetailByIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetAlbumDetailByIdResponseBodyResult result;

    public static GetAlbumDetailByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlbumDetailByIdResponseBody self = new GetAlbumDetailByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlbumDetailByIdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetAlbumDetailByIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAlbumDetailByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAlbumDetailByIdResponseBody setResult(GetAlbumDetailByIdResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetAlbumDetailByIdResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetAlbumDetailByIdResponseBodyResultAlbumContentList extends TeaModel {
        @NameInMap("Duration")
        public String duration;

        @NameInMap("Id")
        public String id;

        @NameInMap("OrderIndex")
        public String orderIndex;

        @NameInMap("Title")
        public String title;

        public static GetAlbumDetailByIdResponseBodyResultAlbumContentList build(java.util.Map<String, ?> map) throws Exception {
            GetAlbumDetailByIdResponseBodyResultAlbumContentList self = new GetAlbumDetailByIdResponseBodyResultAlbumContentList();
            return TeaModel.build(map, self);
        }

        public GetAlbumDetailByIdResponseBodyResultAlbumContentList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetAlbumDetailByIdResponseBodyResultAlbumContentList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetAlbumDetailByIdResponseBodyResultAlbumContentList setOrderIndex(String orderIndex) {
            this.orderIndex = orderIndex;
            return this;
        }
        public String getOrderIndex() {
            return this.orderIndex;
        }

        public GetAlbumDetailByIdResponseBodyResultAlbumContentList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetAlbumDetailByIdResponseBodyResult extends TeaModel {
        @NameInMap("AlbumContentList")
        public java.util.List<GetAlbumDetailByIdResponseBodyResultAlbumContentList> albumContentList;

        @NameInMap("AlbumCoverUrl")
        public String albumCoverUrl;

        @NameInMap("AlbumDescription")
        public String albumDescription;

        @NameInMap("AlbumId")
        public String albumId;

        @NameInMap("AlbumTitle")
        public String albumTitle;

        public static GetAlbumDetailByIdResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetAlbumDetailByIdResponseBodyResult self = new GetAlbumDetailByIdResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetAlbumDetailByIdResponseBodyResult setAlbumContentList(java.util.List<GetAlbumDetailByIdResponseBodyResultAlbumContentList> albumContentList) {
            this.albumContentList = albumContentList;
            return this;
        }
        public java.util.List<GetAlbumDetailByIdResponseBodyResultAlbumContentList> getAlbumContentList() {
            return this.albumContentList;
        }

        public GetAlbumDetailByIdResponseBodyResult setAlbumCoverUrl(String albumCoverUrl) {
            this.albumCoverUrl = albumCoverUrl;
            return this;
        }
        public String getAlbumCoverUrl() {
            return this.albumCoverUrl;
        }

        public GetAlbumDetailByIdResponseBodyResult setAlbumDescription(String albumDescription) {
            this.albumDescription = albumDescription;
            return this;
        }
        public String getAlbumDescription() {
            return this.albumDescription;
        }

        public GetAlbumDetailByIdResponseBodyResult setAlbumId(String albumId) {
            this.albumId = albumId;
            return this;
        }
        public String getAlbumId() {
            return this.albumId;
        }

        public GetAlbumDetailByIdResponseBodyResult setAlbumTitle(String albumTitle) {
            this.albumTitle = albumTitle;
            return this;
        }
        public String getAlbumTitle() {
            return this.albumTitle;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetAlbumDetailByIdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>A0B7CACD-485B-14E2-854F-39EACB09E45B</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>3分24秒</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <strong>example:</strong>
         * <p>468009044</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("OrderIndex")
        public String orderIndex;

        /**
         * <strong>example:</strong>
         * <p>001为什么肚子饿时会咕咕叫</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p><a href="https://ailabs.alibabausercontent.com/images/8838/1600839452498.jpg">https://ailabs.alibabausercontent.com/images/8838/1600839452498.jpg</a></p>
         */
        @NameInMap("AlbumCoverUrl")
        public String albumCoverUrl;

        /**
         * <strong>example:</strong>
         * <p>每次一个百科知识或者故事\n丰富孩子的视野，拓展眼界和知识面，培养和孩子的探究能力和好奇心\n\n</p>
         */
        @NameInMap("AlbumDescription")
        public String albumDescription;

        /**
         * <strong>example:</strong>
         * <p>51999575</p>
         */
        @NameInMap("AlbumId")
        public String albumId;

        /**
         * <strong>example:</strong>
         * <p>小科学家探索</p>
         */
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

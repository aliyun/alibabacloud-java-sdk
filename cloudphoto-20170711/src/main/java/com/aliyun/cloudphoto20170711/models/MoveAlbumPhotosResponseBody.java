// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class MoveAlbumPhotosResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<MoveAlbumPhotosResponseBodyResults> results;

    @NameInMap("Code")
    public String code;

    public static MoveAlbumPhotosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MoveAlbumPhotosResponseBody self = new MoveAlbumPhotosResponseBody();
        return TeaModel.build(map, self);
    }

    public MoveAlbumPhotosResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public MoveAlbumPhotosResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MoveAlbumPhotosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MoveAlbumPhotosResponseBody setResults(java.util.List<MoveAlbumPhotosResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<MoveAlbumPhotosResponseBodyResults> getResults() {
        return this.results;
    }

    public MoveAlbumPhotosResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class MoveAlbumPhotosResponseBodyResults extends TeaModel {
        @NameInMap("IdStr")
        public String idStr;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Id")
        public Long id;

        public static MoveAlbumPhotosResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            MoveAlbumPhotosResponseBodyResults self = new MoveAlbumPhotosResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public MoveAlbumPhotosResponseBodyResults setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public MoveAlbumPhotosResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public MoveAlbumPhotosResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public MoveAlbumPhotosResponseBodyResults setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}

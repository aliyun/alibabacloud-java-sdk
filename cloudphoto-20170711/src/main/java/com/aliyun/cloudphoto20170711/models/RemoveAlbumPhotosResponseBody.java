// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class RemoveAlbumPhotosResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<RemoveAlbumPhotosResponseBodyResults> results;

    @NameInMap("Code")
    public String code;

    public static RemoveAlbumPhotosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveAlbumPhotosResponseBody self = new RemoveAlbumPhotosResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveAlbumPhotosResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public RemoveAlbumPhotosResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RemoveAlbumPhotosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveAlbumPhotosResponseBody setResults(java.util.List<RemoveAlbumPhotosResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<RemoveAlbumPhotosResponseBodyResults> getResults() {
        return this.results;
    }

    public RemoveAlbumPhotosResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class RemoveAlbumPhotosResponseBodyResults extends TeaModel {
        @NameInMap("IdStr")
        public String idStr;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Id")
        public Long id;

        public static RemoveAlbumPhotosResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            RemoveAlbumPhotosResponseBodyResults self = new RemoveAlbumPhotosResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public RemoveAlbumPhotosResponseBodyResults setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public RemoveAlbumPhotosResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RemoveAlbumPhotosResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RemoveAlbumPhotosResponseBodyResults setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}

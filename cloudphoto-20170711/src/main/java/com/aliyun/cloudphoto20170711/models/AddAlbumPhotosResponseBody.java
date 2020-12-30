// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class AddAlbumPhotosResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<AddAlbumPhotosResponseBodyResults> results;

    @NameInMap("Code")
    public String code;

    public static AddAlbumPhotosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAlbumPhotosResponseBody self = new AddAlbumPhotosResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAlbumPhotosResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public AddAlbumPhotosResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddAlbumPhotosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddAlbumPhotosResponseBody setResults(java.util.List<AddAlbumPhotosResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<AddAlbumPhotosResponseBodyResults> getResults() {
        return this.results;
    }

    public AddAlbumPhotosResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class AddAlbumPhotosResponseBodyResults extends TeaModel {
        @NameInMap("IdStr")
        public String idStr;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Id")
        public Long id;

        public static AddAlbumPhotosResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            AddAlbumPhotosResponseBodyResults self = new AddAlbumPhotosResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public AddAlbumPhotosResponseBodyResults setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public AddAlbumPhotosResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AddAlbumPhotosResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AddAlbumPhotosResponseBodyResults setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}

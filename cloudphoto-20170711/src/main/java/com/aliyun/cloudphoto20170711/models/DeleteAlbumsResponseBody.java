// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class DeleteAlbumsResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<DeleteAlbumsResponseBodyResults> results;

    @NameInMap("Code")
    public String code;

    public static DeleteAlbumsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlbumsResponseBody self = new DeleteAlbumsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAlbumsResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public DeleteAlbumsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteAlbumsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAlbumsResponseBody setResults(java.util.List<DeleteAlbumsResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<DeleteAlbumsResponseBodyResults> getResults() {
        return this.results;
    }

    public DeleteAlbumsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DeleteAlbumsResponseBodyResults extends TeaModel {
        @NameInMap("IdStr")
        public String idStr;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Id")
        public Long id;

        public static DeleteAlbumsResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            DeleteAlbumsResponseBodyResults self = new DeleteAlbumsResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public DeleteAlbumsResponseBodyResults setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public DeleteAlbumsResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteAlbumsResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteAlbumsResponseBodyResults setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}

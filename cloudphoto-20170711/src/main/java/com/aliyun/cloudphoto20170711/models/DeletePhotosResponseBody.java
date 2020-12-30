// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class DeletePhotosResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<DeletePhotosResponseBodyResults> results;

    @NameInMap("Code")
    public String code;

    public static DeletePhotosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePhotosResponseBody self = new DeletePhotosResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePhotosResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public DeletePhotosResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeletePhotosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeletePhotosResponseBody setResults(java.util.List<DeletePhotosResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<DeletePhotosResponseBodyResults> getResults() {
        return this.results;
    }

    public DeletePhotosResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DeletePhotosResponseBodyResults extends TeaModel {
        @NameInMap("IdStr")
        public String idStr;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Id")
        public Long id;

        public static DeletePhotosResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            DeletePhotosResponseBodyResults self = new DeletePhotosResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public DeletePhotosResponseBodyResults setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public DeletePhotosResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeletePhotosResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeletePhotosResponseBodyResults setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}

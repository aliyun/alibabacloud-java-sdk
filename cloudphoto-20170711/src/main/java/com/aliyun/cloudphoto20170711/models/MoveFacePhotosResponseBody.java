// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class MoveFacePhotosResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<MoveFacePhotosResponseBodyResults> results;

    @NameInMap("Code")
    public String code;

    public static MoveFacePhotosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MoveFacePhotosResponseBody self = new MoveFacePhotosResponseBody();
        return TeaModel.build(map, self);
    }

    public MoveFacePhotosResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public MoveFacePhotosResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MoveFacePhotosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MoveFacePhotosResponseBody setResults(java.util.List<MoveFacePhotosResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<MoveFacePhotosResponseBodyResults> getResults() {
        return this.results;
    }

    public MoveFacePhotosResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class MoveFacePhotosResponseBodyResults extends TeaModel {
        @NameInMap("IdStr")
        public String idStr;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Id")
        public Long id;

        public static MoveFacePhotosResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            MoveFacePhotosResponseBodyResults self = new MoveFacePhotosResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public MoveFacePhotosResponseBodyResults setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public MoveFacePhotosResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public MoveFacePhotosResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public MoveFacePhotosResponseBodyResults setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}

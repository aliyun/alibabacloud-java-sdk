// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class RemoveFacePhotosResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<RemoveFacePhotosResponseBodyResults> results;

    @NameInMap("Code")
    public String code;

    public static RemoveFacePhotosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveFacePhotosResponseBody self = new RemoveFacePhotosResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveFacePhotosResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public RemoveFacePhotosResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RemoveFacePhotosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveFacePhotosResponseBody setResults(java.util.List<RemoveFacePhotosResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<RemoveFacePhotosResponseBodyResults> getResults() {
        return this.results;
    }

    public RemoveFacePhotosResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class RemoveFacePhotosResponseBodyResults extends TeaModel {
        @NameInMap("IdStr")
        public String idStr;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Id")
        public Long id;

        public static RemoveFacePhotosResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            RemoveFacePhotosResponseBodyResults self = new RemoveFacePhotosResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public RemoveFacePhotosResponseBodyResults setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public RemoveFacePhotosResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RemoveFacePhotosResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RemoveFacePhotosResponseBodyResults setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}

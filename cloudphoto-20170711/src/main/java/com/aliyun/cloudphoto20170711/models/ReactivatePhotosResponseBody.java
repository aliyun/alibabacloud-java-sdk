// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ReactivatePhotosResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<ReactivatePhotosResponseBodyResults> results;

    @NameInMap("Code")
    public String code;

    public static ReactivatePhotosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReactivatePhotosResponseBody self = new ReactivatePhotosResponseBody();
        return TeaModel.build(map, self);
    }

    public ReactivatePhotosResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ReactivatePhotosResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReactivatePhotosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReactivatePhotosResponseBody setResults(java.util.List<ReactivatePhotosResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<ReactivatePhotosResponseBodyResults> getResults() {
        return this.results;
    }

    public ReactivatePhotosResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ReactivatePhotosResponseBodyResults extends TeaModel {
        @NameInMap("IdStr")
        public String idStr;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Id")
        public Long id;

        public static ReactivatePhotosResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            ReactivatePhotosResponseBodyResults self = new ReactivatePhotosResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public ReactivatePhotosResponseBodyResults setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public ReactivatePhotosResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ReactivatePhotosResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ReactivatePhotosResponseBodyResults setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}

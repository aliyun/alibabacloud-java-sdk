// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class InactivatePhotosResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<InactivatePhotosResponseBodyResults> results;

    @NameInMap("Code")
    public String code;

    public static InactivatePhotosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InactivatePhotosResponseBody self = new InactivatePhotosResponseBody();
        return TeaModel.build(map, self);
    }

    public InactivatePhotosResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public InactivatePhotosResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InactivatePhotosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InactivatePhotosResponseBody setResults(java.util.List<InactivatePhotosResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<InactivatePhotosResponseBodyResults> getResults() {
        return this.results;
    }

    public InactivatePhotosResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class InactivatePhotosResponseBodyResults extends TeaModel {
        @NameInMap("IdStr")
        public String idStr;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Id")
        public Long id;

        public static InactivatePhotosResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            InactivatePhotosResponseBodyResults self = new InactivatePhotosResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public InactivatePhotosResponseBodyResults setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public InactivatePhotosResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public InactivatePhotosResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public InactivatePhotosResponseBodyResults setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}

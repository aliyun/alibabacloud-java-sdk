// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ActivatePhotosResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<ActivatePhotosResponseBodyResults> results;

    @NameInMap("Code")
    public String code;

    public static ActivatePhotosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ActivatePhotosResponseBody self = new ActivatePhotosResponseBody();
        return TeaModel.build(map, self);
    }

    public ActivatePhotosResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ActivatePhotosResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ActivatePhotosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ActivatePhotosResponseBody setResults(java.util.List<ActivatePhotosResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<ActivatePhotosResponseBodyResults> getResults() {
        return this.results;
    }

    public ActivatePhotosResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ActivatePhotosResponseBodyResults extends TeaModel {
        @NameInMap("IdStr")
        public String idStr;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Id")
        public Long id;

        public static ActivatePhotosResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            ActivatePhotosResponseBodyResults self = new ActivatePhotosResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public ActivatePhotosResponseBodyResults setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public ActivatePhotosResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ActivatePhotosResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ActivatePhotosResponseBodyResults setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}

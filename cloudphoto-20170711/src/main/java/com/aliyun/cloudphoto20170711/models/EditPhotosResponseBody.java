// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class EditPhotosResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<EditPhotosResponseBodyResults> results;

    @NameInMap("Code")
    public String code;

    public static EditPhotosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EditPhotosResponseBody self = new EditPhotosResponseBody();
        return TeaModel.build(map, self);
    }

    public EditPhotosResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public EditPhotosResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EditPhotosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EditPhotosResponseBody setResults(java.util.List<EditPhotosResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<EditPhotosResponseBodyResults> getResults() {
        return this.results;
    }

    public EditPhotosResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class EditPhotosResponseBodyResults extends TeaModel {
        @NameInMap("IdStr")
        public String idStr;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Id")
        public Long id;

        public static EditPhotosResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            EditPhotosResponseBodyResults self = new EditPhotosResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public EditPhotosResponseBodyResults setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public EditPhotosResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public EditPhotosResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public EditPhotosResponseBodyResults setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}

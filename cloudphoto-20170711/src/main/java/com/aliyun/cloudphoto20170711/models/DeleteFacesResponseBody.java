// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class DeleteFacesResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<DeleteFacesResponseBodyResults> results;

    @NameInMap("Code")
    public String code;

    public static DeleteFacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFacesResponseBody self = new DeleteFacesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFacesResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public DeleteFacesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteFacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteFacesResponseBody setResults(java.util.List<DeleteFacesResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<DeleteFacesResponseBodyResults> getResults() {
        return this.results;
    }

    public DeleteFacesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DeleteFacesResponseBodyResults extends TeaModel {
        @NameInMap("IdStr")
        public String idStr;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Id")
        public Long id;

        public static DeleteFacesResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            DeleteFacesResponseBodyResults self = new DeleteFacesResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public DeleteFacesResponseBodyResults setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public DeleteFacesResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteFacesResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteFacesResponseBodyResults setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}

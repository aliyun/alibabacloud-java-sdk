// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class MergeFacesResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public MergeFacesResponseBodyResults results;

    @NameInMap("Code")
    public String code;

    public static MergeFacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MergeFacesResponseBody self = new MergeFacesResponseBody();
        return TeaModel.build(map, self);
    }

    public MergeFacesResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public MergeFacesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MergeFacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MergeFacesResponseBody setResults(MergeFacesResponseBodyResults results) {
        this.results = results;
        return this;
    }
    public MergeFacesResponseBodyResults getResults() {
        return this.results;
    }

    public MergeFacesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class MergeFacesResponseBodyResultsResult extends TeaModel {
        @NameInMap("IdStr")
        public String idStr;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Id")
        public Long id;

        public static MergeFacesResponseBodyResultsResult build(java.util.Map<String, ?> map) throws Exception {
            MergeFacesResponseBodyResultsResult self = new MergeFacesResponseBodyResultsResult();
            return TeaModel.build(map, self);
        }

        public MergeFacesResponseBodyResultsResult setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public MergeFacesResponseBodyResultsResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public MergeFacesResponseBodyResultsResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public MergeFacesResponseBodyResultsResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class MergeFacesResponseBodyResults extends TeaModel {
        @NameInMap("Result")
        public java.util.List<MergeFacesResponseBodyResultsResult> result;

        public static MergeFacesResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            MergeFacesResponseBodyResults self = new MergeFacesResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public MergeFacesResponseBodyResults setResult(java.util.List<MergeFacesResponseBodyResultsResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<MergeFacesResponseBodyResultsResult> getResult() {
            return this.result;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GenDocQaResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    @NameInMap("data")
    public GenDocQaResultResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>44BD277A-87F9-5310-8D63-3E6645F1DA85</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>2024-04-24 11:54:34</p>
     */
    @NameInMap("time")
    public String time;

    public static GenDocQaResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenDocQaResultResponseBody self = new GenDocQaResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GenDocQaResultResponseBody setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public GenDocQaResultResponseBody setData(GenDocQaResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenDocQaResultResponseBodyData getData() {
        return this.data;
    }

    public GenDocQaResultResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GenDocQaResultResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GenDocQaResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenDocQaResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenDocQaResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GenDocQaResultResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public static class GenDocQaResultResponseBodyDataParseQaResults extends TeaModel {
        @NameInMap("answer")
        public String answer;

        @NameInMap("question")
        public String question;

        public static GenDocQaResultResponseBodyDataParseQaResults build(java.util.Map<String, ?> map) throws Exception {
            GenDocQaResultResponseBodyDataParseQaResults self = new GenDocQaResultResponseBodyDataParseQaResults();
            return TeaModel.build(map, self);
        }

        public GenDocQaResultResponseBodyDataParseQaResults setAnswer(String answer) {
            this.answer = answer;
            return this;
        }
        public String getAnswer() {
            return this.answer;
        }

        public GenDocQaResultResponseBodyDataParseQaResults setQuestion(String question) {
            this.question = question;
            return this;
        }
        public String getQuestion() {
            return this.question;
        }

    }

    public static class GenDocQaResultResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PROCESSING</p>
         */
        @NameInMap("currentStatus")
        public String currentStatus;

        /**
         * <strong>example:</strong>
         * <p>873648346573245</p>
         */
        @NameInMap("docId")
        public String docId;

        /**
         * <strong>example:</strong>
         * <p>7wxwrjpabj</p>
         */
        @NameInMap("libraryId")
        public String libraryId;

        @NameInMap("parseQaResults")
        public java.util.List<GenDocQaResultResponseBodyDataParseQaResults> parseQaResults;

        public static GenDocQaResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenDocQaResultResponseBodyData self = new GenDocQaResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenDocQaResultResponseBodyData setCurrentStatus(String currentStatus) {
            this.currentStatus = currentStatus;
            return this;
        }
        public String getCurrentStatus() {
            return this.currentStatus;
        }

        public GenDocQaResultResponseBodyData setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public GenDocQaResultResponseBodyData setLibraryId(String libraryId) {
            this.libraryId = libraryId;
            return this;
        }
        public String getLibraryId() {
            return this.libraryId;
        }

        public GenDocQaResultResponseBodyData setParseQaResults(java.util.List<GenDocQaResultResponseBodyDataParseQaResults> parseQaResults) {
            this.parseQaResults = parseQaResults;
            return this;
        }
        public java.util.List<GenDocQaResultResponseBodyDataParseQaResults> getParseQaResults() {
            return this.parseQaResults;
        }

    }

}

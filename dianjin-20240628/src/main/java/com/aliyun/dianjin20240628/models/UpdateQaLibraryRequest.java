// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class UpdateQaLibraryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("parseQaResults")
    public java.util.List<UpdateQaLibraryRequestParseQaResults> parseQaResults;

    /**
     * <strong>example:</strong>
     * <p>6jh378d</p>
     */
    @NameInMap("qaLibraryId")
    public String qaLibraryId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0FC6636E-380A-5369-AE01-D1C15BB9B254</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateQaLibraryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateQaLibraryRequest self = new UpdateQaLibraryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateQaLibraryRequest setParseQaResults(java.util.List<UpdateQaLibraryRequestParseQaResults> parseQaResults) {
        this.parseQaResults = parseQaResults;
        return this;
    }
    public java.util.List<UpdateQaLibraryRequestParseQaResults> getParseQaResults() {
        return this.parseQaResults;
    }

    public UpdateQaLibraryRequest setQaLibraryId(String qaLibraryId) {
        this.qaLibraryId = qaLibraryId;
        return this;
    }
    public String getQaLibraryId() {
        return this.qaLibraryId;
    }

    public UpdateQaLibraryRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateQaLibraryRequestParseQaResults extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("answer")
        public String answer;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("question")
        public String question;

        public static UpdateQaLibraryRequestParseQaResults build(java.util.Map<String, ?> map) throws Exception {
            UpdateQaLibraryRequestParseQaResults self = new UpdateQaLibraryRequestParseQaResults();
            return TeaModel.build(map, self);
        }

        public UpdateQaLibraryRequestParseQaResults setAnswer(String answer) {
            this.answer = answer;
            return this;
        }
        public String getAnswer() {
            return this.answer;
        }

        public UpdateQaLibraryRequestParseQaResults setQuestion(String question) {
            this.question = question;
            return this;
        }
        public String getQuestion() {
            return this.question;
        }

    }

}

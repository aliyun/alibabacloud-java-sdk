// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetTitleDiagnoseResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetTitleDiagnoseResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>DC2DCCC9-C3DF-4F59-8D8E-78185729F16D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetTitleDiagnoseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTitleDiagnoseResponseBody self = new GetTitleDiagnoseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTitleDiagnoseResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetTitleDiagnoseResponseBody setData(GetTitleDiagnoseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTitleDiagnoseResponseBodyData getData() {
        return this.data;
    }

    public GetTitleDiagnoseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTitleDiagnoseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTitleDiagnoseResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Boy</p>
         */
        @NameInMap("AllUppercaseWords")
        public String allUppercaseWords;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ContainCoreClasses")
        public String containCoreClasses;

        /**
         * <strong>example:</strong>
         * <p>baba</p>
         */
        @NameInMap("DisableWords")
        public String disableWords;

        /**
         * <strong>example:</strong>
         * <p>hi</p>
         */
        @NameInMap("DuplicateWords")
        public String duplicateWords;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("LanguageQualityScore")
        public String languageQualityScore;

        /**
         * <strong>example:</strong>
         * <p>no</p>
         */
        @NameInMap("NoFirstUppercaseList")
        public String noFirstUppercaseList;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("OverLengthLimit")
        public String overLengthLimit;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalScore")
        public String totalScore;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("WordCount")
        public String wordCount;

        /**
         * <strong>example:</strong>
         * <p>ahk</p>
         */
        @NameInMap("WordSpelledCorrectError")
        public String wordSpelledCorrectError;

        public static GetTitleDiagnoseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTitleDiagnoseResponseBodyData self = new GetTitleDiagnoseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTitleDiagnoseResponseBodyData setAllUppercaseWords(String allUppercaseWords) {
            this.allUppercaseWords = allUppercaseWords;
            return this;
        }
        public String getAllUppercaseWords() {
            return this.allUppercaseWords;
        }

        public GetTitleDiagnoseResponseBodyData setContainCoreClasses(String containCoreClasses) {
            this.containCoreClasses = containCoreClasses;
            return this;
        }
        public String getContainCoreClasses() {
            return this.containCoreClasses;
        }

        public GetTitleDiagnoseResponseBodyData setDisableWords(String disableWords) {
            this.disableWords = disableWords;
            return this;
        }
        public String getDisableWords() {
            return this.disableWords;
        }

        public GetTitleDiagnoseResponseBodyData setDuplicateWords(String duplicateWords) {
            this.duplicateWords = duplicateWords;
            return this;
        }
        public String getDuplicateWords() {
            return this.duplicateWords;
        }

        public GetTitleDiagnoseResponseBodyData setLanguageQualityScore(String languageQualityScore) {
            this.languageQualityScore = languageQualityScore;
            return this;
        }
        public String getLanguageQualityScore() {
            return this.languageQualityScore;
        }

        public GetTitleDiagnoseResponseBodyData setNoFirstUppercaseList(String noFirstUppercaseList) {
            this.noFirstUppercaseList = noFirstUppercaseList;
            return this;
        }
        public String getNoFirstUppercaseList() {
            return this.noFirstUppercaseList;
        }

        public GetTitleDiagnoseResponseBodyData setOverLengthLimit(String overLengthLimit) {
            this.overLengthLimit = overLengthLimit;
            return this;
        }
        public String getOverLengthLimit() {
            return this.overLengthLimit;
        }

        public GetTitleDiagnoseResponseBodyData setTotalScore(String totalScore) {
            this.totalScore = totalScore;
            return this;
        }
        public String getTotalScore() {
            return this.totalScore;
        }

        public GetTitleDiagnoseResponseBodyData setWordCount(String wordCount) {
            this.wordCount = wordCount;
            return this;
        }
        public String getWordCount() {
            return this.wordCount;
        }

        public GetTitleDiagnoseResponseBodyData setWordSpelledCorrectError(String wordSpelledCorrectError) {
            this.wordSpelledCorrectError = wordSpelledCorrectError;
            return this;
        }
        public String getWordSpelledCorrectError() {
            return this.wordSpelledCorrectError;
        }

    }

}

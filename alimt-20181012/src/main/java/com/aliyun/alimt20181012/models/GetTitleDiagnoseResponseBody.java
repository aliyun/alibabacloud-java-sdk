// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetTitleDiagnoseResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetTitleDiagnoseResponseBodyData data;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("AllUppercaseWords")
        public String allUppercaseWords;

        @NameInMap("ContainCoreClasses")
        public String containCoreClasses;

        @NameInMap("DisableWords")
        public String disableWords;

        @NameInMap("DuplicateWords")
        public String duplicateWords;

        @NameInMap("LanguageQualityScore")
        public String languageQualityScore;

        @NameInMap("NoFirstUppercaseList")
        public String noFirstUppercaseList;

        @NameInMap("OverLengthLimit")
        public String overLengthLimit;

        @NameInMap("TotalScore")
        public String totalScore;

        @NameInMap("WordCount")
        public String wordCount;

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

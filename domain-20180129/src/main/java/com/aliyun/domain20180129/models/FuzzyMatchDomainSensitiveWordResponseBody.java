// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class FuzzyMatchDomainSensitiveWordResponseBody extends TeaModel {
    @NameInMap("Exist")
    public Boolean exist;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("MatchedSentiveWords")
    public FuzzyMatchDomainSensitiveWordResponseBodyMatchedSentiveWords matchedSentiveWords;

    public static FuzzyMatchDomainSensitiveWordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FuzzyMatchDomainSensitiveWordResponseBody self = new FuzzyMatchDomainSensitiveWordResponseBody();
        return TeaModel.build(map, self);
    }

    public FuzzyMatchDomainSensitiveWordResponseBody setExist(Boolean exist) {
        this.exist = exist;
        return this;
    }
    public Boolean getExist() {
        return this.exist;
    }

    public FuzzyMatchDomainSensitiveWordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FuzzyMatchDomainSensitiveWordResponseBody setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public FuzzyMatchDomainSensitiveWordResponseBody setMatchedSentiveWords(FuzzyMatchDomainSensitiveWordResponseBodyMatchedSentiveWords matchedSentiveWords) {
        this.matchedSentiveWords = matchedSentiveWords;
        return this;
    }
    public FuzzyMatchDomainSensitiveWordResponseBodyMatchedSentiveWords getMatchedSentiveWords() {
        return this.matchedSentiveWords;
    }

    public static class BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResultMatchedSentiveWordsMatchedSensitiveWord extends TeaModel {
        @NameInMap("Word")
        public String word;

        public static BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResultMatchedSentiveWordsMatchedSensitiveWord build(java.util.Map<String, ?> map) throws Exception {
            BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResultMatchedSentiveWordsMatchedSensitiveWord self = new BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResultMatchedSentiveWordsMatchedSensitiveWord();
            return TeaModel.build(map, self);
        }

        public BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResultMatchedSentiveWordsMatchedSensitiveWord setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

    public static class BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResultMatchedSentiveWords extends TeaModel {
        @NameInMap("MatchedSensitiveWord")
        public java.util.List<BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResultMatchedSentiveWordsMatchedSensitiveWord> matchedSensitiveWord;

        public static BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResultMatchedSentiveWords build(java.util.Map<String, ?> map) throws Exception {
            BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResultMatchedSentiveWords self = new BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResultMatchedSentiveWords();
            return TeaModel.build(map, self);
        }

        public BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResultMatchedSentiveWords setMatchedSensitiveWord(java.util.List<BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResultMatchedSentiveWordsMatchedSensitiveWord> matchedSensitiveWord) {
            this.matchedSensitiveWord = matchedSensitiveWord;
            return this;
        }
        public java.util.List<BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResultMatchedSentiveWordsMatchedSensitiveWord> getMatchedSensitiveWord() {
            return this.matchedSensitiveWord;
        }

    }

    public static class BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResult extends TeaModel {
        @NameInMap("Keyword")
        public String keyword;

        @NameInMap("Exist")
        public Boolean exist;

        @NameInMap("MatchedSentiveWords")
        public BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResultMatchedSentiveWords matchedSentiveWords;

        public static BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResult build(java.util.Map<String, ?> map) throws Exception {
            BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResult self = new BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResult();
            return TeaModel.build(map, self);
        }

        public BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResult setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResult setExist(Boolean exist) {
            this.exist = exist;
            return this;
        }
        public Boolean getExist() {
            return this.exist;
        }

        public BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResult setMatchedSentiveWords(BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResultMatchedSentiveWords matchedSentiveWords) {
            this.matchedSentiveWords = matchedSentiveWords;
            return this;
        }
        public BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResultMatchedSentiveWords getMatchedSentiveWords() {
            return this.matchedSentiveWords;
        }

    }

    public static class BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultList extends TeaModel {
        @NameInMap("SensitiveWordMatchResult")
        public java.util.List<BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResult> sensitiveWordMatchResult;

        public static BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultList build(java.util.Map<String, ?> map) throws Exception {
            BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultList self = new BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultList();
            return TeaModel.build(map, self);
        }

        public BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultList setSensitiveWordMatchResult(java.util.List<BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResult> sensitiveWordMatchResult) {
            this.sensitiveWordMatchResult = sensitiveWordMatchResult;
            return this;
        }
        public java.util.List<BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResult> getSensitiveWordMatchResult() {
            return this.sensitiveWordMatchResult;
        }

    }

    public static class FuzzyMatchDomainSensitiveWordResponseBodyMatchedSentiveWordsMatchedSensitiveWord extends TeaModel {
        @NameInMap("Word")
        public String word;

        public static FuzzyMatchDomainSensitiveWordResponseBodyMatchedSentiveWordsMatchedSensitiveWord build(java.util.Map<String, ?> map) throws Exception {
            FuzzyMatchDomainSensitiveWordResponseBodyMatchedSentiveWordsMatchedSensitiveWord self = new FuzzyMatchDomainSensitiveWordResponseBodyMatchedSentiveWordsMatchedSensitiveWord();
            return TeaModel.build(map, self);
        }

        public FuzzyMatchDomainSensitiveWordResponseBodyMatchedSentiveWordsMatchedSensitiveWord setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

    public static class FuzzyMatchDomainSensitiveWordResponseBodyMatchedSentiveWords extends TeaModel {
        @NameInMap("MatchedSensitiveWord")
        public java.util.List<FuzzyMatchDomainSensitiveWordResponseBodyMatchedSentiveWordsMatchedSensitiveWord> matchedSensitiveWord;

        public static FuzzyMatchDomainSensitiveWordResponseBodyMatchedSentiveWords build(java.util.Map<String, ?> map) throws Exception {
            FuzzyMatchDomainSensitiveWordResponseBodyMatchedSentiveWords self = new FuzzyMatchDomainSensitiveWordResponseBodyMatchedSentiveWords();
            return TeaModel.build(map, self);
        }

        public FuzzyMatchDomainSensitiveWordResponseBodyMatchedSentiveWords setMatchedSensitiveWord(java.util.List<FuzzyMatchDomainSensitiveWordResponseBodyMatchedSentiveWordsMatchedSensitiveWord> matchedSensitiveWord) {
            this.matchedSensitiveWord = matchedSensitiveWord;
            return this;
        }
        public java.util.List<FuzzyMatchDomainSensitiveWordResponseBodyMatchedSentiveWordsMatchedSensitiveWord> getMatchedSensitiveWord() {
            return this.matchedSensitiveWord;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class BatchFuzzyMatchDomainSensitiveWordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SensitiveWordMatchResultList")
    public BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultList sensitiveWordMatchResultList;

    public static BatchFuzzyMatchDomainSensitiveWordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchFuzzyMatchDomainSensitiveWordResponseBody self = new BatchFuzzyMatchDomainSensitiveWordResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchFuzzyMatchDomainSensitiveWordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchFuzzyMatchDomainSensitiveWordResponseBody setSensitiveWordMatchResultList(BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultList sensitiveWordMatchResultList) {
        this.sensitiveWordMatchResultList = sensitiveWordMatchResultList;
        return this;
    }
    public BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultList getSensitiveWordMatchResultList() {
        return this.sensitiveWordMatchResultList;
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
        @NameInMap("Exist")
        public Boolean exist;

        @NameInMap("Keyword")
        public String keyword;

        @NameInMap("MatchedSentiveWords")
        public BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResultMatchedSentiveWords matchedSentiveWords;

        public static BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResult build(java.util.Map<String, ?> map) throws Exception {
            BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResult self = new BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResult();
            return TeaModel.build(map, self);
        }

        public BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResult setExist(Boolean exist) {
            this.exist = exist;
            return this;
        }
        public Boolean getExist() {
            return this.exist;
        }

        public BatchFuzzyMatchDomainSensitiveWordResponseBodySensitiveWordMatchResultListSensitiveWordMatchResult setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
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

}

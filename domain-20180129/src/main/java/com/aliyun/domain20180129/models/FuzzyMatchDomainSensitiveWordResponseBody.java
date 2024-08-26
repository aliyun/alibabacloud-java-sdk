// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class FuzzyMatchDomainSensitiveWordResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Exist")
    public Boolean exist;

    /**
     * <strong>example:</strong>
     * <p>xxx**.cn</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("MatchedSentiveWords")
    public FuzzyMatchDomainSensitiveWordResponseBodyMatchedSentiveWords matchedSentiveWords;

    /**
     * <strong>example:</strong>
     * <p>D15F91FD-0B34-4E48-8CBF-EFA5D2A31586</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public FuzzyMatchDomainSensitiveWordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class FuzzyMatchDomainSensitiveWordResponseBodyMatchedSentiveWordsMatchedSensitiveWord extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
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

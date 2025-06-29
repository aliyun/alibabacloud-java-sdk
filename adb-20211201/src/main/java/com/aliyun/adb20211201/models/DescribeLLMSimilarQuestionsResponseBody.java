// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeLLMSimilarQuestionsResponseBody extends TeaModel {
    /**
     * <p>The queried similar questions.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeLLMSimilarQuestionsResponseBodyItems> items;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>96A55627-28E9-5E47-B8F6-D786BE551349</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4847</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    public static DescribeLLMSimilarQuestionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLLMSimilarQuestionsResponseBody self = new DescribeLLMSimilarQuestionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLLMSimilarQuestionsResponseBody setItems(java.util.List<DescribeLLMSimilarQuestionsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeLLMSimilarQuestionsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeLLMSimilarQuestionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLLMSimilarQuestionsResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public static class DescribeLLMSimilarQuestionsResponseBodyItems extends TeaModel {
        /**
         * <p>The answer to the similar question.</p>
         */
        @NameInMap("Answer")
        public String answer;

        /**
         * <p>The ID of the similar question.</p>
         * 
         * <strong>example:</strong>
         * <p>2389899</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The similarity of the similar question.</p>
         * 
         * <strong>example:</strong>
         * <p>0.58</p>
         */
        @NameInMap("Score")
        public Double score;

        /**
         * <p>The source of the similar question.</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The summary of the similar question.</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>The content of the similar question.</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The URL of the answer to the similar question.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com/product">www.aliyun.com/product</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static DescribeLLMSimilarQuestionsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeLLMSimilarQuestionsResponseBodyItems self = new DescribeLLMSimilarQuestionsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeLLMSimilarQuestionsResponseBodyItems setAnswer(String answer) {
            this.answer = answer;
            return this;
        }
        public String getAnswer() {
            return this.answer;
        }

        public DescribeLLMSimilarQuestionsResponseBodyItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeLLMSimilarQuestionsResponseBodyItems setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public DescribeLLMSimilarQuestionsResponseBodyItems setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeLLMSimilarQuestionsResponseBodyItems setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public DescribeLLMSimilarQuestionsResponseBodyItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeLLMSimilarQuestionsResponseBodyItems setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}

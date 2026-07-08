// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GenerateTraceability extends TeaModel {
    /**
     * <p>The list of traceability news.</p>
     */
    @NameInMap("News")
    public java.util.List<GenerateTraceabilityNews> news;

    public static GenerateTraceability build(java.util.Map<String, ?> map) throws Exception {
        GenerateTraceability self = new GenerateTraceability();
        return TeaModel.build(map, self);
    }

    public GenerateTraceability setNews(java.util.List<GenerateTraceabilityNews> news) {
        this.news = news;
        return this;
    }
    public java.util.List<GenerateTraceabilityNews> getNews() {
        return this.news;
    }

    public static class GenerateTraceabilityNews extends TeaModel {
        /**
         * <p>The index \<code>n\\</code> that corresponds to the \<code>[[n]]\\</code> marker in the original article. The index starts from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>The publish time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-22 10:29:00</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <p>The unique identity of the retrieval source.</p>
         * 
         * <strong>example:</strong>
         * <p>检索源唯一标识</p>
         */
        @NameInMap("SearchSource")
        public String searchSource;

        /**
         * <p>The name of the retrieval source.</p>
         * 
         * <strong>example:</strong>
         * <p>检索源编码</p>
         */
        @NameInMap("SearchSourceName")
        public String searchSourceName;

        /**
         * <p>The title.</p>
         * 
         * <strong>example:</strong>
         * <p>新闻标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com/xxx.html">http://www.example.com/xxx.html</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static GenerateTraceabilityNews build(java.util.Map<String, ?> map) throws Exception {
            GenerateTraceabilityNews self = new GenerateTraceabilityNews();
            return TeaModel.build(map, self);
        }

        public GenerateTraceabilityNews setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public GenerateTraceabilityNews setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public GenerateTraceabilityNews setSearchSource(String searchSource) {
            this.searchSource = searchSource;
            return this;
        }
        public String getSearchSource() {
            return this.searchSource;
        }

        public GenerateTraceabilityNews setSearchSourceName(String searchSourceName) {
            this.searchSourceName = searchSourceName;
            return this;
        }
        public String getSearchSourceName() {
            return this.searchSourceName;
        }

        public GenerateTraceabilityNews setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GenerateTraceabilityNews setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}

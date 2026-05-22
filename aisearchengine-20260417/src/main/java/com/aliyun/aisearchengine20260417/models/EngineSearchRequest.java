// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearchengine20260417.models;

import com.aliyun.tea.*;

public class EngineSearchRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>507218</p>
     */
    @NameInMap("appId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("grey")
    public Boolean grey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("query")
    public EngineSearchRequestQuery query;

    @NameInMap("recall")
    public EngineSearchRequestRecall recall;

    /**
     * <strong>example:</strong>
     * <p>2e95ef4fbc28437db5008a910bd392a4</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>507218</p>
     */
    @NameInMap("strategyId")
    public String strategyId;

    @NameInMap("user")
    public EngineSearchRequestUser user;

    /**
     * <strong>example:</strong>
     * <p>默认1.0</p>
     */
    @NameInMap("version")
    public String version;

    public static EngineSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        EngineSearchRequest self = new EngineSearchRequest();
        return TeaModel.build(map, self);
    }

    public EngineSearchRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public EngineSearchRequest setGrey(Boolean grey) {
        this.grey = grey;
        return this;
    }
    public Boolean getGrey() {
        return this.grey;
    }

    public EngineSearchRequest setQuery(EngineSearchRequestQuery query) {
        this.query = query;
        return this;
    }
    public EngineSearchRequestQuery getQuery() {
        return this.query;
    }

    public EngineSearchRequest setRecall(EngineSearchRequestRecall recall) {
        this.recall = recall;
        return this;
    }
    public EngineSearchRequestRecall getRecall() {
        return this.recall;
    }

    public EngineSearchRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public EngineSearchRequest setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

    public EngineSearchRequest setUser(EngineSearchRequestUser user) {
        this.user = user;
        return this;
    }
    public EngineSearchRequestUser getUser() {
        return this.user;
    }

    public EngineSearchRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class EngineSearchRequestQuery extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[&quot;24234111&quot;,&quot;12423525&quot;]</p>
         */
        @NameInMap("excludeIds")
        public java.util.List<String> excludeIds;

        /**
         * <strong>example:</strong>
         * <p>[&quot;<a href="https://paperreview.oss-cn-hangzhou.aliyuncs.com/59dd424f-97ed-4855-942e-c961f1f5b67e.jpeg%22%5D">https://paperreview.oss-cn-hangzhou.aliyuncs.com/59dd424f-97ed-4855-942e-c961f1f5b67e.jpeg&quot;]</a></p>
         */
        @NameInMap("imageUrls")
        public java.util.List<String> imageUrls;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNo")
        public Integer pageNo;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>[&quot;梅花图片&quot;]</p>
         */
        @NameInMap("texts")
        public java.util.List<String> texts;

        public static EngineSearchRequestQuery build(java.util.Map<String, ?> map) throws Exception {
            EngineSearchRequestQuery self = new EngineSearchRequestQuery();
            return TeaModel.build(map, self);
        }

        public EngineSearchRequestQuery setExcludeIds(java.util.List<String> excludeIds) {
            this.excludeIds = excludeIds;
            return this;
        }
        public java.util.List<String> getExcludeIds() {
            return this.excludeIds;
        }

        public EngineSearchRequestQuery setImageUrls(java.util.List<String> imageUrls) {
            this.imageUrls = imageUrls;
            return this;
        }
        public java.util.List<String> getImageUrls() {
            return this.imageUrls;
        }

        public EngineSearchRequestQuery setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public EngineSearchRequestQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public EngineSearchRequestQuery setTexts(java.util.List<String> texts) {
            this.texts = texts;
            return this;
        }
        public java.util.List<String> getTexts() {
            return this.texts;
        }

    }

    public static class EngineSearchRequestRecall extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("closeRecallAsr")
        public Boolean closeRecallAsr;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("needMergeSegments")
        public Boolean needMergeSegments;

        public static EngineSearchRequestRecall build(java.util.Map<String, ?> map) throws Exception {
            EngineSearchRequestRecall self = new EngineSearchRequestRecall();
            return TeaModel.build(map, self);
        }

        public EngineSearchRequestRecall setCloseRecallAsr(Boolean closeRecallAsr) {
            this.closeRecallAsr = closeRecallAsr;
            return this;
        }
        public Boolean getCloseRecallAsr() {
            return this.closeRecallAsr;
        }

        public EngineSearchRequestRecall setNeedMergeSegments(Boolean needMergeSegments) {
            this.needMergeSegments = needMergeSegments;
            return this;
        }
        public Boolean getNeedMergeSegments() {
            return this.needMergeSegments;
        }

    }

    public static class EngineSearchRequestUser extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;123456&quot;</p>
         */
        @NameInMap("userId")
        public String userId;

        public static EngineSearchRequestUser build(java.util.Map<String, ?> map) throws Exception {
            EngineSearchRequestUser self = new EngineSearchRequestUser();
            return TeaModel.build(map, self);
        }

        public EngineSearchRequestUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}

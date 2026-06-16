// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearchengine20260417.models;

import com.aliyun.tea.*;

public class EngineSearchRequest extends TeaModel {
    /**
     * <p>The unique ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2048962366415007746</p>
     */
    @NameInMap("appId")
    public String appId;

    /**
     * <p>Specifies whether to access the draft version.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("grey")
    public Boolean grey;

    /**
     * <p>The query condition object.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("query")
    public EngineSearchRequestQuery query;

    /**
     * <p>This parameter does not need to be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>2e95ef4fbc28437db5008a910bd392a4</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>The user information object, used for subsequent user-perspective analysis.</p>
     */
    @NameInMap("user")
    public EngineSearchRequestUser user;

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

    public EngineSearchRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public EngineSearchRequest setUser(EngineSearchRequestUser user) {
        this.user = user;
        return this;
    }
    public EngineSearchRequestUser getUser() {
        return this.user;
    }

    public static class EngineSearchRequestQuery extends TeaModel {
        /**
         * <p>The list of primary key IDs to exclude.<br>• Purpose: filters out previously viewed history records.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;24234111&quot;,&quot;12423525&quot;]</p>
         */
        @NameInMap("excludeIds")
        public java.util.List<String> excludeIds;

        /**
         * <p>The image query list.<br>• Only one image URL is supported. The maximum size of a single image is 10 MB. Supported formats: JPG, PNG, WEBP, and JPEG.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;<a href="https://paperreview.oss-cn-hangzhou.aliyuncs.com/59dd424f-97ed-4855-942e-c961f1f5b67e.jpeg%22%5D">https://paperreview.oss-cn-hangzhou.aliyuncs.com/59dd424f-97ed-4855-942e-c961f1f5b67e.jpeg&quot;]</a></p>
         */
        @NameInMap("imageUrls")
        public java.util.List<String> imageUrls;

        /**
         * <p>The page number, starting from 1.<br>• Default value: <code>1</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNo")
        public Integer pageNo;

        /**
         * <p>The number of results returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The text query list.<br>• Only one text string is supported. The maximum length is 256 characters.</p>
         * 
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

    public static class EngineSearchRequestUser extends TeaModel {
        /**
         * <p>The unique ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>asdfgnoevnor</p>
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

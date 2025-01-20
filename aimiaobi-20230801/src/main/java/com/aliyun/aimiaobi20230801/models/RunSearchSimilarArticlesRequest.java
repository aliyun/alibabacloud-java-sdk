// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunSearchSimilarArticlesRequest extends TeaModel {
    @NameInMap("ChatConfig")
    public RunSearchSimilarArticlesRequestChatConfig chatConfig;

    /**
     * <strong>example:</strong>
     * <p>html</p>
     */
    @NameInMap("DocType")
    public String docType;

    @NameInMap("Title")
    public String title;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx/xxx">https://xxx/xxx</a></p>
     */
    @NameInMap("Url")
    public String url;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunSearchSimilarArticlesRequest build(java.util.Map<String, ?> map) throws Exception {
        RunSearchSimilarArticlesRequest self = new RunSearchSimilarArticlesRequest();
        return TeaModel.build(map, self);
    }

    public RunSearchSimilarArticlesRequest setChatConfig(RunSearchSimilarArticlesRequestChatConfig chatConfig) {
        this.chatConfig = chatConfig;
        return this;
    }
    public RunSearchSimilarArticlesRequestChatConfig getChatConfig() {
        return this.chatConfig;
    }

    public RunSearchSimilarArticlesRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public RunSearchSimilarArticlesRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public RunSearchSimilarArticlesRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RunSearchSimilarArticlesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class RunSearchSimilarArticlesRequestChatConfigSearchParamSearchSources extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SystemSearch</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static RunSearchSimilarArticlesRequestChatConfigSearchParamSearchSources build(java.util.Map<String, ?> map) throws Exception {
            RunSearchSimilarArticlesRequestChatConfigSearchParamSearchSources self = new RunSearchSimilarArticlesRequestChatConfigSearchParamSearchSources();
            return TeaModel.build(map, self);
        }

        public RunSearchSimilarArticlesRequestChatConfigSearchParamSearchSources setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RunSearchSimilarArticlesRequestChatConfigSearchParamSearchSources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class RunSearchSimilarArticlesRequestChatConfigSearchParam extends TeaModel {
        @NameInMap("SearchSources")
        public java.util.List<RunSearchSimilarArticlesRequestChatConfigSearchParamSearchSources> searchSources;

        public static RunSearchSimilarArticlesRequestChatConfigSearchParam build(java.util.Map<String, ?> map) throws Exception {
            RunSearchSimilarArticlesRequestChatConfigSearchParam self = new RunSearchSimilarArticlesRequestChatConfigSearchParam();
            return TeaModel.build(map, self);
        }

        public RunSearchSimilarArticlesRequestChatConfigSearchParam setSearchSources(java.util.List<RunSearchSimilarArticlesRequestChatConfigSearchParamSearchSources> searchSources) {
            this.searchSources = searchSources;
            return this;
        }
        public java.util.List<RunSearchSimilarArticlesRequestChatConfigSearchParamSearchSources> getSearchSources() {
            return this.searchSources;
        }

    }

    public static class RunSearchSimilarArticlesRequestChatConfig extends TeaModel {
        @NameInMap("SearchParam")
        public RunSearchSimilarArticlesRequestChatConfigSearchParam searchParam;

        public static RunSearchSimilarArticlesRequestChatConfig build(java.util.Map<String, ?> map) throws Exception {
            RunSearchSimilarArticlesRequestChatConfig self = new RunSearchSimilarArticlesRequestChatConfig();
            return TeaModel.build(map, self);
        }

        public RunSearchSimilarArticlesRequestChatConfig setSearchParam(RunSearchSimilarArticlesRequestChatConfigSearchParam searchParam) {
            this.searchParam = searchParam;
            return this;
        }
        public RunSearchSimilarArticlesRequestChatConfigSearchParam getSearchParam() {
            return this.searchParam;
        }

    }

}

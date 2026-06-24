// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataAgentSessionResponseBody extends TeaModel {
    /**
     * <p>The response struct.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListDataAgentSessionResponseBodyData> data;

    /**
     * <p>The error code returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The current page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E0D21075-CD3E-4D98-8264-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request is successful.</li>
     * <li><strong>false</strong>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Total")
    public Integer total;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static ListDataAgentSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataAgentSessionResponseBody self = new ListDataAgentSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataAgentSessionResponseBody setData(java.util.List<ListDataAgentSessionResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDataAgentSessionResponseBodyData> getData() {
        return this.data;
    }

    public ListDataAgentSessionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataAgentSessionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataAgentSessionResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataAgentSessionResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataAgentSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataAgentSessionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDataAgentSessionResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListDataAgentSessionResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class ListDataAgentSessionResponseBodyDataSessionConfig extends TeaModel {
        /**
         * <p>The custom agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-e*******ckd</p>
         */
        @NameInMap("CustomAgentId")
        public String customAgentId;

        /**
         * <p>The usage stage of the custom agent. Valid values:</p>
         * <ul>
         * <li><strong>debug</strong>: Debug stage.</li>
         * <li><strong>prod</strong>: Production stage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>prod</p>
         */
        @NameInMap("CustomAgentStage")
        public String customAgentStage;

        /**
         * <p>Specifies whether to enable web search.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableSearch")
        public Boolean enableSearch;

        /**
         * <p>The language. Valid values:</p>
         * <ul>
         * <li><strong>CHINESE</strong>: Chinese.</li>
         * <li><strong>ENGLISH</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CHINESE</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The mode. Valid values:</p>
         * <ul>
         * <li><strong>ASK_DATA</strong>: Ask data mode.</li>
         * <li><strong>ANALYSIS</strong>: Analysis mode.</li>
         * <li><strong>INSIGHT</strong>: Insight mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ANALYSIS</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The name of the user OSS bucket.</p>
         * <ul>
         * <li>Analysis process files and report artifacts can be uploaded to the user-specified OSS bucket.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user-oss-bucket</p>
         */
        @NameInMap("UserOssBucket")
        public String userOssBucket;

        public static ListDataAgentSessionResponseBodyDataSessionConfig build(java.util.Map<String, ?> map) throws Exception {
            ListDataAgentSessionResponseBodyDataSessionConfig self = new ListDataAgentSessionResponseBodyDataSessionConfig();
            return TeaModel.build(map, self);
        }

        public ListDataAgentSessionResponseBodyDataSessionConfig setCustomAgentId(String customAgentId) {
            this.customAgentId = customAgentId;
            return this;
        }
        public String getCustomAgentId() {
            return this.customAgentId;
        }

        public ListDataAgentSessionResponseBodyDataSessionConfig setCustomAgentStage(String customAgentStage) {
            this.customAgentStage = customAgentStage;
            return this;
        }
        public String getCustomAgentStage() {
            return this.customAgentStage;
        }

        public ListDataAgentSessionResponseBodyDataSessionConfig setEnableSearch(Boolean enableSearch) {
            this.enableSearch = enableSearch;
            return this;
        }
        public Boolean getEnableSearch() {
            return this.enableSearch;
        }

        public ListDataAgentSessionResponseBodyDataSessionConfig setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListDataAgentSessionResponseBodyDataSessionConfig setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListDataAgentSessionResponseBodyDataSessionConfig setUserOssBucket(String userOssBucket) {
            this.userOssBucket = userOssBucket;
            return this;
        }
        public String getUserOssBucket() {
            return this.userOssBucket;
        }

    }

    public static class ListDataAgentSessionResponseBodyData extends TeaModel {
        /**
         * <p>The current agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cu0cs*******mf</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <p>The current agent status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("AgentStatus")
        public String agentStatus;

        /**
         * <p>The session creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1731645908000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Indicates whether the session is favorited by the current logged-in user in the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FavoriteInWorkspace")
        public Boolean favoriteInWorkspace;

        /**
         * <p>The file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f-8*******01m</p>
         */
        @NameInMap("File")
        public String file;

        /**
         * <p>Indicates whether the session is favorited by the current logged-in user.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Saved")
        public Boolean saved;

        /**
         * <p>The session configuration item.</p>
         */
        @NameInMap("SessionConfig")
        public ListDataAgentSessionResponseBodyDataSessionConfig sessionConfig;

        /**
         * <p>The Data Agent session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>h8r********4fch</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>The session status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("SessionStatus")
        public String sessionStatus;

        /**
         * <p>The title.</p>
         * 
         * <strong>example:</strong>
         * <p>分析一下这份文件，给出报告。</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The ID of the session owner.</p>
         * 
         * <strong>example:</strong>
         * <p>2096******</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListDataAgentSessionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataAgentSessionResponseBodyData self = new ListDataAgentSessionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataAgentSessionResponseBodyData setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListDataAgentSessionResponseBodyData setAgentStatus(String agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }
        public String getAgentStatus() {
            return this.agentStatus;
        }

        public ListDataAgentSessionResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDataAgentSessionResponseBodyData setFavoriteInWorkspace(Boolean favoriteInWorkspace) {
            this.favoriteInWorkspace = favoriteInWorkspace;
            return this;
        }
        public Boolean getFavoriteInWorkspace() {
            return this.favoriteInWorkspace;
        }

        public ListDataAgentSessionResponseBodyData setFile(String file) {
            this.file = file;
            return this;
        }
        public String getFile() {
            return this.file;
        }

        public ListDataAgentSessionResponseBodyData setSaved(Boolean saved) {
            this.saved = saved;
            return this;
        }
        public Boolean getSaved() {
            return this.saved;
        }

        public ListDataAgentSessionResponseBodyData setSessionConfig(ListDataAgentSessionResponseBodyDataSessionConfig sessionConfig) {
            this.sessionConfig = sessionConfig;
            return this;
        }
        public ListDataAgentSessionResponseBodyDataSessionConfig getSessionConfig() {
            return this.sessionConfig;
        }

        public ListDataAgentSessionResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public ListDataAgentSessionResponseBodyData setSessionStatus(String sessionStatus) {
            this.sessionStatus = sessionStatus;
            return this;
        }
        public String getSessionStatus() {
            return this.sessionStatus;
        }

        public ListDataAgentSessionResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListDataAgentSessionResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}

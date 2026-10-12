// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListCustomAgentMonitorSessionsResponseBody extends TeaModel {
    /**
     * <p>The response struct.</p>
     */
    @NameInMap("Data")
    public ListCustomAgentMonitorSessionsResponseBodyData data;

    /**
     * <p>The error code returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidTid</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Specified parameter Tid is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E0D21075-CD3E-4D98-8264-FD8AD04A63B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListCustomAgentMonitorSessionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomAgentMonitorSessionsResponseBody self = new ListCustomAgentMonitorSessionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomAgentMonitorSessionsResponseBody setData(ListCustomAgentMonitorSessionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCustomAgentMonitorSessionsResponseBodyData getData() {
        return this.data;
    }

    public ListCustomAgentMonitorSessionsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListCustomAgentMonitorSessionsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListCustomAgentMonitorSessionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomAgentMonitorSessionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCustomAgentMonitorSessionsResponseBodyDataContent extends TeaModel {
        /**
         * <p>The Alibaba Cloud UID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>20372822********</p>
         */
        @NameInMap("AliyunUid")
        public String aliyunUid;

        /**
         * <p>The display name of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>HaoY***</p>
         */
        @NameInMap("CreatorUserName")
        public String creatorUserName;

        /**
         * <p>The custom agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-4y3ca4khkcu**********ysf</p>
         */
        @NameInMap("CustomAgentId")
        public String customAgentId;

        /**
         * <p>The number of dislikes for the session.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DislikeCount")
        public Long dislikeCount;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-18T10:02:04+08:00</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-11T14:04:32.000+00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The number of likes for the session.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("LikeCount")
        public Long likeCount;

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2gum46f149******ndfxxo</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>The session status. Valid values:</p>
         * <ul>
         * <li>init: The session is in the initial state.</li>
         * <li>INITIALIZING: The session is being initialized.</li>
         * <li>RUNNING: The session is running.</li>
         * <li>IDLE: The session is idle.</li>
         * <li>RECOVERABLE: The session is completed and can accept further questions.</li>
         * <li>UNAVAILABLE: The session is completed and cannot accept further questions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The session name.</p>
         * 
         * <strong>example:</strong>
         * <p>Please analyze this data</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The total number of turns in the session.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TurnCount")
        public Long turnCount;

        public static ListCustomAgentMonitorSessionsResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListCustomAgentMonitorSessionsResponseBodyDataContent self = new ListCustomAgentMonitorSessionsResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListCustomAgentMonitorSessionsResponseBodyDataContent setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public ListCustomAgentMonitorSessionsResponseBodyDataContent setCreatorUserName(String creatorUserName) {
            this.creatorUserName = creatorUserName;
            return this;
        }
        public String getCreatorUserName() {
            return this.creatorUserName;
        }

        public ListCustomAgentMonitorSessionsResponseBodyDataContent setCustomAgentId(String customAgentId) {
            this.customAgentId = customAgentId;
            return this;
        }
        public String getCustomAgentId() {
            return this.customAgentId;
        }

        public ListCustomAgentMonitorSessionsResponseBodyDataContent setDislikeCount(Long dislikeCount) {
            this.dislikeCount = dislikeCount;
            return this;
        }
        public Long getDislikeCount() {
            return this.dislikeCount;
        }

        public ListCustomAgentMonitorSessionsResponseBodyDataContent setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public ListCustomAgentMonitorSessionsResponseBodyDataContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListCustomAgentMonitorSessionsResponseBodyDataContent setLikeCount(Long likeCount) {
            this.likeCount = likeCount;
            return this;
        }
        public Long getLikeCount() {
            return this.likeCount;
        }

        public ListCustomAgentMonitorSessionsResponseBodyDataContent setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public ListCustomAgentMonitorSessionsResponseBodyDataContent setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListCustomAgentMonitorSessionsResponseBodyDataContent setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListCustomAgentMonitorSessionsResponseBodyDataContent setTurnCount(Long turnCount) {
            this.turnCount = turnCount;
            return this;
        }
        public Long getTurnCount() {
            return this.turnCount;
        }

    }

    public static class ListCustomAgentMonitorSessionsResponseBodyData extends TeaModel {
        /**
         * <p>The session details list for the current page, sorted by creation time in descending order.</p>
         */
        @NameInMap("Content")
        public java.util.List<ListCustomAgentMonitorSessionsResponseBodyDataContent> content;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of sessions within the filter scope.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalElements")
        public Long totalElements;

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPages")
        public Long totalPages;

        public static ListCustomAgentMonitorSessionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCustomAgentMonitorSessionsResponseBodyData self = new ListCustomAgentMonitorSessionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCustomAgentMonitorSessionsResponseBodyData setContent(java.util.List<ListCustomAgentMonitorSessionsResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListCustomAgentMonitorSessionsResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListCustomAgentMonitorSessionsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListCustomAgentMonitorSessionsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListCustomAgentMonitorSessionsResponseBodyData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

        public ListCustomAgentMonitorSessionsResponseBodyData setTotalPages(Long totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Long getTotalPages() {
            return this.totalPages;
        }

    }

}

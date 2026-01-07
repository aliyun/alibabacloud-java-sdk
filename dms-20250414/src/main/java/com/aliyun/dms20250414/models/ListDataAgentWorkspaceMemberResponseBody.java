// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataAgentWorkspaceMemberResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListDataAgentWorkspaceMemberResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>DMS-DA-40114</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>Specified parameter is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>E0D2-*****-A63B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDataAgentWorkspaceMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataAgentWorkspaceMemberResponseBody self = new ListDataAgentWorkspaceMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataAgentWorkspaceMemberResponseBody setData(ListDataAgentWorkspaceMemberResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDataAgentWorkspaceMemberResponseBodyData getData() {
        return this.data;
    }

    public ListDataAgentWorkspaceMemberResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataAgentWorkspaceMemberResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataAgentWorkspaceMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataAgentWorkspaceMemberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataAgentWorkspaceMemberResponseBodyDataContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1765961516</p>
         */
        @NameInMap("JoinTime")
        public String joinTime;

        /**
         * <strong>example:</strong>
         * <p>20282*****7591</p>
         */
        @NameInMap("MemberId")
        public String memberId;

        /**
         * <strong>example:</strong>
         * <p>member</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        /**
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("RunningTaskNumber")
        public Long runningTaskNumber;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TotalTaskNumber")
        public Long totalTaskNumber;

        /**
         * <strong>example:</strong>
         * <p>yunqitest</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static ListDataAgentWorkspaceMemberResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListDataAgentWorkspaceMemberResponseBodyDataContent self = new ListDataAgentWorkspaceMemberResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListDataAgentWorkspaceMemberResponseBodyDataContent setJoinTime(String joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public String getJoinTime() {
            return this.joinTime;
        }

        public ListDataAgentWorkspaceMemberResponseBodyDataContent setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public ListDataAgentWorkspaceMemberResponseBodyDataContent setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListDataAgentWorkspaceMemberResponseBodyDataContent setRunningTaskNumber(Long runningTaskNumber) {
            this.runningTaskNumber = runningTaskNumber;
            return this;
        }
        public Long getRunningTaskNumber() {
            return this.runningTaskNumber;
        }

        public ListDataAgentWorkspaceMemberResponseBodyDataContent setTotalTaskNumber(Long totalTaskNumber) {
            this.totalTaskNumber = totalTaskNumber;
            return this;
        }
        public Long getTotalTaskNumber() {
            return this.totalTaskNumber;
        }

        public ListDataAgentWorkspaceMemberResponseBodyDataContent setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ListDataAgentWorkspaceMemberResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public java.util.List<ListDataAgentWorkspaceMemberResponseBodyDataContent> content;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <strong>example:</strong>
         * <p>no use</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <strong>example:</strong>
         * <p>no use</p>
         */
        @NameInMap("TotalElements")
        public Long totalElements;

        /**
         * <strong>example:</strong>
         * <p>no use</p>
         */
        @NameInMap("TotalPages")
        public Long totalPages;

        public static ListDataAgentWorkspaceMemberResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataAgentWorkspaceMemberResponseBodyData self = new ListDataAgentWorkspaceMemberResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataAgentWorkspaceMemberResponseBodyData setContent(java.util.List<ListDataAgentWorkspaceMemberResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListDataAgentWorkspaceMemberResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListDataAgentWorkspaceMemberResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListDataAgentWorkspaceMemberResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListDataAgentWorkspaceMemberResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListDataAgentWorkspaceMemberResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListDataAgentWorkspaceMemberResponseBodyData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

        public ListDataAgentWorkspaceMemberResponseBodyData setTotalPages(Long totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Long getTotalPages() {
            return this.totalPages;
        }

    }

}

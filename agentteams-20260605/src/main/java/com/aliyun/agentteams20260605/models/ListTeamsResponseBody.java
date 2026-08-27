// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class ListTeamsResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list of team summaries.</p>
     * 
     * <strong>example:</strong>
     * <p>[...]</p>
     */
    @NameInMap("Items")
    public java.util.List<ListTeamsResponseBodyItems> items;

    /**
     * <p>The maximum number of records returned in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The pagination token for the next page. This parameter is empty if no more data is available.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>req-list-teams-001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of records that match the specified conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListTeamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTeamsResponseBody self = new ListTeamsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTeamsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTeamsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTeamsResponseBody setItems(java.util.List<ListTeamsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListTeamsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListTeamsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTeamsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTeamsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTeamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTeamsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTeamsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListTeamsResponseBodyItemsTeamMembers extends TeaModel {
        /**
         * <p>The team name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-team</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListTeamsResponseBodyItemsTeamMembers build(java.util.Map<String, ?> map) throws Exception {
            ListTeamsResponseBodyItemsTeamMembers self = new ListTeamsResponseBodyItemsTeamMembers();
            return TeaModel.build(map, self);
        }

        public ListTeamsResponseBodyItemsTeamMembers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListTeamsResponseBodyItems extends TeaModel {
        /**
         * <p>The name of the team administrator.</p>
         * 
         * <strong>example:</strong>
         * <p>admin-user</p>
         */
        @NameInMap("AdminName")
        public String adminName;

        /**
         * <p>The time when the team was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-01T12:00:00</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The team description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a team.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agentteams-test-001</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the team leader.</p>
         * 
         * <strong>example:</strong>
         * <p>leader-user</p>
         */
        @NameInMap("LeaderName")
        public String leaderName;

        /**
         * <p>The team name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-team</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The running status of the team. This parameter is empty when the team is running normally.</p>
         * 
         * <strong>example:</strong>
         * <p>Deleting</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of team members.</p>
         * 
         * <strong>example:</strong>
         * <p>[...]</p>
         */
        @NameInMap("TeamMembers")
        public java.util.List<ListTeamsResponseBodyItemsTeamMembers> teamMembers;

        /**
         * <p>The list of Worker names associated with the team.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;worker-1&quot;]</p>
         */
        @NameInMap("WorkerNames")
        public java.util.List<String> workerNames;

        public static ListTeamsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListTeamsResponseBodyItems self = new ListTeamsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListTeamsResponseBodyItems setAdminName(String adminName) {
            this.adminName = adminName;
            return this;
        }
        public String getAdminName() {
            return this.adminName;
        }

        public ListTeamsResponseBodyItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListTeamsResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTeamsResponseBodyItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListTeamsResponseBodyItems setLeaderName(String leaderName) {
            this.leaderName = leaderName;
            return this;
        }
        public String getLeaderName() {
            return this.leaderName;
        }

        public ListTeamsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTeamsResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTeamsResponseBodyItems setTeamMembers(java.util.List<ListTeamsResponseBodyItemsTeamMembers> teamMembers) {
            this.teamMembers = teamMembers;
            return this;
        }
        public java.util.List<ListTeamsResponseBodyItemsTeamMembers> getTeamMembers() {
            return this.teamMembers;
        }

        public ListTeamsResponseBodyItems setWorkerNames(java.util.List<String> workerNames) {
            this.workerNames = workerNames;
            return this;
        }
        public java.util.List<String> getWorkerNames() {
            return this.workerNames;
        }

    }

}

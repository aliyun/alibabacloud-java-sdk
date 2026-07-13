// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class ListTeamsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Items")
    public java.util.List<ListTeamsResponseBodyItems> items;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("AdminName")
        public String adminName;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Description")
        public String description;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LeaderName")
        public String leaderName;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        @NameInMap("TeamMembers")
        public java.util.List<ListTeamsResponseBodyItemsTeamMembers> teamMembers;

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

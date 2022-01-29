// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListSprintsResponseBody extends TeaModel {
    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("errorMsg")
    public String errorMsg;

    // 每页数量
    @NameInMap("maxResults")
    public Long maxResults;

    // 分页Token，没有下一页则为空
    @NameInMap("nextToken")
    public String nextToken;

    // 请求id，每次请求都是唯一值，便于后续排查问题
    @NameInMap("requestId")
    public String requestId;

    // 迭代信息
    @NameInMap("sprints")
    public java.util.List<ListSprintsResponseBodySprints> sprints;

    // true或者false
    @NameInMap("success")
    public Boolean success;

    // 总数
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListSprintsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSprintsResponseBody self = new ListSprintsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSprintsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListSprintsResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListSprintsResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListSprintsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSprintsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSprintsResponseBody setSprints(java.util.List<ListSprintsResponseBodySprints> sprints) {
        this.sprints = sprints;
        return this;
    }
    public java.util.List<ListSprintsResponseBodySprints> getSprints() {
        return this.sprints;
    }

    public ListSprintsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSprintsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListSprintsResponseBodySprints extends TeaModel {
        // 创建人id
        @NameInMap("creator")
        public String creator;

        // 描述信息
        @NameInMap("description")
        public String description;

        // 结束时间
        @NameInMap("endDate")
        public Long endDate;

        // 创建时间
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        // 修改时间
        @NameInMap("gmtModified")
        public Long gmtModified;

        // 迭代唯一标识符
        @NameInMap("identifier")
        public String identifier;

        // 修改人
        @NameInMap("modifier")
        public String modifier;

        // 迭代名称
        @NameInMap("name")
        public String name;

        // 可见范围
        @NameInMap("scope")
        public String scope;

        // 项目id
        @NameInMap("spaceIdentifier")
        public String spaceIdentifier;

        // 开始时间
        @NameInMap("startDate")
        public Long startDate;

        // 状态，未开始:Todo, 进行中:Doing, 已完成:Done
        @NameInMap("status")
        public String status;

        public static ListSprintsResponseBodySprints build(java.util.Map<String, ?> map) throws Exception {
            ListSprintsResponseBodySprints self = new ListSprintsResponseBodySprints();
            return TeaModel.build(map, self);
        }

        public ListSprintsResponseBodySprints setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListSprintsResponseBodySprints setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSprintsResponseBodySprints setEndDate(Long endDate) {
            this.endDate = endDate;
            return this;
        }
        public Long getEndDate() {
            return this.endDate;
        }

        public ListSprintsResponseBodySprints setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListSprintsResponseBodySprints setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListSprintsResponseBodySprints setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListSprintsResponseBodySprints setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListSprintsResponseBodySprints setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSprintsResponseBodySprints setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListSprintsResponseBodySprints setSpaceIdentifier(String spaceIdentifier) {
            this.spaceIdentifier = spaceIdentifier;
            return this;
        }
        public String getSpaceIdentifier() {
            return this.spaceIdentifier;
        }

        public ListSprintsResponseBodySprints setStartDate(Long startDate) {
            this.startDate = startDate;
            return this;
        }
        public Long getStartDate() {
            return this.startDate;
        }

        public ListSprintsResponseBodySprints setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}

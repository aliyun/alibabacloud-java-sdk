// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListPipelineGroupsResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("pipelineGroups")
    public java.util.List<ListPipelineGroupsResponseBodyPipelineGroups> pipelineGroups;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListPipelineGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineGroupsResponseBody self = new ListPipelineGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPipelineGroupsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListPipelineGroupsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListPipelineGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPipelineGroupsResponseBody setPipelineGroups(java.util.List<ListPipelineGroupsResponseBodyPipelineGroups> pipelineGroups) {
        this.pipelineGroups = pipelineGroups;
        return this;
    }
    public java.util.List<ListPipelineGroupsResponseBodyPipelineGroups> getPipelineGroups() {
        return this.pipelineGroups;
    }

    public ListPipelineGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPipelineGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListPipelineGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListPipelineGroupsResponseBodyPipelineGroups extends TeaModel {
        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        public static ListPipelineGroupsResponseBodyPipelineGroups build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineGroupsResponseBodyPipelineGroups self = new ListPipelineGroupsResponseBodyPipelineGroups();
            return TeaModel.build(map, self);
        }

        public ListPipelineGroupsResponseBodyPipelineGroups setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListPipelineGroupsResponseBodyPipelineGroups setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListPipelineGroupsResponseBodyPipelineGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}

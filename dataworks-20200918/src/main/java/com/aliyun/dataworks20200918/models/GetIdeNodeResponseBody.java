// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetIdeNodeResponseBody extends TeaModel {
    @NameInMap("Node")
    public GetIdeNodeResponseBodyNode node;

    @NameInMap("RequestId")
    public String requestId;

    public static GetIdeNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIdeNodeResponseBody self = new GetIdeNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIdeNodeResponseBody setNode(GetIdeNodeResponseBodyNode node) {
        this.node = node;
        return this;
    }
    public GetIdeNodeResponseBodyNode getNode() {
        return this.node;
    }

    public GetIdeNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetIdeNodeResponseBodyNode extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("Spec")
        public String spec;

        @NameInMap("TaskId")
        public Long taskId;

        public static GetIdeNodeResponseBodyNode build(java.util.Map<String, ?> map) throws Exception {
            GetIdeNodeResponseBodyNode self = new GetIdeNodeResponseBodyNode();
            return TeaModel.build(map, self);
        }

        public GetIdeNodeResponseBodyNode setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetIdeNodeResponseBodyNode setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetIdeNodeResponseBodyNode setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetIdeNodeResponseBodyNode setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetIdeNodeResponseBodyNode setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetIdeNodeResponseBodyNode setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetIdeNodeResponseBodyNode setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public GetIdeNodeResponseBodyNode setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}

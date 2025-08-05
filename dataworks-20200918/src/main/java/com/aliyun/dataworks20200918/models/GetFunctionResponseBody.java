// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetFunctionResponseBody extends TeaModel {
    @NameInMap("Function")
    public GetFunctionResponseBodyFunction function;

    @NameInMap("RequestId")
    public String requestId;

    public static GetFunctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionResponseBody self = new GetFunctionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFunctionResponseBody setFunction(GetFunctionResponseBodyFunction function) {
        this.function = function;
        return this;
    }
    public GetFunctionResponseBodyFunction getFunction() {
        return this.function;
    }

    public GetFunctionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetFunctionResponseBodyFunction extends TeaModel {
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

        public static GetFunctionResponseBodyFunction build(java.util.Map<String, ?> map) throws Exception {
            GetFunctionResponseBodyFunction self = new GetFunctionResponseBodyFunction();
            return TeaModel.build(map, self);
        }

        public GetFunctionResponseBodyFunction setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetFunctionResponseBodyFunction setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetFunctionResponseBodyFunction setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetFunctionResponseBodyFunction setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetFunctionResponseBodyFunction setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetFunctionResponseBodyFunction setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetFunctionResponseBodyFunction setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetFunctionResponseBody extends TeaModel {
    @NameInMap("Function")
    public GetFunctionResponseBodyFunction function;

    /**
     * <strong>example:</strong>
     * <p>6CF95929-6D12-5A88-8CC3-4B2F4C2EXXXX</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1724505917000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>860438872620113XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>1724506661000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>110755000425XXXX</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

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

        public GetFunctionResponseBodyFunction setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
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

        public GetFunctionResponseBodyFunction setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
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

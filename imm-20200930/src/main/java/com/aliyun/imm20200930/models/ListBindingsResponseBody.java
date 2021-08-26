// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ListBindingsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Bindings")
    public java.util.List<ListBindingsResponseBodyBindings> bindings;

    public static ListBindingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBindingsResponseBody self = new ListBindingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBindingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBindingsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListBindingsResponseBody setBindings(java.util.List<ListBindingsResponseBodyBindings> bindings) {
        this.bindings = bindings;
        return this;
    }
    public java.util.List<ListBindingsResponseBodyBindings> getBindings() {
        return this.bindings;
    }

    public static class ListBindingsResponseBodyBindingsBinding extends TeaModel {
        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("DatasetName")
        public String datasetName;

        @NameInMap("URI")
        public String URI;

        @NameInMap("State")
        public String state;

        @NameInMap("Phase")
        public String phase;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListBindingsResponseBodyBindingsBinding build(java.util.Map<String, ?> map) throws Exception {
            ListBindingsResponseBodyBindingsBinding self = new ListBindingsResponseBodyBindingsBinding();
            return TeaModel.build(map, self);
        }

        public ListBindingsResponseBodyBindingsBinding setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListBindingsResponseBodyBindingsBinding setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public ListBindingsResponseBodyBindingsBinding setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

        public ListBindingsResponseBodyBindingsBinding setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListBindingsResponseBodyBindingsBinding setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public ListBindingsResponseBodyBindingsBinding setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListBindingsResponseBodyBindingsBinding setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListBindingsResponseBodyBindingsBinding setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListBindingsResponseBodyBindings extends TeaModel {
        @NameInMap("Binding")
        public ListBindingsResponseBodyBindingsBinding binding;

        public static ListBindingsResponseBodyBindings build(java.util.Map<String, ?> map) throws Exception {
            ListBindingsResponseBodyBindings self = new ListBindingsResponseBodyBindings();
            return TeaModel.build(map, self);
        }

        public ListBindingsResponseBodyBindings setBinding(ListBindingsResponseBodyBindingsBinding binding) {
            this.binding = binding;
            return this;
        }
        public ListBindingsResponseBodyBindingsBinding getBinding() {
            return this.binding;
        }

    }

}

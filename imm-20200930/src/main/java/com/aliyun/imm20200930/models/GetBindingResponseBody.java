// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetBindingResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Binding")
    public GetBindingResponseBodyBinding binding;

    public static GetBindingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBindingResponseBody self = new GetBindingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBindingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBindingResponseBody setBinding(GetBindingResponseBodyBinding binding) {
        this.binding = binding;
        return this;
    }
    public GetBindingResponseBodyBinding getBinding() {
        return this.binding;
    }

    public static class GetBindingResponseBodyBinding extends TeaModel {
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

        public static GetBindingResponseBodyBinding build(java.util.Map<String, ?> map) throws Exception {
            GetBindingResponseBodyBinding self = new GetBindingResponseBodyBinding();
            return TeaModel.build(map, self);
        }

        public GetBindingResponseBodyBinding setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetBindingResponseBodyBinding setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public GetBindingResponseBodyBinding setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

        public GetBindingResponseBodyBinding setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetBindingResponseBodyBinding setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public GetBindingResponseBodyBinding setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetBindingResponseBodyBinding setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetBindingResponseBodyBinding setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}

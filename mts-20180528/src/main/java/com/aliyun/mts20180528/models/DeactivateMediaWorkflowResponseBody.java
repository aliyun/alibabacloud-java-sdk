// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class DeactivateMediaWorkflowResponseBody extends TeaModel {
    @NameInMap("MediaWorkflow")
    public DeactivateMediaWorkflowResponseBodyMediaWorkflow mediaWorkflow;

    @NameInMap("RequestId")
    public String requestId;

    public static DeactivateMediaWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeactivateMediaWorkflowResponseBody self = new DeactivateMediaWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public DeactivateMediaWorkflowResponseBody setMediaWorkflow(DeactivateMediaWorkflowResponseBodyMediaWorkflow mediaWorkflow) {
        this.mediaWorkflow = mediaWorkflow;
        return this;
    }
    public DeactivateMediaWorkflowResponseBodyMediaWorkflow getMediaWorkflow() {
        return this.mediaWorkflow;
    }

    public DeactivateMediaWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeactivateMediaWorkflowResponseBodyMediaWorkflow extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("MediaWorkflowId")
        public String mediaWorkflowId;

        @NameInMap("Name")
        public String name;

        @NameInMap("State")
        public String state;

        @NameInMap("Topology")
        public String topology;

        public static DeactivateMediaWorkflowResponseBodyMediaWorkflow build(java.util.Map<String, ?> map) throws Exception {
            DeactivateMediaWorkflowResponseBodyMediaWorkflow self = new DeactivateMediaWorkflowResponseBodyMediaWorkflow();
            return TeaModel.build(map, self);
        }

        public DeactivateMediaWorkflowResponseBodyMediaWorkflow setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DeactivateMediaWorkflowResponseBodyMediaWorkflow setMediaWorkflowId(String mediaWorkflowId) {
            this.mediaWorkflowId = mediaWorkflowId;
            return this;
        }
        public String getMediaWorkflowId() {
            return this.mediaWorkflowId;
        }

        public DeactivateMediaWorkflowResponseBodyMediaWorkflow setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeactivateMediaWorkflowResponseBodyMediaWorkflow setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DeactivateMediaWorkflowResponseBodyMediaWorkflow setTopology(String topology) {
            this.topology = topology;
            return this;
        }
        public String getTopology() {
            return this.topology;
        }

    }

}

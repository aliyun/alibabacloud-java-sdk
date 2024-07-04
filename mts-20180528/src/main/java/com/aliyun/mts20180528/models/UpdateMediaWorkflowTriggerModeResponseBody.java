// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class UpdateMediaWorkflowTriggerModeResponseBody extends TeaModel {
    @NameInMap("MediaWorkflow")
    public UpdateMediaWorkflowTriggerModeResponseBodyMediaWorkflow mediaWorkflow;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateMediaWorkflowTriggerModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaWorkflowTriggerModeResponseBody self = new UpdateMediaWorkflowTriggerModeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMediaWorkflowTriggerModeResponseBody setMediaWorkflow(UpdateMediaWorkflowTriggerModeResponseBodyMediaWorkflow mediaWorkflow) {
        this.mediaWorkflow = mediaWorkflow;
        return this;
    }
    public UpdateMediaWorkflowTriggerModeResponseBodyMediaWorkflow getMediaWorkflow() {
        return this.mediaWorkflow;
    }

    public UpdateMediaWorkflowTriggerModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateMediaWorkflowTriggerModeResponseBodyMediaWorkflow extends TeaModel {
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

        @NameInMap("TriggerMode")
        public String triggerMode;

        public static UpdateMediaWorkflowTriggerModeResponseBodyMediaWorkflow build(java.util.Map<String, ?> map) throws Exception {
            UpdateMediaWorkflowTriggerModeResponseBodyMediaWorkflow self = new UpdateMediaWorkflowTriggerModeResponseBodyMediaWorkflow();
            return TeaModel.build(map, self);
        }

        public UpdateMediaWorkflowTriggerModeResponseBodyMediaWorkflow setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public UpdateMediaWorkflowTriggerModeResponseBodyMediaWorkflow setMediaWorkflowId(String mediaWorkflowId) {
            this.mediaWorkflowId = mediaWorkflowId;
            return this;
        }
        public String getMediaWorkflowId() {
            return this.mediaWorkflowId;
        }

        public UpdateMediaWorkflowTriggerModeResponseBodyMediaWorkflow setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateMediaWorkflowTriggerModeResponseBodyMediaWorkflow setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateMediaWorkflowTriggerModeResponseBodyMediaWorkflow setTopology(String topology) {
            this.topology = topology;
            return this;
        }
        public String getTopology() {
            return this.topology;
        }

        public UpdateMediaWorkflowTriggerModeResponseBodyMediaWorkflow setTriggerMode(String triggerMode) {
            this.triggerMode = triggerMode;
            return this;
        }
        public String getTriggerMode() {
            return this.triggerMode;
        }

    }

}

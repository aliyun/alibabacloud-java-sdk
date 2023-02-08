// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateMediaWorkflowResponseBody extends TeaModel {
    /**
     * <p>The details of the media workflow.</p>
     */
    @NameInMap("MediaWorkflow")
    public UpdateMediaWorkflowResponseBodyMediaWorkflow mediaWorkflow;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateMediaWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaWorkflowResponseBody self = new UpdateMediaWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMediaWorkflowResponseBody setMediaWorkflow(UpdateMediaWorkflowResponseBodyMediaWorkflow mediaWorkflow) {
        this.mediaWorkflow = mediaWorkflow;
        return this;
    }
    public UpdateMediaWorkflowResponseBodyMediaWorkflow getMediaWorkflow() {
        return this.mediaWorkflow;
    }

    public UpdateMediaWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateMediaWorkflowResponseBodyMediaWorkflow extends TeaModel {
        /**
         * <p>The time when the media workflow was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the media workflow that is updated.</p>
         */
        @NameInMap("MediaWorkflowId")
        public String mediaWorkflowId;

        /**
         * <p>The name of the media workflow.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the media workflow. Valid values:</p>
         * <br>
         * <p>*   **Inactive**: The media workflow is deactivated.</p>
         * <p>*   **Active**: The media workflow is activated.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The topology of the media workflow.</p>
         */
        @NameInMap("Topology")
        public String topology;

        /**
         * <p>The trigger mode of the media workflow. Valid values:</p>
         * <br>
         * <p>*   **OssAutoTrigger**: The media workflow is automatically triggered.</p>
         * <p>*   **NotInAuto**: The media workflow is not automatically triggered.</p>
         */
        @NameInMap("TriggerMode")
        public String triggerMode;

        public static UpdateMediaWorkflowResponseBodyMediaWorkflow build(java.util.Map<String, ?> map) throws Exception {
            UpdateMediaWorkflowResponseBodyMediaWorkflow self = new UpdateMediaWorkflowResponseBodyMediaWorkflow();
            return TeaModel.build(map, self);
        }

        public UpdateMediaWorkflowResponseBodyMediaWorkflow setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public UpdateMediaWorkflowResponseBodyMediaWorkflow setMediaWorkflowId(String mediaWorkflowId) {
            this.mediaWorkflowId = mediaWorkflowId;
            return this;
        }
        public String getMediaWorkflowId() {
            return this.mediaWorkflowId;
        }

        public UpdateMediaWorkflowResponseBodyMediaWorkflow setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateMediaWorkflowResponseBodyMediaWorkflow setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateMediaWorkflowResponseBodyMediaWorkflow setTopology(String topology) {
            this.topology = topology;
            return this;
        }
        public String getTopology() {
            return this.topology;
        }

        public UpdateMediaWorkflowResponseBodyMediaWorkflow setTriggerMode(String triggerMode) {
            this.triggerMode = triggerMode;
            return this;
        }
        public String getTriggerMode() {
            return this.triggerMode;
        }

    }

}

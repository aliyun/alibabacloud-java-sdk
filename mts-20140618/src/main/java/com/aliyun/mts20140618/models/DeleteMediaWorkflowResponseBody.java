// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DeleteMediaWorkflowResponseBody extends TeaModel {
    /**
     * <p>The details of the media workflow.</p>
     */
    @NameInMap("MediaWorkflow")
    public DeleteMediaWorkflowResponseBodyMediaWorkflow mediaWorkflow;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMediaWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaWorkflowResponseBody self = new DeleteMediaWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMediaWorkflowResponseBody setMediaWorkflow(DeleteMediaWorkflowResponseBodyMediaWorkflow mediaWorkflow) {
        this.mediaWorkflow = mediaWorkflow;
        return this;
    }
    public DeleteMediaWorkflowResponseBodyMediaWorkflow getMediaWorkflow() {
        return this.mediaWorkflow;
    }

    public DeleteMediaWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteMediaWorkflowResponseBodyMediaWorkflow extends TeaModel {
        /**
         * <p>The time when the media workflow was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the media workflow that is deleted.</p>
         */
        @NameInMap("MediaWorkflowId")
        public String mediaWorkflowId;

        /**
         * <p>The name of the media workflow that is deleted.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the media workflow. The value is **Deleted**.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The topology of the media workflow.</p>
         */
        @NameInMap("Topology")
        public String topology;

        public static DeleteMediaWorkflowResponseBodyMediaWorkflow build(java.util.Map<String, ?> map) throws Exception {
            DeleteMediaWorkflowResponseBodyMediaWorkflow self = new DeleteMediaWorkflowResponseBodyMediaWorkflow();
            return TeaModel.build(map, self);
        }

        public DeleteMediaWorkflowResponseBodyMediaWorkflow setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DeleteMediaWorkflowResponseBodyMediaWorkflow setMediaWorkflowId(String mediaWorkflowId) {
            this.mediaWorkflowId = mediaWorkflowId;
            return this;
        }
        public String getMediaWorkflowId() {
            return this.mediaWorkflowId;
        }

        public DeleteMediaWorkflowResponseBodyMediaWorkflow setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteMediaWorkflowResponseBodyMediaWorkflow setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DeleteMediaWorkflowResponseBodyMediaWorkflow setTopology(String topology) {
            this.topology = topology;
            return this;
        }
        public String getTopology() {
            return this.topology;
        }

    }

}

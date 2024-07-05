// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateMediaWorkflowResponseBody extends TeaModel {
    /**
     * <p>The detailed information about the media workflow.</p>
     */
    @NameInMap("MediaWorkflow")
    public UpdateMediaWorkflowResponseBodyMediaWorkflow mediaWorkflow;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7D752035-97DA-54E5-88E2-E8405EEA****</p>
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
         * 
         * <strong>example:</strong>
         * <p>2016-04-01T05:29:38Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the media workflow that is updated.</p>
         * 
         * <strong>example:</strong>
         * <p>6307eb0d3f85477882d205aa040f****</p>
         */
        @NameInMap("MediaWorkflowId")
        public String mediaWorkflowId;

        /**
         * <p>The name of the media workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>examp-mediaworkflow-****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The state of the media workflow. Valid values:</p>
         * <ul>
         * <li><strong>Inactive</strong>: The media workflow is disabled.</li>
         * <li><strong>Active</strong>: The media workflow is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The topology of the media workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;Activities&quot;: {
         *             &quot;Act-Start&quot;: {
         *                   &quot;Parameters&quot;: {
         *                         &quot;PipelineId&quot;: &quot;130266f58161436a80bf07cb12c8****&quot;,
         *                         &quot;InputFile&quot;: &quot;{\&quot;Bucket\&quot;: \&quot;example-bucket-<strong><strong>\&quot;,\&quot;Location\&quot;: \&quot;cn-shanghai\&quot;}&quot;
         *                   },
         *                   &quot;Type&quot;: &quot;Start&quot;
         *             },
         *             &quot;Act-Report&quot;: {
         *                   &quot;Parameters&quot;: {},
         *                   &quot;Type&quot;: &quot;Report&quot;
         *             },
         *             &quot;Act-Transcode-M3U8&quot;: {
         *                   &quot;Parameters&quot;: {
         *                         &quot;Outputs&quot;: &quot;[{\&quot;Object\&quot;:\&quot;transcode/{ObjectPrefix}{FileName}\&quot;,\&quot;TemplateId\&quot;: \&quot;957d1719ee85ed6527b90cf62726</strong></strong>\&quot;}]&quot;,
         *                         &quot;OutputBucket&quot;: &quot;example-bucket-****&quot;,
         *                         &quot;OutputLocation&quot;: &quot;cn-shanghai&quot;
         *                   },
         *                   &quot;Type&quot;: &quot;Transcode&quot;
         *             }
         *       },
         *       &quot;Dependencies&quot;: {
         *             &quot;Act-Start&quot;: [
         *                   &quot;Act-Transcode-M3U8&quot;
         *             ],
         *             &quot;Act-Report&quot;: [],
         *             &quot;Act-Transcode-M3U8&quot;: [
         *                   &quot;Act-Report&quot;
         *             ]
         *       }
         * }</p>
         */
        @NameInMap("Topology")
        public String topology;

        /**
         * <p>The trigger mode of the media workflow. Valid values:</p>
         * <ul>
         * <li><strong>OssAutoTrigger</strong>: The media workflow is automatically triggered.</li>
         * <li><strong>NotInAuto</strong>: The media workflow is not automatically triggered.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OssAutoTrigger</p>
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

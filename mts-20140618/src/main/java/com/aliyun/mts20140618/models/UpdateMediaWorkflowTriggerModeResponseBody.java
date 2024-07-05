// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateMediaWorkflowTriggerModeResponseBody extends TeaModel {
    /**
     * <p>The information about the media workflow.</p>
     */
    @NameInMap("MediaWorkflow")
    public UpdateMediaWorkflowTriggerModeResponseBodyMediaWorkflow mediaWorkflow;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16CD0CDD-457E-420D-9755-8385075A1234</p>
     */
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
        /**
         * <p>The time when the media workflow was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-04-01T05:29:37Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the media workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>e00732b977da427d9177a4dee646****</p>
         */
        @NameInMap("MediaWorkflowId")
        public String mediaWorkflowId;

        /**
         * <p>The name of the media workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>example-mediaworkflow-****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the media workflow. Valid values:</p>
         * <ul>
         * <li><strong>Inactive</strong>: The media workflow is disabled.</li>
         * <li><strong>Active</strong>: The media workflow is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Inactive</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The topology of the media workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>{mediaworkflow&quot;,&quot;State&quot;:&quot;Active&quot;,&quot;Topology&quot;:&quot;{\&quot;Activities\&quot;:{\&quot;Act-Start\&quot;:{\&quot;Parameters\&quot;:{\&quot;PipelineId\&quot;:\&quot;130266f58161436a80bf07cb12c8****\&quot;,\&quot;InputFile\&quot;:\&quot;{\\\&quot;Bucket\\\&quot;: \\\&quot;example-bucket-<strong><strong>\\\&quot;,\\\&quot;Location\\\&quot;: \\\&quot;cn-shanghai\\\&quot;}\&quot;},\&quot;Type\&quot;:\&quot;Start\&quot;},\&quot;Act-Report\&quot;:{\&quot;Parameters\&quot;:{},\&quot;Type\&quot;:\&quot;Report\&quot;},\&quot;Act-Transcode-M3U8\&quot;:{\&quot;Parameters\&quot;:{\&quot;Outputs\&quot;:\&quot;[{\\\&quot;Object\\\&quot;:\\\&quot;transcode/{ObjectPrefix}{FileName}\\\&quot;,\\\&quot;TemplateId\\\&quot;: \\\&quot;957d1719ee85ed6527b90cf62726</strong></strong>\\\&quot;}]\&quot;,\&quot;OutputBucket\&quot;:\&quot;example-bucket-<strong><strong>\&quot;,\&quot;OutputLocation\&quot;:\&quot;cn-shanghai\&quot;},\&quot;Type\&quot;:\&quot;Transcode\&quot;}},\&quot;Dependencies\&quot;:{\&quot;Act-Start\&quot;:[\&quot;Act-Transcode-M3U8\&quot;],\&quot;Act-Report\&quot;:[],\&quot;Act-Transcode-M3U8\&quot;:[\&quot;Act-Report\&quot;]}}&quot;,&quot;MediaWorkflowId&quot;:&quot;93ab850b4f6f44eab54b6e91d24d</strong></strong>&quot;}]},&quot;RequestId&quot;:&quot;16CD0CDD-457E-420D-9755-8385075A1234&quot;}</p>
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
         * <p>NotInAuto</p>
         */
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

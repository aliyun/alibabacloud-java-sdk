// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DeactivateMediaWorkflowResponseBody extends TeaModel {
    /**
     * <p>The topology of the media workflow.</p>
     */
    @NameInMap("MediaWorkflow")
    public DeactivateMediaWorkflowResponseBodyMediaWorkflow mediaWorkflow;

    /**
     * <p>The name of the media workflow that is deactivated.</p>
     * 
     * <strong>example:</strong>
     * <p>16CD0CDD-457E-420D-9755-8385075A1234</p>
     */
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
        /**
         * <ul>
         * <li>After you deactivate a media workflow, you can modify the workflow information.</li>
         * <li>After you delete or deactivate a media workflow, the workflow cannot be used. In this case, the workflow is not automatically triggered when you upload a file to the bucket specified by the workflow.</li>
         * </ul>
         * <h2>Limits on QPS</h2>
         * <p>You can call this operation up to 100 times per second. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-for-media-processing/latest/qps-limit">QPS limits</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-04-01T05:29:37Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the media workflow that you want to deactivate. To obtain the ID of the media workflow, you can log on to the <strong>ApsaraVideo Media Processing (MPS) console</strong> and choose <strong>Workflows</strong> &gt; <strong>Workflow Settings</strong> in the left-side navigation pane.</p>
         * 
         * <strong>example:</strong>
         * <p>93ab850b4f6f44eab54b6e9181d4****</p>
         */
        @NameInMap("MediaWorkflowId")
        public String mediaWorkflowId;

        /**
         * <p>The details of the media workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>example-mediaworkflow-****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The topology of the media workflow.The status of the media workflow. The value is <strong>Inactive</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Inactive</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The status of the media workflow. The value is <strong>Inactive</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>{mediaworkflow&quot;,&quot;State&quot;:&quot;Active&quot;,&quot;Topology&quot;:&quot;{\&quot;Activities\&quot;:{\&quot;Act-Start\&quot;:{\&quot;Parameters\&quot;:{\&quot;PipelineId\&quot;:\&quot;130266f58161436a80bf07cb12c8****\&quot;,\&quot;InputFile\&quot;:\&quot;{\\\&quot;Bucket\\\&quot;: \\\&quot;example-bucket-<strong><strong>\\\&quot;,\\\&quot;Location\\\&quot;: \\\&quot;cn-shanghai\\\&quot;}\&quot;},\&quot;Type\&quot;:\&quot;Start\&quot;},\&quot;Act-Report\&quot;:{\&quot;Parameters\&quot;:{},\&quot;Type\&quot;:\&quot;Report\&quot;},\&quot;Act-Transcode-M3U8\&quot;:{\&quot;Parameters\&quot;:{\&quot;Outputs\&quot;:\&quot;[{\\\&quot;Object\\\&quot;:\\\&quot;transcode/{ObjectPrefix}{FileName}\\\&quot;,\\\&quot;TemplateId\\\&quot;: \\\&quot;957d1719ee85ed6527b90cf62726</strong></strong>\\\&quot;}]\&quot;,\&quot;OutputBucket\&quot;:\&quot;example-bucket-<strong><strong>\&quot;,\&quot;OutputLocation\&quot;:\&quot;cn-shanghai\&quot;},\&quot;Type\&quot;:\&quot;Transcode\&quot;}},\&quot;Dependencies\&quot;:{\&quot;Act-Start\&quot;:[\&quot;Act-Transcode-M3U8\&quot;],\&quot;Act-Report\&quot;:[],\&quot;Act-Transcode-M3U8\&quot;:[\&quot;Act-Report\&quot;]}}&quot;,&quot;MediaWorkflowId&quot;:&quot;93ab850b4f6f44eab54b6e91d24d</strong></strong>&quot;}]},&quot;RequestId&quot;:&quot;16CD0CDD-457E-420D-9755-8385075A1234&quot;}</p>
         */
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

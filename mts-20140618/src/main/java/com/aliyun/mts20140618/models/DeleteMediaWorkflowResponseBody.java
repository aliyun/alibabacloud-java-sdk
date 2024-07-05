// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DeleteMediaWorkflowResponseBody extends TeaModel {
    /**
     * <p>The information about the media workflow.</p>
     */
    @NameInMap("MediaWorkflow")
    public DeleteMediaWorkflowResponseBodyMediaWorkflow mediaWorkflow;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7D752035-97DA-54E5-88E2-E8405EEA4394</p>
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
         * 
         * <strong>example:</strong>
         * <p>2016-04-01T05:29:37Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the media workflow that is deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>93ab850b4f6f44eab54b6e9181d4****</p>
         */
        @NameInMap("MediaWorkflowId")
        public String mediaWorkflowId;

        /**
         * <p>The name of the media workflow that is deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>example-mediaworkflow-****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the media workflow. The value is <strong>Deleted</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Deleted</p>
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

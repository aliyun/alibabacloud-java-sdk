// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ActivateMediaWorkflowResponseBody extends TeaModel {
    /**
     * <p>The details of the media workflow.</p>
     */
    @NameInMap("MediaWorkflow")
    public ActivateMediaWorkflowResponseBodyMediaWorkflow mediaWorkflow;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A1326BD4-30B1-4CB6-Q123-3330B877B0D4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ActivateMediaWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ActivateMediaWorkflowResponseBody self = new ActivateMediaWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public ActivateMediaWorkflowResponseBody setMediaWorkflow(ActivateMediaWorkflowResponseBodyMediaWorkflow mediaWorkflow) {
        this.mediaWorkflow = mediaWorkflow;
        return this;
    }
    public ActivateMediaWorkflowResponseBodyMediaWorkflow getMediaWorkflow() {
        return this.mediaWorkflow;
    }

    public ActivateMediaWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ActivateMediaWorkflowResponseBodyMediaWorkflow extends TeaModel {
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
         * <p>93ab850b4f6f44eab54b6e9181d4****</p>
         */
        @NameInMap("MediaWorkflowId")
        public String mediaWorkflowId;

        /**
         * <p>The name of the media workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>mediaworkflow-example</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the media workflow. The value is <strong>Active</strong>.</p>
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
         * <p>{\&quot;Activities\&quot;:{\&quot;Act-Start\&quot;:{\&quot;Parameters\&quot;:{\&quot;PipelineId\&quot;:\&quot;130266f58161436a80bf07cb12c8****\&quot;,\&quot;InputFile\&quot;:\&quot;{\\\&quot;Bucket\\\&quot;: \\\&quot;example\\\&quot;,\\\&quot;Location\\\&quot;: \\\&quot;oss-cn-hangzhou\\\&quot;}\&quot;},\&quot;Type\&quot;:\&quot;Start\&quot;},\&quot;Act-Report\&quot;:{\&quot;Parameters\&quot;:{},\&quot;Type\&quot;:\&quot;Report\&quot;},\&quot;Act-Transcode-M3U8\&quot;:{\&quot;Parameters\&quot;:{\&quot;Outputs\&quot;:\&quot;[{\\\&quot;OutputObject\\\&quot;:\\\&quot;transcode%2F%7BObjectPrefix%7D%7BFileName%7D\\\&quot;,\\\&quot;TemplateId\\\&quot;: \\\&quot;957d1719ee85ed6527b90cf62726****\\\&quot;}]\&quot;,\&quot;OutputBucket\&quot;:\&quot;panda-vod-hls\&quot;,\&quot;OutputLocation\&quot;:\&quot;oss-cn-hangzhou\&quot;},\&quot;Type\&quot;:\&quot;Transcode\&quot;}},\&quot;Dependencies\&quot;:{\&quot;Act-Start\&quot;:[\&quot;Act-Transcode-M3U8\&quot;],\&quot;Act-Report\&quot;:[],\&quot;Act-Transcode-M3U8\&quot;:[\&quot;Act-Report\&quot;]}}</p>
         */
        @NameInMap("Topology")
        public String topology;

        public static ActivateMediaWorkflowResponseBodyMediaWorkflow build(java.util.Map<String, ?> map) throws Exception {
            ActivateMediaWorkflowResponseBodyMediaWorkflow self = new ActivateMediaWorkflowResponseBodyMediaWorkflow();
            return TeaModel.build(map, self);
        }

        public ActivateMediaWorkflowResponseBodyMediaWorkflow setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ActivateMediaWorkflowResponseBodyMediaWorkflow setMediaWorkflowId(String mediaWorkflowId) {
            this.mediaWorkflowId = mediaWorkflowId;
            return this;
        }
        public String getMediaWorkflowId() {
            return this.mediaWorkflowId;
        }

        public ActivateMediaWorkflowResponseBodyMediaWorkflow setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ActivateMediaWorkflowResponseBodyMediaWorkflow setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ActivateMediaWorkflowResponseBodyMediaWorkflow setTopology(String topology) {
            this.topology = topology;
            return this;
        }
        public String getTopology() {
            return this.topology;
        }

    }

}

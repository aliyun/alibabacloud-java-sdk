// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMediaWorkflowListResponseBody extends TeaModel {
    /**
     * <p>The media workflows.</p>
     */
    @NameInMap("MediaWorkflowList")
    public QueryMediaWorkflowListResponseBodyMediaWorkflowList mediaWorkflowList;

    /**
     * <p>The workflows that do not exist.</p>
     */
    @NameInMap("NonExistMediaWorkflowIds")
    public QueryMediaWorkflowListResponseBodyNonExistMediaWorkflowIds nonExistMediaWorkflowIds;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16CD0CDD-457E-420D-1234-8385075A618B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryMediaWorkflowListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaWorkflowListResponseBody self = new QueryMediaWorkflowListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMediaWorkflowListResponseBody setMediaWorkflowList(QueryMediaWorkflowListResponseBodyMediaWorkflowList mediaWorkflowList) {
        this.mediaWorkflowList = mediaWorkflowList;
        return this;
    }
    public QueryMediaWorkflowListResponseBodyMediaWorkflowList getMediaWorkflowList() {
        return this.mediaWorkflowList;
    }

    public QueryMediaWorkflowListResponseBody setNonExistMediaWorkflowIds(QueryMediaWorkflowListResponseBodyNonExistMediaWorkflowIds nonExistMediaWorkflowIds) {
        this.nonExistMediaWorkflowIds = nonExistMediaWorkflowIds;
        return this;
    }
    public QueryMediaWorkflowListResponseBodyNonExistMediaWorkflowIds getNonExistMediaWorkflowIds() {
        return this.nonExistMediaWorkflowIds;
    }

    public QueryMediaWorkflowListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryMediaWorkflowListResponseBodyMediaWorkflowListMediaWorkflow extends TeaModel {
        /**
         * <p>The time when the media workflow was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-04-01T05:29:38Z</p>
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
         * <p>example-mediaworkflow-****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The state of the media workflow. Valid values:</p>
         * <ul>
         * <li><strong>Inactive</strong>: The media workflow was deactivated.</li>
         * <li><strong>Active</strong>: The media workflow was activated.</li>
         * <li><strong>Deleted</strong>: The media workflow was deleted.</li>
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
         * <p>OssAutoTrigger</p>
         */
        @NameInMap("TriggerMode")
        public String triggerMode;

        public static QueryMediaWorkflowListResponseBodyMediaWorkflowListMediaWorkflow build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaWorkflowListResponseBodyMediaWorkflowListMediaWorkflow self = new QueryMediaWorkflowListResponseBodyMediaWorkflowListMediaWorkflow();
            return TeaModel.build(map, self);
        }

        public QueryMediaWorkflowListResponseBodyMediaWorkflowListMediaWorkflow setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryMediaWorkflowListResponseBodyMediaWorkflowListMediaWorkflow setMediaWorkflowId(String mediaWorkflowId) {
            this.mediaWorkflowId = mediaWorkflowId;
            return this;
        }
        public String getMediaWorkflowId() {
            return this.mediaWorkflowId;
        }

        public QueryMediaWorkflowListResponseBodyMediaWorkflowListMediaWorkflow setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMediaWorkflowListResponseBodyMediaWorkflowListMediaWorkflow setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryMediaWorkflowListResponseBodyMediaWorkflowListMediaWorkflow setTopology(String topology) {
            this.topology = topology;
            return this;
        }
        public String getTopology() {
            return this.topology;
        }

        public QueryMediaWorkflowListResponseBodyMediaWorkflowListMediaWorkflow setTriggerMode(String triggerMode) {
            this.triggerMode = triggerMode;
            return this;
        }
        public String getTriggerMode() {
            return this.triggerMode;
        }

    }

    public static class QueryMediaWorkflowListResponseBodyMediaWorkflowList extends TeaModel {
        @NameInMap("MediaWorkflow")
        public java.util.List<QueryMediaWorkflowListResponseBodyMediaWorkflowListMediaWorkflow> mediaWorkflow;

        public static QueryMediaWorkflowListResponseBodyMediaWorkflowList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaWorkflowListResponseBodyMediaWorkflowList self = new QueryMediaWorkflowListResponseBodyMediaWorkflowList();
            return TeaModel.build(map, self);
        }

        public QueryMediaWorkflowListResponseBodyMediaWorkflowList setMediaWorkflow(java.util.List<QueryMediaWorkflowListResponseBodyMediaWorkflowListMediaWorkflow> mediaWorkflow) {
            this.mediaWorkflow = mediaWorkflow;
            return this;
        }
        public java.util.List<QueryMediaWorkflowListResponseBodyMediaWorkflowListMediaWorkflow> getMediaWorkflow() {
            return this.mediaWorkflow;
        }

    }

    public static class QueryMediaWorkflowListResponseBodyNonExistMediaWorkflowIds extends TeaModel {
        @NameInMap("MediaWorkflowId")
        public java.util.List<String> mediaWorkflowId;

        public static QueryMediaWorkflowListResponseBodyNonExistMediaWorkflowIds build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaWorkflowListResponseBodyNonExistMediaWorkflowIds self = new QueryMediaWorkflowListResponseBodyNonExistMediaWorkflowIds();
            return TeaModel.build(map, self);
        }

        public QueryMediaWorkflowListResponseBodyNonExistMediaWorkflowIds setMediaWorkflowId(java.util.List<String> mediaWorkflowId) {
            this.mediaWorkflowId = mediaWorkflowId;
            return this;
        }
        public java.util.List<String> getMediaWorkflowId() {
            return this.mediaWorkflowId;
        }

    }

}

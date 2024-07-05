// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SearchMediaWorkflowResponseBody extends TeaModel {
    /**
     * <p>The details of the media workflows.</p>
     */
    @NameInMap("MediaWorkflowList")
    public SearchMediaWorkflowResponseBodyMediaWorkflowList mediaWorkflowList;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16CD0CDD-457E-420D-9755-8385075A1234</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static SearchMediaWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaWorkflowResponseBody self = new SearchMediaWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchMediaWorkflowResponseBody setMediaWorkflowList(SearchMediaWorkflowResponseBodyMediaWorkflowList mediaWorkflowList) {
        this.mediaWorkflowList = mediaWorkflowList;
        return this;
    }
    public SearchMediaWorkflowResponseBodyMediaWorkflowList getMediaWorkflowList() {
        return this.mediaWorkflowList;
    }

    public SearchMediaWorkflowResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public SearchMediaWorkflowResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public SearchMediaWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchMediaWorkflowResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class SearchMediaWorkflowResponseBodyMediaWorkflowListMediaWorkflow extends TeaModel {
        /**
         * <p>The time when the media workflow was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-04-01T05:38:41Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the media workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>88c6ca184c0e4578645b665e2a12****</p>
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
         * <li><strong>Inactive</strong>: The media workflow is deactivated.</li>
         * <li><strong>Active</strong>: The media workflow is activated.</li>
         * <li><strong>Deleted</strong>: The media workflow is deleted.</li>
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
         * <p>{&quot;MediaWorkflowList&quot;:{&quot;MediaWorkflow&quot;:[{&quot;CreationTime&quot;:&quot;2016-04-01T05:29:38Z&quot;,&quot;Name&quot;:&quot;example-mediaworkflow-<strong><strong>&quot;,&quot;State&quot;:&quot;Active&quot;,&quot;Topology&quot;:&quot;{\&quot;Activities\&quot;:{\&quot;Act-Start\&quot;:{\&quot;Parameters\&quot;:{\&quot;PipelineId\&quot;:\&quot;130266f58161436a80bf07cb12c8</strong></strong>\&quot;,\&quot;InputFile\&quot;:\&quot;{\\\&quot;Bucket\\\&quot;: \\\&quot;example-bucket-<strong><strong>\\\&quot;,\\\&quot;Location\\\&quot;: \\\&quot;example-location\\\&quot;}\&quot;},\&quot;Type\&quot;:\&quot;Start\&quot;},\&quot;Act-Report\&quot;:{\&quot;Parameters\&quot;:{},\&quot;Type\&quot;:\&quot;Report\&quot;},\&quot;Act-Transcode-M3U8\&quot;:{\&quot;Parameters\&quot;:{\&quot;Outputs\&quot;:\&quot;[{\\\&quot;Object\\\&quot;:\\\&quot;transcode/{ObjectPrefix}{FileName}\\\&quot;,\\\&quot;TemplateId\\\&quot;: \\\&quot;957d1719ee85ed6527b90cf62726</strong></strong>\\\&quot;}]\&quot;,\&quot;OutputBucket\&quot;:\&quot;example-bucket-<strong><strong>\&quot;,\&quot;OutputLocation\&quot;:\&quot;example-location\&quot;},\&quot;Type\&quot;:\&quot;Transcode\&quot;}},\&quot;Dependencies\&quot;:{\&quot;Act-Start\&quot;:[\&quot;Act-Transcode-M3U8\&quot;],\&quot;Act-Report\&quot;:[],\&quot;Act-Transcode-M3U8\&quot;:[\&quot;Act-Report\&quot;]}}&quot;,&quot;MediaWorkflowId&quot;:&quot;93ab850b4f6f44eab54b6e91d24d</strong></strong>&quot;}]},&quot;RequestId&quot;:&quot;16CD0CDD-457E-420D-9755-8385075A1234&quot;}</p>
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

        public static SearchMediaWorkflowResponseBodyMediaWorkflowListMediaWorkflow build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaWorkflowResponseBodyMediaWorkflowListMediaWorkflow self = new SearchMediaWorkflowResponseBodyMediaWorkflowListMediaWorkflow();
            return TeaModel.build(map, self);
        }

        public SearchMediaWorkflowResponseBodyMediaWorkflowListMediaWorkflow setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SearchMediaWorkflowResponseBodyMediaWorkflowListMediaWorkflow setMediaWorkflowId(String mediaWorkflowId) {
            this.mediaWorkflowId = mediaWorkflowId;
            return this;
        }
        public String getMediaWorkflowId() {
            return this.mediaWorkflowId;
        }

        public SearchMediaWorkflowResponseBodyMediaWorkflowListMediaWorkflow setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SearchMediaWorkflowResponseBodyMediaWorkflowListMediaWorkflow setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public SearchMediaWorkflowResponseBodyMediaWorkflowListMediaWorkflow setTopology(String topology) {
            this.topology = topology;
            return this;
        }
        public String getTopology() {
            return this.topology;
        }

        public SearchMediaWorkflowResponseBodyMediaWorkflowListMediaWorkflow setTriggerMode(String triggerMode) {
            this.triggerMode = triggerMode;
            return this;
        }
        public String getTriggerMode() {
            return this.triggerMode;
        }

    }

    public static class SearchMediaWorkflowResponseBodyMediaWorkflowList extends TeaModel {
        @NameInMap("MediaWorkflow")
        public java.util.List<SearchMediaWorkflowResponseBodyMediaWorkflowListMediaWorkflow> mediaWorkflow;

        public static SearchMediaWorkflowResponseBodyMediaWorkflowList build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaWorkflowResponseBodyMediaWorkflowList self = new SearchMediaWorkflowResponseBodyMediaWorkflowList();
            return TeaModel.build(map, self);
        }

        public SearchMediaWorkflowResponseBodyMediaWorkflowList setMediaWorkflow(java.util.List<SearchMediaWorkflowResponseBodyMediaWorkflowListMediaWorkflow> mediaWorkflow) {
            this.mediaWorkflow = mediaWorkflow;
            return this;
        }
        public java.util.List<SearchMediaWorkflowResponseBodyMediaWorkflowListMediaWorkflow> getMediaWorkflow() {
            return this.mediaWorkflow;
        }

    }

}

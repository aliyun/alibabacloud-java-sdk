// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMediaWorkflowListResponseBody extends TeaModel {
    /**
     * <p>The details of the media workflows.</p>
     */
    @NameInMap("MediaWorkflowList")
    public QueryMediaWorkflowListResponseBodyMediaWorkflowList mediaWorkflowList;

    /**
     * <p>The media workflow IDs that do not exist. This parameter is not returned if all specified media workflows are found.</p>
     */
    @NameInMap("NonExistMediaWorkflowIds")
    public QueryMediaWorkflowListResponseBodyNonExistMediaWorkflowIds nonExistMediaWorkflowIds;

    /**
     * <p>The ID of the request.</p>
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
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the media workflow.</p>
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
         * <p>*   **Deleted**: The media workflow is deleted.</p>
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

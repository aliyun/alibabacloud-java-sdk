// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class QueryMediaWorkflowListResponseBody extends TeaModel {
    @NameInMap("MediaWorkflowList")
    public QueryMediaWorkflowListResponseBodyMediaWorkflowList mediaWorkflowList;

    @NameInMap("NonExistMediaWorkflowIds")
    public QueryMediaWorkflowListResponseBodyNonExistMediaWorkflowIds nonExistMediaWorkflowIds;

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
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("MediaWorkflowId")
        public String mediaWorkflowId;

        @NameInMap("Name")
        public String name;

        @NameInMap("State")
        public String state;

        @NameInMap("Topology")
        public String topology;

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

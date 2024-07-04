// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class SearchMediaWorkflowResponseBody extends TeaModel {
    @NameInMap("MediaWorkflowList")
    public SearchMediaWorkflowResponseBodyMediaWorkflowList mediaWorkflowList;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

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

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
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
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

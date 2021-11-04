// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListCoverPipelineResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PipelineList")
    public ListCoverPipelineResponseBodyPipelineList pipelineList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListCoverPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCoverPipelineResponseBody self = new ListCoverPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCoverPipelineResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListCoverPipelineResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCoverPipelineResponseBody setPipelineList(ListCoverPipelineResponseBodyPipelineList pipelineList) {
        this.pipelineList = pipelineList;
        return this;
    }
    public ListCoverPipelineResponseBodyPipelineList getPipelineList() {
        return this.pipelineList;
    }

    public ListCoverPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCoverPipelineResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListCoverPipelineResponseBodyPipelineListPipeline extends TeaModel {
        @NameInMap("ExtendConfig")
        public String extendConfig;

        @NameInMap("Name")
        public String name;

        @NameInMap("NotifyConfig")
        public String notifyConfig;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Role")
        public String role;

        @NameInMap("State")
        public String state;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("quotaNum")
        public Integer quotaNum;

        @NameInMap("quotaUsed")
        public Integer quotaUsed;

        public static ListCoverPipelineResponseBodyPipelineListPipeline build(java.util.Map<String, ?> map) throws Exception {
            ListCoverPipelineResponseBodyPipelineListPipeline self = new ListCoverPipelineResponseBodyPipelineListPipeline();
            return TeaModel.build(map, self);
        }

        public ListCoverPipelineResponseBodyPipelineListPipeline setExtendConfig(String extendConfig) {
            this.extendConfig = extendConfig;
            return this;
        }
        public String getExtendConfig() {
            return this.extendConfig;
        }

        public ListCoverPipelineResponseBodyPipelineListPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCoverPipelineResponseBodyPipelineListPipeline setNotifyConfig(String notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }
        public String getNotifyConfig() {
            return this.notifyConfig;
        }

        public ListCoverPipelineResponseBodyPipelineListPipeline setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public ListCoverPipelineResponseBodyPipelineListPipeline setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public ListCoverPipelineResponseBodyPipelineListPipeline setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListCoverPipelineResponseBodyPipelineListPipeline setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListCoverPipelineResponseBodyPipelineListPipeline setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public ListCoverPipelineResponseBodyPipelineListPipeline setQuotaNum(Integer quotaNum) {
            this.quotaNum = quotaNum;
            return this;
        }
        public Integer getQuotaNum() {
            return this.quotaNum;
        }

        public ListCoverPipelineResponseBodyPipelineListPipeline setQuotaUsed(Integer quotaUsed) {
            this.quotaUsed = quotaUsed;
            return this;
        }
        public Integer getQuotaUsed() {
            return this.quotaUsed;
        }

    }

    public static class ListCoverPipelineResponseBodyPipelineList extends TeaModel {
        @NameInMap("Pipeline")
        public java.util.List<ListCoverPipelineResponseBodyPipelineListPipeline> pipeline;

        public static ListCoverPipelineResponseBodyPipelineList build(java.util.Map<String, ?> map) throws Exception {
            ListCoverPipelineResponseBodyPipelineList self = new ListCoverPipelineResponseBodyPipelineList();
            return TeaModel.build(map, self);
        }

        public ListCoverPipelineResponseBodyPipelineList setPipeline(java.util.List<ListCoverPipelineResponseBodyPipelineListPipeline> pipeline) {
            this.pipeline = pipeline;
            return this;
        }
        public java.util.List<ListCoverPipelineResponseBodyPipelineListPipeline> getPipeline() {
            return this.pipeline;
        }

    }

}

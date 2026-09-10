// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetBwmMigrationTaskWriterWorkflowListResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public java.util.List<GetBwmMigrationTaskWriterWorkflowListResponseBodyData> data;

    /**
     * <p>Indicates whether the result is empty.</p>
     */
    @NameInMap("empty")
    public Boolean empty;

    /**
     * <p>The error code. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>Indicates whether the result is not empty.</p>
     */
    @NameInMap("notEmpty")
    public Boolean notEmpty;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates success. A value of false indicates failure. If the call fails, check errCode and errMessage for details.</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("totalPages")
    public Integer totalPages;

    public static GetBwmMigrationTaskWriterWorkflowListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBwmMigrationTaskWriterWorkflowListResponseBody self = new GetBwmMigrationTaskWriterWorkflowListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBwmMigrationTaskWriterWorkflowListResponseBody setData(java.util.List<GetBwmMigrationTaskWriterWorkflowListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetBwmMigrationTaskWriterWorkflowListResponseBodyData> getData() {
        return this.data;
    }

    public GetBwmMigrationTaskWriterWorkflowListResponseBody setEmpty(Boolean empty) {
        this.empty = empty;
        return this;
    }
    public Boolean getEmpty() {
        return this.empty;
    }

    public GetBwmMigrationTaskWriterWorkflowListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetBwmMigrationTaskWriterWorkflowListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetBwmMigrationTaskWriterWorkflowListResponseBody setNotEmpty(Boolean notEmpty) {
        this.notEmpty = notEmpty;
        return this;
    }
    public Boolean getNotEmpty() {
        return this.notEmpty;
    }

    public GetBwmMigrationTaskWriterWorkflowListResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetBwmMigrationTaskWriterWorkflowListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetBwmMigrationTaskWriterWorkflowListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBwmMigrationTaskWriterWorkflowListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetBwmMigrationTaskWriterWorkflowListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public GetBwmMigrationTaskWriterWorkflowListResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class GetBwmMigrationTaskWriterWorkflowListResponseBodyData extends TeaModel {
        /**
         * <p>The cron expression.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("cron")
        public String cron;

        /**
         * <p>The database primary key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("id")
        public Integer id;

        /**
         * <p>The submit failure error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Submit failed</p>
         */
        @NameInMap("submitDetail")
        public String submitDetail;

        /**
         * <p>Filter by status. Valid values:</p>
         * <ul>
         * <li>WRT_INIT: Submit not started.</li>
         * <li>WRT_RUN: Submitting.</li>
         * <li>WRT_SUCC: All submitted successfully.</li>
         * <li>WRT_FAIL: All submissions failed.</li>
         * <li>WRT_PART_FAIL: Some submissions failed.</li>
         * <li>DPY_SUCC: Published successfully.</li>
         * <li>DPY_FAIL: Publish failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WRT_INIT</p>
         */
        @NameInMap("submitStatus")
        public String submitStatus;

        /**
         * <p>The workflow ID written to the target side.</p>
         * 
         * <strong>example:</strong>
         * <p>target_wf-12345</p>
         */
        @NameInMap("targetWorkflowId")
        public String targetWorkflowId;

        /**
         * <p>The workflow name on the target side.</p>
         * 
         * <strong>example:</strong>
         * <p>target_workflow_name</p>
         */
        @NameInMap("targetWorkflowName")
        public String targetWorkflowName;

        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("taskNodeCount")
        public Integer taskNodeCount;

        /**
         * <p>The actual workflow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>wf-12345</p>
         */
        @NameInMap("workflowId")
        public String workflowId;

        /**
         * <p>The workflow name.</p>
         * 
         * <strong>example:</strong>
         * <p>workflow_name</p>
         */
        @NameInMap("workflowName")
        public String workflowName;

        public static GetBwmMigrationTaskWriterWorkflowListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBwmMigrationTaskWriterWorkflowListResponseBodyData self = new GetBwmMigrationTaskWriterWorkflowListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBwmMigrationTaskWriterWorkflowListResponseBodyData setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public GetBwmMigrationTaskWriterWorkflowListResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public GetBwmMigrationTaskWriterWorkflowListResponseBodyData setSubmitDetail(String submitDetail) {
            this.submitDetail = submitDetail;
            return this;
        }
        public String getSubmitDetail() {
            return this.submitDetail;
        }

        public GetBwmMigrationTaskWriterWorkflowListResponseBodyData setSubmitStatus(String submitStatus) {
            this.submitStatus = submitStatus;
            return this;
        }
        public String getSubmitStatus() {
            return this.submitStatus;
        }

        public GetBwmMigrationTaskWriterWorkflowListResponseBodyData setTargetWorkflowId(String targetWorkflowId) {
            this.targetWorkflowId = targetWorkflowId;
            return this;
        }
        public String getTargetWorkflowId() {
            return this.targetWorkflowId;
        }

        public GetBwmMigrationTaskWriterWorkflowListResponseBodyData setTargetWorkflowName(String targetWorkflowName) {
            this.targetWorkflowName = targetWorkflowName;
            return this;
        }
        public String getTargetWorkflowName() {
            return this.targetWorkflowName;
        }

        public GetBwmMigrationTaskWriterWorkflowListResponseBodyData setTaskNodeCount(Integer taskNodeCount) {
            this.taskNodeCount = taskNodeCount;
            return this;
        }
        public Integer getTaskNodeCount() {
            return this.taskNodeCount;
        }

        public GetBwmMigrationTaskWriterWorkflowListResponseBodyData setWorkflowId(String workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public String getWorkflowId() {
            return this.workflowId;
        }

        public GetBwmMigrationTaskWriterWorkflowListResponseBodyData setWorkflowName(String workflowName) {
            this.workflowName = workflowName;
            return this;
        }
        public String getWorkflowName() {
            return this.workflowName;
        }

    }

}

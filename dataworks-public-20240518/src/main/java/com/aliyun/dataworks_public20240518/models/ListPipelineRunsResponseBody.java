// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListPipelineRunsResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListPipelineRunsResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7C352CB7-CD88-50CF-9D0D-E81BDF02XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPipelineRunsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineRunsResponseBody self = new ListPipelineRunsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPipelineRunsResponseBody setPagingInfo(ListPipelineRunsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListPipelineRunsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListPipelineRunsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPipelineRunsResponseBodyPagingInfoPipelineRunsStages extends TeaModel {
        /**
         * <p>The code of the stage.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV_CHECK</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The description of the stage.</p>
         * 
         * <strong>example:</strong>
         * <p>Check before going online to development</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The additional information about the stage.</p>
         */
        @NameInMap("Detail")
        public java.util.Map<String, ?> detail;

        /**
         * <p>The error message returned during the stage.</p>
         * 
         * <strong>example:</strong>
         * <p>Error message</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The name of the stage.</p>
         * 
         * <strong>example:</strong>
         * <p>Check before going online to development</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the stage.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Init</li>
         * <li>Running</li>
         * <li>Success</li>
         * <li>Fail</li>
         * <li>Termination</li>
         * <li>Cancel</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The step number of the stage.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Step")
        public Integer step;

        /**
         * <p>The type of the stage. This parameter indicates the operation type in the stage.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Deploy</li>
         * <li>Check</li>
         * <li>Offline</li>
         * <li>Build</li>
         * <li>Delete</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Check</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListPipelineRunsResponseBodyPagingInfoPipelineRunsStages build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineRunsResponseBodyPagingInfoPipelineRunsStages self = new ListPipelineRunsResponseBodyPagingInfoPipelineRunsStages();
            return TeaModel.build(map, self);
        }

        public ListPipelineRunsResponseBodyPagingInfoPipelineRunsStages setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListPipelineRunsResponseBodyPagingInfoPipelineRunsStages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPipelineRunsResponseBodyPagingInfoPipelineRunsStages setDetail(java.util.Map<String, ?> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.Map<String, ?> getDetail() {
            return this.detail;
        }

        public ListPipelineRunsResponseBodyPagingInfoPipelineRunsStages setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListPipelineRunsResponseBodyPagingInfoPipelineRunsStages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPipelineRunsResponseBodyPagingInfoPipelineRunsStages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPipelineRunsResponseBodyPagingInfoPipelineRunsStages setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

        public ListPipelineRunsResponseBodyPagingInfoPipelineRunsStages setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListPipelineRunsResponseBodyPagingInfoPipelineRuns extends TeaModel {
        /**
         * <p>The time when the process was created. This value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1702736654000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The creator of the process.</p>
         * 
         * <strong>example:</strong>
         * <p>110755000425XXXX</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>发布流程描述信息</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The process ID.</p>
         * 
         * <strong>example:</strong>
         * <p>097c73fe-ed6e-4fb1-b109-a5d59e46cd58</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The error message returned during the stage.</p>
         * 
         * <strong>example:</strong>
         * <p>Error message</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The time when the process was modified. This value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1702736654000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The DataWorks workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>70199</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The stages of the process.</p>
         */
        @NameInMap("Stages")
        public java.util.List<ListPipelineRunsResponseBodyPagingInfoPipelineRunsStages> stages;

        /**
         * <p>The status of the process.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Init</li>
         * <li>Running</li>
         * <li>Success</li>
         * <li>Fail</li>
         * <li>Termination</li>
         * <li>Cancel</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListPipelineRunsResponseBodyPagingInfoPipelineRuns build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineRunsResponseBodyPagingInfoPipelineRuns self = new ListPipelineRunsResponseBodyPagingInfoPipelineRuns();
            return TeaModel.build(map, self);
        }

        public ListPipelineRunsResponseBodyPagingInfoPipelineRuns setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListPipelineRunsResponseBodyPagingInfoPipelineRuns setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListPipelineRunsResponseBodyPagingInfoPipelineRuns setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPipelineRunsResponseBodyPagingInfoPipelineRuns setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListPipelineRunsResponseBodyPagingInfoPipelineRuns setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListPipelineRunsResponseBodyPagingInfoPipelineRuns setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListPipelineRunsResponseBodyPagingInfoPipelineRuns setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListPipelineRunsResponseBodyPagingInfoPipelineRuns setStages(java.util.List<ListPipelineRunsResponseBodyPagingInfoPipelineRunsStages> stages) {
            this.stages = stages;
            return this;
        }
        public java.util.List<ListPipelineRunsResponseBodyPagingInfoPipelineRunsStages> getStages() {
            return this.stages;
        }

        public ListPipelineRunsResponseBodyPagingInfoPipelineRuns setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListPipelineRunsResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The processes.</p>
         */
        @NameInMap("PipelineRuns")
        public java.util.List<ListPipelineRunsResponseBodyPagingInfoPipelineRuns> pipelineRuns;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2524</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListPipelineRunsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineRunsResponseBodyPagingInfo self = new ListPipelineRunsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListPipelineRunsResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListPipelineRunsResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPipelineRunsResponseBodyPagingInfo setPipelineRuns(java.util.List<ListPipelineRunsResponseBodyPagingInfoPipelineRuns> pipelineRuns) {
            this.pipelineRuns = pipelineRuns;
            return this;
        }
        public java.util.List<ListPipelineRunsResponseBodyPagingInfoPipelineRuns> getPipelineRuns() {
            return this.pipelineRuns;
        }

        public ListPipelineRunsResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDeploymentsResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListDeploymentsResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7C352CB7-CD88-50CF-9D0D-E81BDF02XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDeploymentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentsResponseBody self = new ListDeploymentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeploymentsResponseBody setPagingInfo(ListDeploymentsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListDeploymentsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListDeploymentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDeploymentsResponseBodyPagingInfoDeploymentsStages extends TeaModel {
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
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The name of the stage.</p>
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
         * <p>RUNNING</p>
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
         * <p>CHECK</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDeploymentsResponseBodyPagingInfoDeploymentsStages build(java.util.Map<String, ?> map) throws Exception {
            ListDeploymentsResponseBodyPagingInfoDeploymentsStages self = new ListDeploymentsResponseBodyPagingInfoDeploymentsStages();
            return TeaModel.build(map, self);
        }

        public ListDeploymentsResponseBodyPagingInfoDeploymentsStages setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListDeploymentsResponseBodyPagingInfoDeploymentsStages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDeploymentsResponseBodyPagingInfoDeploymentsStages setDetail(java.util.Map<String, ?> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.Map<String, ?> getDetail() {
            return this.detail;
        }

        public ListDeploymentsResponseBodyPagingInfoDeploymentsStages setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListDeploymentsResponseBodyPagingInfoDeploymentsStages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDeploymentsResponseBodyPagingInfoDeploymentsStages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDeploymentsResponseBodyPagingInfoDeploymentsStages setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

        public ListDeploymentsResponseBodyPagingInfoDeploymentsStages setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDeploymentsResponseBodyPagingInfoDeployments extends TeaModel {
        /**
         * <p>The time when the process was created. This value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1702736654000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the user who creates the process.</p>
         * 
         * <strong>example:</strong>
         * <p>110755000425XXXX</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The process ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ddf354a5-03df-48fc-94c1-cc973f79XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The error message returned if the process fails.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The time when the process was last modified. This value is a UNIX timestamp.</p>
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
         * <p>44683</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The stages of the process.</p>
         */
        @NameInMap("Stages")
        public java.util.List<ListDeploymentsResponseBodyPagingInfoDeploymentsStages> stages;

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
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListDeploymentsResponseBodyPagingInfoDeployments build(java.util.Map<String, ?> map) throws Exception {
            ListDeploymentsResponseBodyPagingInfoDeployments self = new ListDeploymentsResponseBodyPagingInfoDeployments();
            return TeaModel.build(map, self);
        }

        public ListDeploymentsResponseBodyPagingInfoDeployments setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDeploymentsResponseBodyPagingInfoDeployments setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListDeploymentsResponseBodyPagingInfoDeployments setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDeploymentsResponseBodyPagingInfoDeployments setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListDeploymentsResponseBodyPagingInfoDeployments setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListDeploymentsResponseBodyPagingInfoDeployments setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDeploymentsResponseBodyPagingInfoDeployments setStages(java.util.List<ListDeploymentsResponseBodyPagingInfoDeploymentsStages> stages) {
            this.stages = stages;
            return this;
        }
        public java.util.List<ListDeploymentsResponseBodyPagingInfoDeploymentsStages> getStages() {
            return this.stages;
        }

        public ListDeploymentsResponseBodyPagingInfoDeployments setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListDeploymentsResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The deployment processes.</p>
         */
        @NameInMap("Deployments")
        public java.util.List<ListDeploymentsResponseBodyPagingInfoDeployments> deployments;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public String pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2524</p>
         */
        @NameInMap("TotalCount")
        public String totalCount;

        public static ListDeploymentsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDeploymentsResponseBodyPagingInfo self = new ListDeploymentsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListDeploymentsResponseBodyPagingInfo setDeployments(java.util.List<ListDeploymentsResponseBodyPagingInfoDeployments> deployments) {
            this.deployments = deployments;
            return this;
        }
        public java.util.List<ListDeploymentsResponseBodyPagingInfoDeployments> getDeployments() {
            return this.deployments;
        }

        public ListDeploymentsResponseBodyPagingInfo setPageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public String getPageNumber() {
            return this.pageNumber;
        }

        public ListDeploymentsResponseBodyPagingInfo setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public ListDeploymentsResponseBodyPagingInfo setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

    }

}

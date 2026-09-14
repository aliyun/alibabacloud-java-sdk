// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCrossProjectDeploymentEnvironmentsResponseBody extends TeaModel {
    /**
     * <p>The business response.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;RequestId&quot;:&quot;735894D1-D5E5-50B8-8A6D-041C90A98B23&quot;,&quot;PageNumber&quot;:1,&quot;PageSize&quot;:10,&quot;TotalCount&quot;:1,&quot;DeploymentEnvironments&quot;:[{&quot;DeploymentEnvironmentId&quot;:101,&quot;Name&quot;:&quot;environment-101&quot;,&quot;SourceProjectId&quot;:10,&quot;TargetProjectId&quot;:20,&quot;TargetProjectName&quot;:&quot;target&quot;,&quot;Status&quot;:&quot;Enabled&quot;}]}</p>
     */
    @NameInMap("Data")
    public ListCrossProjectDeploymentEnvironmentsResponseBodyData data;

    /**
     * <p>The request ID, which is used to locate and troubleshoot this API call.</p>
     * 
     * <strong>example:</strong>
     * <p>735894D1-D5E5-50B8-8A6D-041C90A98B23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListCrossProjectDeploymentEnvironmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCrossProjectDeploymentEnvironmentsResponseBody self = new ListCrossProjectDeploymentEnvironmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCrossProjectDeploymentEnvironmentsResponseBody setData(ListCrossProjectDeploymentEnvironmentsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCrossProjectDeploymentEnvironmentsResponseBodyData getData() {
        return this.data;
    }

    public ListCrossProjectDeploymentEnvironmentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCrossProjectDeploymentEnvironmentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCrossProjectDeploymentEnvironmentsResponseBodyDataDeploymentEnvironments extends TeaModel {
        /**
         * <p>The cross-workspace deployment environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("DeploymentEnvironmentId")
        public Long deploymentEnvironmentId;

        /**
         * <p>The environment name.</p>
         * 
         * <strong>example:</strong>
         * <p>environment-101</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The source project workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SourceProjectId")
        public Long sourceProjectId;

        /**
         * <p>The environment status.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The target project workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TargetProjectId")
        public Long targetProjectId;

        /**
         * <p>The target project workspace name.</p>
         * 
         * <strong>example:</strong>
         * <p>target</p>
         */
        @NameInMap("TargetProjectName")
        public String targetProjectName;

        public static ListCrossProjectDeploymentEnvironmentsResponseBodyDataDeploymentEnvironments build(java.util.Map<String, ?> map) throws Exception {
            ListCrossProjectDeploymentEnvironmentsResponseBodyDataDeploymentEnvironments self = new ListCrossProjectDeploymentEnvironmentsResponseBodyDataDeploymentEnvironments();
            return TeaModel.build(map, self);
        }

        public ListCrossProjectDeploymentEnvironmentsResponseBodyDataDeploymentEnvironments setDeploymentEnvironmentId(Long deploymentEnvironmentId) {
            this.deploymentEnvironmentId = deploymentEnvironmentId;
            return this;
        }
        public Long getDeploymentEnvironmentId() {
            return this.deploymentEnvironmentId;
        }

        public ListCrossProjectDeploymentEnvironmentsResponseBodyDataDeploymentEnvironments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCrossProjectDeploymentEnvironmentsResponseBodyDataDeploymentEnvironments setSourceProjectId(Long sourceProjectId) {
            this.sourceProjectId = sourceProjectId;
            return this;
        }
        public Long getSourceProjectId() {
            return this.sourceProjectId;
        }

        public ListCrossProjectDeploymentEnvironmentsResponseBodyDataDeploymentEnvironments setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCrossProjectDeploymentEnvironmentsResponseBodyDataDeploymentEnvironments setTargetProjectId(Long targetProjectId) {
            this.targetProjectId = targetProjectId;
            return this;
        }
        public Long getTargetProjectId() {
            return this.targetProjectId;
        }

        public ListCrossProjectDeploymentEnvironmentsResponseBodyDataDeploymentEnvironments setTargetProjectName(String targetProjectName) {
            this.targetProjectName = targetProjectName;
            return this;
        }
        public String getTargetProjectName() {
            return this.targetProjectName;
        }

    }

    public static class ListCrossProjectDeploymentEnvironmentsResponseBodyData extends TeaModel {
        /**
         * <p>The list of enabled cross-workspace deployment environments in the source project.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;DeploymentEnvironmentId&quot;:101,&quot;Name&quot;:&quot;environment-101&quot;,&quot;SourceProjectId&quot;:10,&quot;TargetProjectId&quot;:20,&quot;TargetProjectName&quot;:&quot;target&quot;,&quot;Status&quot;:&quot;Enabled&quot;}]</p>
         */
        @NameInMap("DeploymentEnvironments")
        public java.util.List<ListCrossProjectDeploymentEnvironmentsResponseBodyDataDeploymentEnvironments> deploymentEnvironments;

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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>735894D1-D5E5-50B8-8A6D-041C90A98B23</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCrossProjectDeploymentEnvironmentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCrossProjectDeploymentEnvironmentsResponseBodyData self = new ListCrossProjectDeploymentEnvironmentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCrossProjectDeploymentEnvironmentsResponseBodyData setDeploymentEnvironments(java.util.List<ListCrossProjectDeploymentEnvironmentsResponseBodyDataDeploymentEnvironments> deploymentEnvironments) {
            this.deploymentEnvironments = deploymentEnvironments;
            return this;
        }
        public java.util.List<ListCrossProjectDeploymentEnvironmentsResponseBodyDataDeploymentEnvironments> getDeploymentEnvironments() {
            return this.deploymentEnvironments;
        }

        public ListCrossProjectDeploymentEnvironmentsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCrossProjectDeploymentEnvironmentsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCrossProjectDeploymentEnvironmentsResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListCrossProjectDeploymentEnvironmentsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}

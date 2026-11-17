// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListSemanticJobsResponseBody extends TeaModel {
    /**
     * <p>The paged results of job definitions. Use the Name of a list item to run or delete a job, query its run records, or download its results. Use the ProjectId to query run details and logs, or stop a run.</p>
     */
    @NameInMap("Data")
    public ListSemanticJobsResponseBodyData data;

    /**
     * <p>The request ID. You can use the ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>676271D6-53B4-57BE-89FA-72F7AE1418DF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListSemanticJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSemanticJobsResponseBody self = new ListSemanticJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSemanticJobsResponseBody setData(ListSemanticJobsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSemanticJobsResponseBodyData getData() {
        return this.data;
    }

    public ListSemanticJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSemanticJobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSemanticJobsResponseBodyDataSemanticJobs extends TeaModel {
        /**
         * <p>The user identifier of the creator of the semantic job.</p>
         * 
         * <strong>example:</strong>
         * <p>user-demo</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1700000000000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The last modification time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1700000000000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The internal unique ID of the job definition.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The job name. This name is used in RunSemanticJob, DeleteSemanticJob, ListSemanticJobRuns, and DownloadSemanticResults.</p>
         * 
         * <strong>example:</strong>
         * <p>semantic-job-demo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the workspace to which the job belongs. This ID is used in GetSemanticJobDetail, GetSemanticJobLog, and KillSemanticJob.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The list of IDs of the uploaded files associated with the job.</p>
         */
        @NameInMap("ReferenceFileIds")
        public java.util.List<String> referenceFileIds;

        /**
         * <p>The list of URIs of the external reference files associated with the job.</p>
         */
        @NameInMap("ReferenceFileUris")
        public java.util.List<String> referenceFileUris;

        /**
         * <p>The identifier of the resource group used to run the job.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-demo</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The input data source configuration saved for the job. The job uses this configuration to determine the analysis scope at runtime.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;maxcompute&quot;,&quot;domain&quot;:&quot;sales&quot;,&quot;pinnedScopeInfo&quot;:[{&quot;type&quot;:&quot;project&quot;,&quot;name&quot;:&quot;mc_project&quot;}]}</p>
         */
        @NameInMap("Source")
        public java.util.Map<String, ?> source;

        /**
         * <p>The data source type saved in the Source.type field of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The user identifier of the creator of the semantic job.</p>
         * 
         * <strong>example:</strong>
         * <p>user-demo</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListSemanticJobsResponseBodyDataSemanticJobs build(java.util.Map<String, ?> map) throws Exception {
            ListSemanticJobsResponseBodyDataSemanticJobs self = new ListSemanticJobsResponseBodyDataSemanticJobs();
            return TeaModel.build(map, self);
        }

        public ListSemanticJobsResponseBodyDataSemanticJobs setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListSemanticJobsResponseBodyDataSemanticJobs setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListSemanticJobsResponseBodyDataSemanticJobs setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListSemanticJobsResponseBodyDataSemanticJobs setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListSemanticJobsResponseBodyDataSemanticJobs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSemanticJobsResponseBodyDataSemanticJobs setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListSemanticJobsResponseBodyDataSemanticJobs setReferenceFileIds(java.util.List<String> referenceFileIds) {
            this.referenceFileIds = referenceFileIds;
            return this;
        }
        public java.util.List<String> getReferenceFileIds() {
            return this.referenceFileIds;
        }

        public ListSemanticJobsResponseBodyDataSemanticJobs setReferenceFileUris(java.util.List<String> referenceFileUris) {
            this.referenceFileUris = referenceFileUris;
            return this;
        }
        public java.util.List<String> getReferenceFileUris() {
            return this.referenceFileUris;
        }

        public ListSemanticJobsResponseBodyDataSemanticJobs setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListSemanticJobsResponseBodyDataSemanticJobs setSource(java.util.Map<String, ?> source) {
            this.source = source;
            return this;
        }
        public java.util.Map<String, ?> getSource() {
            return this.source;
        }

        public ListSemanticJobsResponseBodyDataSemanticJobs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListSemanticJobsResponseBodyDataSemanticJobs setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListSemanticJobsResponseBodyData extends TeaModel {
        /**
         * <p>The page number of the returned page. Pages start from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of job definitions returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The list of job definitions.</p>
         */
        @NameInMap("SemanticJobs")
        public java.util.List<ListSemanticJobsResponseBodyDataSemanticJobs> semanticJobs;

        /**
         * <p>The total number of job definitions that meet the query conditions in the current tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListSemanticJobsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSemanticJobsResponseBodyData self = new ListSemanticJobsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSemanticJobsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListSemanticJobsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSemanticJobsResponseBodyData setSemanticJobs(java.util.List<ListSemanticJobsResponseBodyDataSemanticJobs> semanticJobs) {
            this.semanticJobs = semanticJobs;
            return this;
        }
        public java.util.List<ListSemanticJobsResponseBodyDataSemanticJobs> getSemanticJobs() {
            return this.semanticJobs;
        }

        public ListSemanticJobsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}

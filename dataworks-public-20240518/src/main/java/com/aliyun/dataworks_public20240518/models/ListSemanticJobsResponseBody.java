// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListSemanticJobsResponseBody extends TeaModel {
    /**
     * <p>The paginated result of job definitions. Use the Name field of a list item to run, delete, query run records, or download results. Use the ProjectId field to query run details, logs, or stop a run.</p>
     */
    @NameInMap("Data")
    public ListSemanticJobsResponseBodyData data;

    /**
     * <p>The request ID. Used for locating logs and troubleshooting issues.</p>
     * 
     * <strong>example:</strong>
     * <p>676271D6-53B4-57BE-89FA-72F7AE1418DF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
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
         * <p>The user identifier of the semantic job creator.</p>
         * 
         * <strong>example:</strong>
         * <p>user-demo</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The creation time, expressed as a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1700000000000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The last modification time, expressed as a UNIX timestamp in milliseconds.</p>
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
         * <p>The job name. Used for RunSemanticJob, DeleteSemanticJob, ListSemanticJobRuns, and DownloadSemanticResults.</p>
         * 
         * <strong>example:</strong>
         * <p>semantic-job-demo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The workspace ID to which the job belongs. Used for GetSemanticJobDetail, GetSemanticJobLog, and KillSemanticJob.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The list of uploaded file IDs associated with the job.</p>
         */
        @NameInMap("ReferenceFileIds")
        public java.util.List<String> referenceFileIds;

        /**
         * <p>The list of external reference file URIs associated with the job.</p>
         */
        @NameInMap("ReferenceFileUris")
        public java.util.List<String> referenceFileUris;

        /**
         * <p>The resource group identifier used when running this job.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-demo</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The input datasource config saved with the node. This configuration determines the analysis scope at runtime.</p>
         */
        @NameInMap("Source")
        public java.util.Map<String, ?> source;

        /**
         * <p>The Source.type data source type saved with the job.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The user identifier of the semantic job creator.</p>
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
         * <p>The page number returned, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of job definitions per page returned.</p>
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
         * <p>The total number of job definitions that meet the conditions in the current tenant.</p>
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

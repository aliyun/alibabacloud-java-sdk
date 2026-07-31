// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateSemanticJobResponseBody extends TeaModel {
    /**
     * <p>The saved semantic task definition. Use Data.Name to call RunSemanticJob, DeleteSemanticJob, ListSemanticJobRuns, and DownloadSemanticResults.</p>
     */
    @NameInMap("Data")
    public CreateSemanticJobResponseBodyData data;

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

    public static CreateSemanticJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSemanticJobResponseBody self = new CreateSemanticJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSemanticJobResponseBody setData(CreateSemanticJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSemanticJobResponseBodyData getData() {
        return this.data;
    }

    public CreateSemanticJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSemanticJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateSemanticJobResponseBodyData extends TeaModel {
        /**
         * <p>The task creator identifier, equivalent to UserId, used to display creation ownership.</p>
         * 
         * <strong>example:</strong>
         * <p>user-demo</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The creation time of the task definition, as a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1700000000000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The last modification time of the task definition, as a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1700000000000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The internal unique ID of the task definition, which identifies the task created by this call.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The saved task name. Use this value for subsequent run, delete, list runs, and download results operations.</p>
         * 
         * <strong>example:</strong>
         * <p>semantic-job-demo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The DataWorks workspace ID to which the task belongs. Use this value as the ProjectId for GetSemanticJobDetail, GetSemanticJobLog, and KillSemanticJob.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The list of associated uploaded file IDs. For singleTableFile, the single file in this list is read at runtime.</p>
         */
        @NameInMap("ReferenceFileIds")
        public java.util.List<String> referenceFileIds;

        /**
         * <p>The list of associated external reference file URIs. For singleTableFile, the single file in this list is read at runtime.</p>
         */
        @NameInMap("ReferenceFileUris")
        public java.util.List<String> referenceFileUris;

        /**
         * <p>The ID of the resource group that will be used when running this task.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-demo</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The saved input datasource config, corresponding to the Source in the creation request. The data scope to be analyzed is determined based on this configuration at runtime.</p>
         */
        @NameInMap("Source")
        public java.util.Map<String, ?> source;

        /**
         * <p>The saved Source.type data source type, used to quickly identify the task input type.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The identifier of the user who created the task.</p>
         * 
         * <strong>example:</strong>
         * <p>user-demo</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static CreateSemanticJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateSemanticJobResponseBodyData self = new CreateSemanticJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateSemanticJobResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public CreateSemanticJobResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateSemanticJobResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public CreateSemanticJobResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateSemanticJobResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateSemanticJobResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public CreateSemanticJobResponseBodyData setReferenceFileIds(java.util.List<String> referenceFileIds) {
            this.referenceFileIds = referenceFileIds;
            return this;
        }
        public java.util.List<String> getReferenceFileIds() {
            return this.referenceFileIds;
        }

        public CreateSemanticJobResponseBodyData setReferenceFileUris(java.util.List<String> referenceFileUris) {
            this.referenceFileUris = referenceFileUris;
            return this;
        }
        public java.util.List<String> getReferenceFileUris() {
            return this.referenceFileUris;
        }

        public CreateSemanticJobResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public CreateSemanticJobResponseBodyData setSource(java.util.Map<String, ?> source) {
            this.source = source;
            return this;
        }
        public java.util.Map<String, ?> getSource() {
            return this.source;
        }

        public CreateSemanticJobResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateSemanticJobResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}

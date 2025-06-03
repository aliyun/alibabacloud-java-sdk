// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDeploymentPackageFilesResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListDeploymentPackageFilesResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDeploymentPackageFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentPackageFilesResponseBody self = new ListDeploymentPackageFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeploymentPackageFilesResponseBody setPagingInfo(ListDeploymentPackageFilesResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListDeploymentPackageFilesResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListDeploymentPackageFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDeploymentPackageFilesResponseBodyPagingInfoDeploymentPackageFiles extends TeaModel {
        /**
         * <p>The change type, which is an integer. Valid values:</p>
         * <ul>
         * <li>0: addition</li>
         * <li>1: update</li>
         * <li>2: deletion</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ChangeType")
        public Integer changeType;

        /**
         * <p>The comment for committing.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The time for committing.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-10 15:55:47</p>
         */
        @NameInMap("CommitTime")
        public String commitTime;

        /**
         * <p>The ID of the Alibaba Cloud account used by the user who committed the file.</p>
         * 
         * <strong>example:</strong>
         * <p>446***</p>
         */
        @NameInMap("CommitUser")
        public String commitUser;

        /**
         * <p>The name of the Alibaba Cloud account used by the user who committed the file.</p>
         * 
         * <strong>example:</strong>
         * <p>user***</p>
         */
        @NameInMap("CommitUserName")
        public String commitUserName;

        /**
         * <p>The file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>520246913</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The name of the file of the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>bak_part_basc_person_relation_all_da</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The file type. The code for files varies based on the file type. For more information, see <a href="https://help.aliyun.com/document_detail/600169.html">DataWorks nodes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("FileType")
        public Integer fileType;

        /**
         * <p>The file version.</p>
         * 
         * <strong>example:</strong>
         * <p>34</p>
         */
        @NameInMap("FileVersion")
        public Long fileVersion;

        /**
         * <p>The unique ID.</p>
         * 
         * <strong>example:</strong>
         * <p>650433503</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Indicates whether the version is a version in the production environment of the scheduling system.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsSameAsProductionVersion")
        public Boolean isSameAsProductionVersion;

        /**
         * <p>The scheduling property configurations of the node that corresponds to the file, which is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;tagList&quot;: [],
         *     &quot;fileId&quot;: -1,
         *     &quot;taskRerunTime&quot;: 0,
         *     &quot;taskRerunInterval&quot;: 0,
         *     &quot;reRunAble&quot;: 1,
         *     &quot;nodeId&quot;: 125803000,
         *     &quot;nodeName&quot;: &quot;new&quot;,
         *     &quot;nodeType&quot;: 0,
         *     &quot;isStop&quot;: 0,
         *     &quot;paraValue&quot;: &quot;&quot;,
         *     &quot;startEffectDate&quot;: &quot;1970-01-01 00:00:00&quot;,
         *     &quot;endEffectDate&quot;: &quot;9999-01-01 00:00:00&quot;,
         *     &quot;cronExpress&quot;: &quot;00 26 00 * * ?&quot;,
         *     &quot;owner&quot;: &quot;1107550004250000&quot;,
         *     &quot;resgroupId&quot;: 6300000,
         *     &quot;cu&quot;: &quot;0.25&quot;,
         *     &quot;appId&quot;: 170000,
         *     &quot;tenantId&quot;: 524257424560000,
         *     &quot;createTime&quot;: &quot;2025-04-10 15:55:01&quot;,
         *     &quot;createUser&quot;: &quot;1107550004250000&quot;,
         *     &quot;lastModifyTime&quot;: &quot;2025-04-10 15:55:41&quot;,
         *     &quot;cycleType&quot;: 0,
         *     &quot;dependentType&quot;: 0,
         *     &quot;dependentTypeList&quot;: [0],
         *     &quot;lastModifyUser&quot;: &quot;1107550004250000&quot;,
         *     &quot;dependentDataNode&quot;: &quot;&quot;,
         *     &quot;input&quot;: &quot;[{\&quot;regionId\&quot;:\&quot;cn-hangzhou\&quot;,\&quot;str\&quot;:\&quot;root_input\&quot;,\&quot;parseType\&quot;:1}]&quot;,
         *     &quot;output&quot;: &quot;[{\&quot;str\&quot;:\&quot;project_root.526586287_out\&quot;,\&quot;parseType\&quot;:2},{\&quot;str\&quot;:\&quot;project_root.new\&quot;,\&quot;parseType\&quot;:1}]&quot;,
         *     &quot;inputList&quot;: [{
         *         &quot;regionId&quot;: &quot;cn-hangzhou&quot;,
         *         &quot;str&quot;: &quot;root_input&quot;,
         *         &quot;parseType&quot;: 1
         *     }],
         *     &quot;outputList&quot;: [{
         *         &quot;str&quot;: &quot;project_root.526586287_out&quot;,
         *         &quot;parseType&quot;: 2
         *     }, {
         *         &quot;str&quot;: &quot;project_root.new&quot;,
         *         &quot;parseType&quot;: 1
         *     }],
         *     &quot;isAutoParse&quot;: 1,
         *     &quot;startRightNow&quot;: false,
         *     &quot;extConfig&quot;: &quot;{\&quot;openCustomCron\&quot;:false,\&quot;formCron\&quot;:\&quot;\&quot;}&quot;,
         *     &quot;inputContextList&quot;: [],
         *     &quot;outputContextList&quot;: []
         * }</p>
         */
        @NameInMap("NodeConfiguration")
        public String nodeConfiguration;

        /**
         * <p>The ID of the auto triggered node that corresponds to the file.</p>
         * 
         * <strong>example:</strong>
         * <p>700005008419</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>27595</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The test status in the development environment.</p>
         */
        @NameInMap("SmokeTestStatus")
        public String smokeTestStatus;

        /**
         * <p>The status of the code for the file of the current version. Valid values:</p>
         * <ul>
         * <li>10: committing</li>
         * <li>11: committed to the development environment of the scheduling system</li>
         * <li>20: review passed</li>
         * <li>21: review failed</li>
         * <li>80: deployment package creation succeeded</li>
         * <li>100: deploying</li>
         * <li>101: deployed to the production environment</li>
         * <li>200: cancelled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The DataWorks tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>639415964191360</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        /**
         * <p>The module to which the file belongs. Valid values:</p>
         * <ul>
         * <li>NORMAL: The file is used for DataStudio.</li>
         * <li>MANUAL: The file is used for a manually triggered node.</li>
         * <li>MANUAL_BIZ: The file is used for a manually triggered workflow.</li>
         * <li>SKIP: The file is used for a dry-run node in DataStudio.</li>
         * <li>ADHOCQUERY: The file is used for an ad hoc query.</li>
         * <li>COMPONENT: The file is used for a script template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("UseType")
        public String useType;

        public static ListDeploymentPackageFilesResponseBodyPagingInfoDeploymentPackageFiles build(java.util.Map<String, ?> map) throws Exception {
            ListDeploymentPackageFilesResponseBodyPagingInfoDeploymentPackageFiles self = new ListDeploymentPackageFilesResponseBodyPagingInfoDeploymentPackageFiles();
            return TeaModel.build(map, self);
        }

        public ListDeploymentPackageFilesResponseBodyPagingInfoDeploymentPackageFiles setChangeType(Integer changeType) {
            this.changeType = changeType;
            return this;
        }
        public Integer getChangeType() {
            return this.changeType;
        }

        public ListDeploymentPackageFilesResponseBodyPagingInfoDeploymentPackageFiles setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListDeploymentPackageFilesResponseBodyPagingInfoDeploymentPackageFiles setCommitTime(String commitTime) {
            this.commitTime = commitTime;
            return this;
        }
        public String getCommitTime() {
            return this.commitTime;
        }

        public ListDeploymentPackageFilesResponseBodyPagingInfoDeploymentPackageFiles setCommitUser(String commitUser) {
            this.commitUser = commitUser;
            return this;
        }
        public String getCommitUser() {
            return this.commitUser;
        }

        public ListDeploymentPackageFilesResponseBodyPagingInfoDeploymentPackageFiles setCommitUserName(String commitUserName) {
            this.commitUserName = commitUserName;
            return this;
        }
        public String getCommitUserName() {
            return this.commitUserName;
        }

        public ListDeploymentPackageFilesResponseBodyPagingInfoDeploymentPackageFiles setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public ListDeploymentPackageFilesResponseBodyPagingInfoDeploymentPackageFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListDeploymentPackageFilesResponseBodyPagingInfoDeploymentPackageFiles setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public ListDeploymentPackageFilesResponseBodyPagingInfoDeploymentPackageFiles setFileVersion(Long fileVersion) {
            this.fileVersion = fileVersion;
            return this;
        }
        public Long getFileVersion() {
            return this.fileVersion;
        }

        public ListDeploymentPackageFilesResponseBodyPagingInfoDeploymentPackageFiles setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDeploymentPackageFilesResponseBodyPagingInfoDeploymentPackageFiles setIsSameAsProductionVersion(Boolean isSameAsProductionVersion) {
            this.isSameAsProductionVersion = isSameAsProductionVersion;
            return this;
        }
        public Boolean getIsSameAsProductionVersion() {
            return this.isSameAsProductionVersion;
        }

        public ListDeploymentPackageFilesResponseBodyPagingInfoDeploymentPackageFiles setNodeConfiguration(String nodeConfiguration) {
            this.nodeConfiguration = nodeConfiguration;
            return this;
        }
        public String getNodeConfiguration() {
            return this.nodeConfiguration;
        }

        public ListDeploymentPackageFilesResponseBodyPagingInfoDeploymentPackageFiles setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListDeploymentPackageFilesResponseBodyPagingInfoDeploymentPackageFiles setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDeploymentPackageFilesResponseBodyPagingInfoDeploymentPackageFiles setSmokeTestStatus(String smokeTestStatus) {
            this.smokeTestStatus = smokeTestStatus;
            return this;
        }
        public String getSmokeTestStatus() {
            return this.smokeTestStatus;
        }

        public ListDeploymentPackageFilesResponseBodyPagingInfoDeploymentPackageFiles setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListDeploymentPackageFilesResponseBodyPagingInfoDeploymentPackageFiles setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListDeploymentPackageFilesResponseBodyPagingInfoDeploymentPackageFiles setUseType(String useType) {
            this.useType = useType;
            return this;
        }
        public String getUseType() {
            return this.useType;
        }

    }

    public static class ListDeploymentPackageFilesResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The details of the versions of the files to be deployed.</p>
         */
        @NameInMap("DeploymentPackageFiles")
        public java.util.List<ListDeploymentPackageFilesResponseBodyPagingInfoDeploymentPackageFiles> deploymentPackageFiles;

        /**
         * <p>The page number. Pages start from page 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDeploymentPackageFilesResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDeploymentPackageFilesResponseBodyPagingInfo self = new ListDeploymentPackageFilesResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListDeploymentPackageFilesResponseBodyPagingInfo setDeploymentPackageFiles(java.util.List<ListDeploymentPackageFilesResponseBodyPagingInfoDeploymentPackageFiles> deploymentPackageFiles) {
            this.deploymentPackageFiles = deploymentPackageFiles;
            return this;
        }
        public java.util.List<ListDeploymentPackageFilesResponseBodyPagingInfoDeploymentPackageFiles> getDeploymentPackageFiles() {
            return this.deploymentPackageFiles;
        }

        public ListDeploymentPackageFilesResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDeploymentPackageFilesResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDeploymentPackageFilesResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}

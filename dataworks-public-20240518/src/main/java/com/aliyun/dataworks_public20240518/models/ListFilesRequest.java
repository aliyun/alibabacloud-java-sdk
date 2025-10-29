// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListFilesRequest extends TeaModel {
    /**
     * <p>The current commit status of the file. Valid values: 0 (the latest code is not committed) and 1 (the latest code is committed).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CommitStatus")
    public Integer commitStatus;

    /**
     * <p>The exact file name. The file name in the query result must exactly match this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>ods_create.sql</p>
     */
    @NameInMap("ExactFileName")
    public String exactFileName;

    /**
     * <p>The path to the folder where the file is located.</p>
     * 
     * <strong>example:</strong>
     * <p>Business_process/my_first_business_process/MaxCompute/ods_layer</p>
     */
    @NameInMap("FileFolderPath")
    public String fileFolderPath;

    /**
     * <p>The list of file IDs. The file IDs in the query result must be a subset of this list. You can specify up to 50 file IDs at a time.</p>
     * 
     * <strong>example:</strong>
     * <p>78237,816123</p>
     */
    @NameInMap("FileIdIn")
    public String fileIdIn;

    /**
     * <p>The code type of the file.</p>
     * <p>The code type of the file. Common code types and their corresponding file types include: 6 (Shell), 10 (ODPS SQL), 11 (ODPS MR), 23 (Data Integration), 24 (ODPS Script), 97 (PAI), 98 (Combined node), 99 (Virtual node), 221 (PyODPS 2), 225 (ODPS Spark), 227 (EMR Hive), 228 (EMR Spark), 229 (EMR Spark SQL), 230 (EMR MR), 239 (OSS object inspection), 257 (EMR Shell), 258 (EMR Spark Shell), 259 (EMR Presto), 260 (EMR Impala), 900 (Real-time sync), 1002 (PAI internal node), 1089 (Cross-tenant node), 1091 (Hologres development), 1093 (Hologres SQL), 1100 (Assignment node), 1106 (ForEach node), 1221 (PyODPS 3).</p>
     * 
     * <strong>example:</strong>
     * <p>10,23</p>
     */
    @NameInMap("FileTypes")
    public String fileTypes;

    /**
     * <p>The keyword for the file name. Fuzzy match is supported. You can enter a keyword to query all files that contain the keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>ods</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The Alibaba Cloud account ID of the user who last updated the file.</p>
     * 
     * <strong>example:</strong>
     * <p>11233***</p>
     */
    @NameInMap("LastEditUser")
    public String lastEditUser;

    /**
     * <p>Specifies whether the query result includes the path to the folder where the file is located.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedAbsoluteFolderPath")
    public Boolean needAbsoluteFolderPath;

    /**
     * <p>Specifies whether the query result includes the file content. For files with large content, network transmission delays may occur.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedContent")
    public Boolean needContent;

    /**
     * <p>The ID of the scheduling node. You can call the <a href="https://help.aliyun.com/document_detail/173979.html">ListNodes</a> operation to obtain the node ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123541234</p>
     */
    @NameInMap("NodeId")
    public Long nodeId;

    /**
     * <p>The ID of the file owner.</p>
     * 
     * <strong>example:</strong>
     * <p>3726346****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The page number for pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to obtain the ID.</p>
     * <p>You must configure either this parameter or the ProjectIdentifier parameter to determine the DataWorks workspace to which the operation is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The DataWorks workspace name. To obtain the workspace name, log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and navigate to the workspace configuration page.</p>
     * <p>You must specify either this parameter or ProjectId to identify the target DataWorks workspace for this API call.</p>
     * 
     * <strong>example:</strong>
     * <p>dw_project</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    /**
     * <p>The functional module to which the file belongs. Valid values:</p>
     * <ul>
     * <li>NORMAL: Data Studio</li>
     * <li>MANUAL: Manually triggered node</li>
     * <li>MANUAL_BIZ: Manually triggered workflow</li>
     * <li>SKIP: Dry-run scheduling in Data Studio</li>
     * <li>ADHOCQUERY: Ad hoc query</li>
     * <li>COMPONENT: Component management</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("UseType")
    public String useType;

    public static ListFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFilesRequest self = new ListFilesRequest();
        return TeaModel.build(map, self);
    }

    public ListFilesRequest setCommitStatus(Integer commitStatus) {
        this.commitStatus = commitStatus;
        return this;
    }
    public Integer getCommitStatus() {
        return this.commitStatus;
    }

    public ListFilesRequest setExactFileName(String exactFileName) {
        this.exactFileName = exactFileName;
        return this;
    }
    public String getExactFileName() {
        return this.exactFileName;
    }

    public ListFilesRequest setFileFolderPath(String fileFolderPath) {
        this.fileFolderPath = fileFolderPath;
        return this;
    }
    public String getFileFolderPath() {
        return this.fileFolderPath;
    }

    public ListFilesRequest setFileIdIn(String fileIdIn) {
        this.fileIdIn = fileIdIn;
        return this;
    }
    public String getFileIdIn() {
        return this.fileIdIn;
    }

    public ListFilesRequest setFileTypes(String fileTypes) {
        this.fileTypes = fileTypes;
        return this;
    }
    public String getFileTypes() {
        return this.fileTypes;
    }

    public ListFilesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListFilesRequest setLastEditUser(String lastEditUser) {
        this.lastEditUser = lastEditUser;
        return this;
    }
    public String getLastEditUser() {
        return this.lastEditUser;
    }

    public ListFilesRequest setNeedAbsoluteFolderPath(Boolean needAbsoluteFolderPath) {
        this.needAbsoluteFolderPath = needAbsoluteFolderPath;
        return this;
    }
    public Boolean getNeedAbsoluteFolderPath() {
        return this.needAbsoluteFolderPath;
    }

    public ListFilesRequest setNeedContent(Boolean needContent) {
        this.needContent = needContent;
        return this;
    }
    public Boolean getNeedContent() {
        return this.needContent;
    }

    public ListFilesRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

    public ListFilesRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListFilesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFilesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFilesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListFilesRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    public ListFilesRequest setUseType(String useType) {
        this.useType = useType;
        return this;
    }
    public String getUseType() {
        return this.useType;
    }

}

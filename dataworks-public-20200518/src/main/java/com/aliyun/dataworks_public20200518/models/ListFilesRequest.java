// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListFilesRequest extends TeaModel {
    @NameInMap("ExactFileName")
    public String exactFileName;

    /**
     * <p>The path of the files.</p>
     */
    @NameInMap("FileFolderPath")
    public String fileFolderPath;

    @NameInMap("FileIdIn")
    public String fileIdIn;

    /**
     * <p>The types of the code in the files.</p>
     * <br>
     * <p>Valid values: 6 (Shell), 10 (ODPS SQL), 11 (ODPS MR), 23 (Data Integration), 24 (ODPS Script), 97 (PAI), 98 (node group), 99 (zero load), 221 (PyODPS 2), 225 (ODPS Spark), 227 (EMR Hive), 228 (EMR Spark), 229 (EMR Spark SQL), 230 (EMR MR), 239 (OSS object inspection), 257 (EMR Shell), 258 (EMR Spark Shell), 259 (EMR Presto), 260 (EMR Impala), 900 (real-time synchronization), 1002 (PAI inner node), 1089 (cross-tenant collaboration), 1091 (Hologres development), 1093 (Hologres SQL), 1100 (assignment), 1106 (for-each), and 1221 (PyODPS 3).</p>
     */
    @NameInMap("FileTypes")
    public String fileTypes;

    /**
     * <p>The keyword in the file names. The keyword is used to perform a fuzzy match. You can specify a keyword to query all files whose names contain the keyword.</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("NeedAbsoluteFolderPath")
    public Boolean needAbsoluteFolderPath;

    @NameInMap("NeedContent")
    public Boolean needContent;

    /**
     * <p>The ID of the node that is scheduled. You can call the [ListNodes](https://help.aliyun.com/document_detail/173979.html) operation to query the ID of the node.</p>
     */
    @NameInMap("NodeId")
    public Long nodeId;

    /**
     * <p>The owner of the files.</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to obtain the workspace ID.</p>
     * <br>
     * <p>You must configure either the ProjectId or ProjectIdentifier parameter to determine the DataWorks workspace to which the operation is applied.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the DataWorks workspace. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to obtain the workspace name.</p>
     * <br>
     * <p>You must configure either the ProjectId or ProjectIdentifier parameter to determine the DataWorks workspace to which the operation is applied.</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    /**
     * <p>The module to which the files belong. Valid values:</p>
     * <br>
     * <p>*   NORMAL: The files are used for DataStudio.</p>
     * <p>*   MANUAL: The files are used for manually triggered nodes.</p>
     * <p>*   MANUAL_BIZ: The files are used for manually triggered workflows.</p>
     * <p>*   SKIP: The files are used for dry-run nodes in DataStudio.</p>
     * <p>*   ADHOCQUERY: The files are used for ad hoc queries.</p>
     * <p>*   COMPONENT: The files are used for snippets.</p>
     */
    @NameInMap("UseType")
    public String useType;

    public static ListFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFilesRequest self = new ListFilesRequest();
        return TeaModel.build(map, self);
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

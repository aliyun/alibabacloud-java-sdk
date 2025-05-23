// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListFilesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CommitStatus")
    public Integer commitStatus;

    /**
     * <strong>example:</strong>
     * <p>ods_create.sql</p>
     */
    @NameInMap("ExactFileName")
    public String exactFileName;

    /**
     * <strong>example:</strong>
     * <p>Business_process/my_first_business_process/MaxCompute/ods_layer</p>
     */
    @NameInMap("FileFolderPath")
    public String fileFolderPath;

    /**
     * <strong>example:</strong>
     * <p>78237,816123</p>
     */
    @NameInMap("FileIdIn")
    public String fileIdIn;

    /**
     * <strong>example:</strong>
     * <p>10,23</p>
     */
    @NameInMap("FileTypes")
    public String fileTypes;

    /**
     * <strong>example:</strong>
     * <p>ods</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>11233***</p>
     */
    @NameInMap("LastEditUser")
    public String lastEditUser;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedAbsoluteFolderPath")
    public Boolean needAbsoluteFolderPath;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedContent")
    public Boolean needContent;

    /**
     * <strong>example:</strong>
     * <p>123541234</p>
     */
    @NameInMap("NodeId")
    public Long nodeId;

    /**
     * <strong>example:</strong>
     * <p>3726346****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <strong>example:</strong>
     * <p>dw_project</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    /**
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

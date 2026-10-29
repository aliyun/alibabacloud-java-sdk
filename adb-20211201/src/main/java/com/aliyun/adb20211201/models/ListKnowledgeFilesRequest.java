// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListKnowledgeFilesRequest extends TeaModel {
    /**
     * <p>The ID of the ADB instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp19aaaaaa****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The JSON string of the file ID array, which contains up to 200 positive integers.</p>
     * 
     * <strong>example:</strong>
     * <p>[1001,1002,1003]</p>
     */
    @NameInMap("FileIds")
    public String fileIds;

    /**
     * <p>The URL of the knowledge base file.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://bucket_name/path/to/file</p>
     */
    @NameInMap("FileLocation")
    public String fileLocation;

    /**
     * <p>The page number. Pages start from 1. If you do not specify this parameter, the default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public String page;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. If you do not specify this parameter, the default value is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The processing status. Valid values: PENDING, PROCESSING, COMPLETED, FAILED, DUPLICATED, and SKIPPED.</p>
     * 
     * <strong>example:</strong>
     * <p>FAILED</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The stable ID of the authorized user. If you do not specify this parameter, all files in the knowledge base can be queried.</p>
     * 
     * <strong>example:</strong>
     * <p>u123</p>
     */
    @NameInMap("User")
    public String user;

    public static ListKnowledgeFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeFilesRequest self = new ListKnowledgeFilesRequest();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeFilesRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ListKnowledgeFilesRequest setFileIds(String fileIds) {
        this.fileIds = fileIds;
        return this;
    }
    public String getFileIds() {
        return this.fileIds;
    }

    public ListKnowledgeFilesRequest setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
        return this;
    }
    public String getFileLocation() {
        return this.fileLocation;
    }

    public ListKnowledgeFilesRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public ListKnowledgeFilesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListKnowledgeFilesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListKnowledgeFilesRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}

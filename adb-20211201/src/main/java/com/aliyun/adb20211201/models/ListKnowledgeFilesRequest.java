// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListKnowledgeFilesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp19aaaaaa****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>[1001,1002,1003]</p>
     */
    @NameInMap("FileIds")
    public String fileIds;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public String page;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p>FAILED</p>
     */
    @NameInMap("Status")
    public String status;

    /**
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

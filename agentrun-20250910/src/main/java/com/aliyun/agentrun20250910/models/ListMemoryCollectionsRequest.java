// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListMemoryCollectionsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>my-memory-1</p>
     */
    @NameInMap("memoryCollectionName")
    public String memoryCollectionName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>mem0</p>
     */
    @NameInMap("type")
    public String type;

    public static ListMemoryCollectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMemoryCollectionsRequest self = new ListMemoryCollectionsRequest();
        return TeaModel.build(map, self);
    }

    public ListMemoryCollectionsRequest setMemoryCollectionName(String memoryCollectionName) {
        this.memoryCollectionName = memoryCollectionName;
        return this;
    }
    public String getMemoryCollectionName() {
        return this.memoryCollectionName;
    }

    public ListMemoryCollectionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMemoryCollectionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMemoryCollectionsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListMemoryCollectionsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

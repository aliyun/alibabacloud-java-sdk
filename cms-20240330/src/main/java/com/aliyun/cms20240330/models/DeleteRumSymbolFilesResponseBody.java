// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteRumSymbolFilesResponseBody extends TeaModel {
    /**
     * <p>The actual number of objects that were successfully deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("deletedObjectCount")
    public Integer deletedObjectCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>request-1</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The number of file paths requested for deletion.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("requestedFileCount")
    public Integer requestedFileCount;

    /**
     * <p>The total number of deduplicated objects to be deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("requestedObjectCount")
    public Integer requestedObjectCount;

    /**
     * <p>Indicates whether all delete operations succeeded. The value is true only if all deduplicated objects to be deleted are successfully deleted. If a partial deletion failure or exception occurs, the API directly returns an error.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static DeleteRumSymbolFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRumSymbolFilesResponseBody self = new DeleteRumSymbolFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRumSymbolFilesResponseBody setDeletedObjectCount(Integer deletedObjectCount) {
        this.deletedObjectCount = deletedObjectCount;
        return this;
    }
    public Integer getDeletedObjectCount() {
        return this.deletedObjectCount;
    }

    public DeleteRumSymbolFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRumSymbolFilesResponseBody setRequestedFileCount(Integer requestedFileCount) {
        this.requestedFileCount = requestedFileCount;
        return this;
    }
    public Integer getRequestedFileCount() {
        return this.requestedFileCount;
    }

    public DeleteRumSymbolFilesResponseBody setRequestedObjectCount(Integer requestedObjectCount) {
        this.requestedObjectCount = requestedObjectCount;
        return this;
    }
    public Integer getRequestedObjectCount() {
        return this.requestedObjectCount;
    }

    public DeleteRumSymbolFilesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

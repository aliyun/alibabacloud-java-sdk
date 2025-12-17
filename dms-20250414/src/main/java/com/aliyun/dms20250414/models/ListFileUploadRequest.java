// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListFileUploadRequest extends TeaModel {
    @NameInMap("CallFrom")
    public String callFrom;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DmsUnit")
    public String dmsUnit;

    /**
     * <strong>example:</strong>
     * <p>TextReport</p>
     */
    @NameInMap("FileCategory")
    public String fileCategory;

    /**
     * <strong>example:</strong>
     * <p>Agent</p>
     */
    @NameInMap("FileFrom")
    public String fileFrom;

    /**
     * <strong>example:</strong>
     * <p>f-8*******01m</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <strong>example:</strong>
     * <p>h8r********4fch</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>gmtCreated</p>
     */
    @NameInMap("SortColumn")
    public String sortColumn;

    /**
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("SortDirection")
    public String sortDirection;

    public static ListFileUploadRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFileUploadRequest self = new ListFileUploadRequest();
        return TeaModel.build(map, self);
    }

    public ListFileUploadRequest setCallFrom(String callFrom) {
        this.callFrom = callFrom;
        return this;
    }
    public String getCallFrom() {
        return this.callFrom;
    }

    public ListFileUploadRequest setDmsUnit(String dmsUnit) {
        this.dmsUnit = dmsUnit;
        return this;
    }
    public String getDmsUnit() {
        return this.dmsUnit;
    }

    public ListFileUploadRequest setFileCategory(String fileCategory) {
        this.fileCategory = fileCategory;
        return this;
    }
    public String getFileCategory() {
        return this.fileCategory;
    }

    public ListFileUploadRequest setFileFrom(String fileFrom) {
        this.fileFrom = fileFrom;
        return this;
    }
    public String getFileFrom() {
        return this.fileFrom;
    }

    public ListFileUploadRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ListFileUploadRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ListFileUploadRequest setSortColumn(String sortColumn) {
        this.sortColumn = sortColumn;
        return this;
    }
    public String getSortColumn() {
        return this.sortColumn;
    }

    public ListFileUploadRequest setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
        return this;
    }
    public String getSortDirection() {
        return this.sortDirection;
    }

}

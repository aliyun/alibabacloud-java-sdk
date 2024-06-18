// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetSheetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("columnCount")
    public Long columnCount;

    /**
     * <strong>example:</strong>
     * <p>stxxxx</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("lastNonEmptyColumn")
    public Long lastNonEmptyColumn;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("lastNonEmptyRow")
    public Long lastNonEmptyRow;

    /**
     * <strong>example:</strong>
     * <p>Sheet1</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("rowCount")
    public Long rowCount;

    /**
     * <strong>example:</strong>
     * <p>visible</p>
     */
    @NameInMap("visibility")
    public String visibility;

    public static GetSheetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSheetResponseBody self = new GetSheetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSheetResponseBody setColumnCount(Long columnCount) {
        this.columnCount = columnCount;
        return this;
    }
    public Long getColumnCount() {
        return this.columnCount;
    }

    public GetSheetResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetSheetResponseBody setLastNonEmptyColumn(Long lastNonEmptyColumn) {
        this.lastNonEmptyColumn = lastNonEmptyColumn;
        return this;
    }
    public Long getLastNonEmptyColumn() {
        return this.lastNonEmptyColumn;
    }

    public GetSheetResponseBody setLastNonEmptyRow(Long lastNonEmptyRow) {
        this.lastNonEmptyRow = lastNonEmptyRow;
        return this;
    }
    public Long getLastNonEmptyRow() {
        return this.lastNonEmptyRow;
    }

    public GetSheetResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetSheetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSheetResponseBody setRowCount(Long rowCount) {
        this.rowCount = rowCount;
        return this;
    }
    public Long getRowCount() {
        return this.rowCount;
    }

    public GetSheetResponseBody setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

}

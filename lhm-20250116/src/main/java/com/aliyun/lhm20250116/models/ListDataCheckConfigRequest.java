// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListDataCheckConfigRequest extends TeaModel {
    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The source table name for fuzzy search.</p>
     * 
     * <strong>example:</strong>
     * <p>table_demo</p>
     */
    @NameInMap("srcTable")
    public String srcTable;

    /**
     * <p>The ID of the data validation task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("taskId")
    public Long taskId;

    public static ListDataCheckConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataCheckConfigRequest self = new ListDataCheckConfigRequest();
        return TeaModel.build(map, self);
    }

    public ListDataCheckConfigRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListDataCheckConfigRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataCheckConfigRequest setSrcTable(String srcTable) {
        this.srcTable = srcTable;
        return this;
    }
    public String getSrcTable() {
        return this.srcTable;
    }

    public ListDataCheckConfigRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}

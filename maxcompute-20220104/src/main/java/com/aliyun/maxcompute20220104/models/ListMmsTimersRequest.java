// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsTimersRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNum")
    public Integer pageNum;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>test_db_1</p>
     */
    @NameInMap("srcDbName")
    public String srcDbName;

    /**
     * <strong>example:</strong>
     * <p>test_table_1</p>
     */
    @NameInMap("srcTableName")
    public String srcTableName;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("stopped")
    public Boolean stopped;

    public static ListMmsTimersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMmsTimersRequest self = new ListMmsTimersRequest();
        return TeaModel.build(map, self);
    }

    public ListMmsTimersRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListMmsTimersRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListMmsTimersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMmsTimersRequest setSrcDbName(String srcDbName) {
        this.srcDbName = srcDbName;
        return this;
    }
    public String getSrcDbName() {
        return this.srcDbName;
    }

    public ListMmsTimersRequest setSrcTableName(String srcTableName) {
        this.srcTableName = srcTableName;
        return this;
    }
    public String getSrcTableName() {
        return this.srcTableName;
    }

    public ListMmsTimersRequest setStopped(Boolean stopped) {
        this.stopped = stopped;
        return this;
    }
    public Boolean getStopped() {
        return this.stopped;
    }

}

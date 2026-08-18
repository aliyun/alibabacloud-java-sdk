// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class Partition extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1700192563000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <strong>example:</strong>
     * <p>4096</p>
     */
    @NameInMap("DataSize")
    public Long dataSize;

    /**
     * <strong>example:</strong>
     * <p>1700192563000</p>
     */
    @NameInMap("ModifyTime")
    public Long modifyTime;

    /**
     * <strong>example:</strong>
     * <p>ds=20250101</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>1000000</p>
     */
    @NameInMap("RecordCount")
    public Long recordCount;

    /**
     * <strong>example:</strong>
     * <p>maxcompute-table:accountId::project::table</p>
     */
    @NameInMap("TableId")
    public String tableId;

    public static Partition build(java.util.Map<String, ?> map) throws Exception {
        Partition self = new Partition();
        return TeaModel.build(map, self);
    }

    public Partition setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public Partition setDataSize(Long dataSize) {
        this.dataSize = dataSize;
        return this;
    }
    public Long getDataSize() {
        return this.dataSize;
    }

    public Partition setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public Long getModifyTime() {
        return this.modifyTime;
    }

    public Partition setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Partition setRecordCount(Long recordCount) {
        this.recordCount = recordCount;
        return this;
    }
    public Long getRecordCount() {
        return this.recordCount;
    }

    public Partition setTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }
    public String getTableId() {
        return this.tableId;
    }

}

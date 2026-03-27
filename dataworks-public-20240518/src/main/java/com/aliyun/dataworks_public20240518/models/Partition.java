// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class Partition extends TeaModel {
    /**
     * <p>The creation time. This value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1700192563000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The storage size of the partition. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>4096</p>
     */
    @NameInMap("DataSize")
    public Long dataSize;

    /**
     * <p>The modification time. This value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1700192563000</p>
     */
    @NameInMap("ModifyTime")
    public Long modifyTime;

    /**
     * <p>The partition name.</p>
     * 
     * <strong>example:</strong>
     * <p>ds=20250101</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of records in the partition.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000</p>
     */
    @NameInMap("RecordCount")
    public Long recordCount;

    /**
     * <p>The ID of the table to which the partition belongs. You can configure this parameter by referring to the <code>Table</code> topic.</p>
     * 
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

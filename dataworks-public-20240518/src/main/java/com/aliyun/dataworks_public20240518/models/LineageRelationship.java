// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class LineageRelationship extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1743040581000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("DstEntity")
    public LineageEntity dstEntity;

    /**
     * <strong>example:</strong>
     * <p>maxcompute-table.p.table:custom-table.xxx:custom-sql.123</p>
     */
    @NameInMap("Id")
    public String id;

    @NameInMap("SrcEntity")
    public LineageEntity srcEntity;

    @NameInMap("Task")
    public LineageTask task;

    public static LineageRelationship build(java.util.Map<String, ?> map) throws Exception {
        LineageRelationship self = new LineageRelationship();
        return TeaModel.build(map, self);
    }

    public LineageRelationship setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public LineageRelationship setDstEntity(LineageEntity dstEntity) {
        this.dstEntity = dstEntity;
        return this;
    }
    public LineageEntity getDstEntity() {
        return this.dstEntity;
    }

    public LineageRelationship setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public LineageRelationship setSrcEntity(LineageEntity srcEntity) {
        this.srcEntity = srcEntity;
        return this;
    }
    public LineageEntity getSrcEntity() {
        return this.srcEntity;
    }

    public LineageRelationship setTask(LineageTask task) {
        this.task = task;
        return this;
    }
    public LineageTask getTask() {
        return this.task;
    }

}

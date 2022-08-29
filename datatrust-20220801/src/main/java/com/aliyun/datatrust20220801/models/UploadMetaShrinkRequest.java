// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class UploadMetaShrinkRequest extends TeaModel {
    @NameInMap("LsccTableDesc")
    public String lsccTableDesc;

    @NameInMap("LsccTableId")
    public Long lsccTableId;

    @NameInMap("LsccTableName")
    public String lsccTableName;

    @NameInMap("SourceTargetList")
    public String sourceTargetListShrink;

    public static UploadMetaShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadMetaShrinkRequest self = new UploadMetaShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UploadMetaShrinkRequest setLsccTableDesc(String lsccTableDesc) {
        this.lsccTableDesc = lsccTableDesc;
        return this;
    }
    public String getLsccTableDesc() {
        return this.lsccTableDesc;
    }

    public UploadMetaShrinkRequest setLsccTableId(Long lsccTableId) {
        this.lsccTableId = lsccTableId;
        return this;
    }
    public Long getLsccTableId() {
        return this.lsccTableId;
    }

    public UploadMetaShrinkRequest setLsccTableName(String lsccTableName) {
        this.lsccTableName = lsccTableName;
        return this;
    }
    public String getLsccTableName() {
        return this.lsccTableName;
    }

    public UploadMetaShrinkRequest setSourceTargetListShrink(String sourceTargetListShrink) {
        this.sourceTargetListShrink = sourceTargetListShrink;
        return this;
    }
    public String getSourceTargetListShrink() {
        return this.sourceTargetListShrink;
    }

}

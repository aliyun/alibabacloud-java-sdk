// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListSourceReplicaShrinkRequest extends TeaModel {
    @NameInMap("Context")
    public String contextShrink;

    @NameInMap("LpInstanceId")
    public String lpInstanceId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("SourceType")
    @Validation(required = true)
    public String sourceType;

    @NameInMap("PageNo")
    @Validation(required = true)
    public Integer pageNo;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    public static ListSourceReplicaShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSourceReplicaShrinkRequest self = new ListSourceReplicaShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListSourceReplicaShrinkRequest setContextShrink(String contextShrink) {
        this.contextShrink = contextShrink;
        return this;
    }
    public String getContextShrink() {
        return this.contextShrink;
    }

    public ListSourceReplicaShrinkRequest setLpInstanceId(String lpInstanceId) {
        this.lpInstanceId = lpInstanceId;
        return this;
    }
    public String getLpInstanceId() {
        return this.lpInstanceId;
    }

    public ListSourceReplicaShrinkRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ListSourceReplicaShrinkRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ListSourceReplicaShrinkRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListSourceReplicaShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}

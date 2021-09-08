// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListSourceReplicaRequest extends TeaModel {
    @NameInMap("Context")
    public java.util.Map<String, ?> context;

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

    public static ListSourceReplicaRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSourceReplicaRequest self = new ListSourceReplicaRequest();
        return TeaModel.build(map, self);
    }

    public ListSourceReplicaRequest setContext(java.util.Map<String, ?> context) {
        this.context = context;
        return this;
    }
    public java.util.Map<String, ?> getContext() {
        return this.context;
    }

    public ListSourceReplicaRequest setLpInstanceId(String lpInstanceId) {
        this.lpInstanceId = lpInstanceId;
        return this;
    }
    public String getLpInstanceId() {
        return this.lpInstanceId;
    }

    public ListSourceReplicaRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ListSourceReplicaRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ListSourceReplicaRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListSourceReplicaRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}

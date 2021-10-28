// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetPublicDatasetEntityResponseBody extends TeaModel {
    // 实体属性名称列表
    @NameInMap("Attributes")
    public java.util.List<String> attributes;

    // 公共数据集名称
    @NameInMap("DatasetName")
    public String datasetName;

    // 实体类型
    @NameInMap("EntityType")
    public String entityType;

    // 主机ID
    @NameInMap("HostId")
    public String hostId;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 该类型实体总数
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetPublicDatasetEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPublicDatasetEntityResponseBody self = new GetPublicDatasetEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPublicDatasetEntityResponseBody setAttributes(java.util.List<String> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.List<String> getAttributes() {
        return this.attributes;
    }

    public GetPublicDatasetEntityResponseBody setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public GetPublicDatasetEntityResponseBody setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public GetPublicDatasetEntityResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public GetPublicDatasetEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPublicDatasetEntityResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}

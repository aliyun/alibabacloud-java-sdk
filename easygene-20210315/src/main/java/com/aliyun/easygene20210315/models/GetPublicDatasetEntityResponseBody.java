// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetPublicDatasetEntityResponseBody extends TeaModel {
    @NameInMap("Attributes")
    public java.util.List<String> attributes;

    /**
     * <strong>example:</strong>
     * <p>西蒙斯基因组多样性计划</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <strong>example:</strong>
     * <p>sample</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <strong>example:</strong>
     * <p>easygene.cn-beijing.aliyuncs.com</p>
     */
    @NameInMap("HostId")
    public String hostId;

    /**
     * <strong>example:</strong>
     * <p>DA980AD0-158F-44F3-847D-5EAB96C0EB6B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
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

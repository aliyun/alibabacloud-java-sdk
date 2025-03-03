// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListDatasetJobConfigsResponseBody extends TeaModel {
    @NameInMap("DatasetJobConfigs")
    public java.util.List<DatasetJobConfig> datasetJobConfigs;

    /**
     * <strong>example:</strong>
     * <p>5A14FA81-DD4E-******-6343FE44B941</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDatasetJobConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetJobConfigsResponseBody self = new ListDatasetJobConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatasetJobConfigsResponseBody setDatasetJobConfigs(java.util.List<DatasetJobConfig> datasetJobConfigs) {
        this.datasetJobConfigs = datasetJobConfigs;
        return this;
    }
    public java.util.List<DatasetJobConfig> getDatasetJobConfigs() {
        return this.datasetJobConfigs;
    }

    public ListDatasetJobConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatasetJobConfigsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}

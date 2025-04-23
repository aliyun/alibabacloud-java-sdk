// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetDatasetFileMetasStatisticsResponseBody extends TeaModel {
    @NameInMap("DatasetFileMetasStats")
    public java.util.List<DatasetFileMetasStat> datasetFileMetasStats;

    /**
     * <strong>example:</strong>
     * <p>73</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <strong>example:</strong>
     * <p>ADF6D849-*****-7E7030F0CE53</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetDatasetFileMetasStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetFileMetasStatisticsResponseBody self = new GetDatasetFileMetasStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatasetFileMetasStatisticsResponseBody setDatasetFileMetasStats(java.util.List<DatasetFileMetasStat> datasetFileMetasStats) {
        this.datasetFileMetasStats = datasetFileMetasStats;
        return this;
    }
    public java.util.List<DatasetFileMetasStat> getDatasetFileMetasStats() {
        return this.datasetFileMetasStats;
    }

    public GetDatasetFileMetasStatisticsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public GetDatasetFileMetasStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

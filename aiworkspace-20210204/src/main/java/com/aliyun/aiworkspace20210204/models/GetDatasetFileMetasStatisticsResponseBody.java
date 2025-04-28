// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetDatasetFileMetasStatisticsResponseBody extends TeaModel {
    /**
     * <p>The details of the returned aggregation list, including the number of each aggregate item. The list is by default sorted in descending order based on the count number.</p>
     */
    @NameInMap("DatasetFileMetasStats")
    public java.util.List<DatasetFileMetasStat> datasetFileMetasStats;

    /**
     * <p>The returned number. Example: the number of metadata records or the number of user-defined tags.</p>
     * 
     * <strong>example:</strong>
     * <p>73</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The request ID.</p>
     * 
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

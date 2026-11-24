// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateDataSetResponseBody extends TeaModel {
    @NameInMap("DataSetRecordStatistic")
    public CreateDataSetResponseBodyDataSetRecordStatistic dataSetRecordStatistic;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDataSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataSetResponseBody self = new CreateDataSetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataSetResponseBody setDataSetRecordStatistic(CreateDataSetResponseBodyDataSetRecordStatistic dataSetRecordStatistic) {
        this.dataSetRecordStatistic = dataSetRecordStatistic;
        return this;
    }
    public CreateDataSetResponseBodyDataSetRecordStatistic getDataSetRecordStatistic() {
        return this.dataSetRecordStatistic;
    }

    public CreateDataSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateDataSetResponseBodyDataSetRecordStatistic extends TeaModel {
        @NameInMap("DataSetId")
        public String dataSetId;

        @NameInMap("NewDataSetRecordCount")
        public Integer newDataSetRecordCount;

        public static CreateDataSetResponseBodyDataSetRecordStatistic build(java.util.Map<String, ?> map) throws Exception {
            CreateDataSetResponseBodyDataSetRecordStatistic self = new CreateDataSetResponseBodyDataSetRecordStatistic();
            return TeaModel.build(map, self);
        }

        public CreateDataSetResponseBodyDataSetRecordStatistic setDataSetId(String dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public String getDataSetId() {
            return this.dataSetId;
        }

        public CreateDataSetResponseBodyDataSetRecordStatistic setNewDataSetRecordCount(Integer newDataSetRecordCount) {
            this.newDataSetRecordCount = newDataSetRecordCount;
            return this;
        }
        public Integer getNewDataSetRecordCount() {
            return this.newDataSetRecordCount;
        }

    }

}

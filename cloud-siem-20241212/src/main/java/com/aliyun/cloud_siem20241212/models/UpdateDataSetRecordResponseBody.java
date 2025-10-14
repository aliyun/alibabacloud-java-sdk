// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataSetRecordResponseBody extends TeaModel {
    @NameInMap("DataSetRecordStatistic")
    public UpdateDataSetRecordResponseBodyDataSetRecordStatistic dataSetRecordStatistic;

    /**
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDataSetRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataSetRecordResponseBody self = new UpdateDataSetRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDataSetRecordResponseBody setDataSetRecordStatistic(UpdateDataSetRecordResponseBodyDataSetRecordStatistic dataSetRecordStatistic) {
        this.dataSetRecordStatistic = dataSetRecordStatistic;
        return this;
    }
    public UpdateDataSetRecordResponseBodyDataSetRecordStatistic getDataSetRecordStatistic() {
        return this.dataSetRecordStatistic;
    }

    public UpdateDataSetRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateDataSetRecordResponseBodyDataSetRecordStatistic extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("NewDataSetRecordCount")
        public Integer newDataSetRecordCount;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("UpdateDataSetRecordCount")
        public Integer updateDataSetRecordCount;

        public static UpdateDataSetRecordResponseBodyDataSetRecordStatistic build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataSetRecordResponseBodyDataSetRecordStatistic self = new UpdateDataSetRecordResponseBodyDataSetRecordStatistic();
            return TeaModel.build(map, self);
        }

        public UpdateDataSetRecordResponseBodyDataSetRecordStatistic setNewDataSetRecordCount(Integer newDataSetRecordCount) {
            this.newDataSetRecordCount = newDataSetRecordCount;
            return this;
        }
        public Integer getNewDataSetRecordCount() {
            return this.newDataSetRecordCount;
        }

        public UpdateDataSetRecordResponseBodyDataSetRecordStatistic setUpdateDataSetRecordCount(Integer updateDataSetRecordCount) {
            this.updateDataSetRecordCount = updateDataSetRecordCount;
            return this;
        }
        public Integer getUpdateDataSetRecordCount() {
            return this.updateDataSetRecordCount;
        }

    }

}

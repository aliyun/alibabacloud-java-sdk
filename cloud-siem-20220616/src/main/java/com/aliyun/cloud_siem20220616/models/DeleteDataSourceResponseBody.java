// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DeleteDataSourceResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DeleteDataSourceResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataSourceResponseBody self = new DeleteDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDataSourceResponseBody setData(DeleteDataSourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteDataSourceResponseBodyData getData() {
        return this.data;
    }

    public DeleteDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteDataSourceResponseBodyData extends TeaModel {
        /**
         * <p>The number of data sources that are removed. The value 1 indicates that data source is removed, and a value less than or equal to 0 indicates that the data source failed to be removed.</p>
         */
        @NameInMap("Count")
        public Integer count;

        public static DeleteDataSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteDataSourceResponseBodyData self = new DeleteDataSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteDataSourceResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class GetDistributedTablesBufferSizeResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetDistributedTablesBufferSizeResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>48CBEEBE-FA07-5A06-8BA4-567B92ADD6A0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDistributedTablesBufferSizeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDistributedTablesBufferSizeResponseBody self = new GetDistributedTablesBufferSizeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDistributedTablesBufferSizeResponseBody setData(GetDistributedTablesBufferSizeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDistributedTablesBufferSizeResponseBodyData getData() {
        return this.data;
    }

    public GetDistributedTablesBufferSizeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDistributedTablesBufferSizeResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("BufferSizeGiB")
        public Integer bufferSizeGiB;

        public static GetDistributedTablesBufferSizeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDistributedTablesBufferSizeResponseBodyData self = new GetDistributedTablesBufferSizeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDistributedTablesBufferSizeResponseBodyData setBufferSizeGiB(Integer bufferSizeGiB) {
            this.bufferSizeGiB = bufferSizeGiB;
            return this;
        }
        public Integer getBufferSizeGiB() {
            return this.bufferSizeGiB;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DeleteDataSourceResponseBody extends TeaModel {
    /**
     * <p>The return value of the request.</p>
     */
    @NameInMap("Data")
    public DeleteDataSourceResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
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
         * <p>The number of data sources that are deleted. A value of 1 indicates success. A value of 0 or less indicates failure.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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

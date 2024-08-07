// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DeleteBindAccountResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DeleteBindAccountResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBindAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBindAccountResponseBody self = new DeleteBindAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBindAccountResponseBody setData(DeleteBindAccountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteBindAccountResponseBodyData getData() {
        return this.data;
    }

    public DeleteBindAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteBindAccountResponseBodyData extends TeaModel {
        /**
         * <p>The number of cloud accounts that are removed. The value 1 indicates that cloud account is removed, and a value less than or equal to 0 indicates that the cloud account failed to be removed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Integer count;

        public static DeleteBindAccountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteBindAccountResponseBodyData self = new DeleteBindAccountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteBindAccountResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}

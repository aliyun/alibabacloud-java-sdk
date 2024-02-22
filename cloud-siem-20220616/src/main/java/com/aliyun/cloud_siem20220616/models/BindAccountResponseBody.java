// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class BindAccountResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public BindAccountResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BindAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindAccountResponseBody self = new BindAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public BindAccountResponseBody setData(BindAccountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BindAccountResponseBodyData getData() {
        return this.data;
    }

    public BindAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BindAccountResponseBodyData extends TeaModel {
        /**
         * <p>The number of the cloud accounts that are added to the threat analysis feature. The value 1 indicates that the account is added, and a value less than or equal to 0 indicates that the account failed to be added.</p>
         */
        @NameInMap("Count")
        public Integer count;

        public static BindAccountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BindAccountResponseBodyData self = new BindAccountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BindAccountResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}

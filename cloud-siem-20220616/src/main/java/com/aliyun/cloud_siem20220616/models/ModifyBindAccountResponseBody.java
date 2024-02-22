// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ModifyBindAccountResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public ModifyBindAccountResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyBindAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyBindAccountResponseBody self = new ModifyBindAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyBindAccountResponseBody setData(ModifyBindAccountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyBindAccountResponseBodyData getData() {
        return this.data;
    }

    public ModifyBindAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyBindAccountResponseBodyData extends TeaModel {
        /**
         * <p>The number of the accounts that are modified. The value 1 indicates that the modification is successful, and a value less than or equal to 0 indicates that the modification failed.</p>
         */
        @NameInMap("Count")
        public Integer count;

        public static ModifyBindAccountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyBindAccountResponseBodyData self = new ModifyBindAccountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyBindAccountResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}

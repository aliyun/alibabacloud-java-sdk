// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ModifyBindAccountResponseBody extends TeaModel {
    /**
     * <p>The return value of the request.</p>
     */
    @NameInMap("Data")
    public ModifyBindAccountResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
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
         * <p>The number of account bindings that are modified. A value of 1 indicates that the operation is successful. A value of 0 or less indicates that the operation failed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class AISearchResourceDeleteResponseBody extends TeaModel {
    @NameInMap("data")
    public AISearchResourceDeleteResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static AISearchResourceDeleteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AISearchResourceDeleteResponseBody self = new AISearchResourceDeleteResponseBody();
        return TeaModel.build(map, self);
    }

    public AISearchResourceDeleteResponseBody setData(AISearchResourceDeleteResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AISearchResourceDeleteResponseBodyData getData() {
        return this.data;
    }

    public AISearchResourceDeleteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AISearchResourceDeleteResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>WzMGQZwB7nQEs3Qk3ajH</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>miniapp</p>
         */
        @NameInMap("type")
        public String type;

        public static AISearchResourceDeleteResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AISearchResourceDeleteResponseBodyData self = new AISearchResourceDeleteResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AISearchResourceDeleteResponseBodyData setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public AISearchResourceDeleteResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}

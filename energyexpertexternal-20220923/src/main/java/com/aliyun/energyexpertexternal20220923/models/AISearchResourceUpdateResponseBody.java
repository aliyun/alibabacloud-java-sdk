// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class AISearchResourceUpdateResponseBody extends TeaModel {
    @NameInMap("data")
    public AISearchResourceUpdateResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>FDE51A3B-09C0-57E5-96FC-31E85EEFF318</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static AISearchResourceUpdateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AISearchResourceUpdateResponseBody self = new AISearchResourceUpdateResponseBody();
        return TeaModel.build(map, self);
    }

    public AISearchResourceUpdateResponseBody setData(AISearchResourceUpdateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AISearchResourceUpdateResponseBodyData getData() {
        return this.data;
    }

    public AISearchResourceUpdateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AISearchResourceUpdateResponseBodyData extends TeaModel {
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

        public static AISearchResourceUpdateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AISearchResourceUpdateResponseBodyData self = new AISearchResourceUpdateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AISearchResourceUpdateResponseBodyData setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public AISearchResourceUpdateResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}

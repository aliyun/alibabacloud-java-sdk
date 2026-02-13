// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class AISearchResourceAddResponseBody extends TeaModel {
    @NameInMap("data")
    public AISearchResourceAddResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4A0AEC56-5C9A-5D47-93DF-7227836FFF82</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static AISearchResourceAddResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AISearchResourceAddResponseBody self = new AISearchResourceAddResponseBody();
        return TeaModel.build(map, self);
    }

    public AISearchResourceAddResponseBody setData(AISearchResourceAddResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AISearchResourceAddResponseBodyData getData() {
        return this.data;
    }

    public AISearchResourceAddResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AISearchResourceAddResponseBodyData extends TeaModel {
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

        public static AISearchResourceAddResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AISearchResourceAddResponseBodyData self = new AISearchResourceAddResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AISearchResourceAddResponseBodyData setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public AISearchResourceAddResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}

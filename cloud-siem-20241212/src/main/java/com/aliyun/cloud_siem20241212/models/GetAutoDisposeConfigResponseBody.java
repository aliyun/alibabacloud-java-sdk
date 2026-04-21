// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetAutoDisposeConfigResponseBody extends TeaModel {
    @NameInMap("AutoDisposeConfig")
    public GetAutoDisposeConfigResponseBodyAutoDisposeConfig autoDisposeConfig;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAutoDisposeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAutoDisposeConfigResponseBody self = new GetAutoDisposeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAutoDisposeConfigResponseBody setAutoDisposeConfig(GetAutoDisposeConfigResponseBodyAutoDisposeConfig autoDisposeConfig) {
        this.autoDisposeConfig = autoDisposeConfig;
        return this;
    }
    public GetAutoDisposeConfigResponseBodyAutoDisposeConfig getAutoDisposeConfig() {
        return this.autoDisposeConfig;
    }

    public GetAutoDisposeConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAutoDisposeConfigResponseBodyAutoDisposeConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("AutoDecisionStatus")
        public String autoDecisionStatus;

        /**
         * <strong>example:</strong>
         * <p>alibaba_cloud_sas</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        public static GetAutoDisposeConfigResponseBodyAutoDisposeConfig build(java.util.Map<String, ?> map) throws Exception {
            GetAutoDisposeConfigResponseBodyAutoDisposeConfig self = new GetAutoDisposeConfigResponseBodyAutoDisposeConfig();
            return TeaModel.build(map, self);
        }

        public GetAutoDisposeConfigResponseBodyAutoDisposeConfig setAutoDecisionStatus(String autoDecisionStatus) {
            this.autoDecisionStatus = autoDecisionStatus;
            return this;
        }
        public String getAutoDecisionStatus() {
            return this.autoDecisionStatus;
        }

        public GetAutoDisposeConfigResponseBodyAutoDisposeConfig setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

}

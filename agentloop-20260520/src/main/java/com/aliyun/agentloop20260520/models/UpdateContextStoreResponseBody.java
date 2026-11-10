// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateContextStoreResponseBody extends TeaModel {
    /**
     * <p>The configuration properties after updating the runtime recall switch. This block is not returned for other library update operations.</p>
     */
    @NameInMap("config")
    public UpdateContextStoreResponseBodyConfig config;

    /**
     * <p>The request ID. You can use this ID to locate the request when troubleshooting issues.</p>
     * 
     * <strong>example:</strong>
     * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The strategy version number that takes effect after the update for the memory type. If the strategy remains unchanged, the version number is the same as before the update.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("strategyVersion")
    public Integer strategyVersion;

    public static UpdateContextStoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateContextStoreResponseBody self = new UpdateContextStoreResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateContextStoreResponseBody setConfig(UpdateContextStoreResponseBodyConfig config) {
        this.config = config;
        return this;
    }
    public UpdateContextStoreResponseBodyConfig getConfig() {
        return this.config;
    }

    public UpdateContextStoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateContextStoreResponseBody setStrategyVersion(Integer strategyVersion) {
        this.strategyVersion = strategyVersion;
        return this;
    }
    public Integer getStrategyVersion() {
        return this.strategyVersion;
    }

    public static class UpdateContextStoreResponseBodyConfig extends TeaModel {
        /**
         * <p>Indicates whether runtime recall is allowed after the experience library is updated.</p>
         */
        @NameInMap("runtimeRecallEnabled")
        public Boolean runtimeRecallEnabled;

        /**
         * <p>The runtime recall property version that takes effect after this update.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("runtimeRecallRevision")
        public Long runtimeRecallRevision;

        public static UpdateContextStoreResponseBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateContextStoreResponseBodyConfig self = new UpdateContextStoreResponseBodyConfig();
            return TeaModel.build(map, self);
        }

        public UpdateContextStoreResponseBodyConfig setRuntimeRecallEnabled(Boolean runtimeRecallEnabled) {
            this.runtimeRecallEnabled = runtimeRecallEnabled;
            return this;
        }
        public Boolean getRuntimeRecallEnabled() {
            return this.runtimeRecallEnabled;
        }

        public UpdateContextStoreResponseBodyConfig setRuntimeRecallRevision(Long runtimeRecallRevision) {
            this.runtimeRecallRevision = runtimeRecallRevision;
            return this;
        }
        public Long getRuntimeRecallRevision() {
            return this.runtimeRecallRevision;
        }

    }

}

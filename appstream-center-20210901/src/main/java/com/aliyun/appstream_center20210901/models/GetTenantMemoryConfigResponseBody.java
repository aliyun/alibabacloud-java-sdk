// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetTenantMemoryConfigResponseBody extends TeaModel {
    /**
     * <p>The tenant memory configuration that matches the business combination.</p>
     */
    @NameInMap("Data")
    public GetTenantMemoryConfigResponseBodyData data;

    /**
     * <p>The unique identifier of the request, which can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>01A1CEEB-CDFF-18F9-B2BF-9997600D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetTenantMemoryConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTenantMemoryConfigResponseBody self = new GetTenantMemoryConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTenantMemoryConfigResponseBody setData(GetTenantMemoryConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTenantMemoryConfigResponseBodyData getData() {
        return this.data;
    }

    public GetTenantMemoryConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTenantMemoryConfigResponseBodyData extends TeaModel {
        /**
         * <p>This field is not enabled. The current query result does not provide the disable reason. The example is used to illustrate the field status.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A (not enabled)</p>
         */
        @NameInMap("DisabledReason")
        public String disabledReason;

        /**
         * <p>This field is not enabled. The current query result does not provide the effective switch of the instance.</p>
         */
        @NameInMap("EffectiveEnabled")
        public Boolean effectiveEnabled;

        /**
         * <p>The tenant-level memory switch for the corresponding business combination. A value of <code>true</code> indicates that the switch is enabled, and a value of <code>false</code> indicates that the switch is disabled. This field may be omitted if no switch is configured for the combination.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>This field is not enabled. The current query result does not provide the instance desired switch.</p>
         */
        @NameInMap("InstanceDesiredEnabled")
        public Boolean instanceDesiredEnabled;

        /**
         * <p>This field is not enabled. To obtain the tenant-level configuration switch returned by the current API operation, read the Enabled field.</p>
         */
        @NameInMap("TenantEnabled")
        public Boolean tenantEnabled;

        public static GetTenantMemoryConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTenantMemoryConfigResponseBodyData self = new GetTenantMemoryConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTenantMemoryConfigResponseBodyData setDisabledReason(String disabledReason) {
            this.disabledReason = disabledReason;
            return this;
        }
        public String getDisabledReason() {
            return this.disabledReason;
        }

        public GetTenantMemoryConfigResponseBodyData setEffectiveEnabled(Boolean effectiveEnabled) {
            this.effectiveEnabled = effectiveEnabled;
            return this;
        }
        public Boolean getEffectiveEnabled() {
            return this.effectiveEnabled;
        }

        public GetTenantMemoryConfigResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetTenantMemoryConfigResponseBodyData setInstanceDesiredEnabled(Boolean instanceDesiredEnabled) {
            this.instanceDesiredEnabled = instanceDesiredEnabled;
            return this;
        }
        public Boolean getInstanceDesiredEnabled() {
            return this.instanceDesiredEnabled;
        }

        public GetTenantMemoryConfigResponseBodyData setTenantEnabled(Boolean tenantEnabled) {
            this.tenantEnabled = tenantEnabled;
            return this;
        }
        public Boolean getTenantEnabled() {
            return this.tenantEnabled;
        }

    }

}

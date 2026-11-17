// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class GetFirewallFeatureResponseBody extends TeaModel {
    /**
     * <p>The list of firewall feature statuses. This list always returns the statuses of application control and web filtering.</p>
     */
    @NameInMap("Features")
    public java.util.List<GetFirewallFeatureResponseBodyFeatures> features;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetFirewallFeatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFirewallFeatureResponseBody self = new GetFirewallFeatureResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFirewallFeatureResponseBody setFeatures(java.util.List<GetFirewallFeatureResponseBodyFeatures> features) {
        this.features = features;
        return this;
    }
    public java.util.List<GetFirewallFeatureResponseBodyFeatures> getFeatures() {
        return this.features;
    }

    public GetFirewallFeatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetFirewallFeatureResponseBodyFeatures extends TeaModel {
        /**
         * <p>The feature name. Valid values:</p>
         * <ul>
         * <li><strong>ApplicationControl</strong>: Application control.</li>
         * <li><strong>WebFilter</strong>: Web filtering.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ApplicationControl</p>
         */
        @NameInMap("FeatureName")
        public String featureName;

        /**
         * <p>The activation status of the feature. Valid values:</p>
         * <ul>
         * <li><strong>Enable</strong>: Enabled.</li>
         * <li><strong>Disable</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetFirewallFeatureResponseBodyFeatures build(java.util.Map<String, ?> map) throws Exception {
            GetFirewallFeatureResponseBodyFeatures self = new GetFirewallFeatureResponseBodyFeatures();
            return TeaModel.build(map, self);
        }

        public GetFirewallFeatureResponseBodyFeatures setFeatureName(String featureName) {
            this.featureName = featureName;
            return this;
        }
        public String getFeatureName() {
            return this.featureName;
        }

        public GetFirewallFeatureResponseBodyFeatures setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}

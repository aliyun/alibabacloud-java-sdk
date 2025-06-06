// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListEnterpriseAcceleratePoliciesResponseBody extends TeaModel {
    @NameInMap("Policies")
    public java.util.List<ListEnterpriseAcceleratePoliciesResponseBodyPolicies> policies;

    /**
     * <strong>example:</strong>
     * <p>DB0471D0-C05C-556D-9F40-0325D890036F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListEnterpriseAcceleratePoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnterpriseAcceleratePoliciesResponseBody self = new ListEnterpriseAcceleratePoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnterpriseAcceleratePoliciesResponseBody setPolicies(java.util.List<ListEnterpriseAcceleratePoliciesResponseBodyPolicies> policies) {
        this.policies = policies;
        return this;
    }
    public java.util.List<ListEnterpriseAcceleratePoliciesResponseBodyPolicies> getPolicies() {
        return this.policies;
    }

    public ListEnterpriseAcceleratePoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEnterpriseAcceleratePoliciesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListEnterpriseAcceleratePoliciesResponseBodyPolicies extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>whitelist</p>
         */
        @NameInMap("AccelerationType")
        public String accelerationType;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>eap-eec34d4b12fcca61</p>
         */
        @NameInMap("EapId")
        public String eapId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Enabled")
        public Integer enabled;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OnTls")
        public Integer onTls;

        /**
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ShowInClient")
        public Integer showInClient;

        /**
         * <strong>example:</strong>
         * <p>12.34.56.XX</p>
         */
        @NameInMap("UpstreamHost")
        public String upstreamHost;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("UpstreamPort")
        public Integer upstreamPort;

        /**
         * <strong>example:</strong>
         * <p>connector</p>
         */
        @NameInMap("UpstreamType")
        public String upstreamType;

        @NameInMap("UserAttributeGroup")
        public String userAttributeGroup;

        public static ListEnterpriseAcceleratePoliciesResponseBodyPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListEnterpriseAcceleratePoliciesResponseBodyPolicies self = new ListEnterpriseAcceleratePoliciesResponseBodyPolicies();
            return TeaModel.build(map, self);
        }

        public ListEnterpriseAcceleratePoliciesResponseBodyPolicies setAccelerationType(String accelerationType) {
            this.accelerationType = accelerationType;
            return this;
        }
        public String getAccelerationType() {
            return this.accelerationType;
        }

        public ListEnterpriseAcceleratePoliciesResponseBodyPolicies setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEnterpriseAcceleratePoliciesResponseBodyPolicies setEapId(String eapId) {
            this.eapId = eapId;
            return this;
        }
        public String getEapId() {
            return this.eapId;
        }

        public ListEnterpriseAcceleratePoliciesResponseBodyPolicies setEnabled(Integer enabled) {
            this.enabled = enabled;
            return this;
        }
        public Integer getEnabled() {
            return this.enabled;
        }

        public ListEnterpriseAcceleratePoliciesResponseBodyPolicies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEnterpriseAcceleratePoliciesResponseBodyPolicies setOnTls(Integer onTls) {
            this.onTls = onTls;
            return this;
        }
        public Integer getOnTls() {
            return this.onTls;
        }

        public ListEnterpriseAcceleratePoliciesResponseBodyPolicies setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListEnterpriseAcceleratePoliciesResponseBodyPolicies setShowInClient(Integer showInClient) {
            this.showInClient = showInClient;
            return this;
        }
        public Integer getShowInClient() {
            return this.showInClient;
        }

        public ListEnterpriseAcceleratePoliciesResponseBodyPolicies setUpstreamHost(String upstreamHost) {
            this.upstreamHost = upstreamHost;
            return this;
        }
        public String getUpstreamHost() {
            return this.upstreamHost;
        }

        public ListEnterpriseAcceleratePoliciesResponseBodyPolicies setUpstreamPort(Integer upstreamPort) {
            this.upstreamPort = upstreamPort;
            return this;
        }
        public Integer getUpstreamPort() {
            return this.upstreamPort;
        }

        public ListEnterpriseAcceleratePoliciesResponseBodyPolicies setUpstreamType(String upstreamType) {
            this.upstreamType = upstreamType;
            return this;
        }
        public String getUpstreamType() {
            return this.upstreamType;
        }

        public ListEnterpriseAcceleratePoliciesResponseBodyPolicies setUserAttributeGroup(String userAttributeGroup) {
            this.userAttributeGroup = userAttributeGroup;
            return this;
        }
        public String getUserAttributeGroup() {
            return this.userAttributeGroup;
        }

    }

}

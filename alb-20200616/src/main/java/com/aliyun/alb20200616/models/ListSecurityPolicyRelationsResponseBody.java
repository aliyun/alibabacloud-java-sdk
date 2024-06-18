// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListSecurityPolicyRelationsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>593B0448-D13E-4C56-AC0D-FDF0FDE0E9A3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The security policies and the listeners that are associated with the security policies.</p>
     */
    @NameInMap("SecrityPolicyRelations")
    public java.util.List<ListSecurityPolicyRelationsResponseBodySecrityPolicyRelations> secrityPolicyRelations;

    public static ListSecurityPolicyRelationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityPolicyRelationsResponseBody self = new ListSecurityPolicyRelationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSecurityPolicyRelationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSecurityPolicyRelationsResponseBody setSecrityPolicyRelations(java.util.List<ListSecurityPolicyRelationsResponseBodySecrityPolicyRelations> secrityPolicyRelations) {
        this.secrityPolicyRelations = secrityPolicyRelations;
        return this;
    }
    public java.util.List<ListSecurityPolicyRelationsResponseBodySecrityPolicyRelations> getSecrityPolicyRelations() {
        return this.secrityPolicyRelations;
    }

    public static class ListSecurityPolicyRelationsResponseBodySecrityPolicyRelationsRelatedListeners extends TeaModel {
        /**
         * <p>The listener ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lsn-0bfuc****</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        /**
         * <p>The listener port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ListenerPort")
        public Long listenerPort;

        /**
         * <p>The listener protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTPS</p>
         */
        @NameInMap("ListenerProtocol")
        public String listenerProtocol;

        /**
         * <p>The Server Load Balancer (SLB) instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1o94dp5i6ea****</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        public static ListSecurityPolicyRelationsResponseBodySecrityPolicyRelationsRelatedListeners build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityPolicyRelationsResponseBodySecrityPolicyRelationsRelatedListeners self = new ListSecurityPolicyRelationsResponseBodySecrityPolicyRelationsRelatedListeners();
            return TeaModel.build(map, self);
        }

        public ListSecurityPolicyRelationsResponseBodySecrityPolicyRelationsRelatedListeners setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

        public ListSecurityPolicyRelationsResponseBodySecrityPolicyRelationsRelatedListeners setListenerPort(Long listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Long getListenerPort() {
            return this.listenerPort;
        }

        public ListSecurityPolicyRelationsResponseBodySecrityPolicyRelationsRelatedListeners setListenerProtocol(String listenerProtocol) {
            this.listenerProtocol = listenerProtocol;
            return this;
        }
        public String getListenerProtocol() {
            return this.listenerProtocol;
        }

        public ListSecurityPolicyRelationsResponseBodySecrityPolicyRelationsRelatedListeners setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

    }

    public static class ListSecurityPolicyRelationsResponseBodySecrityPolicyRelations extends TeaModel {
        /**
         * <p>The listeners that are associated with the security policy.</p>
         */
        @NameInMap("RelatedListeners")
        public java.util.List<ListSecurityPolicyRelationsResponseBodySecrityPolicyRelationsRelatedListeners> relatedListeners;

        /**
         * <p>The security policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>scp-bp1bpn0kn9****</p>
         */
        @NameInMap("SecurityPolicyId")
        public String securityPolicyId;

        public static ListSecurityPolicyRelationsResponseBodySecrityPolicyRelations build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityPolicyRelationsResponseBodySecrityPolicyRelations self = new ListSecurityPolicyRelationsResponseBodySecrityPolicyRelations();
            return TeaModel.build(map, self);
        }

        public ListSecurityPolicyRelationsResponseBodySecrityPolicyRelations setRelatedListeners(java.util.List<ListSecurityPolicyRelationsResponseBodySecrityPolicyRelationsRelatedListeners> relatedListeners) {
            this.relatedListeners = relatedListeners;
            return this;
        }
        public java.util.List<ListSecurityPolicyRelationsResponseBodySecrityPolicyRelationsRelatedListeners> getRelatedListeners() {
            return this.relatedListeners;
        }

        public ListSecurityPolicyRelationsResponseBodySecrityPolicyRelations setSecurityPolicyId(String securityPolicyId) {
            this.securityPolicyId = securityPolicyId;
            return this;
        }
        public String getSecurityPolicyId() {
            return this.securityPolicyId;
        }

    }

}

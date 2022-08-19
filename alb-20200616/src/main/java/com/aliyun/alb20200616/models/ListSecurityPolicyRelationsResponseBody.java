// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListSecurityPolicyRelationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ListenerId")
        public String listenerId;

        @NameInMap("ListenerPort")
        public Long listenerPort;

        @NameInMap("ListenerProtocol")
        public String listenerProtocol;

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
        @NameInMap("RelatedListeners")
        public java.util.List<ListSecurityPolicyRelationsResponseBodySecrityPolicyRelationsRelatedListeners> relatedListeners;

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

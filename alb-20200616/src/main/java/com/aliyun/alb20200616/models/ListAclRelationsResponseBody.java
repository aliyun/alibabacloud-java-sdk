// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListAclRelationsResponseBody extends TeaModel {
    /**
     * <p>The ACLs and the associated listeners.</p>
     */
    @NameInMap("AclRelations")
    public java.util.List<ListAclRelationsResponseBodyAclRelations> aclRelations;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAclRelationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAclRelationsResponseBody self = new ListAclRelationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAclRelationsResponseBody setAclRelations(java.util.List<ListAclRelationsResponseBodyAclRelations> aclRelations) {
        this.aclRelations = aclRelations;
        return this;
    }
    public java.util.List<ListAclRelationsResponseBodyAclRelations> getAclRelations() {
        return this.aclRelations;
    }

    public ListAclRelationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAclRelationsResponseBodyAclRelationsRelatedListeners extends TeaModel {
        /**
         * <p>The listener ID.</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        /**
         * <p>The listener port.</p>
         */
        @NameInMap("ListenerPort")
        public Integer listenerPort;

        /**
         * <p>The listener protocol.</p>
         */
        @NameInMap("ListenerProtocol")
        public String listenerProtocol;

        /**
         * <p>The ID of the Server Load Balancer (SLB) instance.</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The association status between the ACL and the listener. Valid values:</p>
         * <br>
         * <p>*   **Associating**</p>
         * <p>*   **Associated**</p>
         * <p>*   **Dissociating**</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListAclRelationsResponseBodyAclRelationsRelatedListeners build(java.util.Map<String, ?> map) throws Exception {
            ListAclRelationsResponseBodyAclRelationsRelatedListeners self = new ListAclRelationsResponseBodyAclRelationsRelatedListeners();
            return TeaModel.build(map, self);
        }

        public ListAclRelationsResponseBodyAclRelationsRelatedListeners setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

        public ListAclRelationsResponseBodyAclRelationsRelatedListeners setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        public ListAclRelationsResponseBodyAclRelationsRelatedListeners setListenerProtocol(String listenerProtocol) {
            this.listenerProtocol = listenerProtocol;
            return this;
        }
        public String getListenerProtocol() {
            return this.listenerProtocol;
        }

        public ListAclRelationsResponseBodyAclRelationsRelatedListeners setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public ListAclRelationsResponseBodyAclRelationsRelatedListeners setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListAclRelationsResponseBodyAclRelations extends TeaModel {
        /**
         * <p>ACL ID</p>
         */
        @NameInMap("AclId")
        public String aclId;

        /**
         * <p>The listeners that are associated with the ACL.</p>
         */
        @NameInMap("RelatedListeners")
        public java.util.List<ListAclRelationsResponseBodyAclRelationsRelatedListeners> relatedListeners;

        public static ListAclRelationsResponseBodyAclRelations build(java.util.Map<String, ?> map) throws Exception {
            ListAclRelationsResponseBodyAclRelations self = new ListAclRelationsResponseBodyAclRelations();
            return TeaModel.build(map, self);
        }

        public ListAclRelationsResponseBodyAclRelations setAclId(String aclId) {
            this.aclId = aclId;
            return this;
        }
        public String getAclId() {
            return this.aclId;
        }

        public ListAclRelationsResponseBodyAclRelations setRelatedListeners(java.util.List<ListAclRelationsResponseBodyAclRelationsRelatedListeners> relatedListeners) {
            this.relatedListeners = relatedListeners;
            return this;
        }
        public java.util.List<ListAclRelationsResponseBodyAclRelationsRelatedListeners> getRelatedListeners() {
            return this.relatedListeners;
        }

    }

}

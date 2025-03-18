// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerListenersResponseBody extends TeaModel {
    /**
     * <p>The listeners of the ELB instance.</p>
     */
    @NameInMap("Listeners")
    public DescribeLoadBalancerListenersResponseBodyListeners listeners;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F3B261DD-3858-4D3C-877D-303ADF374600</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>49</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeLoadBalancerListenersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancerListenersResponseBody self = new DescribeLoadBalancerListenersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancerListenersResponseBody setListeners(DescribeLoadBalancerListenersResponseBodyListeners listeners) {
        this.listeners = listeners;
        return this;
    }
    public DescribeLoadBalancerListenersResponseBodyListeners getListeners() {
        return this.listeners;
    }

    public DescribeLoadBalancerListenersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLoadBalancerListenersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLoadBalancerListenersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLoadBalancerListenersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeLoadBalancerListenersResponseBodyListenersListener extends TeaModel {
        @NameInMap("BackendServerPort")
        public Integer backendServerPort;

        /**
         * <p>The timestamp when the listener was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-15T08:42:57Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the listener.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The listener port that is used for HTTP-to-HTTPS redirection.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("ForwardPort")
        public String forwardPort;

        /**
         * <p>Indicates whether HTTP-to-HTTPS redirection is enabled for the listener. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("ListenerForward")
        public String listenerForward;

        /**
         * <p>The listening port.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("ListenerPort")
        public String listenerPort;

        /**
         * <p>The ID of the ELB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-51a5fhou****</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The network transmission protocol that is used by the listener.</p>
         * <ul>
         * <li><strong>tcp</strong></li>
         * <li><strong>udp</strong></li>
         * <li><strong>http</strong></li>
         * <li><strong>https</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The status of the listener. Valid values:</p>
         * <ul>
         * <li><strong>running</strong></li>
         * <li><strong>stopped</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeLoadBalancerListenersResponseBodyListenersListener build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerListenersResponseBodyListenersListener self = new DescribeLoadBalancerListenersResponseBodyListenersListener();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerListenersResponseBodyListenersListener setBackendServerPort(Integer backendServerPort) {
            this.backendServerPort = backendServerPort;
            return this;
        }
        public Integer getBackendServerPort() {
            return this.backendServerPort;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersListener setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersListener setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersListener setForwardPort(String forwardPort) {
            this.forwardPort = forwardPort;
            return this;
        }
        public String getForwardPort() {
            return this.forwardPort;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersListener setListenerForward(String listenerForward) {
            this.listenerForward = listenerForward;
            return this;
        }
        public String getListenerForward() {
            return this.listenerForward;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersListener setListenerPort(String listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public String getListenerPort() {
            return this.listenerPort;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersListener setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersListener setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersListener setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeLoadBalancerListenersResponseBodyListeners extends TeaModel {
        @NameInMap("Listener")
        public java.util.List<DescribeLoadBalancerListenersResponseBodyListenersListener> listener;

        public static DescribeLoadBalancerListenersResponseBodyListeners build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerListenersResponseBodyListeners self = new DescribeLoadBalancerListenersResponseBodyListeners();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setListener(java.util.List<DescribeLoadBalancerListenersResponseBodyListenersListener> listener) {
            this.listener = listener;
            return this;
        }
        public java.util.List<DescribeLoadBalancerListenersResponseBodyListenersListener> getListener() {
            return this.listener;
        }

    }

}

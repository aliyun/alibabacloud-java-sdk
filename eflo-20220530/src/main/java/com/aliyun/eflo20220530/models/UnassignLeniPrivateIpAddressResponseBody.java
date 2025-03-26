// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UnassignLeniPrivateIpAddressResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response data.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Content")
    public UnassignLeniPrivateIpAddressResponseBodyContent content;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AC8C713A-A9F4-5984-A5E1-76496DF35153</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnassignLeniPrivateIpAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnassignLeniPrivateIpAddressResponseBody self = new UnassignLeniPrivateIpAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public UnassignLeniPrivateIpAddressResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UnassignLeniPrivateIpAddressResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UnassignLeniPrivateIpAddressResponseBody setContent(UnassignLeniPrivateIpAddressResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public UnassignLeniPrivateIpAddressResponseBodyContent getContent() {
        return this.content;
    }

    public UnassignLeniPrivateIpAddressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnassignLeniPrivateIpAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UnassignLeniPrivateIpAddressResponseBodyContent extends TeaModel {
        /**
         * <p>Lingjun Elastic Network Interface ID.</p>
         * 
         * <strong>example:</strong>
         * <p>leni-1234****</p>
         */
        @NameInMap("ElasticNetworkInterfaceId")
        public String elasticNetworkInterfaceId;

        /**
         * <p>Lingjun Elastic Network Interface secondary private IP unique identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>sip-dqvs****</p>
         */
        @NameInMap("IpName")
        public String ipName;

        public static UnassignLeniPrivateIpAddressResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            UnassignLeniPrivateIpAddressResponseBodyContent self = new UnassignLeniPrivateIpAddressResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public UnassignLeniPrivateIpAddressResponseBodyContent setElasticNetworkInterfaceId(String elasticNetworkInterfaceId) {
            this.elasticNetworkInterfaceId = elasticNetworkInterfaceId;
            return this;
        }
        public String getElasticNetworkInterfaceId() {
            return this.elasticNetworkInterfaceId;
        }

        public UnassignLeniPrivateIpAddressResponseBodyContent setIpName(String ipName) {
            this.ipName = ipName;
            return this;
        }
        public String getIpName() {
            return this.ipName;
        }

    }

}

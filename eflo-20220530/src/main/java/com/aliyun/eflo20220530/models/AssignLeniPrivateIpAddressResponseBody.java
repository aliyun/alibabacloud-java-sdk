// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class AssignLeniPrivateIpAddressResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * <blockquote>
     * <p> This parameter is returned only if Resource Access Management (RAM) permission verification failed.</p>
     * </blockquote>
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
     */
    @NameInMap("Content")
    public AssignLeniPrivateIpAddressResponseBodyContent content;

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
     * <p>A88DFED5-24B7-5A3E-87DE-380BF06F3C90</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssignLeniPrivateIpAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssignLeniPrivateIpAddressResponseBody self = new AssignLeniPrivateIpAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public AssignLeniPrivateIpAddressResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public AssignLeniPrivateIpAddressResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AssignLeniPrivateIpAddressResponseBody setContent(AssignLeniPrivateIpAddressResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public AssignLeniPrivateIpAddressResponseBodyContent getContent() {
        return this.content;
    }

    public AssignLeniPrivateIpAddressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AssignLeniPrivateIpAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AssignLeniPrivateIpAddressResponseBodyContent extends TeaModel {
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
         * <p>sip-lzwx****</p>
         */
        @NameInMap("IpName")
        public String ipName;

        public static AssignLeniPrivateIpAddressResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            AssignLeniPrivateIpAddressResponseBodyContent self = new AssignLeniPrivateIpAddressResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public AssignLeniPrivateIpAddressResponseBodyContent setElasticNetworkInterfaceId(String elasticNetworkInterfaceId) {
            this.elasticNetworkInterfaceId = elasticNetworkInterfaceId;
            return this;
        }
        public String getElasticNetworkInterfaceId() {
            return this.elasticNetworkInterfaceId;
        }

        public AssignLeniPrivateIpAddressResponseBodyContent setIpName(String ipName) {
            this.ipName = ipName;
            return this;
        }
        public String getIpName() {
            return this.ipName;
        }

    }

}

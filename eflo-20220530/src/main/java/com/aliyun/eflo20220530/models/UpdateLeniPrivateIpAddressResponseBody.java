// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UpdateLeniPrivateIpAddressResponseBody extends TeaModel {
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
     */
    @NameInMap("Content")
    public UpdateLeniPrivateIpAddressResponseBodyContent content;

    /**
     * <p>The returned message.</p>
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

    public static UpdateLeniPrivateIpAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLeniPrivateIpAddressResponseBody self = new UpdateLeniPrivateIpAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLeniPrivateIpAddressResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UpdateLeniPrivateIpAddressResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateLeniPrivateIpAddressResponseBody setContent(UpdateLeniPrivateIpAddressResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public UpdateLeniPrivateIpAddressResponseBodyContent getContent() {
        return this.content;
    }

    public UpdateLeniPrivateIpAddressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateLeniPrivateIpAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateLeniPrivateIpAddressResponseBodyContent extends TeaModel {
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
         * <p>sip-8ylg****</p>
         */
        @NameInMap("IpName")
        public String ipName;

        public static UpdateLeniPrivateIpAddressResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            UpdateLeniPrivateIpAddressResponseBodyContent self = new UpdateLeniPrivateIpAddressResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public UpdateLeniPrivateIpAddressResponseBodyContent setElasticNetworkInterfaceId(String elasticNetworkInterfaceId) {
            this.elasticNetworkInterfaceId = elasticNetworkInterfaceId;
            return this;
        }
        public String getElasticNetworkInterfaceId() {
            return this.elasticNetworkInterfaceId;
        }

        public UpdateLeniPrivateIpAddressResponseBodyContent setIpName(String ipName) {
            this.ipName = ipName;
            return this;
        }
        public String getIpName() {
            return this.ipName;
        }

    }

}

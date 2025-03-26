// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class AssignPrivateIpAddressResponseBody extends TeaModel {
    /**
     * <p>The detailed reason why the access was denied.</p>
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
    public AssignPrivateIpAddressResponseBodyContent content;

    /**
     * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
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

    public static AssignPrivateIpAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssignPrivateIpAddressResponseBody self = new AssignPrivateIpAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public AssignPrivateIpAddressResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public AssignPrivateIpAddressResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AssignPrivateIpAddressResponseBody setContent(AssignPrivateIpAddressResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public AssignPrivateIpAddressResponseBodyContent getContent() {
        return this.content;
    }

    public AssignPrivateIpAddressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AssignPrivateIpAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AssignPrivateIpAddressResponseBodyContent extends TeaModel {
        /**
         * <p>The unique IP identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>sip-8exxqa2r</p>
         */
        @NameInMap("IpName")
        public String ipName;

        /**
         * <p>Lingjun network interface controller ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lni-bp18exxqa2rvfn45e5pz</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        public static AssignPrivateIpAddressResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            AssignPrivateIpAddressResponseBodyContent self = new AssignPrivateIpAddressResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public AssignPrivateIpAddressResponseBodyContent setIpName(String ipName) {
            this.ipName = ipName;
            return this;
        }
        public String getIpName() {
            return this.ipName;
        }

        public AssignPrivateIpAddressResponseBodyContent setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

    }

}

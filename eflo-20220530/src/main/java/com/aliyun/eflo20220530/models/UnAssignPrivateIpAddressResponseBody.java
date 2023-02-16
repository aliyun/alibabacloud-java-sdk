// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UnAssignPrivateIpAddressResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public UnAssignPrivateIpAddressResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static UnAssignPrivateIpAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnAssignPrivateIpAddressResponseBody self = new UnAssignPrivateIpAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public UnAssignPrivateIpAddressResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UnAssignPrivateIpAddressResponseBody setContent(UnAssignPrivateIpAddressResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public UnAssignPrivateIpAddressResponseBodyContent getContent() {
        return this.content;
    }

    public UnAssignPrivateIpAddressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnAssignPrivateIpAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UnAssignPrivateIpAddressResponseBodyContent extends TeaModel {
        @NameInMap("IpName")
        public String ipName;

        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        public static UnAssignPrivateIpAddressResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            UnAssignPrivateIpAddressResponseBodyContent self = new UnAssignPrivateIpAddressResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public UnAssignPrivateIpAddressResponseBodyContent setIpName(String ipName) {
            this.ipName = ipName;
            return this;
        }
        public String getIpName() {
            return this.ipName;
        }

        public UnAssignPrivateIpAddressResponseBodyContent setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class AssignPrivateIpAddressResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public AssignPrivateIpAddressResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static AssignPrivateIpAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssignPrivateIpAddressResponseBody self = new AssignPrivateIpAddressResponseBody();
        return TeaModel.build(map, self);
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
        @NameInMap("IpName")
        public String ipName;

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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeFlexAccConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FlexAccConfig")
    public DescribeFlexAccConfigResponseBodyFlexAccConfig flexAccConfig;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeFlexAccConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlexAccConfigResponseBody self = new DescribeFlexAccConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlexAccConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlexAccConfigResponseBody setFlexAccConfig(DescribeFlexAccConfigResponseBodyFlexAccConfig flexAccConfig) {
        this.flexAccConfig = flexAccConfig;
        return this;
    }
    public DescribeFlexAccConfigResponseBodyFlexAccConfig getFlexAccConfig() {
        return this.flexAccConfig;
    }

    public DescribeFlexAccConfigResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeFlexAccConfigResponseBodyFlexAccConfig extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("TcpPorts")
        public String tcpPorts;

        @NameInMap("UdpPorts")
        public String udpPorts;

        public static DescribeFlexAccConfigResponseBodyFlexAccConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlexAccConfigResponseBodyFlexAccConfig self = new DescribeFlexAccConfigResponseBodyFlexAccConfig();
            return TeaModel.build(map, self);
        }

        public DescribeFlexAccConfigResponseBodyFlexAccConfig setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeFlexAccConfigResponseBodyFlexAccConfig setTcpPorts(String tcpPorts) {
            this.tcpPorts = tcpPorts;
            return this;
        }
        public String getTcpPorts() {
            return this.tcpPorts;
        }

        public DescribeFlexAccConfigResponseBodyFlexAccConfig setUdpPorts(String udpPorts) {
            this.udpPorts = udpPorts;
            return this;
        }
        public String getUdpPorts() {
            return this.udpPorts;
        }

    }

}

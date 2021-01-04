// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeFlexConfigResponseBody extends TeaModel {
    @NameInMap("FlexConfig")
    public DescribeFlexConfigResponseBodyFlexConfig flexConfig;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeFlexConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlexConfigResponseBody self = new DescribeFlexConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlexConfigResponseBody setFlexConfig(DescribeFlexConfigResponseBodyFlexConfig flexConfig) {
        this.flexConfig = flexConfig;
        return this;
    }
    public DescribeFlexConfigResponseBodyFlexConfig getFlexConfig() {
        return this.flexConfig;
    }

    public DescribeFlexConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlexConfigResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeFlexConfigResponseBodyFlexConfig extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("LinkType")
        public Integer linkType;

        @NameInMap("Ports")
        public String ports;

        @NameInMap("Rate")
        public Integer rate;

        public static DescribeFlexConfigResponseBodyFlexConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlexConfigResponseBodyFlexConfig self = new DescribeFlexConfigResponseBodyFlexConfig();
            return TeaModel.build(map, self);
        }

        public DescribeFlexConfigResponseBodyFlexConfig setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeFlexConfigResponseBodyFlexConfig setLinkType(Integer linkType) {
            this.linkType = linkType;
            return this;
        }
        public Integer getLinkType() {
            return this.linkType;
        }

        public DescribeFlexConfigResponseBodyFlexConfig setPorts(String ports) {
            this.ports = ports;
            return this;
        }
        public String getPorts() {
            return this.ports;
        }

        public DescribeFlexConfigResponseBodyFlexConfig setRate(Integer rate) {
            this.rate = rate;
            return this;
        }
        public Integer getRate() {
            return this.rate;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeHardwareTerminalsResponseBody extends TeaModel {
    @NameInMap("HardwareTerminals")
    public java.util.List<DescribeHardwareTerminalsResponseBodyHardwareTerminals> hardwareTerminals;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHardwareTerminalsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHardwareTerminalsResponseBody self = new DescribeHardwareTerminalsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHardwareTerminalsResponseBody setHardwareTerminals(java.util.List<DescribeHardwareTerminalsResponseBodyHardwareTerminals> hardwareTerminals) {
        this.hardwareTerminals = hardwareTerminals;
        return this;
    }
    public java.util.List<DescribeHardwareTerminalsResponseBodyHardwareTerminals> getHardwareTerminals() {
        return this.hardwareTerminals;
    }

    public DescribeHardwareTerminalsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeHardwareTerminalsResponseBodyHardwareTerminalsHardwareTypeDetails extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("HardwareVersion")
        public Integer hardwareVersion;

        @NameInMap("StockState")
        public String stockState;

        public static DescribeHardwareTerminalsResponseBodyHardwareTerminalsHardwareTypeDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeHardwareTerminalsResponseBodyHardwareTerminalsHardwareTypeDetails self = new DescribeHardwareTerminalsResponseBodyHardwareTerminalsHardwareTypeDetails();
            return TeaModel.build(map, self);
        }

        public DescribeHardwareTerminalsResponseBodyHardwareTerminalsHardwareTypeDetails setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeHardwareTerminalsResponseBodyHardwareTerminalsHardwareTypeDetails setHardwareVersion(Integer hardwareVersion) {
            this.hardwareVersion = hardwareVersion;
            return this;
        }
        public Integer getHardwareVersion() {
            return this.hardwareVersion;
        }

        public DescribeHardwareTerminalsResponseBodyHardwareTerminalsHardwareTypeDetails setStockState(String stockState) {
            this.stockState = stockState;
            return this;
        }
        public String getStockState() {
            return this.stockState;
        }

    }

    public static class DescribeHardwareTerminalsResponseBodyHardwareTerminals extends TeaModel {
        @NameInMap("HardwareType")
        public String hardwareType;

        @NameInMap("HardwareTypeDetails")
        public java.util.List<DescribeHardwareTerminalsResponseBodyHardwareTerminalsHardwareTypeDetails> hardwareTypeDetails;

        public static DescribeHardwareTerminalsResponseBodyHardwareTerminals build(java.util.Map<String, ?> map) throws Exception {
            DescribeHardwareTerminalsResponseBodyHardwareTerminals self = new DescribeHardwareTerminalsResponseBodyHardwareTerminals();
            return TeaModel.build(map, self);
        }

        public DescribeHardwareTerminalsResponseBodyHardwareTerminals setHardwareType(String hardwareType) {
            this.hardwareType = hardwareType;
            return this;
        }
        public String getHardwareType() {
            return this.hardwareType;
        }

        public DescribeHardwareTerminalsResponseBodyHardwareTerminals setHardwareTypeDetails(java.util.List<DescribeHardwareTerminalsResponseBodyHardwareTerminalsHardwareTypeDetails> hardwareTypeDetails) {
            this.hardwareTypeDetails = hardwareTypeDetails;
            return this;
        }
        public java.util.List<DescribeHardwareTerminalsResponseBodyHardwareTerminalsHardwareTypeDetails> getHardwareTypeDetails() {
            return this.hardwareTypeDetails;
        }

    }

}

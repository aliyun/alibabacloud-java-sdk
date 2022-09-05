// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeEIURangeResponseBody extends TeaModel {
    @NameInMap("EIUInfo")
    public DescribeEIURangeResponseBodyEIUInfo EIUInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEIURangeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEIURangeResponseBody self = new DescribeEIURangeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEIURangeResponseBody setEIUInfo(DescribeEIURangeResponseBodyEIUInfo EIUInfo) {
        this.EIUInfo = EIUInfo;
        return this;
    }
    public DescribeEIURangeResponseBodyEIUInfo getEIUInfo() {
        return this.EIUInfo;
    }

    public DescribeEIURangeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEIURangeResponseBodyEIUInfo extends TeaModel {
        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("EIURange")
        public java.util.List<Long> EIURange;

        public static DescribeEIURangeResponseBodyEIUInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeEIURangeResponseBodyEIUInfo self = new DescribeEIURangeResponseBodyEIUInfo();
            return TeaModel.build(map, self);
        }

        public DescribeEIURangeResponseBodyEIUInfo setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeEIURangeResponseBodyEIUInfo setEIURange(java.util.List<Long> EIURange) {
            this.EIURange = EIURange;
            return this;
        }
        public java.util.List<Long> getEIURange() {
            return this.EIURange;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeVirtualWareHouseStatusSetResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeVirtualWareHouseStatusSetResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVirtualWareHouseStatusSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualWareHouseStatusSetResponseBody self = new DescribeVirtualWareHouseStatusSetResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVirtualWareHouseStatusSetResponseBody setData(java.util.List<DescribeVirtualWareHouseStatusSetResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeVirtualWareHouseStatusSetResponseBodyData> getData() {
        return this.data;
    }

    public DescribeVirtualWareHouseStatusSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVirtualWareHouseStatusSetResponseBodyData extends TeaModel {
        // 描述
        @NameInMap("Desc")
        public String desc;

        // 状态值
        @NameInMap("Value")
        public String value;

        public static DescribeVirtualWareHouseStatusSetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualWareHouseStatusSetResponseBodyData self = new DescribeVirtualWareHouseStatusSetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualWareHouseStatusSetResponseBodyData setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public DescribeVirtualWareHouseStatusSetResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

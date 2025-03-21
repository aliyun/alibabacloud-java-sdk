// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeClusterStatusSetResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeClusterStatusSetResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>F5178C10-1407-4987-9133-DE4DC9119F75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClusterStatusSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterStatusSetResponseBody self = new DescribeClusterStatusSetResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterStatusSetResponseBody setData(java.util.List<DescribeClusterStatusSetResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeClusterStatusSetResponseBodyData> getData() {
        return this.data;
    }

    public DescribeClusterStatusSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClusterStatusSetResponseBodyData extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeClusterStatusSetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterStatusSetResponseBodyData self = new DescribeClusterStatusSetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeClusterStatusSetResponseBodyData setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public DescribeClusterStatusSetResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

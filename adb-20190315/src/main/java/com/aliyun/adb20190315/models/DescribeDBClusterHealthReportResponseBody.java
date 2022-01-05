// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClusterHealthReportResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeDBClusterHealthReportResponseBodyItems> items;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterHealthReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterHealthReportResponseBody self = new DescribeDBClusterHealthReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterHealthReportResponseBody setItems(java.util.List<DescribeDBClusterHealthReportResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDBClusterHealthReportResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeDBClusterHealthReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBClusterHealthReportResponseBodyItems extends TeaModel {
        @NameInMap("Avg")
        public String avg;

        @NameInMap("Key")
        public String key;

        @NameInMap("Max")
        public String max;

        @NameInMap("Name")
        public String name;

        public static DescribeDBClusterHealthReportResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterHealthReportResponseBodyItems self = new DescribeDBClusterHealthReportResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterHealthReportResponseBodyItems setAvg(String avg) {
            this.avg = avg;
            return this;
        }
        public String getAvg() {
            return this.avg;
        }

        public DescribeDBClusterHealthReportResponseBodyItems setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBClusterHealthReportResponseBodyItems setMax(String max) {
            this.max = max;
            return this;
        }
        public String getMax() {
            return this.max;
        }

        public DescribeDBClusterHealthReportResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}

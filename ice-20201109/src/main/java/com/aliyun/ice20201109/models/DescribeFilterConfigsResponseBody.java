// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeFilterConfigsResponseBody extends TeaModel {
    @NameInMap("FilterConfigs")
    public java.util.List<DescribeFilterConfigsResponseBodyFilterConfigs> filterConfigs;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFilterConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFilterConfigsResponseBody self = new DescribeFilterConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFilterConfigsResponseBody setFilterConfigs(java.util.List<DescribeFilterConfigsResponseBodyFilterConfigs> filterConfigs) {
        this.filterConfigs = filterConfigs;
        return this;
    }
    public java.util.List<DescribeFilterConfigsResponseBodyFilterConfigs> getFilterConfigs() {
        return this.filterConfigs;
    }

    public DescribeFilterConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeFilterConfigsResponseBodyFilterConfigs extends TeaModel {
        @NameInMap("FilterName")
        public String filterName;

        @NameInMap("ItemConfigs")
        public String itemConfigs;

        @NameInMap("Type")
        public String type;

        @NameInMap("UuId")
        public String uuId;

        public static DescribeFilterConfigsResponseBodyFilterConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeFilterConfigsResponseBodyFilterConfigs self = new DescribeFilterConfigsResponseBodyFilterConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeFilterConfigsResponseBodyFilterConfigs setFilterName(String filterName) {
            this.filterName = filterName;
            return this;
        }
        public String getFilterName() {
            return this.filterName;
        }

        public DescribeFilterConfigsResponseBodyFilterConfigs setItemConfigs(String itemConfigs) {
            this.itemConfigs = itemConfigs;
            return this;
        }
        public String getItemConfigs() {
            return this.itemConfigs;
        }

        public DescribeFilterConfigsResponseBodyFilterConfigs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeFilterConfigsResponseBodyFilterConfigs setUuId(String uuId) {
            this.uuId = uuId;
            return this;
        }
        public String getUuId() {
            return this.uuId;
        }

    }

}

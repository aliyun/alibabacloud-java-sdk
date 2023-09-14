// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorHDFSUGIResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<Data> data;

    /**
     * <p>本次请求所返回的最大记录条数。</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>返回读取到的数据位置，空代表数据已经读取完毕。</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>本次请求条件下的数据总量。</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDoctorHDFSUGIResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDoctorHDFSUGIResponseBody self = new ListDoctorHDFSUGIResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDoctorHDFSUGIResponseBody setData(java.util.List<Data> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Data> getData() {
        return this.data;
    }

    public ListDoctorHDFSUGIResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDoctorHDFSUGIResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDoctorHDFSUGIResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDoctorHDFSUGIResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class TotalDataSize extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("Value")
        public Long value;

        public static TotalDataSize build(java.util.Map<String, ?> map) throws Exception {
            TotalDataSize self = new TotalDataSize();
            return TeaModel.build(map, self);
        }

        public TotalDataSize setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TotalDataSize setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TotalDataSize setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public TotalDataSize setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class TotalDirCount extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("Value")
        public Long value;

        public static TotalDirCount build(java.util.Map<String, ?> map) throws Exception {
            TotalDirCount self = new TotalDirCount();
            return TeaModel.build(map, self);
        }

        public TotalDirCount setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TotalDirCount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TotalDirCount setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public TotalDirCount setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class TotalFileCount extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("Value")
        public Long value;

        public static TotalFileCount build(java.util.Map<String, ?> map) throws Exception {
            TotalFileCount self = new TotalFileCount();
            return TeaModel.build(map, self);
        }

        public TotalFileCount setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TotalFileCount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TotalFileCount setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public TotalFileCount setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class Metrics extends TeaModel {
        @NameInMap("TotalDataSize")
        public TotalDataSize totalDataSize;

        @NameInMap("TotalDirCount")
        public TotalDirCount totalDirCount;

        @NameInMap("TotalFileCount")
        public TotalFileCount totalFileCount;

        public static Metrics build(java.util.Map<String, ?> map) throws Exception {
            Metrics self = new Metrics();
            return TeaModel.build(map, self);
        }

        public Metrics setTotalDataSize(TotalDataSize totalDataSize) {
            this.totalDataSize = totalDataSize;
            return this;
        }
        public TotalDataSize getTotalDataSize() {
            return this.totalDataSize;
        }

        public Metrics setTotalDirCount(TotalDirCount totalDirCount) {
            this.totalDirCount = totalDirCount;
            return this;
        }
        public TotalDirCount getTotalDirCount() {
            return this.totalDirCount;
        }

        public Metrics setTotalFileCount(TotalFileCount totalFileCount) {
            this.totalFileCount = totalFileCount;
            return this;
        }
        public TotalFileCount getTotalFileCount() {
            return this.totalFileCount;
        }

    }

    public static class Data extends TeaModel {
        @NameInMap("Metrics")
        public Metrics metrics;

        @NameInMap("Name")
        public String name;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setMetrics(Metrics metrics) {
            this.metrics = metrics;
            return this;
        }
        public Metrics getMetrics() {
            return this.metrics;
        }

        public Data setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}

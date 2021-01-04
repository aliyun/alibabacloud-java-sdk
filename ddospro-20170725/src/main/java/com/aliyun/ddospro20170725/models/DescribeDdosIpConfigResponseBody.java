// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeDdosIpConfigResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<DescribeDdosIpConfigResponseBodyDataList> dataList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    public static DescribeDdosIpConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosIpConfigResponseBody self = new DescribeDdosIpConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDdosIpConfigResponseBody setDataList(java.util.List<DescribeDdosIpConfigResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeDdosIpConfigResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeDdosIpConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDdosIpConfigResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeDdosIpConfigResponseBodyDataList extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("CleanStatus")
        public Integer cleanStatus;

        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("ConfigDomainCount")
        public Integer configDomainCount;

        @NameInMap("Line")
        public String line;

        @NameInMap("ElasticBandwidth")
        public Integer elasticBandwidth;

        @NameInMap("LbId")
        public String lbId;

        @NameInMap("ConfigPortCount")
        public Integer configPortCount;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("TotalDefenseCount")
        public Integer totalDefenseCount;

        public static DescribeDdosIpConfigResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDdosIpConfigResponseBodyDataList self = new DescribeDdosIpConfigResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeDdosIpConfigResponseBodyDataList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeDdosIpConfigResponseBodyDataList setCleanStatus(Integer cleanStatus) {
            this.cleanStatus = cleanStatus;
            return this;
        }
        public Integer getCleanStatus() {
            return this.cleanStatus;
        }

        public DescribeDdosIpConfigResponseBodyDataList setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeDdosIpConfigResponseBodyDataList setConfigDomainCount(Integer configDomainCount) {
            this.configDomainCount = configDomainCount;
            return this;
        }
        public Integer getConfigDomainCount() {
            return this.configDomainCount;
        }

        public DescribeDdosIpConfigResponseBodyDataList setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

        public DescribeDdosIpConfigResponseBodyDataList setElasticBandwidth(Integer elasticBandwidth) {
            this.elasticBandwidth = elasticBandwidth;
            return this;
        }
        public Integer getElasticBandwidth() {
            return this.elasticBandwidth;
        }

        public DescribeDdosIpConfigResponseBodyDataList setLbId(String lbId) {
            this.lbId = lbId;
            return this;
        }
        public String getLbId() {
            return this.lbId;
        }

        public DescribeDdosIpConfigResponseBodyDataList setConfigPortCount(Integer configPortCount) {
            this.configPortCount = configPortCount;
            return this;
        }
        public Integer getConfigPortCount() {
            return this.configPortCount;
        }

        public DescribeDdosIpConfigResponseBodyDataList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDdosIpConfigResponseBodyDataList setTotalDefenseCount(Integer totalDefenseCount) {
            this.totalDefenseCount = totalDefenseCount;
            return this;
        }
        public Integer getTotalDefenseCount() {
            return this.totalDefenseCount;
        }

    }

}

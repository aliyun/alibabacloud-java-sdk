// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstanceBandwidthDetailResponseBody extends TeaModel {
    @NameInMap("Bandwidths")
    public java.util.List<DescribeInstanceBandwidthDetailResponseBodyBandwidths> bandwidths;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C0003E8B-B930-4F59-ADC0-0E209A9012A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeInstanceBandwidthDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceBandwidthDetailResponseBody self = new DescribeInstanceBandwidthDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceBandwidthDetailResponseBody setBandwidths(java.util.List<DescribeInstanceBandwidthDetailResponseBodyBandwidths> bandwidths) {
        this.bandwidths = bandwidths;
        return this;
    }
    public java.util.List<DescribeInstanceBandwidthDetailResponseBodyBandwidths> getBandwidths() {
        return this.bandwidths;
    }

    public DescribeInstanceBandwidthDetailResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceBandwidthDetailResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceBandwidthDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceBandwidthDetailResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInstanceBandwidthDetailResponseBodyBandwidths extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1972653484384661</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <strong>example:</strong>
         * <p>2024-01-11 00:00:00</p>
         */
        @NameInMap("BizTime")
        public String bizTime;

        /**
         * <strong>example:</strong>
         * <p>cn-yichang-2</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FlowType")
        public Integer flowType;

        /**
         * <strong>example:</strong>
         * <p>i-6ecpqvkicnchxccozrpxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>vm</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p>203.107.***</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <strong>example:</strong>
         * <p>cmcc</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <strong>example:</strong>
         * <p>43795230</p>
         */
        @NameInMap("RxBw")
        public Long rxBw;

        /**
         * <strong>example:</strong>
         * <p>vm</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <strong>example:</strong>
         * <p>25415638</p>
         */
        @NameInMap("TxBw")
        public Long txBw;

        public static DescribeInstanceBandwidthDetailResponseBodyBandwidths build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceBandwidthDetailResponseBodyBandwidths self = new DescribeInstanceBandwidthDetailResponseBodyBandwidths();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceBandwidthDetailResponseBodyBandwidths setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeInstanceBandwidthDetailResponseBodyBandwidths setBizTime(String bizTime) {
            this.bizTime = bizTime;
            return this;
        }
        public String getBizTime() {
            return this.bizTime;
        }

        public DescribeInstanceBandwidthDetailResponseBodyBandwidths setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeInstanceBandwidthDetailResponseBodyBandwidths setFlowType(Integer flowType) {
            this.flowType = flowType;
            return this;
        }
        public Integer getFlowType() {
            return this.flowType;
        }

        public DescribeInstanceBandwidthDetailResponseBodyBandwidths setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceBandwidthDetailResponseBodyBandwidths setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeInstanceBandwidthDetailResponseBodyBandwidths setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeInstanceBandwidthDetailResponseBodyBandwidths setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public DescribeInstanceBandwidthDetailResponseBodyBandwidths setRxBw(Long rxBw) {
            this.rxBw = rxBw;
            return this;
        }
        public Long getRxBw() {
            return this.rxBw;
        }

        public DescribeInstanceBandwidthDetailResponseBodyBandwidths setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public DescribeInstanceBandwidthDetailResponseBodyBandwidths setTxBw(Long txBw) {
            this.txBw = txBw;
            return this;
        }
        public Long getTxBw() {
            return this.txBw;
        }

    }

}

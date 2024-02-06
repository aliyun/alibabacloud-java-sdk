// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsRegionIdResourceResponseBody extends TeaModel {
    /**
     * <p>The returned data. For more information, see EnsRegionIdResources in sample JSON responses.</p>
     */
    @NameInMap("EnsRegionIdResources")
    public DescribeEnsRegionIdResourceResponseBodyEnsRegionIdResources ensRegionIdResources;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of queried nodes.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeEnsRegionIdResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsRegionIdResourceResponseBody self = new DescribeEnsRegionIdResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEnsRegionIdResourceResponseBody setEnsRegionIdResources(DescribeEnsRegionIdResourceResponseBodyEnsRegionIdResources ensRegionIdResources) {
        this.ensRegionIdResources = ensRegionIdResources;
        return this;
    }
    public DescribeEnsRegionIdResourceResponseBodyEnsRegionIdResources getEnsRegionIdResources() {
        return this.ensRegionIdResources;
    }

    public DescribeEnsRegionIdResourceResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEnsRegionIdResourceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEnsRegionIdResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEnsRegionIdResourceResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeEnsRegionIdResourceResponseBodyEnsRegionIdResourcesEnsRegionIdResource extends TeaModel {
        /**
         * <p>The region. Set the value to West.</p>
         */
        @NameInMap("Area")
        public String area;

        /**
         * <p>The code of the region.</p>
         */
        @NameInMap("AreaCode")
        public String areaCode;

        /**
         * <p>The date when the transaction was processed.</p>
         */
        @NameInMap("BizDate")
        public String bizDate;

        /**
         * <p>The ID of the node.</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The name of the node.</p>
         */
        @NameInMap("EnsRegionIdName")
        public String ensRegionIdName;

        /**
         * <p>The number of instances.</p>
         */
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        /**
         * <p>The public bandwidth of the instance. Unit: Bits/s.</p>
         */
        @NameInMap("InternetBandwidth")
        public Long internetBandwidth;

        /**
         * <p>The ISP. Valid values:</p>
         * <br>
         * <p>*   cmcc: China Mobile</p>
         * <p>*   unicom: China Unicom</p>
         * <p>*   telecom: China Telecom</p>
         * <p>*   multiCarrier: multi-line ISP</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <p>The number of vCPUs.</p>
         */
        @NameInMap("VCpu")
        public Integer VCpu;

        public static DescribeEnsRegionIdResourceResponseBodyEnsRegionIdResourcesEnsRegionIdResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsRegionIdResourceResponseBodyEnsRegionIdResourcesEnsRegionIdResource self = new DescribeEnsRegionIdResourceResponseBodyEnsRegionIdResourcesEnsRegionIdResource();
            return TeaModel.build(map, self);
        }

        public DescribeEnsRegionIdResourceResponseBodyEnsRegionIdResourcesEnsRegionIdResource setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public DescribeEnsRegionIdResourceResponseBodyEnsRegionIdResourcesEnsRegionIdResource setAreaCode(String areaCode) {
            this.areaCode = areaCode;
            return this;
        }
        public String getAreaCode() {
            return this.areaCode;
        }

        public DescribeEnsRegionIdResourceResponseBodyEnsRegionIdResourcesEnsRegionIdResource setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public DescribeEnsRegionIdResourceResponseBodyEnsRegionIdResourcesEnsRegionIdResource setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeEnsRegionIdResourceResponseBodyEnsRegionIdResourcesEnsRegionIdResource setEnsRegionIdName(String ensRegionIdName) {
            this.ensRegionIdName = ensRegionIdName;
            return this;
        }
        public String getEnsRegionIdName() {
            return this.ensRegionIdName;
        }

        public DescribeEnsRegionIdResourceResponseBodyEnsRegionIdResourcesEnsRegionIdResource setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public DescribeEnsRegionIdResourceResponseBodyEnsRegionIdResourcesEnsRegionIdResource setInternetBandwidth(Long internetBandwidth) {
            this.internetBandwidth = internetBandwidth;
            return this;
        }
        public Long getInternetBandwidth() {
            return this.internetBandwidth;
        }

        public DescribeEnsRegionIdResourceResponseBodyEnsRegionIdResourcesEnsRegionIdResource setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public DescribeEnsRegionIdResourceResponseBodyEnsRegionIdResourcesEnsRegionIdResource setVCpu(Integer VCpu) {
            this.VCpu = VCpu;
            return this;
        }
        public Integer getVCpu() {
            return this.VCpu;
        }

    }

    public static class DescribeEnsRegionIdResourceResponseBodyEnsRegionIdResources extends TeaModel {
        @NameInMap("EnsRegionIdResource")
        public java.util.List<DescribeEnsRegionIdResourceResponseBodyEnsRegionIdResourcesEnsRegionIdResource> ensRegionIdResource;

        public static DescribeEnsRegionIdResourceResponseBodyEnsRegionIdResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsRegionIdResourceResponseBodyEnsRegionIdResources self = new DescribeEnsRegionIdResourceResponseBodyEnsRegionIdResources();
            return TeaModel.build(map, self);
        }

        public DescribeEnsRegionIdResourceResponseBodyEnsRegionIdResources setEnsRegionIdResource(java.util.List<DescribeEnsRegionIdResourceResponseBodyEnsRegionIdResourcesEnsRegionIdResource> ensRegionIdResource) {
            this.ensRegionIdResource = ensRegionIdResource;
            return this;
        }
        public java.util.List<DescribeEnsRegionIdResourceResponseBodyEnsRegionIdResourcesEnsRegionIdResource> getEnsRegionIdResource() {
            return this.ensRegionIdResource;
        }

    }

}

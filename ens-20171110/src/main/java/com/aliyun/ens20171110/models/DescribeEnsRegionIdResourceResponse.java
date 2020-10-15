// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsRegionIdResourceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("EnsRegionIdResources")
    @Validation(required = true)
    public DescribeEnsRegionIdResourceResponseEnsRegionIdResources ensRegionIdResources;

    public static DescribeEnsRegionIdResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsRegionIdResourceResponse self = new DescribeEnsRegionIdResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnsRegionIdResourceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEnsRegionIdResourceResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeEnsRegionIdResourceResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEnsRegionIdResourceResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEnsRegionIdResourceResponse setEnsRegionIdResources(DescribeEnsRegionIdResourceResponseEnsRegionIdResources ensRegionIdResources) {
        this.ensRegionIdResources = ensRegionIdResources;
        return this;
    }
    public DescribeEnsRegionIdResourceResponseEnsRegionIdResources getEnsRegionIdResources() {
        return this.ensRegionIdResources;
    }

    public static class DescribeEnsRegionIdResourceResponseEnsRegionIdResourcesEnsRegionIdResource extends TeaModel {
        @NameInMap("Area")
        @Validation(required = true)
        public String area;

        @NameInMap("AreaCode")
        @Validation(required = true)
        public String areaCode;

        @NameInMap("EnsRegionId")
        @Validation(required = true)
        public String ensRegionId;

        @NameInMap("EnsRegionIdName")
        @Validation(required = true)
        public String ensRegionIdName;

        @NameInMap("VCpu")
        @Validation(required = true)
        public Integer VCpu;

        @NameInMap("InternetBandwidth")
        @Validation(required = true)
        public Integer internetBandwidth;

        @NameInMap("Isp")
        @Validation(required = true)
        public String isp;

        @NameInMap("BizDate")
        @Validation(required = true)
        public String bizDate;

        @NameInMap("InstanceCount")
        @Validation(required = true)
        public Integer instanceCount;

        public static DescribeEnsRegionIdResourceResponseEnsRegionIdResourcesEnsRegionIdResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsRegionIdResourceResponseEnsRegionIdResourcesEnsRegionIdResource self = new DescribeEnsRegionIdResourceResponseEnsRegionIdResourcesEnsRegionIdResource();
            return TeaModel.build(map, self);
        }

        public DescribeEnsRegionIdResourceResponseEnsRegionIdResourcesEnsRegionIdResource setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public DescribeEnsRegionIdResourceResponseEnsRegionIdResourcesEnsRegionIdResource setAreaCode(String areaCode) {
            this.areaCode = areaCode;
            return this;
        }
        public String getAreaCode() {
            return this.areaCode;
        }

        public DescribeEnsRegionIdResourceResponseEnsRegionIdResourcesEnsRegionIdResource setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeEnsRegionIdResourceResponseEnsRegionIdResourcesEnsRegionIdResource setEnsRegionIdName(String ensRegionIdName) {
            this.ensRegionIdName = ensRegionIdName;
            return this;
        }
        public String getEnsRegionIdName() {
            return this.ensRegionIdName;
        }

        public DescribeEnsRegionIdResourceResponseEnsRegionIdResourcesEnsRegionIdResource setVCpu(Integer VCpu) {
            this.VCpu = VCpu;
            return this;
        }
        public Integer getVCpu() {
            return this.VCpu;
        }

        public DescribeEnsRegionIdResourceResponseEnsRegionIdResourcesEnsRegionIdResource setInternetBandwidth(Integer internetBandwidth) {
            this.internetBandwidth = internetBandwidth;
            return this;
        }
        public Integer getInternetBandwidth() {
            return this.internetBandwidth;
        }

        public DescribeEnsRegionIdResourceResponseEnsRegionIdResourcesEnsRegionIdResource setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public DescribeEnsRegionIdResourceResponseEnsRegionIdResourcesEnsRegionIdResource setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public DescribeEnsRegionIdResourceResponseEnsRegionIdResourcesEnsRegionIdResource setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

    }

    public static class DescribeEnsRegionIdResourceResponseEnsRegionIdResources extends TeaModel {
        @NameInMap("EnsRegionIdResource")
        @Validation(required = true)
        public java.util.List<DescribeEnsRegionIdResourceResponseEnsRegionIdResourcesEnsRegionIdResource> ensRegionIdResource;

        public static DescribeEnsRegionIdResourceResponseEnsRegionIdResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsRegionIdResourceResponseEnsRegionIdResources self = new DescribeEnsRegionIdResourceResponseEnsRegionIdResources();
            return TeaModel.build(map, self);
        }

        public DescribeEnsRegionIdResourceResponseEnsRegionIdResources setEnsRegionIdResource(java.util.List<DescribeEnsRegionIdResourceResponseEnsRegionIdResourcesEnsRegionIdResource> ensRegionIdResource) {
            this.ensRegionIdResource = ensRegionIdResource;
            return this;
        }
        public java.util.List<DescribeEnsRegionIdResourceResponseEnsRegionIdResourcesEnsRegionIdResource> getEnsRegionIdResource() {
            return this.ensRegionIdResource;
        }

    }

}

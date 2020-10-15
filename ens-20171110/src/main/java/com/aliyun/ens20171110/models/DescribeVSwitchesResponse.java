// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeVSwitchesResponse extends TeaModel {
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

    @NameInMap("VSwitches")
    @Validation(required = true)
    public DescribeVSwitchesResponseVSwitches vSwitches;

    public static DescribeVSwitchesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVSwitchesResponse self = new DescribeVSwitchesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVSwitchesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVSwitchesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVSwitchesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVSwitchesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVSwitchesResponse setVSwitches(DescribeVSwitchesResponseVSwitches vSwitches) {
        this.vSwitches = vSwitches;
        return this;
    }
    public DescribeVSwitchesResponseVSwitches getVSwitches() {
        return this.vSwitches;
    }

    public static class DescribeVSwitchesResponseVSwitchesVSwitch extends TeaModel {
        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String vSwitchId;

        @NameInMap("VSwitchName")
        @Validation(required = true)
        public String vSwitchName;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("CidrBlock")
        @Validation(required = true)
        public String cidrBlock;

        @NameInMap("EnsRegionId")
        @Validation(required = true)
        public String ensRegionId;

        @NameInMap("FreeIpCount")
        @Validation(required = true)
        public Long freeIpCount;

        @NameInMap("CreatedTime")
        @Validation(required = true)
        public String createdTime;

        public static DescribeVSwitchesResponseVSwitchesVSwitch build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchesResponseVSwitchesVSwitch self = new DescribeVSwitchesResponseVSwitchesVSwitch();
            return TeaModel.build(map, self);
        }

        public DescribeVSwitchesResponseVSwitchesVSwitch setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeVSwitchesResponseVSwitchesVSwitch setVSwitchName(String vSwitchName) {
            this.vSwitchName = vSwitchName;
            return this;
        }
        public String getVSwitchName() {
            return this.vSwitchName;
        }

        public DescribeVSwitchesResponseVSwitchesVSwitch setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVSwitchesResponseVSwitchesVSwitch setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeVSwitchesResponseVSwitchesVSwitch setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeVSwitchesResponseVSwitchesVSwitch setFreeIpCount(Long freeIpCount) {
            this.freeIpCount = freeIpCount;
            return this;
        }
        public Long getFreeIpCount() {
            return this.freeIpCount;
        }

        public DescribeVSwitchesResponseVSwitchesVSwitch setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

    }

    public static class DescribeVSwitchesResponseVSwitches extends TeaModel {
        @NameInMap("VSwitch")
        @Validation(required = true)
        public java.util.List<DescribeVSwitchesResponseVSwitchesVSwitch> vSwitch;

        public static DescribeVSwitchesResponseVSwitches build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchesResponseVSwitches self = new DescribeVSwitchesResponseVSwitches();
            return TeaModel.build(map, self);
        }

        public DescribeVSwitchesResponseVSwitches setVSwitch(java.util.List<DescribeVSwitchesResponseVSwitchesVSwitch> vSwitch) {
            this.vSwitch = vSwitch;
            return this;
        }
        public java.util.List<DescribeVSwitchesResponseVSwitchesVSwitch> getVSwitch() {
            return this.vSwitch;
        }

    }

}

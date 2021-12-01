// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribePreCheckStatusRequest extends TeaModel {
    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("JobCode")
    public String jobCode;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageNo")
    public String pageNo;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StructPhase")
    public String structPhase;

    @NameInMap("StructType")
    public String structType;

    public static DescribePreCheckStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePreCheckStatusRequest self = new DescribePreCheckStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribePreCheckStatusRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public DescribePreCheckStatusRequest setJobCode(String jobCode) {
        this.jobCode = jobCode;
        return this;
    }
    public String getJobCode() {
        return this.jobCode;
    }

    public DescribePreCheckStatusRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribePreCheckStatusRequest setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public DescribePreCheckStatusRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribePreCheckStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePreCheckStatusRequest setStructPhase(String structPhase) {
        this.structPhase = structPhase;
        return this;
    }
    public String getStructPhase() {
        return this.structPhase;
    }

    public DescribePreCheckStatusRequest setStructType(String structType) {
        this.structType = structType;
        return this;
    }
    public String getStructType() {
        return this.structType;
    }

}

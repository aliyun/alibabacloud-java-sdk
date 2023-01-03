// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListVccsRequest extends TeaModel {
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("CenId")
    public String cenId;

    @NameInMap("EnablePage")
    public Boolean enablePage;

    @NameInMap("ExStatus")
    public String exStatus;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Status")
    public String status;

    @NameInMap("VccId")
    public String vccId;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VpdId")
    public String vpdId;

    public static ListVccsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVccsRequest self = new ListVccsRequest();
        return TeaModel.build(map, self);
    }

    public ListVccsRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public ListVccsRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public ListVccsRequest setEnablePage(Boolean enablePage) {
        this.enablePage = enablePage;
        return this;
    }
    public Boolean getEnablePage() {
        return this.enablePage;
    }

    public ListVccsRequest setExStatus(String exStatus) {
        this.exStatus = exStatus;
        return this;
    }
    public String getExStatus() {
        return this.exStatus;
    }

    public ListVccsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListVccsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListVccsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListVccsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListVccsRequest setVccId(String vccId) {
        this.vccId = vccId;
        return this;
    }
    public String getVccId() {
        return this.vccId;
    }

    public ListVccsRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public ListVccsRequest setVpdId(String vpdId) {
        this.vpdId = vpdId;
        return this;
    }
    public String getVpdId() {
        return this.vpdId;
    }

}

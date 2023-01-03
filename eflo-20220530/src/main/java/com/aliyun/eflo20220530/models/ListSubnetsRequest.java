// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListSubnetsRequest extends TeaModel {
    @NameInMap("EnablePage")
    public Boolean enablePage;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Status")
    public String status;

    @NameInMap("SubnetId")
    public String subnetId;

    @NameInMap("Type")
    public String type;

    @NameInMap("VpdId")
    public String vpdId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static ListSubnetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSubnetsRequest self = new ListSubnetsRequest();
        return TeaModel.build(map, self);
    }

    public ListSubnetsRequest setEnablePage(Boolean enablePage) {
        this.enablePage = enablePage;
        return this;
    }
    public Boolean getEnablePage() {
        return this.enablePage;
    }

    public ListSubnetsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListSubnetsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSubnetsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSubnetsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListSubnetsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListSubnetsRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }
    public String getSubnetId() {
        return this.subnetId;
    }

    public ListSubnetsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListSubnetsRequest setVpdId(String vpdId) {
        this.vpdId = vpdId;
        return this;
    }
    public String getVpdId() {
        return this.vpdId;
    }

    public ListSubnetsRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}

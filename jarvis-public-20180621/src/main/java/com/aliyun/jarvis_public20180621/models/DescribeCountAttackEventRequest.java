// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jarvis_public20180621.models;

import com.aliyun.tea.*;

public class DescribeCountAttackEventRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EndTime")
    public Integer endTime;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("Region")
    public String region;

    @NameInMap("ServerIpList")
    public String serverIpList;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("StartTime")
    public Integer startTime;

    public static DescribeCountAttackEventRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCountAttackEventRequest self = new DescribeCountAttackEventRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCountAttackEventRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCountAttackEventRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public DescribeCountAttackEventRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeCountAttackEventRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCountAttackEventRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public DescribeCountAttackEventRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeCountAttackEventRequest setServerIpList(String serverIpList) {
        this.serverIpList = serverIpList;
        return this;
    }
    public String getServerIpList() {
        return this.serverIpList;
    }

    public DescribeCountAttackEventRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeCountAttackEventRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

}

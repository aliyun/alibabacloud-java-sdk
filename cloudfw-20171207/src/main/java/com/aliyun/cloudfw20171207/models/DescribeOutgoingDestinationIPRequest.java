// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDestinationIPRequest extends TeaModel {
    @NameInMap("ApplicationName")
    public String applicationName;

    @NameInMap("CurrentPage")
    public String currentPage;

    @NameInMap("DstIP")
    public String dstIP;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Order")
    public String order;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("Port")
    public String port;

    @NameInMap("PrivateIP")
    public String privateIP;

    @NameInMap("PublicIP")
    public String publicIP;

    @NameInMap("Sort")
    public String sort;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeOutgoingDestinationIPRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingDestinationIPRequest self = new DescribeOutgoingDestinationIPRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingDestinationIPRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public DescribeOutgoingDestinationIPRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeOutgoingDestinationIPRequest setDstIP(String dstIP) {
        this.dstIP = dstIP;
        return this;
    }
    public String getDstIP() {
        return this.dstIP;
    }

    public DescribeOutgoingDestinationIPRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeOutgoingDestinationIPRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeOutgoingDestinationIPRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeOutgoingDestinationIPRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeOutgoingDestinationIPRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public DescribeOutgoingDestinationIPRequest setPrivateIP(String privateIP) {
        this.privateIP = privateIP;
        return this;
    }
    public String getPrivateIP() {
        return this.privateIP;
    }

    public DescribeOutgoingDestinationIPRequest setPublicIP(String publicIP) {
        this.publicIP = publicIP;
        return this;
    }
    public String getPublicIP() {
        return this.publicIP;
    }

    public DescribeOutgoingDestinationIPRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public DescribeOutgoingDestinationIPRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}

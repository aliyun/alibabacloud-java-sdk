// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDestinationIPRequest extends TeaModel {
    // The type of the applications that the access control policy supports. Valid values:
    // 
    // - **FTP**
    // - **HTTP**
    // - **HTTPS**
    // - **MySQL**
    // - **SMTP**
    // - **SMTPS**
    // - **RDP**
    // - **VNC**
    // - **SSH**
    // - **Redis**
    // - **MQTT**
    // - **MongoDB**
    // - **Memcache**
    // - **SSL**
    // - **ANY**: all types of applications
    @NameInMap("ApplicationName")
    public String applicationName;

    @NameInMap("CategoryId")
    public String categoryId;

    // The number of the page to return.
    // 
    // Pages start from page 1. Default value: 1.
    @NameInMap("CurrentPage")
    public String currentPage;

    // The destination IP address in the outbound connection that is initiated to access a domain name.
    @NameInMap("DstIP")
    public String dstIP;

    // The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.
    @NameInMap("EndTime")
    public String endTime;

    // The language of the content within the response. Valid values:
    // 
    // *   **zh**: Chinese (default)
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The field based on which you want to sort the queried information. Valid values:
    // 
    // *   **SessionCount**: the number of requests. This is the default value.
    // *   **InBytes**: the inbound traffic.
    // *   **OutBytes**: the outbound traffic.
    @NameInMap("Order")
    public String order;

    // The number of entries to return on each page.
    // 
    // Default value: 6. Maximum value: 10.
    @NameInMap("PageSize")
    public String pageSize;

    // The port number.
    @NameInMap("Port")
    public String port;

    // The private IP address of the ECS instance that initiates the outbound connection.
    @NameInMap("PrivateIP")
    public String privateIP;

    // The public IP address of the Elastic Compute Service (ECS) instance that initiates the outbound connection.
    @NameInMap("PublicIP")
    public String publicIP;

    // The order in which you want to sort the queried information. Valid values:
    // 
    // *   **asc**: the ascending order
    // *   **desc**: the descending order
    @NameInMap("Sort")
    public String sort;

    // The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.
    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TagIdNew")
    public String tagIdNew;

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

    public DescribeOutgoingDestinationIPRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
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

    public DescribeOutgoingDestinationIPRequest setTagIdNew(String tagIdNew) {
        this.tagIdNew = tagIdNew;
        return this;
    }
    public String getTagIdNew() {
        return this.tagIdNew;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetOpenPortRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <strong>example:</strong>
     * <p>1748358644</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    /**
     * <strong>example:</strong>
     * <p>SMB</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <strong>example:</strong>
     * <p>SMB</p>
     */
    @NameInMap("ServiceNameFuzzy")
    public String serviceNameFuzzy;

    /**
     * <strong>example:</strong>
     * <p>114.242.33.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <strong>example:</strong>
     * <p>1735264800</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SuggestLevel")
    public String suggestLevel;

    public static DescribeInternetOpenPortRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInternetOpenPortRequest self = new DescribeInternetOpenPortRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInternetOpenPortRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeInternetOpenPortRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeInternetOpenPortRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeInternetOpenPortRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeInternetOpenPortRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public DescribeInternetOpenPortRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public DescribeInternetOpenPortRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public DescribeInternetOpenPortRequest setServiceNameFuzzy(String serviceNameFuzzy) {
        this.serviceNameFuzzy = serviceNameFuzzy;
        return this;
    }
    public String getServiceNameFuzzy() {
        return this.serviceNameFuzzy;
    }

    public DescribeInternetOpenPortRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeInternetOpenPortRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeInternetOpenPortRequest setSuggestLevel(String suggestLevel) {
        this.suggestLevel = suggestLevel;
        return this;
    }
    public String getSuggestLevel() {
        return this.suggestLevel;
    }

}

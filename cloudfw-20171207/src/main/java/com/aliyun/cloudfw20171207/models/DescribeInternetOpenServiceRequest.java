// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetOpenServiceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <strong>example:</strong>
     * <p>1753804800</p>
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
     * <p>3389</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <strong>example:</strong>
     * <p>2</p>
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
     * <p>122.200.64.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <strong>example:</strong>
     * <p>1755742107</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SuggestLevel")
    public String suggestLevel;

    public static DescribeInternetOpenServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInternetOpenServiceRequest self = new DescribeInternetOpenServiceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInternetOpenServiceRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeInternetOpenServiceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeInternetOpenServiceRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeInternetOpenServiceRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeInternetOpenServiceRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public DescribeInternetOpenServiceRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public DescribeInternetOpenServiceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public DescribeInternetOpenServiceRequest setServiceNameFuzzy(String serviceNameFuzzy) {
        this.serviceNameFuzzy = serviceNameFuzzy;
        return this;
    }
    public String getServiceNameFuzzy() {
        return this.serviceNameFuzzy;
    }

    public DescribeInternetOpenServiceRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeInternetOpenServiceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeInternetOpenServiceRequest setSuggestLevel(String suggestLevel) {
        this.suggestLevel = suggestLevel;
        return this;
    }
    public String getSuggestLevel() {
        return this.suggestLevel;
    }

}

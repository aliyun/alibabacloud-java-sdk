// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetOpenDetailRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>i-uf6faknmuby7ezht****</p>
     */
    @NameInMap("AssetsInstanceId")
    public String assetsInstanceId;

    /**
     * <strong>example:</strong>
     * <p>instance_test</p>
     */
    @NameInMap("AssetsInstanceName")
    public String assetsInstanceName;

    /**
     * <strong>example:</strong>
     * <p>EcsPublicIP</p>
     */
    @NameInMap("AssetsType")
    public String assetsType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <strong>example:</strong>
     * <p>1745251200</p>
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
     * <p>9100</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <strong>example:</strong>
     * <p>203.0.13.XX</p>
     */
    @NameInMap("PublicIp")
    public String publicIp;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

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

    @NameInMap("SortList")
    public java.util.List<DescribeInternetOpenDetailRequestSortList> sortList;

    /**
     * <strong>example:</strong>
     * <p>222.212.86.7XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <strong>example:</strong>
     * <p>1656837360</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SuggestLevel")
    public String suggestLevel;

    public static DescribeInternetOpenDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInternetOpenDetailRequest self = new DescribeInternetOpenDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInternetOpenDetailRequest setAssetsInstanceId(String assetsInstanceId) {
        this.assetsInstanceId = assetsInstanceId;
        return this;
    }
    public String getAssetsInstanceId() {
        return this.assetsInstanceId;
    }

    public DescribeInternetOpenDetailRequest setAssetsInstanceName(String assetsInstanceName) {
        this.assetsInstanceName = assetsInstanceName;
        return this;
    }
    public String getAssetsInstanceName() {
        return this.assetsInstanceName;
    }

    public DescribeInternetOpenDetailRequest setAssetsType(String assetsType) {
        this.assetsType = assetsType;
        return this;
    }
    public String getAssetsType() {
        return this.assetsType;
    }

    public DescribeInternetOpenDetailRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeInternetOpenDetailRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeInternetOpenDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeInternetOpenDetailRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeInternetOpenDetailRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public DescribeInternetOpenDetailRequest setPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }
    public String getPublicIp() {
        return this.publicIp;
    }

    public DescribeInternetOpenDetailRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public DescribeInternetOpenDetailRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public DescribeInternetOpenDetailRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public DescribeInternetOpenDetailRequest setServiceNameFuzzy(String serviceNameFuzzy) {
        this.serviceNameFuzzy = serviceNameFuzzy;
        return this;
    }
    public String getServiceNameFuzzy() {
        return this.serviceNameFuzzy;
    }

    public DescribeInternetOpenDetailRequest setSortList(java.util.List<DescribeInternetOpenDetailRequestSortList> sortList) {
        this.sortList = sortList;
        return this;
    }
    public java.util.List<DescribeInternetOpenDetailRequestSortList> getSortList() {
        return this.sortList;
    }

    public DescribeInternetOpenDetailRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeInternetOpenDetailRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeInternetOpenDetailRequest setSuggestLevel(String suggestLevel) {
        this.suggestLevel = suggestLevel;
        return this;
    }
    public String getSuggestLevel() {
        return this.suggestLevel;
    }

    public static class DescribeInternetOpenDetailRequestSortList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>asc</p>
         */
        @NameInMap("Dir")
        public String dir;

        /**
         * <strong>example:</strong>
         * <p>ServiceName</p>
         */
        @NameInMap("SortKey")
        public String sortKey;

        public static DescribeInternetOpenDetailRequestSortList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInternetOpenDetailRequestSortList self = new DescribeInternetOpenDetailRequestSortList();
            return TeaModel.build(map, self);
        }

        public DescribeInternetOpenDetailRequestSortList setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public DescribeInternetOpenDetailRequestSortList setSortKey(String sortKey) {
            this.sortKey = sortKey;
            return this;
        }
        public String getSortKey() {
            return this.sortKey;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetOpenDetailRequest extends TeaModel {
    /**
     * <p>The ID of the asset. Fuzzy search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>i-uf6faknmuby7ezht****</p>
     */
    @NameInMap("AssetsInstanceId")
    public String assetsInstanceId;

    /**
     * <p>The name of the asset. Fuzzy search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>instance_test</p>
     */
    @NameInMap("AssetsInstanceName")
    public String assetsInstanceName;

    /**
     * <p>The type of the asset for an exact match. If you leave this parameter empty, all asset types are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>EcsPublicIP</p>
     */
    @NameInMap("AssetsType")
    public String assetsType;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1745251200</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The language of the content.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The port for an exact match. The value must be an integer from 1 to 65535. If you leave this parameter empty, all ports are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>9100</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The public IP address for an exact match. If you leave this parameter empty, all public IP addresses are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>203.0.13.XX</p>
     */
    @NameInMap("PublicIp")
    public String publicIp;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>The risk level. If you leave this parameter empty, all risk levels are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    /**
     * <p>The name of the application for an exact match. If you leave this parameter empty, all applications are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>SMB</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The name of the application for a fuzzy match. If you leave this parameter empty, all applications are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>SMB</p>
     */
    @NameInMap("ServiceNameFuzzy")
    public String serviceNameFuzzy;

    /**
     * <p>The sorting conditions.</p>
     */
    @NameInMap("SortList")
    public java.util.List<DescribeInternetOpenDetailRequestSortList> sortList;

    /**
     * <p>The source IP address of the access request.</p>
     * 
     * <strong>example:</strong>
     * <p>222.212.86.7XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The start of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1656837360</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The recommended policy level.</p>
     * 
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
         * <p>The sort order.</p>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
         */
        @NameInMap("Dir")
        public String dir;

        /**
         * <p>The sorting key.</p>
         * 
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

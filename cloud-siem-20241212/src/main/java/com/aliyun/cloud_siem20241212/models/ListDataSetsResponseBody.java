// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDataSetsResponseBody extends TeaModel {
    /**
     * <p>The list of datasets.</p>
     */
    @NameInMap("DataSets")
    public java.util.List<ListDataSetsResponseBodyDataSets> dataSets;

    /**
     * <p>The maximum number of results to return when you use the NextToken-based pagination method. Valid values: 1 to 100. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>157CFBB5-B56F-566F-8991-B3C51799****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>57</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDataSetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSetsResponseBody self = new ListDataSetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataSetsResponseBody setDataSets(java.util.List<ListDataSetsResponseBodyDataSets> dataSets) {
        this.dataSets = dataSets;
        return this;
    }
    public java.util.List<ListDataSetsResponseBodyDataSets> getDataSets() {
        return this.dataSets;
    }

    public ListDataSetsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataSetsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataSetsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataSetsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataSetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataSetsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDataSetsResponseBodyDataSetsDataSetReferences extends TeaModel {
        /**
         * <p>The dataset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dataset-nhcrmjpx1zsorlaq****</p>
         */
        @NameInMap("DataSetId")
        public String dataSetId;

        /**
         * <p>The ID of the rule or playbook associated with the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>456232</p>
         */
        @NameInMap("DataSetReferenceId")
        public String dataSetReferenceId;

        /**
         * <p>The name of the rule or playbook associated with the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>playbook_name</p>
         */
        @NameInMap("DataSetReferenceName")
        public String dataSetReferenceName;

        /**
         * <p>The type of service associated with the dataset. Valid values:</p>
         * <ul>
         * <li>custom_rule: custom rule.</li>
         * <li>playbook: playbook.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>playbook</p>
         */
        @NameInMap("DataSetReferenceType")
        public String dataSetReferenceType;

        public static ListDataSetsResponseBodyDataSetsDataSetReferences build(java.util.Map<String, ?> map) throws Exception {
            ListDataSetsResponseBodyDataSetsDataSetReferences self = new ListDataSetsResponseBodyDataSetsDataSetReferences();
            return TeaModel.build(map, self);
        }

        public ListDataSetsResponseBodyDataSetsDataSetReferences setDataSetId(String dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public String getDataSetId() {
            return this.dataSetId;
        }

        public ListDataSetsResponseBodyDataSetsDataSetReferences setDataSetReferenceId(String dataSetReferenceId) {
            this.dataSetReferenceId = dataSetReferenceId;
            return this;
        }
        public String getDataSetReferenceId() {
            return this.dataSetReferenceId;
        }

        public ListDataSetsResponseBodyDataSetsDataSetReferences setDataSetReferenceName(String dataSetReferenceName) {
            this.dataSetReferenceName = dataSetReferenceName;
            return this;
        }
        public String getDataSetReferenceName() {
            return this.dataSetReferenceName;
        }

        public ListDataSetsResponseBodyDataSetsDataSetReferences setDataSetReferenceType(String dataSetReferenceType) {
            this.dataSetReferenceType = dataSetReferenceType;
            return this;
        }
        public String getDataSetReferenceType() {
            return this.dataSetReferenceType;
        }

    }

    public static class ListDataSetsResponseBodyDataSetsIpWhitelistRecognizers extends TeaModel {
        /**
         * <p>The automatic recognition status. Valid values:</p>
         * <ul>
         * <li>enabled: enabled.</li>
         * <li>disabled: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("AutoRecognizeStatus")
        public String autoRecognizeStatus;

        /**
         * <p>The IP type identified by the recognizer. Valid values:</p>
         * <ul>
         * <li>sas_vulnerability_scanner_ip: IP addresses of the Security Center vulnerability web scanner.</li>
         * <li>waf_back_source_ip: back-to-origin IP addresses of Web Application Firewall (WAF).</li>
         * <li>ddos_back_source_ip: back-to-origin IP addresses of Anti-DDoS.</li>
         * <li>esa_back_source_ip: back-to-origin node IP addresses of Edge Security Acceleration (ESA).</li>
         * <li>ecs_public_ip: public IP addresses of Elastic Compute Service (ECS) instances.</li>
         * <li>slb_public_ip: public IP addresses of Server Load Balancer (SLB) instances.</li>
         * <li>vpc_eip: elastic IP addresses (EIPs).</li>
         * <li>cdn_back_source_ip: back-to-origin IP addresses of Content Delivery Network (CDN).</li>
         * <li>ga_back_source_ip: back-to-origin IP addresses of Global Accelerator (GA).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>waf_back_source_ip</p>
         */
        @NameInMap("IpWhitelistRecognizerType")
        public String ipWhitelistRecognizerType;

        /**
         * <p>The recognition scope. Valid values:</p>
         * <ul>
         * <li>current_account: current account only.</li>
         * <li>rd_accounts: multi-account enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>current_account</p>
         */
        @NameInMap("RecognizeScope")
        public String recognizeScope;

        /**
         * <p>The update time. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1713787368000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListDataSetsResponseBodyDataSetsIpWhitelistRecognizers build(java.util.Map<String, ?> map) throws Exception {
            ListDataSetsResponseBodyDataSetsIpWhitelistRecognizers self = new ListDataSetsResponseBodyDataSetsIpWhitelistRecognizers();
            return TeaModel.build(map, self);
        }

        public ListDataSetsResponseBodyDataSetsIpWhitelistRecognizers setAutoRecognizeStatus(String autoRecognizeStatus) {
            this.autoRecognizeStatus = autoRecognizeStatus;
            return this;
        }
        public String getAutoRecognizeStatus() {
            return this.autoRecognizeStatus;
        }

        public ListDataSetsResponseBodyDataSetsIpWhitelistRecognizers setIpWhitelistRecognizerType(String ipWhitelistRecognizerType) {
            this.ipWhitelistRecognizerType = ipWhitelistRecognizerType;
            return this;
        }
        public String getIpWhitelistRecognizerType() {
            return this.ipWhitelistRecognizerType;
        }

        public ListDataSetsResponseBodyDataSetsIpWhitelistRecognizers setRecognizeScope(String recognizeScope) {
            this.recognizeScope = recognizeScope;
            return this;
        }
        public String getRecognizeScope() {
            return this.recognizeScope;
        }

        public ListDataSetsResponseBodyDataSetsIpWhitelistRecognizers setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListDataSetsResponseBodyDataSets extends TeaModel {
        /**
         * <p>The creation time. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1713787368000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The dataset description.</p>
         * 
         * <strong>example:</strong>
         * <p>lmftest desc</p>
         */
        @NameInMap("DataSetDescription")
        public String dataSetDescription;

        /**
         * <p>The unique key name of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("DataSetFieldKeyName")
        public String dataSetFieldKeyName;

        /**
         * <p>The field names of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;ip&quot;,&quot;region&quot;]</p>
         */
        @NameInMap("DataSetFieldNames")
        public String dataSetFieldNames;

        /**
         * <p>The name of the uploaded dataset file.</p>
         * 
         * <strong>example:</strong>
         * <p>cloudsiem-dataset/1358117679873357_174338773****.csv</p>
         */
        @NameInMap("DataSetFileName")
        public String dataSetFileName;

        /**
         * <p>The dataset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dataset-t8ha6p7k61rmniqw****</p>
         */
        @NameInMap("DataSetId")
        public String dataSetId;

        /**
         * <p>The dataset name.</p>
         * 
         * <strong>example:</strong>
         * <p>lmftest</p>
         */
        @NameInMap("DataSetName")
        public String dataSetName;

        /**
         * <p>The dataset reference data.</p>
         */
        @NameInMap("DataSetReferences")
        public java.util.List<ListDataSetsResponseBodyDataSetsDataSetReferences> dataSetReferences;

        /**
         * <p>The dataset status. Valid values:</p>
         * <ul>
         * <li>0: deleted.</li>
         * <li>1: enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DataSetStatus")
        public Integer dataSetStatus;

        /**
         * <p>The dataset type. Valid values:</p>
         * <ul>
         * <li>custom: custom dataset.</li>
         * <li>preset: predefined dataset.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>preset</p>
         */
        @NameInMap("DataSetType")
        public String dataSetType;

        /**
         * <p>The list of recognizers.</p>
         */
        @NameInMap("IpWhitelistRecognizers")
        public java.util.List<ListDataSetsResponseBodyDataSetsIpWhitelistRecognizers> ipWhitelistRecognizers;

        /**
         * <p>The update time. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1713787368000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListDataSetsResponseBodyDataSets build(java.util.Map<String, ?> map) throws Exception {
            ListDataSetsResponseBodyDataSets self = new ListDataSetsResponseBodyDataSets();
            return TeaModel.build(map, self);
        }

        public ListDataSetsResponseBodyDataSets setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDataSetsResponseBodyDataSets setDataSetDescription(String dataSetDescription) {
            this.dataSetDescription = dataSetDescription;
            return this;
        }
        public String getDataSetDescription() {
            return this.dataSetDescription;
        }

        public ListDataSetsResponseBodyDataSets setDataSetFieldKeyName(String dataSetFieldKeyName) {
            this.dataSetFieldKeyName = dataSetFieldKeyName;
            return this;
        }
        public String getDataSetFieldKeyName() {
            return this.dataSetFieldKeyName;
        }

        public ListDataSetsResponseBodyDataSets setDataSetFieldNames(String dataSetFieldNames) {
            this.dataSetFieldNames = dataSetFieldNames;
            return this;
        }
        public String getDataSetFieldNames() {
            return this.dataSetFieldNames;
        }

        public ListDataSetsResponseBodyDataSets setDataSetFileName(String dataSetFileName) {
            this.dataSetFileName = dataSetFileName;
            return this;
        }
        public String getDataSetFileName() {
            return this.dataSetFileName;
        }

        public ListDataSetsResponseBodyDataSets setDataSetId(String dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public String getDataSetId() {
            return this.dataSetId;
        }

        public ListDataSetsResponseBodyDataSets setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public ListDataSetsResponseBodyDataSets setDataSetReferences(java.util.List<ListDataSetsResponseBodyDataSetsDataSetReferences> dataSetReferences) {
            this.dataSetReferences = dataSetReferences;
            return this;
        }
        public java.util.List<ListDataSetsResponseBodyDataSetsDataSetReferences> getDataSetReferences() {
            return this.dataSetReferences;
        }

        public ListDataSetsResponseBodyDataSets setDataSetStatus(Integer dataSetStatus) {
            this.dataSetStatus = dataSetStatus;
            return this;
        }
        public Integer getDataSetStatus() {
            return this.dataSetStatus;
        }

        public ListDataSetsResponseBodyDataSets setDataSetType(String dataSetType) {
            this.dataSetType = dataSetType;
            return this;
        }
        public String getDataSetType() {
            return this.dataSetType;
        }

        public ListDataSetsResponseBodyDataSets setIpWhitelistRecognizers(java.util.List<ListDataSetsResponseBodyDataSetsIpWhitelistRecognizers> ipWhitelistRecognizers) {
            this.ipWhitelistRecognizers = ipWhitelistRecognizers;
            return this;
        }
        public java.util.List<ListDataSetsResponseBodyDataSetsIpWhitelistRecognizers> getIpWhitelistRecognizers() {
            return this.ipWhitelistRecognizers;
        }

        public ListDataSetsResponseBodyDataSets setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}

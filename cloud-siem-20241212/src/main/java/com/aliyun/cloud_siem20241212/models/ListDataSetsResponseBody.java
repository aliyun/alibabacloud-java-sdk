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
     * <p>The maximum number of results to return for the request. This parameter is used for queries that use NextToken. Valid values: 1 to 100. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to start the next query.</p>
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
     * <p>The total number of entries.</p>
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
         * <p>The ID of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>dataset-nhcrmjpx1zsorlaq****</p>
         */
        @NameInMap("DataSetId")
        public String dataSetId;

        /**
         * <p>The ID of the rule or playbook that is associated with the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>456232</p>
         */
        @NameInMap("DataSetReferenceId")
        public String dataSetReferenceId;

        /**
         * <p>The name of the rule or playbook that is associated with the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>playbook_name</p>
         */
        @NameInMap("DataSetReferenceName")
        public String dataSetReferenceName;

        /**
         * <p>The type of the service that is associated with the dataset. Valid values:</p>
         * <ul>
         * <li><p>custom_rule: custom rule.</p>
         * </li>
         * <li><p>playbook: playbook.</p>
         * </li>
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
         * <p>The status of automatic detection. Valid values:</p>
         * <ul>
         * <li><p>enabled: enabled.</p>
         * </li>
         * <li><p>disabled: disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("AutoRecognizeStatus")
        public String autoRecognizeStatus;

        /**
         * <p>The type of IP address that the recognizer detects. Valid values:</p>
         * <ul>
         * <li><p>sas_vulnerability_scanner_ip: Security Center web vulnerability scanner IP address.</p>
         * </li>
         * <li><p>waf_back_source_ip: Web Application Firewall back-to-origin IP address.</p>
         * </li>
         * <li><p>ddos_back_source_ip: Anti-DDoS back-to-origin IP address.</p>
         * </li>
         * <li><p>esa_back_source_ip: Edge Security Acceleration (ESA) back-to-origin node IP address.</p>
         * </li>
         * <li><p>ecs_public_ip: Elastic Compute Service (ECS) public IP address.</p>
         * </li>
         * <li><p>slb_public_ip: Server Load Balancer (SLB) public IP address.</p>
         * </li>
         * <li><p>vpc_eip: Elastic IP Address (EIP).</p>
         * </li>
         * <li><p>cdn_back_source_ip: Alibaba Cloud CDN back-to-origin IP address.</p>
         * </li>
         * <li><p>ga_back_source_ip: Global Accelerator (GA) back-to-origin IP address.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>waf_back_source_ip</p>
         */
        @NameInMap("IpWhitelistRecognizerType")
        public String ipWhitelistRecognizerType;

        /**
         * <p>The detection scope. Valid values:</p>
         * <ul>
         * <li><p>current_account: current account only.</p>
         * </li>
         * <li><p>rd_accounts: multiple accounts.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>current_account</p>
         */
        @NameInMap("RecognizeScope")
        public String recognizeScope;

        /**
         * <p>The time when the dataset was updated.</p>
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
         * <p>The time when the dataset was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1713787368000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>lmftest desc</p>
         */
        @NameInMap("DataSetDescription")
        public String dataSetDescription;

        /**
         * <p>The name of the unique key for the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("DataSetFieldKeyName")
        public String dataSetFieldKeyName;

        /**
         * <p>The names of the fields in the dataset.</p>
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
         * <p>The ID of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>dataset-t8ha6p7k61rmniqw****</p>
         */
        @NameInMap("DataSetId")
        public String dataSetId;

        /**
         * <p>The name of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>lmftest</p>
         */
        @NameInMap("DataSetName")
        public String dataSetName;

        /**
         * <p>The dataset references.</p>
         */
        @NameInMap("DataSetReferences")
        public java.util.List<ListDataSetsResponseBodyDataSetsDataSetReferences> dataSetReferences;

        /**
         * <p>The status of the dataset. Valid values:</p>
         * <ul>
         * <li><p>0: deleted.</p>
         * </li>
         * <li><p>1: enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DataSetStatus")
        public Integer dataSetStatus;

        /**
         * <p>The type of the dataset. Valid values:</p>
         * <ul>
         * <li><p>custom: custom.</p>
         * </li>
         * <li><p>preset: predefined.</p>
         * </li>
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
         * <p>The time when the dataset was updated.</p>
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

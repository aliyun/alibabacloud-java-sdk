// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDataSetsResponseBody extends TeaModel {
    @NameInMap("DataSets")
    public java.util.List<ListDataSetsResponseBodyDataSets> dataSets;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("DataSetId")
        public String dataSetId;

        @NameInMap("DataSetReferenceId")
        public String dataSetReferenceId;

        @NameInMap("DataSetReferenceName")
        public String dataSetReferenceName;

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
        @NameInMap("AutoRecognizeStatus")
        public String autoRecognizeStatus;

        @NameInMap("IpWhitelistRecognizerType")
        public String ipWhitelistRecognizerType;

        @NameInMap("RecognizeScope")
        public String recognizeScope;

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
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DataSetDescription")
        public String dataSetDescription;

        @NameInMap("DataSetFieldKeyName")
        public String dataSetFieldKeyName;

        @NameInMap("DataSetFieldNames")
        public String dataSetFieldNames;

        @NameInMap("DataSetFileName")
        public String dataSetFileName;

        @NameInMap("DataSetId")
        public String dataSetId;

        @NameInMap("DataSetName")
        public String dataSetName;

        @NameInMap("DataSetReferences")
        public java.util.List<ListDataSetsResponseBodyDataSetsDataSetReferences> dataSetReferences;

        @NameInMap("DataSetStatus")
        public Integer dataSetStatus;

        @NameInMap("DataSetType")
        public String dataSetType;

        @NameInMap("IpWhitelistRecognizers")
        public java.util.List<ListDataSetsResponseBodyDataSetsIpWhitelistRecognizers> ipWhitelistRecognizers;

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

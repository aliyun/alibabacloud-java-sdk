// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregatorsResponseBody extends TeaModel {
    /**
     * <p>The account groups.</p>
     */
    @NameInMap("AggregatorsResult")
    public ListAggregatorsResponseBodyAggregatorsResult aggregatorsResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20C8526D-12C5-4336-BC72-EBD5D1BA732F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAggregatorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAggregatorsResponseBody self = new ListAggregatorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAggregatorsResponseBody setAggregatorsResult(ListAggregatorsResponseBodyAggregatorsResult aggregatorsResult) {
        this.aggregatorsResult = aggregatorsResult;
        return this;
    }
    public ListAggregatorsResponseBodyAggregatorsResult getAggregatorsResult() {
        return this.aggregatorsResult;
    }

    public ListAggregatorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAggregatorsResponseBodyAggregatorsResultAggregatorsTags extends TeaModel {
        /**
         * <p>The tag keys of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>key-1</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag values of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>value-1</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListAggregatorsResponseBodyAggregatorsResultAggregatorsTags build(java.util.Map<String, ?> map) throws Exception {
            ListAggregatorsResponseBodyAggregatorsResultAggregatorsTags self = new ListAggregatorsResponseBodyAggregatorsResultAggregatorsTags();
            return TeaModel.build(map, self);
        }

        public ListAggregatorsResponseBodyAggregatorsResultAggregatorsTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListAggregatorsResponseBodyAggregatorsResultAggregatorsTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListAggregatorsResponseBodyAggregatorsResultAggregators extends TeaModel {
        /**
         * <p>The ID of the management account that is used to create the account group.</p>
         * 
         * <strong>example:</strong>
         * <p>100931896542****</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The number of member accounts in the account group.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AggregatorAccountCount")
        public Long aggregatorAccountCount;

        /**
         * <p>The timestamp generated when the account group was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1623036305000</p>
         */
        @NameInMap("AggregatorCreateTimestamp")
        public Long aggregatorCreateTimestamp;

        /**
         * <p>The ID of the account group.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-88ea626622af0055****</p>
         */
        @NameInMap("AggregatorId")
        public String aggregatorId;

        /**
         * <p>The name of the account group.</p>
         * 
         * <strong>example:</strong>
         * <p>Test_Group</p>
         */
        @NameInMap("AggregatorName")
        public String aggregatorName;

        /**
         * <p>The status of the account group. Valid values:</p>
         * <ul>
         * <li>0: The account group is being created.</li>
         * <li>1: The account group was created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AggregatorStatus")
        public Integer aggregatorStatus;

        /**
         * <p>The type of the account group. Valid values:</p>
         * <ul>
         * <li>RD: global account group.</li>
         * <li>FOLDER: account group of the folder.</li>
         * <li>CUSTOM: custom account group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("AggregatorType")
        public String aggregatorType;

        /**
         * <p>The description of the account group.</p>
         * 
         * <strong>example:</strong>
         * <p>Example-description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the folder.</p>
         * 
         * <strong>example:</strong>
         * <p>r-BU****</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <p>tags</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListAggregatorsResponseBodyAggregatorsResultAggregatorsTags> tags;

        public static ListAggregatorsResponseBodyAggregatorsResultAggregators build(java.util.Map<String, ?> map) throws Exception {
            ListAggregatorsResponseBodyAggregatorsResultAggregators self = new ListAggregatorsResponseBodyAggregatorsResultAggregators();
            return TeaModel.build(map, self);
        }

        public ListAggregatorsResponseBodyAggregatorsResultAggregators setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public ListAggregatorsResponseBodyAggregatorsResultAggregators setAggregatorAccountCount(Long aggregatorAccountCount) {
            this.aggregatorAccountCount = aggregatorAccountCount;
            return this;
        }
        public Long getAggregatorAccountCount() {
            return this.aggregatorAccountCount;
        }

        public ListAggregatorsResponseBodyAggregatorsResultAggregators setAggregatorCreateTimestamp(Long aggregatorCreateTimestamp) {
            this.aggregatorCreateTimestamp = aggregatorCreateTimestamp;
            return this;
        }
        public Long getAggregatorCreateTimestamp() {
            return this.aggregatorCreateTimestamp;
        }

        public ListAggregatorsResponseBodyAggregatorsResultAggregators setAggregatorId(String aggregatorId) {
            this.aggregatorId = aggregatorId;
            return this;
        }
        public String getAggregatorId() {
            return this.aggregatorId;
        }

        public ListAggregatorsResponseBodyAggregatorsResultAggregators setAggregatorName(String aggregatorName) {
            this.aggregatorName = aggregatorName;
            return this;
        }
        public String getAggregatorName() {
            return this.aggregatorName;
        }

        public ListAggregatorsResponseBodyAggregatorsResultAggregators setAggregatorStatus(Integer aggregatorStatus) {
            this.aggregatorStatus = aggregatorStatus;
            return this;
        }
        public Integer getAggregatorStatus() {
            return this.aggregatorStatus;
        }

        public ListAggregatorsResponseBodyAggregatorsResultAggregators setAggregatorType(String aggregatorType) {
            this.aggregatorType = aggregatorType;
            return this;
        }
        public String getAggregatorType() {
            return this.aggregatorType;
        }

        public ListAggregatorsResponseBodyAggregatorsResultAggregators setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAggregatorsResponseBodyAggregatorsResultAggregators setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public ListAggregatorsResponseBodyAggregatorsResultAggregators setTags(java.util.List<ListAggregatorsResponseBodyAggregatorsResultAggregatorsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListAggregatorsResponseBodyAggregatorsResultAggregatorsTags> getTags() {
            return this.tags;
        }

    }

    public static class ListAggregatorsResponseBodyAggregatorsResult extends TeaModel {
        /**
         * <p>The list of the account groups.</p>
         */
        @NameInMap("Aggregators")
        public java.util.List<ListAggregatorsResponseBodyAggregatorsResultAggregators> aggregators;

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of <code>NextToken</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291cmNlU2hhcmVzJjE1MTI2NjY4NzY5MTAzOTEmMiZORnI4NDhVeEtrUT0</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        public static ListAggregatorsResponseBodyAggregatorsResult build(java.util.Map<String, ?> map) throws Exception {
            ListAggregatorsResponseBodyAggregatorsResult self = new ListAggregatorsResponseBodyAggregatorsResult();
            return TeaModel.build(map, self);
        }

        public ListAggregatorsResponseBodyAggregatorsResult setAggregators(java.util.List<ListAggregatorsResponseBodyAggregatorsResultAggregators> aggregators) {
            this.aggregators = aggregators;
            return this;
        }
        public java.util.List<ListAggregatorsResponseBodyAggregatorsResultAggregators> getAggregators() {
            return this.aggregators;
        }

        public ListAggregatorsResponseBodyAggregatorsResult setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}

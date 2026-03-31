// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregatorResponseBody extends TeaModel {
    /**
     * <p>The details of the account group.</p>
     */
    @NameInMap("Aggregator")
    public GetAggregatorResponseBodyAggregator aggregator;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>733DD93C-2277-4905-AE0C-0BA95C04B8BC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAggregatorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAggregatorResponseBody self = new GetAggregatorResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAggregatorResponseBody setAggregator(GetAggregatorResponseBodyAggregator aggregator) {
        this.aggregator = aggregator;
        return this;
    }
    public GetAggregatorResponseBodyAggregator getAggregator() {
        return this.aggregator;
    }

    public GetAggregatorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAggregatorResponseBodyAggregatorAggregatorAccounts extends TeaModel {
        /**
         * <p>The ID of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>171322098523****</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The display name of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         * 
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The resource directory to which the member belongs. Valid value: ResourceDirectory. ResourceDirectory indicates that the member belongs to a resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>ResourceDirectory</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The status of the configuration recorder for the member. Valid values:</p>
         * <ul>
         * <li>REGISTRABLE: The configuration recorder is not registered.</li>
         * <li>BUILDING: The configuration recorder is being deployed.</li>
         * <li>REGISTERED: The configuration recorder is registered.</li>
         * <li>REBUILDING: The configuration recorder is being redeployed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>REGISTERED</p>
         */
        @NameInMap("RecorderStatus")
        public String recorderStatus;

        public static GetAggregatorResponseBodyAggregatorAggregatorAccounts build(java.util.Map<String, ?> map) throws Exception {
            GetAggregatorResponseBodyAggregatorAggregatorAccounts self = new GetAggregatorResponseBodyAggregatorAggregatorAccounts();
            return TeaModel.build(map, self);
        }

        public GetAggregatorResponseBodyAggregatorAggregatorAccounts setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public GetAggregatorResponseBodyAggregatorAggregatorAccounts setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public GetAggregatorResponseBodyAggregatorAggregatorAccounts setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public GetAggregatorResponseBodyAggregatorAggregatorAccounts setRecorderStatus(String recorderStatus) {
            this.recorderStatus = recorderStatus;
            return this;
        }
        public String getRecorderStatus() {
            return this.recorderStatus;
        }

    }

    public static class GetAggregatorResponseBodyAggregatorTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key-1</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value-1</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static GetAggregatorResponseBodyAggregatorTags build(java.util.Map<String, ?> map) throws Exception {
            GetAggregatorResponseBodyAggregatorTags self = new GetAggregatorResponseBodyAggregatorTags();
            return TeaModel.build(map, self);
        }

        public GetAggregatorResponseBodyAggregatorTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetAggregatorResponseBodyAggregatorTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetAggregatorResponseBodyAggregator extends TeaModel {
        /**
         * <p>The ID of the management account that is used to create the account group.</p>
         * 
         * <strong>example:</strong>
         * <p>100931896542****</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The number of members in the account group.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AggregatorAccountCount")
        public Long aggregatorAccountCount;

        /**
         * <p>The information about the members in the account group.</p>
         */
        @NameInMap("AggregatorAccounts")
        public java.util.List<GetAggregatorResponseBodyAggregatorAggregatorAccounts> aggregatorAccounts;

        /**
         * <p>The timestamp generated when the account group was created.</p>
         * <p>Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1623034091000</p>
         */
        @NameInMap("AggregatorCreateTimestamp")
        public String aggregatorCreateTimestamp;

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
         * <p>Test-Group</p>
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
         * <li>RD: a global account group.</li>
         * <li>FOLDER: an account group for a folder.</li>
         * <li>CUSTOM: a custom account group.</li>
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
         * <p>The description of the test account group.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the attached folder of the account group.</p>
         * 
         * <strong>example:</strong>
         * <p>fd-brHdgv****</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        @NameInMap("FolderName")
        public String folderName;

        /**
         * <p>tags</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetAggregatorResponseBodyAggregatorTags> tags;

        public static GetAggregatorResponseBodyAggregator build(java.util.Map<String, ?> map) throws Exception {
            GetAggregatorResponseBodyAggregator self = new GetAggregatorResponseBodyAggregator();
            return TeaModel.build(map, self);
        }

        public GetAggregatorResponseBodyAggregator setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public GetAggregatorResponseBodyAggregator setAggregatorAccountCount(Long aggregatorAccountCount) {
            this.aggregatorAccountCount = aggregatorAccountCount;
            return this;
        }
        public Long getAggregatorAccountCount() {
            return this.aggregatorAccountCount;
        }

        public GetAggregatorResponseBodyAggregator setAggregatorAccounts(java.util.List<GetAggregatorResponseBodyAggregatorAggregatorAccounts> aggregatorAccounts) {
            this.aggregatorAccounts = aggregatorAccounts;
            return this;
        }
        public java.util.List<GetAggregatorResponseBodyAggregatorAggregatorAccounts> getAggregatorAccounts() {
            return this.aggregatorAccounts;
        }

        public GetAggregatorResponseBodyAggregator setAggregatorCreateTimestamp(String aggregatorCreateTimestamp) {
            this.aggregatorCreateTimestamp = aggregatorCreateTimestamp;
            return this;
        }
        public String getAggregatorCreateTimestamp() {
            return this.aggregatorCreateTimestamp;
        }

        public GetAggregatorResponseBodyAggregator setAggregatorId(String aggregatorId) {
            this.aggregatorId = aggregatorId;
            return this;
        }
        public String getAggregatorId() {
            return this.aggregatorId;
        }

        public GetAggregatorResponseBodyAggregator setAggregatorName(String aggregatorName) {
            this.aggregatorName = aggregatorName;
            return this;
        }
        public String getAggregatorName() {
            return this.aggregatorName;
        }

        public GetAggregatorResponseBodyAggregator setAggregatorStatus(Integer aggregatorStatus) {
            this.aggregatorStatus = aggregatorStatus;
            return this;
        }
        public Integer getAggregatorStatus() {
            return this.aggregatorStatus;
        }

        public GetAggregatorResponseBodyAggregator setAggregatorType(String aggregatorType) {
            this.aggregatorType = aggregatorType;
            return this;
        }
        public String getAggregatorType() {
            return this.aggregatorType;
        }

        public GetAggregatorResponseBodyAggregator setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAggregatorResponseBodyAggregator setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public GetAggregatorResponseBodyAggregator setFolderName(String folderName) {
            this.folderName = folderName;
            return this;
        }
        public String getFolderName() {
            return this.folderName;
        }

        public GetAggregatorResponseBodyAggregator setTags(java.util.List<GetAggregatorResponseBodyAggregatorTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetAggregatorResponseBodyAggregatorTags> getTags() {
            return this.tags;
        }

    }

}

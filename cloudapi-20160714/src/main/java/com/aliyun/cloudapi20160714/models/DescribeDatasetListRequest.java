// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDatasetListRequest extends TeaModel {
    /**
     * <p>The IDs of the datasets.</p>
     * 
     * <strong>example:</strong>
     * <p>4add6a61804e47858266883e********</p>
     */
    @NameInMap("DatasetIds")
    public String datasetIds;

    /**
     * <p>The name of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>IPwhitelist</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>Specify the object labels to which the rule applies, and multiple labels can be set</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeDatasetListRequestTag> tag;

    public static DescribeDatasetListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatasetListRequest self = new DescribeDatasetListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDatasetListRequest setDatasetIds(String datasetIds) {
        this.datasetIds = datasetIds;
        return this;
    }
    public String getDatasetIds() {
        return this.datasetIds;
    }

    public DescribeDatasetListRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public DescribeDatasetListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDatasetListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDatasetListRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeDatasetListRequest setTag(java.util.List<DescribeDatasetListRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDatasetListRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeDatasetListRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDatasetListRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatasetListRequestTag self = new DescribeDatasetListRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeDatasetListRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDatasetListRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDatasetListRequest extends TeaModel {
    @NameInMap("DatasetIds")
    public String datasetIds;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

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
        @NameInMap("Key")
        public String key;

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

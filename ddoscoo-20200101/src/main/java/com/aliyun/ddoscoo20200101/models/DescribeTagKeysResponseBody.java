// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeTagKeysResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TagKeys")
    public java.util.List<DescribeTagKeysResponseBodyTagKeys> tagKeys;

    public static DescribeTagKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagKeysResponseBody self = new DescribeTagKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTagKeysResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeTagKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTagKeysResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTagKeysResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTagKeysResponseBody setTagKeys(java.util.List<DescribeTagKeysResponseBodyTagKeys> tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public java.util.List<DescribeTagKeysResponseBodyTagKeys> getTagKeys() {
        return this.tagKeys;
    }

    public static class DescribeTagKeysResponseBodyTagKeys extends TeaModel {
        @NameInMap("TagCount")
        public Integer tagCount;

        @NameInMap("TagKey")
        public String tagKey;

        public static DescribeTagKeysResponseBodyTagKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagKeysResponseBodyTagKeys self = new DescribeTagKeysResponseBodyTagKeys();
            return TeaModel.build(map, self);
        }

        public DescribeTagKeysResponseBodyTagKeys setTagCount(Integer tagCount) {
            this.tagCount = tagCount;
            return this;
        }
        public Integer getTagCount() {
            return this.tagCount;
        }

        public DescribeTagKeysResponseBodyTagKeys setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

    }

}

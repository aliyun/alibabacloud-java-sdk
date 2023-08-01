// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeKeyPairsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("KeyPairs")
    public DescribeKeyPairsResponseBodyKeyPairs keyPairs;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The tags of the key pair.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The tag value of the key pair.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of the page to return. Pages start from page 1.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeKeyPairsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKeyPairsResponseBody self = new DescribeKeyPairsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKeyPairsResponseBody setKeyPairs(DescribeKeyPairsResponseBodyKeyPairs keyPairs) {
        this.keyPairs = keyPairs;
        return this;
    }
    public DescribeKeyPairsResponseBodyKeyPairs getKeyPairs() {
        return this.keyPairs;
    }

    public DescribeKeyPairsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeKeyPairsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeKeyPairsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeKeyPairsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeKeyPairsResponseBodyKeyPairsKeyPairTagsTag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeKeyPairsResponseBodyKeyPairsKeyPairTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeKeyPairsResponseBodyKeyPairsKeyPairTagsTag self = new DescribeKeyPairsResponseBodyKeyPairsKeyPairTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeKeyPairsResponseBodyKeyPairsKeyPairTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeKeyPairsResponseBodyKeyPairsKeyPairTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeKeyPairsResponseBodyKeyPairsKeyPairTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeKeyPairsResponseBodyKeyPairsKeyPairTagsTag> tag;

        public static DescribeKeyPairsResponseBodyKeyPairsKeyPairTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeKeyPairsResponseBodyKeyPairsKeyPairTags self = new DescribeKeyPairsResponseBodyKeyPairsKeyPairTags();
            return TeaModel.build(map, self);
        }

        public DescribeKeyPairsResponseBodyKeyPairsKeyPairTags setTag(java.util.List<DescribeKeyPairsResponseBodyKeyPairsKeyPairTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeKeyPairsResponseBodyKeyPairsKeyPairTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeKeyPairsResponseBodyKeyPairsKeyPair extends TeaModel {
        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Queries one or more key pairs.</p>
         */
        @NameInMap("KeyPairFingerPrint")
        public String keyPairFingerPrint;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("KeyPairName")
        public String keyPairName;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Tags")
        public DescribeKeyPairsResponseBodyKeyPairsKeyPairTags tags;

        public static DescribeKeyPairsResponseBodyKeyPairsKeyPair build(java.util.Map<String, ?> map) throws Exception {
            DescribeKeyPairsResponseBodyKeyPairsKeyPair self = new DescribeKeyPairsResponseBodyKeyPairsKeyPair();
            return TeaModel.build(map, self);
        }

        public DescribeKeyPairsResponseBodyKeyPairsKeyPair setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeKeyPairsResponseBodyKeyPairsKeyPair setKeyPairFingerPrint(String keyPairFingerPrint) {
            this.keyPairFingerPrint = keyPairFingerPrint;
            return this;
        }
        public String getKeyPairFingerPrint() {
            return this.keyPairFingerPrint;
        }

        public DescribeKeyPairsResponseBodyKeyPairsKeyPair setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public DescribeKeyPairsResponseBodyKeyPairsKeyPair setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeKeyPairsResponseBodyKeyPairsKeyPair setTags(DescribeKeyPairsResponseBodyKeyPairsKeyPairTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeKeyPairsResponseBodyKeyPairsKeyPairTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeKeyPairsResponseBodyKeyPairs extends TeaModel {
        @NameInMap("KeyPair")
        public java.util.List<DescribeKeyPairsResponseBodyKeyPairsKeyPair> keyPair;

        public static DescribeKeyPairsResponseBodyKeyPairs build(java.util.Map<String, ?> map) throws Exception {
            DescribeKeyPairsResponseBodyKeyPairs self = new DescribeKeyPairsResponseBodyKeyPairs();
            return TeaModel.build(map, self);
        }

        public DescribeKeyPairsResponseBodyKeyPairs setKeyPair(java.util.List<DescribeKeyPairsResponseBodyKeyPairsKeyPair> keyPair) {
            this.keyPair = keyPair;
            return this;
        }
        public java.util.List<DescribeKeyPairsResponseBodyKeyPairsKeyPair> getKeyPair() {
            return this.keyPair;
        }

    }

}

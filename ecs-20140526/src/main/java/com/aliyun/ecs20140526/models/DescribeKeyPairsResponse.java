// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeKeyPairsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("KeyPairs")
    @Validation(required = true)
    public DescribeKeyPairsResponseKeyPairs keyPairs;

    public static DescribeKeyPairsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKeyPairsResponse self = new DescribeKeyPairsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKeyPairsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeKeyPairsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeKeyPairsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeKeyPairsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeKeyPairsResponse setKeyPairs(DescribeKeyPairsResponseKeyPairs keyPairs) {
        this.keyPairs = keyPairs;
        return this;
    }
    public DescribeKeyPairsResponseKeyPairs getKeyPairs() {
        return this.keyPairs;
    }

    public static class DescribeKeyPairsResponseKeyPairsKeyPairTagsTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static DescribeKeyPairsResponseKeyPairsKeyPairTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeKeyPairsResponseKeyPairsKeyPairTagsTag self = new DescribeKeyPairsResponseKeyPairsKeyPairTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeKeyPairsResponseKeyPairsKeyPairTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeKeyPairsResponseKeyPairsKeyPairTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeKeyPairsResponseKeyPairsKeyPairTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeKeyPairsResponseKeyPairsKeyPairTagsTag> tag;

        public static DescribeKeyPairsResponseKeyPairsKeyPairTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeKeyPairsResponseKeyPairsKeyPairTags self = new DescribeKeyPairsResponseKeyPairsKeyPairTags();
            return TeaModel.build(map, self);
        }

        public DescribeKeyPairsResponseKeyPairsKeyPairTags setTag(java.util.List<DescribeKeyPairsResponseKeyPairsKeyPairTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeKeyPairsResponseKeyPairsKeyPairTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeKeyPairsResponseKeyPairsKeyPair extends TeaModel {
        @NameInMap("KeyPairName")
        @Validation(required = true)
        public String keyPairName;

        @NameInMap("KeyPairFingerPrint")
        @Validation(required = true)
        public String keyPairFingerPrint;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeKeyPairsResponseKeyPairsKeyPairTags tags;

        public static DescribeKeyPairsResponseKeyPairsKeyPair build(java.util.Map<String, ?> map) throws Exception {
            DescribeKeyPairsResponseKeyPairsKeyPair self = new DescribeKeyPairsResponseKeyPairsKeyPair();
            return TeaModel.build(map, self);
        }

        public DescribeKeyPairsResponseKeyPairsKeyPair setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public DescribeKeyPairsResponseKeyPairsKeyPair setKeyPairFingerPrint(String keyPairFingerPrint) {
            this.keyPairFingerPrint = keyPairFingerPrint;
            return this;
        }
        public String getKeyPairFingerPrint() {
            return this.keyPairFingerPrint;
        }

        public DescribeKeyPairsResponseKeyPairsKeyPair setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeKeyPairsResponseKeyPairsKeyPair setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeKeyPairsResponseKeyPairsKeyPair setTags(DescribeKeyPairsResponseKeyPairsKeyPairTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeKeyPairsResponseKeyPairsKeyPairTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeKeyPairsResponseKeyPairs extends TeaModel {
        @NameInMap("KeyPair")
        @Validation(required = true)
        public java.util.List<DescribeKeyPairsResponseKeyPairsKeyPair> keyPair;

        public static DescribeKeyPairsResponseKeyPairs build(java.util.Map<String, ?> map) throws Exception {
            DescribeKeyPairsResponseKeyPairs self = new DescribeKeyPairsResponseKeyPairs();
            return TeaModel.build(map, self);
        }

        public DescribeKeyPairsResponseKeyPairs setKeyPair(java.util.List<DescribeKeyPairsResponseKeyPairsKeyPair> keyPair) {
            this.keyPair = keyPair;
            return this;
        }
        public java.util.List<DescribeKeyPairsResponseKeyPairsKeyPair> getKeyPair() {
            return this.keyPair;
        }

    }

}

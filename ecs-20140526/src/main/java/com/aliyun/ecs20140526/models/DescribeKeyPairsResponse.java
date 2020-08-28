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

    }

    public static class DescribeKeyPairsResponseKeyPairsKeyPairTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeKeyPairsResponseKeyPairsKeyPairTagsTag> tag;

        public static DescribeKeyPairsResponseKeyPairsKeyPairTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeKeyPairsResponseKeyPairsKeyPairTags self = new DescribeKeyPairsResponseKeyPairsKeyPairTags();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeKeyPairsResponseKeyPairs extends TeaModel {
        @NameInMap("KeyPair")
        @Validation(required = true)
        public java.util.List<DescribeKeyPairsResponseKeyPairsKeyPair> keyPair;

        public static DescribeKeyPairsResponseKeyPairs build(java.util.Map<String, ?> map) throws Exception {
            DescribeKeyPairsResponseKeyPairs self = new DescribeKeyPairsResponseKeyPairs();
            return TeaModel.build(map, self);
        }

    }

}

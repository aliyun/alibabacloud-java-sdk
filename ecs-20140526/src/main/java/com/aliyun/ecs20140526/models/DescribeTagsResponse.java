// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeTagsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("Tags")
    @Validation(required = true)
    public DescribeTagsResponseTags tags;

    public static DescribeTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagsResponse self = new DescribeTagsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeTagsResponseTagsTagResourceTypeCount extends TeaModel {
        @NameInMap("Instance")
        @Validation(required = true)
        public Integer instance;

        @NameInMap("Disk")
        @Validation(required = true)
        public Integer disk;

        @NameInMap("Volume")
        @Validation(required = true)
        public Integer volume;

        @NameInMap("Image")
        @Validation(required = true)
        public Integer image;

        @NameInMap("Snapshot")
        @Validation(required = true)
        public Integer snapshot;

        @NameInMap("Securitygroup")
        @Validation(required = true)
        public Integer securitygroup;

        @NameInMap("LaunchTemplate")
        @Validation(required = true)
        public Integer launchTemplate;

        @NameInMap("Eni")
        @Validation(required = true)
        public Integer eni;

        @NameInMap("Ddh")
        @Validation(required = true)
        public Integer ddh;

        @NameInMap("KeyPair")
        @Validation(required = true)
        public Integer keyPair;

        @NameInMap("SnapshotPolicy")
        @Validation(required = true)
        public Integer snapshotPolicy;

        public static DescribeTagsResponseTagsTagResourceTypeCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseTagsTagResourceTypeCount self = new DescribeTagsResponseTagsTagResourceTypeCount();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeTagsResponseTagsTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        @NameInMap("ResourceTypeCount")
        @Validation(required = true)
        public DescribeTagsResponseTagsTagResourceTypeCount resourceTypeCount;

        public static DescribeTagsResponseTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseTagsTag self = new DescribeTagsResponseTagsTag();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeTagsResponseTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeTagsResponseTagsTag> tag;

        public static DescribeTagsResponseTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseTags self = new DescribeTagsResponseTags();
            return TeaModel.build(map, self);
        }

    }

}

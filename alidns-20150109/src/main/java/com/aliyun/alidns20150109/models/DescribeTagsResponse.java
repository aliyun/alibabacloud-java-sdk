// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeTagsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("Tags")
    @Validation(required = true)
    public java.util.List<DescribeTagsResponseTags> tags;

    public static DescribeTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagsResponse self = new DescribeTagsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeTagsResponseTags extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        public static DescribeTagsResponseTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseTags self = new DescribeTagsResponseTags();
            return TeaModel.build(map, self);
        }

    }

}

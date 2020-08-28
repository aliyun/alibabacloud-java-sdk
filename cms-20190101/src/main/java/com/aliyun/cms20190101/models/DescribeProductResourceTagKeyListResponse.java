// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeProductResourceTagKeyListResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("TagKeys")
    @Validation(required = true)
    public DescribeProductResourceTagKeyListResponseTagKeys tagKeys;

    public static DescribeProductResourceTagKeyListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductResourceTagKeyListResponse self = new DescribeProductResourceTagKeyListResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeProductResourceTagKeyListResponseTagKeys extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public java.util.List<String> tagKey;

        public static DescribeProductResourceTagKeyListResponseTagKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductResourceTagKeyListResponseTagKeys self = new DescribeProductResourceTagKeyListResponseTagKeys();
            return TeaModel.build(map, self);
        }

    }

}

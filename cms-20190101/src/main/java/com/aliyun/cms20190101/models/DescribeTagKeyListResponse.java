// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeTagKeyListResponse extends TeaModel {
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

    @NameInMap("TagKeys")
    @Validation(required = true)
    public DescribeTagKeyListResponseTagKeys tagKeys;

    public static DescribeTagKeyListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagKeyListResponse self = new DescribeTagKeyListResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeTagKeyListResponseTagKeys extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public java.util.List<String> tagKey;

        public static DescribeTagKeyListResponseTagKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagKeyListResponseTagKeys self = new DescribeTagKeyListResponseTagKeys();
            return TeaModel.build(map, self);
        }

    }

}

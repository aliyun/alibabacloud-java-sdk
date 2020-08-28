// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeTagValueListResponse extends TeaModel {
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

    @NameInMap("TagValues")
    @Validation(required = true)
    public DescribeTagValueListResponseTagValues tagValues;

    public static DescribeTagValueListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagValueListResponse self = new DescribeTagValueListResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeTagValueListResponseTagValues extends TeaModel {
        @NameInMap("TagValue")
        @Validation(required = true)
        public java.util.List<String> tagValue;

        public static DescribeTagValueListResponseTagValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagValueListResponseTagValues self = new DescribeTagValueListResponseTagValues();
            return TeaModel.build(map, self);
        }

    }

}

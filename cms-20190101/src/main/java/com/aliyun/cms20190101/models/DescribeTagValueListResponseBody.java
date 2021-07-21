// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeTagValueListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TagValues")
    public DescribeTagValueListResponseBodyTagValues tagValues;

    public static DescribeTagValueListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagValueListResponseBody self = new DescribeTagValueListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTagValueListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeTagValueListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeTagValueListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTagValueListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeTagValueListResponseBody setTagValues(DescribeTagValueListResponseBodyTagValues tagValues) {
        this.tagValues = tagValues;
        return this;
    }
    public DescribeTagValueListResponseBodyTagValues getTagValues() {
        return this.tagValues;
    }

    public static class DescribeTagValueListResponseBodyTagValues extends TeaModel {
        @NameInMap("TagValue")
        public java.util.List<String> tagValue;

        public static DescribeTagValueListResponseBodyTagValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagValueListResponseBodyTagValues self = new DescribeTagValueListResponseBodyTagValues();
            return TeaModel.build(map, self);
        }

        public DescribeTagValueListResponseBodyTagValues setTagValue(java.util.List<String> tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public java.util.List<String> getTagValue() {
            return this.tagValue;
        }

    }

}

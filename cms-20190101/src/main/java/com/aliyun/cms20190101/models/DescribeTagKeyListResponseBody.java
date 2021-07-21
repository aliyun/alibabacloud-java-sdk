// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeTagKeyListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TagKeys")
    public DescribeTagKeyListResponseBodyTagKeys tagKeys;

    public static DescribeTagKeyListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagKeyListResponseBody self = new DescribeTagKeyListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTagKeyListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeTagKeyListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeTagKeyListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTagKeyListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeTagKeyListResponseBody setTagKeys(DescribeTagKeyListResponseBodyTagKeys tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public DescribeTagKeyListResponseBodyTagKeys getTagKeys() {
        return this.tagKeys;
    }

    public static class DescribeTagKeyListResponseBodyTagKeys extends TeaModel {
        @NameInMap("TagKey")
        public java.util.List<String> tagKey;

        public static DescribeTagKeyListResponseBodyTagKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagKeyListResponseBodyTagKeys self = new DescribeTagKeyListResponseBodyTagKeys();
            return TeaModel.build(map, self);
        }

        public DescribeTagKeyListResponseBodyTagKeys setTagKey(java.util.List<String> tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public java.util.List<String> getTagKey() {
            return this.tagKey;
        }

    }

}

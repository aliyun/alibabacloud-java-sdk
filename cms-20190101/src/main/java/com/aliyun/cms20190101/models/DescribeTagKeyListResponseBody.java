// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeTagKeyListResponseBody extends TeaModel {
    /**
     * <p>状态码。</p>
     * <blockquote>
     * <p>200表示成功。</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>错误信息。</p>
     * 
     * <strong>example:</strong>
     * <p>Specified parameter PageSize is not valid.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>B04B8CF3-4489-432D-83BA-6F128E5F2293</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>用于标识本次调用是否成功</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeProductResourceTagKeyListResponseBody extends TeaModel {
    /**
     * <p>The error message.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The pagination cursor. If more entries are to be returned on the next page, a pagination cursor is returned.</p>
     * <br>
     * <p>>  If the value of this parameter is not null, more entries are to be returned on the next page. You can use the returned pagination cursor as a request parameter to obtain entries on the next page. If the value of this parameter is null, all the entries have been returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Indicates whether the call was successful. The value true indicates a success. The value false indicates a failure.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The keys of tags.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>>  If a tag is attached to multiple cloud resources in the region, the key of the tag is returned only once.</p>
     */
    @NameInMap("TagKeys")
    public DescribeProductResourceTagKeyListResponseBodyTagKeys tagKeys;

    public static DescribeProductResourceTagKeyListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductResourceTagKeyListResponseBody self = new DescribeProductResourceTagKeyListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProductResourceTagKeyListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeProductResourceTagKeyListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeProductResourceTagKeyListResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeProductResourceTagKeyListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProductResourceTagKeyListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeProductResourceTagKeyListResponseBody setTagKeys(DescribeProductResourceTagKeyListResponseBodyTagKeys tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public DescribeProductResourceTagKeyListResponseBodyTagKeys getTagKeys() {
        return this.tagKeys;
    }

    public static class DescribeProductResourceTagKeyListResponseBodyTagKeys extends TeaModel {
        @NameInMap("TagKey")
        public java.util.List<String> tagKey;

        public static DescribeProductResourceTagKeyListResponseBodyTagKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductResourceTagKeyListResponseBodyTagKeys self = new DescribeProductResourceTagKeyListResponseBodyTagKeys();
            return TeaModel.build(map, self);
        }

        public DescribeProductResourceTagKeyListResponseBodyTagKeys setTagKey(java.util.List<String> tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public java.util.List<String> getTagKey() {
            return this.tagKey;
        }

    }

}

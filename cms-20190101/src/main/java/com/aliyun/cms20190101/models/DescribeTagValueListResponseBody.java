// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeTagValueListResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   true: The call was successful.</p>
     * <p>*   false: The call failed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The tag values returned.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>This topic provides an example of how to query the tag values corresponding to `tagKey1`. The return results are `tagValue1` and `tagValue2`.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>For more information about common request parameters, see [Common parameters](~~199331~~).</p>
     */
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

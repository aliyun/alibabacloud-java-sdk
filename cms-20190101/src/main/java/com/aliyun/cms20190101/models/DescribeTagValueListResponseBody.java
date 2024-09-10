// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeTagValueListResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <blockquote>
     * <p> The value 200 indicates that the call was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified resource is not found.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B04B8CF3-4489-432D-83BA-6F128E4F2295</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li>true: The call was successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The tag values returned.</p>
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

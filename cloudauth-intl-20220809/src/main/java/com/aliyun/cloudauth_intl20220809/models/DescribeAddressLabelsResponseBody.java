// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DescribeAddressLabelsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeAddressLabelsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAddressLabelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddressLabelsResponseBody self = new DescribeAddressLabelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAddressLabelsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAddressLabelsResponseBody setData(DescribeAddressLabelsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAddressLabelsResponseBodyData getData() {
        return this.data;
    }

    public DescribeAddressLabelsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAddressLabelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAddressLabelsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAddressLabelsResponseBodyData extends TeaModel {
        @NameInMap("LabelList")
        public java.util.List<String> labelList;

        public static DescribeAddressLabelsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddressLabelsResponseBodyData self = new DescribeAddressLabelsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAddressLabelsResponseBodyData setLabelList(java.util.List<String> labelList) {
            this.labelList = labelList;
            return this;
        }
        public java.util.List<String> getLabelList() {
            return this.labelList;
        }

    }

}

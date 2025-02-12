// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DescribeAclResourceNameResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeAclResourceNameResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>operation success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>ABA4A7FD-E10F-45C7-9774-A5236015A***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeAclResourceNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAclResourceNameResponseBody self = new DescribeAclResourceNameResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAclResourceNameResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAclResourceNameResponseBody setData(DescribeAclResourceNameResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAclResourceNameResponseBodyData getData() {
        return this.data;
    }

    public DescribeAclResourceNameResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAclResourceNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAclResourceNameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAclResourceNameResponseBodyData extends TeaModel {
        @NameInMap("data")
        public java.util.List<String> data;

        public static DescribeAclResourceNameResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAclResourceNameResponseBodyData self = new DescribeAclResourceNameResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAclResourceNameResponseBodyData setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

    }

}

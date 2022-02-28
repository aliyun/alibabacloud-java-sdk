// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeAvailableInstanceTypesForSEResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("InstanceTypes")
    public DescribeAvailableInstanceTypesForSEResponseBodyInstanceTypes instanceTypes;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAvailableInstanceTypesForSEResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableInstanceTypesForSEResponseBody self = new DescribeAvailableInstanceTypesForSEResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableInstanceTypesForSEResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAvailableInstanceTypesForSEResponseBody setInstanceTypes(DescribeAvailableInstanceTypesForSEResponseBodyInstanceTypes instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public DescribeAvailableInstanceTypesForSEResponseBodyInstanceTypes getInstanceTypes() {
        return this.instanceTypes;
    }

    public DescribeAvailableInstanceTypesForSEResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAvailableInstanceTypesForSEResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvailableInstanceTypesForSEResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAvailableInstanceTypesForSEResponseBodyInstanceTypes extends TeaModel {
        @NameInMap("instanceType")
        public java.util.List<String> instanceType;

        public static DescribeAvailableInstanceTypesForSEResponseBodyInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableInstanceTypesForSEResponseBodyInstanceTypes self = new DescribeAvailableInstanceTypesForSEResponseBodyInstanceTypes();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableInstanceTypesForSEResponseBodyInstanceTypes setInstanceType(java.util.List<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public java.util.List<String> getInstanceType() {
            return this.instanceType;
        }

    }

}

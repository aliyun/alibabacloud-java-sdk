// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeAvailableInstanceTypesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("InstanceTypes")
    public DescribeAvailableInstanceTypesResponseBodyInstanceTypes instanceTypes;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAvailableInstanceTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableInstanceTypesResponseBody self = new DescribeAvailableInstanceTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableInstanceTypesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAvailableInstanceTypesResponseBody setInstanceTypes(DescribeAvailableInstanceTypesResponseBodyInstanceTypes instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public DescribeAvailableInstanceTypesResponseBodyInstanceTypes getInstanceTypes() {
        return this.instanceTypes;
    }

    public DescribeAvailableInstanceTypesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAvailableInstanceTypesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAvailableInstanceTypesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAvailableInstanceTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvailableInstanceTypesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeAvailableInstanceTypesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAvailableInstanceTypesResponseBodyInstanceTypes extends TeaModel {
        @NameInMap("instanceType")
        public java.util.List<String> instanceType;

        public static DescribeAvailableInstanceTypesResponseBodyInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableInstanceTypesResponseBodyInstanceTypes self = new DescribeAvailableInstanceTypesResponseBodyInstanceTypes();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableInstanceTypesResponseBodyInstanceTypes setInstanceType(java.util.List<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public java.util.List<String> getInstanceType() {
            return this.instanceType;
        }

    }

}

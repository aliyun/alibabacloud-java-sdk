// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrganizationSpecsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>1890FA4F-067A-4CE9-AC9B-2BD2E58FB5D3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeOrganizationSpecsResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeOrganizationSpecsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrganizationSpecsResponseBody self = new DescribeOrganizationSpecsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOrganizationSpecsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeOrganizationSpecsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOrganizationSpecsResponseBody setResult(java.util.List<DescribeOrganizationSpecsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeOrganizationSpecsResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeOrganizationSpecsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeOrganizationSpecsResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>basic</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Title")
        public String title;

        public static DescribeOrganizationSpecsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeOrganizationSpecsResponseBodyResult self = new DescribeOrganizationSpecsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeOrganizationSpecsResponseBodyResult setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeOrganizationSpecsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeOrganizationSpecsResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}

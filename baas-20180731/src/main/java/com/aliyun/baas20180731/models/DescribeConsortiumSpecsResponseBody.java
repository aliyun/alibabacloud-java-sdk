// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeConsortiumSpecsResponseBody extends TeaModel {
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
    public java.util.List<DescribeConsortiumSpecsResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeConsortiumSpecsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsortiumSpecsResponseBody self = new DescribeConsortiumSpecsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConsortiumSpecsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeConsortiumSpecsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConsortiumSpecsResponseBody setResult(java.util.List<DescribeConsortiumSpecsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeConsortiumSpecsResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeConsortiumSpecsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeConsortiumSpecsResponseBodyResult extends TeaModel {
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

        public static DescribeConsortiumSpecsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeConsortiumSpecsResponseBodyResult self = new DescribeConsortiumSpecsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeConsortiumSpecsResponseBodyResult setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeConsortiumSpecsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeConsortiumSpecsResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}

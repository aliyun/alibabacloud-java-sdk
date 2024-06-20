// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumSpecsResponseBody extends TeaModel {
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
    public java.util.List<DescribeFabricConsortiumSpecsResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeFabricConsortiumSpecsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumSpecsResponseBody self = new DescribeFabricConsortiumSpecsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumSpecsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricConsortiumSpecsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricConsortiumSpecsResponseBody setResult(java.util.List<DescribeFabricConsortiumSpecsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeFabricConsortiumSpecsResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeFabricConsortiumSpecsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeFabricConsortiumSpecsResponseBodyResult extends TeaModel {
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
        @NameInMap("SpecName")
        public String specName;

        @NameInMap("SpecTitle")
        public String specTitle;

        public static DescribeFabricConsortiumSpecsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricConsortiumSpecsResponseBodyResult self = new DescribeFabricConsortiumSpecsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricConsortiumSpecsResponseBodyResult setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeFabricConsortiumSpecsResponseBodyResult setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

        public DescribeFabricConsortiumSpecsResponseBodyResult setSpecTitle(String specTitle) {
            this.specTitle = specTitle;
            return this;
        }
        public String getSpecTitle() {
            return this.specTitle;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumSpecsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<DescribeFabricConsortiumSpecsResponseBodyResult> result;

    public static DescribeFabricConsortiumSpecsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumSpecsResponseBody self = new DescribeFabricConsortiumSpecsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumSpecsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricConsortiumSpecsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricConsortiumSpecsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeFabricConsortiumSpecsResponseBody setResult(java.util.List<DescribeFabricConsortiumSpecsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeFabricConsortiumSpecsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeFabricConsortiumSpecsResponseBodyResult extends TeaModel {
        @NameInMap("SpecName")
        public String specName;

        @NameInMap("SpecTitle")
        public String specTitle;

        @NameInMap("Enable")
        public Boolean enable;

        public static DescribeFabricConsortiumSpecsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricConsortiumSpecsResponseBodyResult self = new DescribeFabricConsortiumSpecsResponseBodyResult();
            return TeaModel.build(map, self);
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

        public DescribeFabricConsortiumSpecsResponseBodyResult setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

}

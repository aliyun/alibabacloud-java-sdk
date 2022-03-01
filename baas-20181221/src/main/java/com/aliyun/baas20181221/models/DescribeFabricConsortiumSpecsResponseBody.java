// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumSpecsResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeFabricConsortiumSpecsResponseBodyResult> result;

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
        @NameInMap("Enable")
        public Boolean enable;

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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class AddFabricOrganizationToExternalChannelResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<AddFabricOrganizationToExternalChannelResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static AddFabricOrganizationToExternalChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddFabricOrganizationToExternalChannelResponseBody self = new AddFabricOrganizationToExternalChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public AddFabricOrganizationToExternalChannelResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public AddFabricOrganizationToExternalChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddFabricOrganizationToExternalChannelResponseBody setResult(java.util.List<AddFabricOrganizationToExternalChannelResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<AddFabricOrganizationToExternalChannelResponseBodyResult> getResult() {
        return this.result;
    }

    public AddFabricOrganizationToExternalChannelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddFabricOrganizationToExternalChannelResponseBodyResult extends TeaModel {
        @NameInMap("M")
        public Integer m;

        @NameInMap("N")
        public Integer n;

        public static AddFabricOrganizationToExternalChannelResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddFabricOrganizationToExternalChannelResponseBodyResult self = new AddFabricOrganizationToExternalChannelResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddFabricOrganizationToExternalChannelResponseBodyResult setM(Integer m) {
            this.m = m;
            return this;
        }
        public Integer getM() {
            return this.m;
        }

        public AddFabricOrganizationToExternalChannelResponseBodyResult setN(Integer n) {
            this.n = n;
            return this;
        }
        public Integer getN() {
            return this.n;
        }

    }

}

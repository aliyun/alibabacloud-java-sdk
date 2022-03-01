// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumAdminStatusResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeFabricConsortiumAdminStatusResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeFabricConsortiumAdminStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumAdminStatusResponseBody self = new DescribeFabricConsortiumAdminStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumAdminStatusResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricConsortiumAdminStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricConsortiumAdminStatusResponseBody setResult(java.util.List<DescribeFabricConsortiumAdminStatusResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeFabricConsortiumAdminStatusResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeFabricConsortiumAdminStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeFabricConsortiumAdminStatusResponseBodyResult extends TeaModel {
        @NameInMap("ConsortiumAdministrator")
        public Boolean consortiumAdministrator;

        @NameInMap("ConsortiumId")
        public String consortiumId;

        public static DescribeFabricConsortiumAdminStatusResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricConsortiumAdminStatusResponseBodyResult self = new DescribeFabricConsortiumAdminStatusResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricConsortiumAdminStatusResponseBodyResult setConsortiumAdministrator(Boolean consortiumAdministrator) {
            this.consortiumAdministrator = consortiumAdministrator;
            return this;
        }
        public Boolean getConsortiumAdministrator() {
            return this.consortiumAdministrator;
        }

        public DescribeFabricConsortiumAdminStatusResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

    }

}

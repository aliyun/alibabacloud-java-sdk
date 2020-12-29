// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumAdminStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<DescribeFabricConsortiumAdminStatusResponseBodyResult> result;

    public static DescribeFabricConsortiumAdminStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumAdminStatusResponseBody self = new DescribeFabricConsortiumAdminStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumAdminStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricConsortiumAdminStatusResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricConsortiumAdminStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeFabricConsortiumAdminStatusResponseBody setResult(java.util.List<DescribeFabricConsortiumAdminStatusResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeFabricConsortiumAdminStatusResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeFabricConsortiumAdminStatusResponseBodyResult extends TeaModel {
        @NameInMap("ConsortiumId")
        public String consortiumId;

        @NameInMap("ConsortiumAdministrator")
        public Boolean consortiumAdministrator;

        public static DescribeFabricConsortiumAdminStatusResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricConsortiumAdminStatusResponseBodyResult self = new DescribeFabricConsortiumAdminStatusResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricConsortiumAdminStatusResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DescribeFabricConsortiumAdminStatusResponseBodyResult setConsortiumAdministrator(Boolean consortiumAdministrator) {
            this.consortiumAdministrator = consortiumAdministrator;
            return this;
        }
        public Boolean getConsortiumAdministrator() {
            return this.consortiumAdministrator;
        }

    }

}

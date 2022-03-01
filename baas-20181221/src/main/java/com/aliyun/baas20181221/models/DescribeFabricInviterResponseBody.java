// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricInviterResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeFabricInviterResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeFabricInviterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricInviterResponseBody self = new DescribeFabricInviterResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricInviterResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricInviterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricInviterResponseBody setResult(DescribeFabricInviterResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeFabricInviterResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeFabricInviterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeFabricInviterResponseBodyResult extends TeaModel {
        @NameInMap("ConsortiumId")
        public String consortiumId;

        @NameInMap("ConsortiumName")
        public String consortiumName;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("InviterId")
        public Long inviterId;

        @NameInMap("InviterName")
        public String inviterName;

        public static DescribeFabricInviterResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricInviterResponseBodyResult self = new DescribeFabricInviterResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricInviterResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DescribeFabricInviterResponseBodyResult setConsortiumName(String consortiumName) {
            this.consortiumName = consortiumName;
            return this;
        }
        public String getConsortiumName() {
            return this.consortiumName;
        }

        public DescribeFabricInviterResponseBodyResult setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeFabricInviterResponseBodyResult setInviterId(Long inviterId) {
            this.inviterId = inviterId;
            return this;
        }
        public Long getInviterId() {
            return this.inviterId;
        }

        public DescribeFabricInviterResponseBodyResult setInviterName(String inviterName) {
            this.inviterName = inviterName;
            return this;
        }
        public String getInviterName() {
            return this.inviterName;
        }

    }

}

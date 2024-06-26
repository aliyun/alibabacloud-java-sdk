// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DestroyConsortiumResponseBody extends TeaModel {
    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DestroyConsortiumResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DestroyConsortiumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DestroyConsortiumResponseBody self = new DestroyConsortiumResponseBody();
        return TeaModel.build(map, self);
    }

    public DestroyConsortiumResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DestroyConsortiumResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DestroyConsortiumResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DestroyConsortiumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DestroyConsortiumResponseBody setResult(DestroyConsortiumResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DestroyConsortiumResponseBodyResult getResult() {
        return this.result;
    }

    public DestroyConsortiumResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DestroyConsortiumResponseBodyResult extends TeaModel {
        @NameInMap("ConsortiumId")
        public String consortiumId;

        @NameInMap("Name")
        public String name;

        public static DestroyConsortiumResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DestroyConsortiumResponseBodyResult self = new DestroyConsortiumResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DestroyConsortiumResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DestroyConsortiumResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}

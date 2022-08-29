// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class CsccSystemInitResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public CsccSystemInitResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CsccSystemInitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CsccSystemInitResponseBody self = new CsccSystemInitResponseBody();
        return TeaModel.build(map, self);
    }

    public CsccSystemInitResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CsccSystemInitResponseBody setData(CsccSystemInitResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CsccSystemInitResponseBodyData getData() {
        return this.data;
    }

    public CsccSystemInitResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CsccSystemInitResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CsccSystemInitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CsccSystemInitResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CsccSystemInitResponseBodyData extends TeaModel {
        @NameInMap("DataSourceId")
        public String dataSourceId;

        @NameInMap("EncryptPubKey")
        public String encryptPubKey;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MemberId")
        public Long memberId;

        @NameInMap("TeeUserId")
        public String teeUserId;

        public static CsccSystemInitResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CsccSystemInitResponseBodyData self = new CsccSystemInitResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CsccSystemInitResponseBodyData setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public CsccSystemInitResponseBodyData setEncryptPubKey(String encryptPubKey) {
            this.encryptPubKey = encryptPubKey;
            return this;
        }
        public String getEncryptPubKey() {
            return this.encryptPubKey;
        }

        public CsccSystemInitResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CsccSystemInitResponseBodyData setMemberId(Long memberId) {
            this.memberId = memberId;
            return this;
        }
        public Long getMemberId() {
            return this.memberId;
        }

        public CsccSystemInitResponseBodyData setTeeUserId(String teeUserId) {
            this.teeUserId = teeUserId;
            return this;
        }
        public String getTeeUserId() {
            return this.teeUserId;
        }

    }

}

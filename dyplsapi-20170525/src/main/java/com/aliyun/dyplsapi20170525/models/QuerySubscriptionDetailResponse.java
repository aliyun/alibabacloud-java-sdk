// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySubscriptionDetailResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("SecretBindDetailDTO")
    @Validation(required = true)
    public QuerySubscriptionDetailResponseSecretBindDetailDTO secretBindDetailDTO;

    public static QuerySubscriptionDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySubscriptionDetailResponse self = new QuerySubscriptionDetailResponse();
        return TeaModel.build(map, self);
    }

    public QuerySubscriptionDetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySubscriptionDetailResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySubscriptionDetailResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySubscriptionDetailResponse setSecretBindDetailDTO(QuerySubscriptionDetailResponseSecretBindDetailDTO secretBindDetailDTO) {
        this.secretBindDetailDTO = secretBindDetailDTO;
        return this;
    }
    public QuerySubscriptionDetailResponseSecretBindDetailDTO getSecretBindDetailDTO() {
        return this.secretBindDetailDTO;
    }

    public static class QuerySubscriptionDetailResponseSecretBindDetailDTO extends TeaModel {
        @NameInMap("SubsId")
        @Validation(required = true)
        public String subsId;

        @NameInMap("PhoneNoA")
        @Validation(required = true)
        public String phoneNoA;

        @NameInMap("PhoneNoX")
        @Validation(required = true)
        public String phoneNoX;

        @NameInMap("PhoneNoB")
        @Validation(required = true)
        public String phoneNoB;

        @NameInMap("Extension")
        @Validation(required = true)
        public String extension;

        @NameInMap("GroupId")
        @Validation(required = true)
        public Long groupId;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("ExpireDate")
        @Validation(required = true)
        public String expireDate;

        @NameInMap("NeedRecord")
        @Validation(required = true)
        public Boolean needRecord;

        @NameInMap("CallRestrict")
        @Validation(required = true)
        public String callRestrict;

        @NameInMap("Status")
        @Validation(required = true)
        public Long status;

        @NameInMap("ASRStatus")
        @Validation(required = true)
        public Boolean ASRStatus;

        @NameInMap("ASRModelId")
        @Validation(required = true)
        public String ASRModelId;

        public static QuerySubscriptionDetailResponseSecretBindDetailDTO build(java.util.Map<String, ?> map) throws Exception {
            QuerySubscriptionDetailResponseSecretBindDetailDTO self = new QuerySubscriptionDetailResponseSecretBindDetailDTO();
            return TeaModel.build(map, self);
        }

        public QuerySubscriptionDetailResponseSecretBindDetailDTO setSubsId(String subsId) {
            this.subsId = subsId;
            return this;
        }
        public String getSubsId() {
            return this.subsId;
        }

        public QuerySubscriptionDetailResponseSecretBindDetailDTO setPhoneNoA(String phoneNoA) {
            this.phoneNoA = phoneNoA;
            return this;
        }
        public String getPhoneNoA() {
            return this.phoneNoA;
        }

        public QuerySubscriptionDetailResponseSecretBindDetailDTO setPhoneNoX(String phoneNoX) {
            this.phoneNoX = phoneNoX;
            return this;
        }
        public String getPhoneNoX() {
            return this.phoneNoX;
        }

        public QuerySubscriptionDetailResponseSecretBindDetailDTO setPhoneNoB(String phoneNoB) {
            this.phoneNoB = phoneNoB;
            return this;
        }
        public String getPhoneNoB() {
            return this.phoneNoB;
        }

        public QuerySubscriptionDetailResponseSecretBindDetailDTO setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public QuerySubscriptionDetailResponseSecretBindDetailDTO setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public QuerySubscriptionDetailResponseSecretBindDetailDTO setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QuerySubscriptionDetailResponseSecretBindDetailDTO setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public QuerySubscriptionDetailResponseSecretBindDetailDTO setNeedRecord(Boolean needRecord) {
            this.needRecord = needRecord;
            return this;
        }
        public Boolean getNeedRecord() {
            return this.needRecord;
        }

        public QuerySubscriptionDetailResponseSecretBindDetailDTO setCallRestrict(String callRestrict) {
            this.callRestrict = callRestrict;
            return this;
        }
        public String getCallRestrict() {
            return this.callRestrict;
        }

        public QuerySubscriptionDetailResponseSecretBindDetailDTO setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QuerySubscriptionDetailResponseSecretBindDetailDTO setASRStatus(Boolean ASRStatus) {
            this.ASRStatus = ASRStatus;
            return this;
        }
        public Boolean getASRStatus() {
            return this.ASRStatus;
        }

        public QuerySubscriptionDetailResponseSecretBindDetailDTO setASRModelId(String ASRModelId) {
            this.ASRModelId = ASRModelId;
            return this;
        }
        public String getASRModelId() {
            return this.ASRModelId;
        }

    }

}

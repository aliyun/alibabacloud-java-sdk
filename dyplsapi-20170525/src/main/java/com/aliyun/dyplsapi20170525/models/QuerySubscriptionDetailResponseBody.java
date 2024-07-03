// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySubscriptionDetailResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.</li>
     * <li>Other status codes indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/109196.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>066E6E47-04CB-4774-A976-4F73CB76D4A3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information returned after the QuerySubscriptionDetail operation was called.</p>
     */
    @NameInMap("SecretBindDetailDTO")
    public QuerySubscriptionDetailResponseBodySecretBindDetailDTO secretBindDetailDTO;

    public static QuerySubscriptionDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySubscriptionDetailResponseBody self = new QuerySubscriptionDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySubscriptionDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySubscriptionDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySubscriptionDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySubscriptionDetailResponseBody setSecretBindDetailDTO(QuerySubscriptionDetailResponseBodySecretBindDetailDTO secretBindDetailDTO) {
        this.secretBindDetailDTO = secretBindDetailDTO;
        return this;
    }
    public QuerySubscriptionDetailResponseBodySecretBindDetailDTO getSecretBindDetailDTO() {
        return this.secretBindDetailDTO;
    }

    public static class QuerySubscriptionDetailResponseBodySecretBindDetailDTO extends TeaModel {
        /**
         * <p>The ID of the ASR model.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ASRModelId")
        public String ASRModelId;

        /**
         * <p>Indicates whether automatic speech recognition (ASR) is enabled. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: ASR is disabled.</li>
         * <li><strong>true</strong>: ASR is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ASRStatus")
        public Boolean ASRStatus;

        /**
         * <p>The status of one-way call restrictions. No value is returned for this parameter if one-way call restrictions are not set. Valid values:</p>
         * <ul>
         * <li><strong>CONTROL_AX_DISABLE</strong>: Phone number A cannot be used to call phone number X.</li>
         * <li><strong>CONTROL_BX_DISABLE</strong>: Phone number B cannot be used to call phone number X.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CONTROL_BX_DISABLE</p>
         */
        @NameInMap("CallRestrict")
        public String callRestrict;

        /**
         * <p>The expiration time of the binding.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-05 12:00:00</p>
         */
        @NameInMap("ExpireDate")
        public String expireDate;

        /**
         * <p>The extension in the AXG extension binding.</p>
         * 
         * <strong>example:</strong>
         * <p>130</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>The creation time of the binding.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-03-05 12:00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The ID of number group G in the binding.</p>
         * 
         * <strong>example:</strong>
         * <p>2000000130001</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>Indicates whether all calls made by the bound phone numbers are recorded. Valid values:</p>
         * <ul>
         * <li><strong>false</strong></li>
         * <li><strong>true</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedRecord")
        public Boolean needRecord;

        /**
         * <p>Phone number A in the binding.</p>
         * 
         * <strong>example:</strong>
         * <p>13900001111</p>
         */
        @NameInMap("PhoneNoA")
        public String phoneNoA;

        /**
         * <p>Phone number B in the binding.</p>
         * 
         * <strong>example:</strong>
         * <p>13900002222</p>
         */
        @NameInMap("PhoneNoB")
        public String phoneNoB;

        /**
         * <p>The private number in the binding, that is, phone number X.</p>
         * 
         * <strong>example:</strong>
         * <p>13900001234</p>
         */
        @NameInMap("PhoneNoX")
        public String phoneNoX;

        /**
         * <p>The binding status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The binding expired.</li>
         * <li><strong>1</strong>: The binding is in effect.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <p>The binding ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100000076879****</p>
         */
        @NameInMap("SubsId")
        public String subsId;

        public static QuerySubscriptionDetailResponseBodySecretBindDetailDTO build(java.util.Map<String, ?> map) throws Exception {
            QuerySubscriptionDetailResponseBodySecretBindDetailDTO self = new QuerySubscriptionDetailResponseBodySecretBindDetailDTO();
            return TeaModel.build(map, self);
        }

        public QuerySubscriptionDetailResponseBodySecretBindDetailDTO setASRModelId(String ASRModelId) {
            this.ASRModelId = ASRModelId;
            return this;
        }
        public String getASRModelId() {
            return this.ASRModelId;
        }

        public QuerySubscriptionDetailResponseBodySecretBindDetailDTO setASRStatus(Boolean ASRStatus) {
            this.ASRStatus = ASRStatus;
            return this;
        }
        public Boolean getASRStatus() {
            return this.ASRStatus;
        }

        public QuerySubscriptionDetailResponseBodySecretBindDetailDTO setCallRestrict(String callRestrict) {
            this.callRestrict = callRestrict;
            return this;
        }
        public String getCallRestrict() {
            return this.callRestrict;
        }

        public QuerySubscriptionDetailResponseBodySecretBindDetailDTO setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public QuerySubscriptionDetailResponseBodySecretBindDetailDTO setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public QuerySubscriptionDetailResponseBodySecretBindDetailDTO setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QuerySubscriptionDetailResponseBodySecretBindDetailDTO setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public QuerySubscriptionDetailResponseBodySecretBindDetailDTO setNeedRecord(Boolean needRecord) {
            this.needRecord = needRecord;
            return this;
        }
        public Boolean getNeedRecord() {
            return this.needRecord;
        }

        public QuerySubscriptionDetailResponseBodySecretBindDetailDTO setPhoneNoA(String phoneNoA) {
            this.phoneNoA = phoneNoA;
            return this;
        }
        public String getPhoneNoA() {
            return this.phoneNoA;
        }

        public QuerySubscriptionDetailResponseBodySecretBindDetailDTO setPhoneNoB(String phoneNoB) {
            this.phoneNoB = phoneNoB;
            return this;
        }
        public String getPhoneNoB() {
            return this.phoneNoB;
        }

        public QuerySubscriptionDetailResponseBodySecretBindDetailDTO setPhoneNoX(String phoneNoX) {
            this.phoneNoX = phoneNoX;
            return this;
        }
        public String getPhoneNoX() {
            return this.phoneNoX;
        }

        public QuerySubscriptionDetailResponseBodySecretBindDetailDTO setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QuerySubscriptionDetailResponseBodySecretBindDetailDTO setSubsId(String subsId) {
            this.subsId = subsId;
            return this;
        }
        public String getSubsId() {
            return this.subsId;
        }

    }

}

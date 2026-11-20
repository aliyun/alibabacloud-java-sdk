// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySubscriptionDetailResponseBody extends TeaModel {
    /**
     * <p>The request status code.</p>
     * <ul>
     * <li>OK indicates that the request was successful.</li>
     * <li>For other error codes, see <a href="https://help.aliyun.com/document_detail/109196.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The description of the status code.</p>
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
     * <p>The data structure returned when the API call is successful.</p>
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
         * <p>The ASR model ID. Valid values:</p>
         * <ul>
         * <li><p>General-Telephone-Mandarin Chinese model ID: 7ee372834d2f4cc7ac0d0ab2d0ae1aac</p>
         * </li>
         * <li><p>General-Telephone-Cantonese Chinese model ID: 9b4afe3d224e4fa3bf963697113e2f77</p>
         * </li>
         * <li><p>General-Telephone-Regional Accent model ID: 3655a6cb94764145a1f9a38a3c3b3b4b</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>7ee372834d2f4cc7ac0d0ab2d0ae1aac</p>
         */
        @NameInMap("ASRModelId")
        public String ASRModelId;

        /**
         * <p>The Automatic Speech Recognition (ASR) status. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: Disabled.</li>
         * <li><strong>true</strong>: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ASRStatus")
        public Boolean ASRStatus;

        /**
         * <p>The one-way call restriction status. This parameter is not returned if no one-way call restriction is configured. Valid values:</p>
         * <ul>
         * <li><strong>CONTROL_AX_DISABLE</strong>: Phone number A cannot call phone number X.</li>
         * <li><strong>CONTROL_BX_DISABLE</strong>: Phone number B cannot call phone number X.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CONTROL_BX_DISABLE</p>
         */
        @NameInMap("CallRestrict")
        public String callRestrict;

        /**
         * <p>The expiration time of the binding relationship, in the format of YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-05 12:00:00</p>
         */
        @NameInMap("ExpireDate")
        public String expireDate;

        /**
         * <p>The extension number in the AXG extension binding.</p>
         * 
         * <strong>example:</strong>
         * <p>130</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>The time when the binding relationship was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-03-05 12:00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The ID of the number group G (GID) in the binding relationship.</p>
         * 
         * <strong>example:</strong>
         * <p>200001234****</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>Indicates whether all calls generated by this binding relationship are recorded. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: Calls are not recorded.</li>
         * <li><strong>true</strong>: Calls are recorded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedRecord")
        public Boolean needRecord;

        /**
         * <p>The phone number A in the binding relationship.</p>
         * 
         * <strong>example:</strong>
         * <p>139****0000</p>
         */
        @NameInMap("PhoneNoA")
        public String phoneNoA;

        /**
         * <p>The phone number B in the binding relationship.</p>
         * 
         * <strong>example:</strong>
         * <p>138****0000</p>
         */
        @NameInMap("PhoneNoB")
        public String phoneNoB;

        /**
         * <p>The private number in the binding relationship, which is the X number.</p>
         * 
         * <strong>example:</strong>
         * <p>139****1111</p>
         */
        @NameInMap("PhoneNoX")
        public String phoneNoX;

        /**
         * <p>The status of the binding relationship. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Expired.</li>
         * <li><strong>1</strong>: Active.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <p>The binding relationship ID.</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class GetTrialInfoResponseBody extends TeaModel {
    /**
     * <p>The return code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message. The value &quot;successful&quot; is returned on success. An error message is returned on failure.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The free trial properties. This parameter is returned only when a free trial record exists for the data source.</p>
     */
    @NameInMap("TrialInfo")
    public GetTrialInfoResponseBodyTrialInfo trialInfo;

    public static GetTrialInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrialInfoResponseBody self = new GetTrialInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrialInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTrialInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTrialInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTrialInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTrialInfoResponseBody setTrialInfo(GetTrialInfoResponseBodyTrialInfo trialInfo) {
        this.trialInfo = trialInfo;
        return this;
    }
    public GetTrialInfoResponseBodyTrialInfo getTrialInfo() {
        return this.trialInfo;
    }

    public static class GetTrialInfoResponseBodyTrialInfo extends TeaModel {
        /**
         * <p>Indicates whether the service is converted to pay-as-you-go after the free trial expires.</p>
         */
        @NameInMap("KeepAfterTrialExpiration")
        public Boolean keepAfterTrialExpiration;

        /**
         * <p>The remaining number of free trial backup plans that can be created. The value 1 is returned if the free trial has not expired and no free trial backup plan has been created. Otherwise, the value 0 is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TrialBackupPlanQuota")
        public Long trialBackupPlanQuota;

        /**
         * <p>The expiration time of the free trial. UNIX timestamp, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1584597600</p>
         */
        @NameInMap("TrialExpireTime")
        public Long trialExpireTime;

        /**
         * <p>The start time of the free trial. UNIX timestamp, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1579413159</p>
         */
        @NameInMap("TrialStartTime")
        public Long trialStartTime;

        /**
         * <p>The remaining number of free trial backup vaults that can be created. The value 1 is returned if the free trial has not expired and no free trial backup vault has been created. Otherwise, the value 0 is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TrialVaultQuota")
        public Long trialVaultQuota;

        /**
         * <p>The release time of the free trial backup vault. UNIX timestamp, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1594965600</p>
         */
        @NameInMap("TrialVaultReleaseTime")
        public Long trialVaultReleaseTime;

        public static GetTrialInfoResponseBodyTrialInfo build(java.util.Map<String, ?> map) throws Exception {
            GetTrialInfoResponseBodyTrialInfo self = new GetTrialInfoResponseBodyTrialInfo();
            return TeaModel.build(map, self);
        }

        public GetTrialInfoResponseBodyTrialInfo setKeepAfterTrialExpiration(Boolean keepAfterTrialExpiration) {
            this.keepAfterTrialExpiration = keepAfterTrialExpiration;
            return this;
        }
        public Boolean getKeepAfterTrialExpiration() {
            return this.keepAfterTrialExpiration;
        }

        public GetTrialInfoResponseBodyTrialInfo setTrialBackupPlanQuota(Long trialBackupPlanQuota) {
            this.trialBackupPlanQuota = trialBackupPlanQuota;
            return this;
        }
        public Long getTrialBackupPlanQuota() {
            return this.trialBackupPlanQuota;
        }

        public GetTrialInfoResponseBodyTrialInfo setTrialExpireTime(Long trialExpireTime) {
            this.trialExpireTime = trialExpireTime;
            return this;
        }
        public Long getTrialExpireTime() {
            return this.trialExpireTime;
        }

        public GetTrialInfoResponseBodyTrialInfo setTrialStartTime(Long trialStartTime) {
            this.trialStartTime = trialStartTime;
            return this;
        }
        public Long getTrialStartTime() {
            return this.trialStartTime;
        }

        public GetTrialInfoResponseBodyTrialInfo setTrialVaultQuota(Long trialVaultQuota) {
            this.trialVaultQuota = trialVaultQuota;
            return this;
        }
        public Long getTrialVaultQuota() {
            return this.trialVaultQuota;
        }

        public GetTrialInfoResponseBodyTrialInfo setTrialVaultReleaseTime(Long trialVaultReleaseTime) {
            this.trialVaultReleaseTime = trialVaultReleaseTime;
            return this;
        }
        public Long getTrialVaultReleaseTime() {
            return this.trialVaultReleaseTime;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CancelQualificationVerificationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>S20181*****85212</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>knet</p>
     */
    @NameInMap("QualificationType")
    public String qualificationType;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static CancelQualificationVerificationRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelQualificationVerificationRequest self = new CancelQualificationVerificationRequest();
        return TeaModel.build(map, self);
    }

    public CancelQualificationVerificationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CancelQualificationVerificationRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CancelQualificationVerificationRequest setQualificationType(String qualificationType) {
        this.qualificationType = qualificationType;
        return this;
    }
    public String getQualificationType() {
        return this.qualificationType;
    }

    public CancelQualificationVerificationRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryFailingReasonListForQualificationRequest extends TeaModel {
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
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Integer limit;

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

    public static QueryFailingReasonListForQualificationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFailingReasonListForQualificationRequest self = new QueryFailingReasonListForQualificationRequest();
        return TeaModel.build(map, self);
    }

    public QueryFailingReasonListForQualificationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryFailingReasonListForQualificationRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryFailingReasonListForQualificationRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public QueryFailingReasonListForQualificationRequest setQualificationType(String qualificationType) {
        this.qualificationType = qualificationType;
        return this;
    }
    public String getQualificationType() {
        return this.qualificationType;
    }

    public QueryFailingReasonListForQualificationRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}

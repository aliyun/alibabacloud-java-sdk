// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryQualificationDetailRequest extends TeaModel {
    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>S20181*****85212</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the error message returned by the API. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * <p>Default value: en.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>API type for qualification verification. Fixed value: <strong>knet</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>knet</p>
     */
    @NameInMap("QualificationType")
    public String qualificationType;

    /**
     * <p>User IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static QueryQualificationDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryQualificationDetailRequest self = new QueryQualificationDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryQualificationDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryQualificationDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryQualificationDetailRequest setQualificationType(String qualificationType) {
        this.qualificationType = qualificationType;
        return this;
    }
    public String getQualificationType() {
        return this.qualificationType;
    }

    public QueryQualificationDetailRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}

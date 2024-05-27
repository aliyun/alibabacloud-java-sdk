// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ValidateDnsGtmCnameRrCanUseRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CnameMode")
    public String cnameMode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CnameRr")
    public String cnameRr;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CnameType")
    public String cnameType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CnameZone")
    public String cnameZone;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Lang")
    public String lang;

    public static ValidateDnsGtmCnameRrCanUseRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateDnsGtmCnameRrCanUseRequest self = new ValidateDnsGtmCnameRrCanUseRequest();
        return TeaModel.build(map, self);
    }

    public ValidateDnsGtmCnameRrCanUseRequest setCnameMode(String cnameMode) {
        this.cnameMode = cnameMode;
        return this;
    }
    public String getCnameMode() {
        return this.cnameMode;
    }

    public ValidateDnsGtmCnameRrCanUseRequest setCnameRr(String cnameRr) {
        this.cnameRr = cnameRr;
        return this;
    }
    public String getCnameRr() {
        return this.cnameRr;
    }

    public ValidateDnsGtmCnameRrCanUseRequest setCnameType(String cnameType) {
        this.cnameType = cnameType;
        return this;
    }
    public String getCnameType() {
        return this.cnameType;
    }

    public ValidateDnsGtmCnameRrCanUseRequest setCnameZone(String cnameZone) {
        this.cnameZone = cnameZone;
        return this;
    }
    public String getCnameZone() {
        return this.cnameZone;
    }

    public ValidateDnsGtmCnameRrCanUseRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ValidateDnsGtmCnameRrCanUseRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}

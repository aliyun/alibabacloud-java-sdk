// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetLogTicketRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh。</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>173326*******。</p>
     */
    @NameInMap("LogUserId")
    public Long logUserId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>173326*******。</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static GetLogTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLogTicketRequest self = new GetLogTicketRequest();
        return TeaModel.build(map, self);
    }

    public GetLogTicketRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetLogTicketRequest setLogUserId(Long logUserId) {
        this.logUserId = logUserId;
        return this;
    }
    public Long getLogUserId() {
        return this.logUserId;
    }

    public GetLogTicketRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetLogTicketRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}

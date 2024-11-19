// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteStudioAppDomainOpenRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a12******</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DomainId")
    public Integer domainId;

    /**
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a123*******</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    public static DeleteStudioAppDomainOpenRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStudioAppDomainOpenRequest self = new DeleteStudioAppDomainOpenRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStudioAppDomainOpenRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteStudioAppDomainOpenRequest setDomainId(Integer domainId) {
        this.domainId = domainId;
        return this;
    }
    public Integer getDomainId() {
        return this.domainId;
    }

    public DeleteStudioAppDomainOpenRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeleteStudioAppDomainOpenRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}

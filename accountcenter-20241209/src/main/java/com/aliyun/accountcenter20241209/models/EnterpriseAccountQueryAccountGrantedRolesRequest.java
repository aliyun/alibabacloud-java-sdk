// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseAccountQueryAccountGrantedRolesRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("IsOpenApi")
    public Boolean isOpenApi;

    @NameInMap("OrientedEcId")
    public String orientedEcId;

    @NameInMap("OrientedLeId")
    public String orientedLeId;

    @NameInMap("OrientedNbId")
    public String orientedNbId;

    @NameInMap("Pk")
    public String pk;

    @NameInMap("ShowCompleteInfo")
    public Boolean showCompleteInfo;

    public static EnterpriseAccountQueryAccountGrantedRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseAccountQueryAccountGrantedRolesRequest self = new EnterpriseAccountQueryAccountGrantedRolesRequest();
        return TeaModel.build(map, self);
    }

    public EnterpriseAccountQueryAccountGrantedRolesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public EnterpriseAccountQueryAccountGrantedRolesRequest setIsOpenApi(Boolean isOpenApi) {
        this.isOpenApi = isOpenApi;
        return this;
    }
    public Boolean getIsOpenApi() {
        return this.isOpenApi;
    }

    public EnterpriseAccountQueryAccountGrantedRolesRequest setOrientedEcId(String orientedEcId) {
        this.orientedEcId = orientedEcId;
        return this;
    }
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    public EnterpriseAccountQueryAccountGrantedRolesRequest setOrientedLeId(String orientedLeId) {
        this.orientedLeId = orientedLeId;
        return this;
    }
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    public EnterpriseAccountQueryAccountGrantedRolesRequest setOrientedNbId(String orientedNbId) {
        this.orientedNbId = orientedNbId;
        return this;
    }
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    public EnterpriseAccountQueryAccountGrantedRolesRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public EnterpriseAccountQueryAccountGrantedRolesRequest setShowCompleteInfo(Boolean showCompleteInfo) {
        this.showCompleteInfo = showCompleteInfo;
        return this;
    }
    public Boolean getShowCompleteInfo() {
        return this.showCompleteInfo;
    }

}

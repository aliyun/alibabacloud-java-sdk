// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryInfoFromMdpRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("MobileMd5")
    public String mobileMd5;

    @NameInMap("MobileSha256")
    public String mobileSha256;

    @NameInMap("MobileSm3")
    public String mobileSm3;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RiskScene")
    public String riskScene;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static QueryInfoFromMdpRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInfoFromMdpRequest self = new QueryInfoFromMdpRequest();
        return TeaModel.build(map, self);
    }

    public QueryInfoFromMdpRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryInfoFromMdpRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryInfoFromMdpRequest setMobileMd5(String mobileMd5) {
        this.mobileMd5 = mobileMd5;
        return this;
    }
    public String getMobileMd5() {
        return this.mobileMd5;
    }

    public QueryInfoFromMdpRequest setMobileSha256(String mobileSha256) {
        this.mobileSha256 = mobileSha256;
        return this;
    }
    public String getMobileSha256() {
        return this.mobileSha256;
    }

    public QueryInfoFromMdpRequest setMobileSm3(String mobileSm3) {
        this.mobileSm3 = mobileSm3;
        return this;
    }
    public String getMobileSm3() {
        return this.mobileSm3;
    }

    public QueryInfoFromMdpRequest setRiskScene(String riskScene) {
        this.riskScene = riskScene;
        return this;
    }
    public String getRiskScene() {
        return this.riskScene;
    }

    public QueryInfoFromMdpRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryInfoFromMdpRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALIPUBE5C3F6D091419</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>13178195662</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <strong>example:</strong>
     * <p>2fe6e5fa754be73d1721b9bd2c6cf821</p>
     */
    @NameInMap("MobileMd5")
    public String mobileMd5;

    /**
     * <strong>example:</strong>
     * <p>db0797452ccafce84d7c151eb81596099bda3f097693d1e18b588804e6742ced</p>
     */
    @NameInMap("MobileSha256")
    public String mobileSha256;

    @NameInMap("MobileSm3")
    public String mobileSm3;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("RiskScene")
    public String riskScene;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
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

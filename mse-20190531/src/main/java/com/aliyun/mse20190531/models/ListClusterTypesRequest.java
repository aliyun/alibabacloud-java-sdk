// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListClusterTypesRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The network type. Valid values:</p>
     * <br>
     * <p>*   slb</p>
     * <p>*   eni</p>
     */
    @NameInMap("ConnectType")
    public String connectType;

    /**
     * <p>The edition of the MSE instance that you want to purchase.</p>
     * <br>
     * <p>*   mse_pro: Professional Edition</p>
     * <p>*   mse_dev: Developer Edition</p>
     */
    @NameInMap("MseVersion")
    public String mseVersion;

    /**
     * <p>The ID of the region in which the instance resides. The region is supported by Microservices Engine (MSE).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListClusterTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterTypesRequest self = new ListClusterTypesRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterTypesRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListClusterTypesRequest setConnectType(String connectType) {
        this.connectType = connectType;
        return this;
    }
    public String getConnectType() {
        return this.connectType;
    }

    public ListClusterTypesRequest setMseVersion(String mseVersion) {
        this.mseVersion = mseVersion;
        return this;
    }
    public String getMseVersion() {
        return this.mseVersion;
    }

    public ListClusterTypesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

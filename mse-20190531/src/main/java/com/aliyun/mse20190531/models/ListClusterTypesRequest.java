// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListClusterTypesRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese.</li>
     * <li>en: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The network type. Valid values:</p>
     * <ul>
     * <li>slb</li>
     * <li>eni</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>slb</p>
     */
    @NameInMap("ConnectType")
    public String connectType;

    /**
     * <p>The Microservices Engine (MSE) cluster edition to be activated. Valid values:</p>
     * <ul>
     * <li>mse_pro: Professional Edition.</li>
     * <li>mse_dev: Developer Edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>mse_pro</p>
     */
    @NameInMap("MseVersion")
    public String mseVersion;

    /**
     * <p>The region ID of the cluster. The region must be supported by Microservices Engine (MSE).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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

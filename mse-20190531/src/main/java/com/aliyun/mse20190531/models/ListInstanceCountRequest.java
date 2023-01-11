// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListInstanceCountRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The type of the instance. Valid values: ZooKeeper and Nacos-Ans.</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>The edition type of the instance. Valid values:</p>
     * <br>
     * <p>*   `mse_dev`: Developer Edition</p>
     * <p>*   `mse_pro`: Professional Edition</p>
     */
    @NameInMap("MseVersion")
    public String mseVersion;

    /**
     * <p>The ID of the region where the instance resides. Examples:</p>
     * <br>
     * <p>*   cn-hangzhou: China (Hangzhou)</p>
     * <p>*   cn-beijing: China (Beijing)</p>
     * <p>*   cn-shanghai: China (Shanghai)</p>
     * <p>*   cn-zhangjiakou: China (Zhangjiakou)</p>
     * <p>*   cn-shenzhen: China (Shenzhen)</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The extended request parameters in the JSON format.</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    public static ListInstanceCountRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceCountRequest self = new ListInstanceCountRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceCountRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListInstanceCountRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public ListInstanceCountRequest setMseVersion(String mseVersion) {
        this.mseVersion = mseVersion;
        return this;
    }
    public String getMseVersion() {
        return this.mseVersion;
    }

    public ListInstanceCountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListInstanceCountRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

}

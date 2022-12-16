// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListInstanceCountRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The type of the instance. Valid values: ZooKeeper and Nacos-Ans.
    @NameInMap("ClusterType")
    public String clusterType;

    // The edition type of the instance. Valid values:
    // 
    // *   `mse_dev`: Developer Edition
    // *   `mse_pro`: Professional Edition
    @NameInMap("MseVersion")
    public String mseVersion;

    // The ID of the region where the instance resides. Examples:
    // 
    // *   cn-hangzhou: China (Hangzhou)
    // *   cn-beijing: China (Beijing)
    // *   cn-shanghai: China (Shanghai)
    // *   cn-zhangjiakou: China (Zhangjiakou)
    // *   cn-shenzhen: China (Shenzhen)
    @NameInMap("RegionId")
    public String regionId;

    // The extended request parameters in the JSON format.
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

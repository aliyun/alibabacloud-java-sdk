// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListClusterVersionsRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The type of the instance. Valid values: ZooKeeper, Nacos-Ans, and Eureka.</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>The instance edition. Valid values:</p>
     * <br>
     * <p>*   `mse_dev`: Developer Edition.</p>
     * <p>*   `mse_pro`: Professional Edition. This is the default value.</p>
     */
    @NameInMap("MseVersion")
    public String mseVersion;

    public static ListClusterVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterVersionsRequest self = new ListClusterVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterVersionsRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListClusterVersionsRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public ListClusterVersionsRequest setMseVersion(String mseVersion) {
        this.mseVersion = mseVersion;
        return this;
    }
    public String getMseVersion() {
        return this.mseVersion;
    }

}

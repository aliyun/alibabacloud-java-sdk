// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListClusterVersionsRequest extends TeaModel {
    /**
     * <p>duplicated cluster alias name</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>mse-200-105</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>duplicatedClusterAliasName</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryClusterDiskSpecificationRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The type of the instance. Valid values: ZooKeeper, Nacos-Ans, and Eureka.
    @NameInMap("ClusterType")
    public String clusterType;

    public static QueryClusterDiskSpecificationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterDiskSpecificationRequest self = new QueryClusterDiskSpecificationRequest();
        return TeaModel.build(map, self);
    }

    public QueryClusterDiskSpecificationRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public QueryClusterDiskSpecificationRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

}

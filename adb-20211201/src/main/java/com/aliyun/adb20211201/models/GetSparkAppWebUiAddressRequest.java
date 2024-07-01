// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkAppWebUiAddressRequest extends TeaModel {
    /**
     * <p>The Spark application ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/455888.html">ListSparkApps</a> operation to query Spark application IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>s202205201533hz1209892000****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters within a region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>amv-uf6g8w25jacm7****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static GetSparkAppWebUiAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSparkAppWebUiAddressRequest self = new GetSparkAppWebUiAddressRequest();
        return TeaModel.build(map, self);
    }

    public GetSparkAppWebUiAddressRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetSparkAppWebUiAddressRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}

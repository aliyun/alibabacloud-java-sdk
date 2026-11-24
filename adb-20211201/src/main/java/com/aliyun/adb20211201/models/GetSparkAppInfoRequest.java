// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkAppInfoRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/455888.html">ListSparkApps</a> operation to query the ID of the Spark application.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>s202205201533hz1209892000****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;The ID of the Enterprise Edition, Basic Edition, or Data Lakehouse Edition cluster.
     * &lt;props=&quot;intl&quot;&gt;The ID of the Data Lakehouse Edition cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/612397.html">DescribeDBClusters</a> operation to query the cluster ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>am-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static GetSparkAppInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSparkAppInfoRequest self = new GetSparkAppInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetSparkAppInfoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetSparkAppInfoRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}

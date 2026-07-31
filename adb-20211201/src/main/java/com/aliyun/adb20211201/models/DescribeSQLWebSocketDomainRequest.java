// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSQLWebSocketDomainRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> API to query the details of all clusters in your account, including cluster IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1lw6g669zpi660</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The application module name.</p>
     * <ul>
     * <li><p><code>SQLWebSocket</code>: The module for SQL development.</p>
     * </li>
     * <li><p><code>Assistant</code>: The module for the intelligent assistant.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Assistant</p>
     */
    @NameInMap("Module")
    public String module;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> API to query the region IDs supported by AnalyticDB for MySQL.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeSQLWebSocketDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLWebSocketDomainRequest self = new DescribeSQLWebSocketDomainRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSQLWebSocketDomainRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSQLWebSocketDomainRequest setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public DescribeSQLWebSocketDomainRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

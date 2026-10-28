// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSparkSQLDiagnosisAttributeRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/612475.html">ListSparkApps</a> operation to query the ID of the Spark application.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>s202411071444hzdvk486d9d2001****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to view the information of all clusters in the specified region, including cluster IDs.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-2zeq4788qyy7k662</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The internal query execution ID of the Spark application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InnerQueryId")
    public Long innerQueryId;

    /**
     * <p>The language type. The description of the system access policy is returned in this language.</p>
     * <ul>
     * <li>en: English.</li>
     * <li>zh: Chinese.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query region IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeSparkSQLDiagnosisAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSparkSQLDiagnosisAttributeRequest self = new DescribeSparkSQLDiagnosisAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSparkSQLDiagnosisAttributeRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeSparkSQLDiagnosisAttributeRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSparkSQLDiagnosisAttributeRequest setInnerQueryId(Long innerQueryId) {
        this.innerQueryId = innerQueryId;
        return this;
    }
    public Long getInnerQueryId() {
        return this.innerQueryId;
    }

    public DescribeSparkSQLDiagnosisAttributeRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DescribeSparkSQLDiagnosisAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

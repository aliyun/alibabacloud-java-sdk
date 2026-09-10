// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ExecWorkflowConnectivityRequest extends TeaModel {
    /**
     * <p>The datasource config. The value is a JSON character string whose structure is defined by each dsType. Parse the JSON string before use. Sensitive fields such as tokens are masked in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;endpoint&quot;:&quot;...&quot;,&quot;token&quot;:&quot;******&quot;}</p>
     */
    @NameInMap("dsConfig")
    public String dsConfig;

    /**
     * <p>The data source name. Exact match and fuzzy match are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test_ds318_hangzhou_0428</p>
     */
    @NameInMap("dsName")
    public String dsName;

    /**
     * <p>The data source type, such as Hive or MaxCompute.</p>
     * 
     * <strong>example:</strong>
     * <p>Hive</p>
     */
    @NameInMap("dsType")
    public String dsType;

    /**
     * <p>The data source version number.</p>
     * 
     * <strong>example:</strong>
     * <p>3.2.0</p>
     */
    @NameInMap("dsVersion")
    public String dsVersion;

    /**
     * <p>The primary key ID that uniquely identifies a record.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>Specifies whether the configuration has been modified.</p>
     */
    @NameInMap("isModified")
    public Boolean isModified;

    public static ExecWorkflowConnectivityRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecWorkflowConnectivityRequest self = new ExecWorkflowConnectivityRequest();
        return TeaModel.build(map, self);
    }

    public ExecWorkflowConnectivityRequest setDsConfig(String dsConfig) {
        this.dsConfig = dsConfig;
        return this;
    }
    public String getDsConfig() {
        return this.dsConfig;
    }

    public ExecWorkflowConnectivityRequest setDsName(String dsName) {
        this.dsName = dsName;
        return this;
    }
    public String getDsName() {
        return this.dsName;
    }

    public ExecWorkflowConnectivityRequest setDsType(String dsType) {
        this.dsType = dsType;
        return this;
    }
    public String getDsType() {
        return this.dsType;
    }

    public ExecWorkflowConnectivityRequest setDsVersion(String dsVersion) {
        this.dsVersion = dsVersion;
        return this;
    }
    public String getDsVersion() {
        return this.dsVersion;
    }

    public ExecWorkflowConnectivityRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ExecWorkflowConnectivityRequest setIsModified(Boolean isModified) {
        this.isModified = isModified;
        return this;
    }
    public Boolean getIsModified() {
        return this.isModified;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyParametersRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the details of all AnalyticDB for PostgreSQL instances in a specific region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp***************</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Specifies whether to forcibly restart the instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceRestartInstance")
    public Boolean forceRestartInstance;

    /**
     * <p>The name and value of the parameter to be modified. Specify the parameter in the <code>&lt;Parameter name&gt;:&lt;Parameter value&gt;</code> format.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/208310.html">DescribeParameters</a> operation to query the parameters that can be modified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;statement_timeout&quot;:&quot;11800010&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    public static ModifyParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyParametersRequest self = new ModifyParametersRequest();
        return TeaModel.build(map, self);
    }

    public ModifyParametersRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyParametersRequest setForceRestartInstance(Boolean forceRestartInstance) {
        this.forceRestartInstance = forceRestartInstance;
        return this;
    }
    public Boolean getForceRestartInstance() {
        return this.forceRestartInstance;
    }

    public ModifyParametersRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

}

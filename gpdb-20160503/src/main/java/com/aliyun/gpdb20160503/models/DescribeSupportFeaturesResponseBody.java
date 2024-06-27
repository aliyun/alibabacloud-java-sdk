// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSupportFeaturesResponseBody extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp12ga6v69h86****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>63E5BE60-91FF-57F1-B873-7F1EB734B93D_2724</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The features supported by the instance. Valid values:</p>
     * <ul>
     * <li>sample_data: sample dataset. For more information, see <a href="https://help.aliyun.com/document_detail/452278.html">Sample dataset</a>.</li>
     * <li>diagnose_and_optimize: diagnostics and optimization. For more information, see <a href="https://help.aliyun.com/document_detail/323453.html">Diagnostics and optimization</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[ &quot;sample_data&quot;, &quot;diagnose_and_optimize&quot; ]</p>
     */
    @NameInMap("SupportFeatureList")
    public String supportFeatureList;

    public static DescribeSupportFeaturesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupportFeaturesResponseBody self = new DescribeSupportFeaturesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSupportFeaturesResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeSupportFeaturesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSupportFeaturesResponseBody setSupportFeatureList(String supportFeatureList) {
        this.supportFeatureList = supportFeatureList;
        return this;
    }
    public String getSupportFeatureList() {
        return this.supportFeatureList;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteChartNamespaceRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the chart namespace that you want to delete.</p>
     */
    @NameInMap("NamespaceName")
    public String namespaceName;

    public static DeleteChartNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteChartNamespaceRequest self = new DeleteChartNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteChartNamespaceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteChartNamespaceRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

}

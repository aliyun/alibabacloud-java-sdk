// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ImportEnvironmentNodesRequest extends TeaModel {
    @NameInMap("nodeListYaml")
    public String nodeListYaml;

    public static ImportEnvironmentNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportEnvironmentNodesRequest self = new ImportEnvironmentNodesRequest();
        return TeaModel.build(map, self);
    }

    public ImportEnvironmentNodesRequest setNodeListYaml(String nodeListYaml) {
        this.nodeListYaml = nodeListYaml;
        return this;
    }
    public String getNodeListYaml() {
        return this.nodeListYaml;
    }

}

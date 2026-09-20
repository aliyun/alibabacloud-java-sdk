// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class RestartInstanceRequest extends TeaModel {
    /**
     * <p>The ID of target instance. You can call <a href="https://help.aliyun.com/document_detail/144595.html">DescribeInstances</a> to obtain target instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-bp150tns0sjxs****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the component in the target instance. Valid values:</p>
     * <ul>
     * <li><strong>HBASE</strong></li>
     * <li><strong>HADOOP</strong></li>
     * <li><strong>PHOENIX</strong></li>
     * <li><strong>SOLR</strong></li>
     * <li><strong>THRIFT</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>THRIFT</p>
     */
    @NameInMap("Components")
    public String components;

    public static RestartInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartInstanceRequest self = new RestartInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RestartInstanceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public RestartInstanceRequest setComponents(String components) {
        this.components = components;
        return this;
    }
    public String getComponents() {
        return this.components;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CheckComponentsVersionRequest extends TeaModel {
    /**
     * <p>The cluster ID. You can call the <a href="https://help.aliyun.com/document_detail/144595.html">DescribeInstances</a> operation to obtain the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hb-t4naqsay5gn****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The component to check. Valid values:</p>
     * <ul>
     * <li><strong>HBASE</strong></li>
     * <li><strong>HADOOP</strong></li>
     * <li><strong>PHOENIX</strong></li>
     * <li><strong>SOLR</strong></li>
     * <li><strong>THRIFT</strong>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HBASE,HADOOP</p>
     */
    @NameInMap("Components")
    public String components;

    public static CheckComponentsVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckComponentsVersionRequest self = new CheckComponentsVersionRequest();
        return TeaModel.build(map, self);
    }

    public CheckComponentsVersionRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CheckComponentsVersionRequest setComponents(String components) {
        this.components = components;
        return this;
    }
    public String getComponents() {
        return this.components;
    }

}

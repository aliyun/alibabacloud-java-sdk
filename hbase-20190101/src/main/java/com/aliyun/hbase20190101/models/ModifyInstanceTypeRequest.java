// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyInstanceTypeRequest extends TeaModel {
    /**
     * <p>The ID of target instance. You can call <a href="https://help.aliyun.com/document_detail/144595.html">DescribeInstances</a> to obtain target instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hb-bp1x940uh********</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The new node specifications of the core node. You can invoke <a href="https://help.aliyun.com/document_detail/145796.html">DescribeInstanceType</a> to obtain the available node specifications.</p>
     * <blockquote>
     * <p>You must specify either the MasterInstanceType parameter or the CoreInstanceType parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hbase.sn1.8xlarge</p>
     */
    @NameInMap("CoreInstanceType")
    public String coreInstanceType;

    /**
     * <p>The new node specifications of the master node. You can invoke <a href="https://help.aliyun.com/document_detail/145796.html">DescribeInstanceType</a> to obtain the available node specifications.</p>
     * <blockquote>
     * <p>You must specify either the MasterInstanceType parameter or the CoreInstanceType parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hbase.sn1.large</p>
     */
    @NameInMap("MasterInstanceType")
    public String masterInstanceType;

    public static ModifyInstanceTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceTypeRequest self = new ModifyInstanceTypeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceTypeRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyInstanceTypeRequest setCoreInstanceType(String coreInstanceType) {
        this.coreInstanceType = coreInstanceType;
        return this;
    }
    public String getCoreInstanceType() {
        return this.coreInstanceType;
    }

    public ModifyInstanceTypeRequest setMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
        return this;
    }
    public String getMasterInstanceType() {
        return this.masterInstanceType;
    }

}

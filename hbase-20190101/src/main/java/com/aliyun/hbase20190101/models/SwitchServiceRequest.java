// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class SwitchServiceRequest extends TeaModel {
    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-uf6r2hn2zrxxxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <ul>
     * <li>open: Enable  </li>
     * <li>close: Shutdown</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>open</p>
     */
    @NameInMap("Operate")
    public String operate;

    /**
     * <p>Service name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HBaseProxy</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    public static SwitchServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchServiceRequest self = new SwitchServiceRequest();
        return TeaModel.build(map, self);
    }

    public SwitchServiceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SwitchServiceRequest setOperate(String operate) {
        this.operate = operate;
        return this;
    }
    public String getOperate() {
        return this.operate;
    }

    public SwitchServiceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchBindProductsIntoProjectRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKeys")
    public java.util.List<String> productKeys;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a123********</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    public static BatchBindProductsIntoProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchBindProductsIntoProjectRequest self = new BatchBindProductsIntoProjectRequest();
        return TeaModel.build(map, self);
    }

    public BatchBindProductsIntoProjectRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BatchBindProductsIntoProjectRequest setProductKeys(java.util.List<String> productKeys) {
        this.productKeys = productKeys;
        return this;
    }
    public java.util.List<String> getProductKeys() {
        return this.productKeys;
    }

    public BatchBindProductsIntoProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}

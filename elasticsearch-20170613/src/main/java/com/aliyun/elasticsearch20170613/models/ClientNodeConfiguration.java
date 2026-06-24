// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ClientNodeConfiguration extends TeaModel {
    /**
     * <p>The number of client nodes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("amount")
    public Long amount;

    /**
     * <p>The storage size of the client node. Unit: GB.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("disk")
    public Long disk;

    /**
     * <p>The storage type of the client node. Only cloud_efficiency (ultra cloud disk) is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("diskType")
    public String diskType;

    /**
     * <p>The node specifications of the client node. For more information, see <a href="https://help.aliyun.com/document_detail/271718.html">Specifications</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>elasticsearch.sn2ne.large</p>
     */
    @NameInMap("spec")
    public String spec;

    public static ClientNodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
        ClientNodeConfiguration self = new ClientNodeConfiguration();
        return TeaModel.build(map, self);
    }

    public ClientNodeConfiguration setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public ClientNodeConfiguration setDisk(Long disk) {
        this.disk = disk;
        return this;
    }
    public Long getDisk() {
        return this.disk;
    }

    public ClientNodeConfiguration setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public ClientNodeConfiguration setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}

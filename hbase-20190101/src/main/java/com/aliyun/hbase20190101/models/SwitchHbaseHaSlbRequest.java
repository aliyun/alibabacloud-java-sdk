// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class SwitchHbaseHaSlbRequest extends TeaModel {
    /**
     * <p>The ID of the BDS cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bds-t4n3496whj23ia4k</p>
     */
    @NameInMap("BdsId")
    public String bdsId;

    /**
     * <p>The high-availability ID in BDS high-availability management.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ha-v21tmnxjwh2yuy1il</p>
     */
    @NameInMap("HaId")
    public String haId;

    /**
     * <p>The high-availability type. Valid values:</p>
     * <ol>
     * <li>thrift</li>
     * <li>phoenix.</li>
     * </ol>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>thrift</p>
     */
    @NameInMap("HaTypes")
    public String haTypes;

    /**
     * <p>Specifies whether to switch to the primary or secondary instance. Valid values:</p>
     * <ol>
     * <li>Active: Switch to the primary instance.</li>
     * <li>Standby: Switch to the secondary instance.</li>
     * </ol>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("HbaseType")
    public String hbaseType;

    public static SwitchHbaseHaSlbRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchHbaseHaSlbRequest self = new SwitchHbaseHaSlbRequest();
        return TeaModel.build(map, self);
    }

    public SwitchHbaseHaSlbRequest setBdsId(String bdsId) {
        this.bdsId = bdsId;
        return this;
    }
    public String getBdsId() {
        return this.bdsId;
    }

    public SwitchHbaseHaSlbRequest setHaId(String haId) {
        this.haId = haId;
        return this;
    }
    public String getHaId() {
        return this.haId;
    }

    public SwitchHbaseHaSlbRequest setHaTypes(String haTypes) {
        this.haTypes = haTypes;
        return this;
    }
    public String getHaTypes() {
        return this.haTypes;
    }

    public SwitchHbaseHaSlbRequest setHbaseType(String hbaseType) {
        this.hbaseType = hbaseType;
        return this;
    }
    public String getHbaseType() {
        return this.hbaseType;
    }

}

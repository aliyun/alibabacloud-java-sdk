// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CreateHbaseHaSlbRequest extends TeaModel {
    /**
     * <p>The ID of the BDS cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bds-t4n3496whj23****</p>
     */
    @NameInMap("BdsId")
    public String bdsId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The value cannot exceed 64 printable ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The high-availability ID in the BDS active-active management.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ha-v21tmnxjwh2yu****</p>
     */
    @NameInMap("HaId")
    public String haId;

    /**
     * <p>The high-availability type. Valid values:</p>
     * <ul>
     * <li>thrift</li>
     * <li>phoenix.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>thrift</p>
     */
    @NameInMap("HaTypes")
    public String haTypes;

    /**
     * <p>Specifies whether the high-availability type is on the primary or secondary instance. Valid values:</p>
     * <ul>
     * <li>Active: The high-availability type is on the primary instance.</li>
     * <li>Standby: The high-availability type is on the secondary instance.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("HbaseType")
    public String hbaseType;

    public static CreateHbaseHaSlbRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHbaseHaSlbRequest self = new CreateHbaseHaSlbRequest();
        return TeaModel.build(map, self);
    }

    public CreateHbaseHaSlbRequest setBdsId(String bdsId) {
        this.bdsId = bdsId;
        return this;
    }
    public String getBdsId() {
        return this.bdsId;
    }

    public CreateHbaseHaSlbRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateHbaseHaSlbRequest setHaId(String haId) {
        this.haId = haId;
        return this;
    }
    public String getHaId() {
        return this.haId;
    }

    public CreateHbaseHaSlbRequest setHaTypes(String haTypes) {
        this.haTypes = haTypes;
        return this;
    }
    public String getHaTypes() {
        return this.haTypes;
    }

    public CreateHbaseHaSlbRequest setHbaseType(String hbaseType) {
        this.hbaseType = hbaseType;
        return this;
    }
    public String getHbaseType() {
        return this.hbaseType;
    }

}

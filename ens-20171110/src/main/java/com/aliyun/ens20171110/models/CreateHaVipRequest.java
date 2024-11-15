// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateHaVipRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>120.24.243.91</p>
     */
    @NameInMap("IpAddress")
    public String ipAddress;

    /**
     * <strong>example:</strong>
     * <p>yourName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>vsw-5****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateHaVipRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHaVipRequest self = new CreateHaVipRequest();
        return TeaModel.build(map, self);
    }

    public CreateHaVipRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public CreateHaVipRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateHaVipRequest setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public CreateHaVipRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateHaVipRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}

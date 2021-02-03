// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateGtmAddressPoolRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("AddrPoolId")
    @Validation(required = true)
    public String addrPoolId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    @NameInMap("MinAvailableAddrNum")
    public Integer minAvailableAddrNum;

    @NameInMap("Addr")
    @Validation(required = true)
    public java.util.List<UpdateGtmAddressPoolRequestAddr> addr;

    public static UpdateGtmAddressPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGtmAddressPoolRequest self = new UpdateGtmAddressPoolRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGtmAddressPoolRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateGtmAddressPoolRequest setAddrPoolId(String addrPoolId) {
        this.addrPoolId = addrPoolId;
        return this;
    }
    public String getAddrPoolId() {
        return this.addrPoolId;
    }

    public UpdateGtmAddressPoolRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateGtmAddressPoolRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdateGtmAddressPoolRequest setMinAvailableAddrNum(Integer minAvailableAddrNum) {
        this.minAvailableAddrNum = minAvailableAddrNum;
        return this;
    }
    public Integer getMinAvailableAddrNum() {
        return this.minAvailableAddrNum;
    }

    public UpdateGtmAddressPoolRequest setAddr(java.util.List<UpdateGtmAddressPoolRequestAddr> addr) {
        this.addr = addr;
        return this;
    }
    public java.util.List<UpdateGtmAddressPoolRequestAddr> getAddr() {
        return this.addr;
    }

    public static class UpdateGtmAddressPoolRequestAddr extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("LbaWeight")
        public Integer lbaWeight;

        @NameInMap("Mode")
        public String mode;

        public static UpdateGtmAddressPoolRequestAddr build(java.util.Map<String, ?> map) throws Exception {
            UpdateGtmAddressPoolRequestAddr self = new UpdateGtmAddressPoolRequestAddr();
            return TeaModel.build(map, self);
        }

        public UpdateGtmAddressPoolRequestAddr setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public UpdateGtmAddressPoolRequestAddr setLbaWeight(Integer lbaWeight) {
            this.lbaWeight = lbaWeight;
            return this;
        }
        public Integer getLbaWeight() {
            return this.lbaWeight;
        }

        public UpdateGtmAddressPoolRequestAddr setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

}

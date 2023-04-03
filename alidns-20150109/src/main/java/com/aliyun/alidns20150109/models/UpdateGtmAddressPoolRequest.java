// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateGtmAddressPoolRequest extends TeaModel {
    @NameInMap("Addr")
    public java.util.List<UpdateGtmAddressPoolRequestAddr> addr;

    /**
     * <p>The ID of the address pool that you want to modify.</p>
     */
    @NameInMap("AddrPoolId")
    public String addrPoolId;

    /**
     * <p>The language used by the user.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The minimum number of available addresses in the address pool.</p>
     */
    @NameInMap("MinAvailableAddrNum")
    public Integer minAvailableAddrNum;

    /**
     * <p>The name of the address pool that you want to modify.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The type of the address pool that you want to modify.</p>
     */
    @NameInMap("Type")
    public String type;

    public static UpdateGtmAddressPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGtmAddressPoolRequest self = new UpdateGtmAddressPoolRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGtmAddressPoolRequest setAddr(java.util.List<UpdateGtmAddressPoolRequestAddr> addr) {
        this.addr = addr;
        return this;
    }
    public java.util.List<UpdateGtmAddressPoolRequestAddr> getAddr() {
        return this.addr;
    }

    public UpdateGtmAddressPoolRequest setAddrPoolId(String addrPoolId) {
        this.addrPoolId = addrPoolId;
        return this;
    }
    public String getAddrPoolId() {
        return this.addrPoolId;
    }

    public UpdateGtmAddressPoolRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateGtmAddressPoolRequest setMinAvailableAddrNum(Integer minAvailableAddrNum) {
        this.minAvailableAddrNum = minAvailableAddrNum;
        return this;
    }
    public Integer getMinAvailableAddrNum() {
        return this.minAvailableAddrNum;
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

    public static class UpdateGtmAddressPoolRequestAddr extends TeaModel {
        /**
         * <p>The weight of the address pool that you want to modify.</p>
         */
        @NameInMap("LbaWeight")
        public Integer lbaWeight;

        /**
         * <p>The mode of the address pool that you want to modify.</p>
         * <br>
         * <p>*   **SMART**: Intelligent return</p>
         * <p>*   **ONLINE**: Always online</p>
         * <p>*   **OFFLINE**: Always offline</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The addresses in the address pool.</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateGtmAddressPoolRequestAddr build(java.util.Map<String, ?> map) throws Exception {
            UpdateGtmAddressPoolRequestAddr self = new UpdateGtmAddressPoolRequestAddr();
            return TeaModel.build(map, self);
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

        public UpdateGtmAddressPoolRequestAddr setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

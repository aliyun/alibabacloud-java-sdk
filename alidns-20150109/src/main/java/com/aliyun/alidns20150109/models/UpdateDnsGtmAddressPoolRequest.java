// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsGtmAddressPoolRequest extends TeaModel {
    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("AddrPoolId")
    public String addrPoolId;

    @NameInMap("Name")
    public String name;

    @NameInMap("LbaStrategy")
    public String lbaStrategy;

    @NameInMap("Addr")
    public java.util.List<UpdateDnsGtmAddressPoolRequestAddr> addr;

    public static UpdateDnsGtmAddressPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDnsGtmAddressPoolRequest self = new UpdateDnsGtmAddressPoolRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDnsGtmAddressPoolRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public UpdateDnsGtmAddressPoolRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDnsGtmAddressPoolRequest setAddrPoolId(String addrPoolId) {
        this.addrPoolId = addrPoolId;
        return this;
    }
    public String getAddrPoolId() {
        return this.addrPoolId;
    }

    public UpdateDnsGtmAddressPoolRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDnsGtmAddressPoolRequest setLbaStrategy(String lbaStrategy) {
        this.lbaStrategy = lbaStrategy;
        return this;
    }
    public String getLbaStrategy() {
        return this.lbaStrategy;
    }

    public UpdateDnsGtmAddressPoolRequest setAddr(java.util.List<UpdateDnsGtmAddressPoolRequestAddr> addr) {
        this.addr = addr;
        return this;
    }
    public java.util.List<UpdateDnsGtmAddressPoolRequestAddr> getAddr() {
        return this.addr;
    }

    public static class UpdateDnsGtmAddressPoolRequestAddr extends TeaModel {
        @NameInMap("AttributeInfo")
        public String attributeInfo;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("LbaWeight")
        public Integer lbaWeight;

        @NameInMap("Addr")
        public String addr;

        @NameInMap("Mode")
        public String mode;

        public static UpdateDnsGtmAddressPoolRequestAddr build(java.util.Map<String, ?> map) throws Exception {
            UpdateDnsGtmAddressPoolRequestAddr self = new UpdateDnsGtmAddressPoolRequestAddr();
            return TeaModel.build(map, self);
        }

        public UpdateDnsGtmAddressPoolRequestAddr setAttributeInfo(String attributeInfo) {
            this.attributeInfo = attributeInfo;
            return this;
        }
        public String getAttributeInfo() {
            return this.attributeInfo;
        }

        public UpdateDnsGtmAddressPoolRequestAddr setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public UpdateDnsGtmAddressPoolRequestAddr setLbaWeight(Integer lbaWeight) {
            this.lbaWeight = lbaWeight;
            return this;
        }
        public Integer getLbaWeight() {
            return this.lbaWeight;
        }

        public UpdateDnsGtmAddressPoolRequestAddr setAddr(String addr) {
            this.addr = addr;
            return this;
        }
        public String getAddr() {
            return this.addr;
        }

        public UpdateDnsGtmAddressPoolRequestAddr setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsGtmAddressPoolRequest extends TeaModel {
    /**
     * <p>The address pools.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Addr")
    public java.util.List<UpdateDnsGtmAddressPoolRequestAddr> addr;

    /**
     * <p>The ID of the address pool.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AddrPoolId")
    public String addrPoolId;

    /**
     * <p>The language of the values of specific response parameters. Default value: en. Valid values: en, zh, and ja.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The load balancing policy of the address pool. Valid values:</p>
     * <br>
     * <p>*   ALL_RR: returns all addresses.</p>
     * <p>*   RATIO: returns addresses by weight.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LbaStrategy")
    public String lbaStrategy;

    /**
     * <p>The name of the address pool.</p>
     */
    @NameInMap("Name")
    public String name;

    public static UpdateDnsGtmAddressPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDnsGtmAddressPoolRequest self = new UpdateDnsGtmAddressPoolRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDnsGtmAddressPoolRequest setAddr(java.util.List<UpdateDnsGtmAddressPoolRequestAddr> addr) {
        this.addr = addr;
        return this;
    }
    public java.util.List<UpdateDnsGtmAddressPoolRequestAddr> getAddr() {
        return this.addr;
    }

    public UpdateDnsGtmAddressPoolRequest setAddrPoolId(String addrPoolId) {
        this.addrPoolId = addrPoolId;
        return this;
    }
    public String getAddrPoolId() {
        return this.addrPoolId;
    }

    public UpdateDnsGtmAddressPoolRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDnsGtmAddressPoolRequest setLbaStrategy(String lbaStrategy) {
        this.lbaStrategy = lbaStrategy;
        return this;
    }
    public String getLbaStrategy() {
        return this.lbaStrategy;
    }

    public UpdateDnsGtmAddressPoolRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public static class UpdateDnsGtmAddressPoolRequestAddr extends TeaModel {
        /**
         * <p>The address in the address pool.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Addr")
        public String addr;

        /**
         * <p>The source region of the address, in JSON-formatted string.</p>
         * <br>
         * <p>*   LineCode: the line code of the source region of the address. The LineCode field is deprecated, and the lineCodes field is used as a substitute.</p>
         * <br>
         * <p>*   LineCodes: the line code list of the source regions of addresses.</p>
         * <br>
         * <p>*   lineCodeRectifyType: the rectification type of the line codes. Default value: AUTO. Valid values:</p>
         * <br>
         * <p>    *   NO_NEED: no need for rectification.</p>
         * <p>    *   RECTIFIED: rectified.</p>
         * <p>    *   AUTO: automatic rectification.</p>
         */
        @NameInMap("AttributeInfo")
        public String attributeInfo;

        /**
         * <p>The weight of the address.</p>
         */
        @NameInMap("LbaWeight")
        public Integer lbaWeight;

        /**
         * <p>The response mode: Valid values:</p>
         * <br>
         * <p>*   SMART: smart return.</p>
         * <p>*   ONLINE: always online.</p>
         * <p>*   OFFLINE: always offline.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The additional information about the address.</p>
         */
        @NameInMap("Remark")
        public String remark;

        public static UpdateDnsGtmAddressPoolRequestAddr build(java.util.Map<String, ?> map) throws Exception {
            UpdateDnsGtmAddressPoolRequestAddr self = new UpdateDnsGtmAddressPoolRequestAddr();
            return TeaModel.build(map, self);
        }

        public UpdateDnsGtmAddressPoolRequestAddr setAddr(String addr) {
            this.addr = addr;
            return this;
        }
        public String getAddr() {
            return this.addr;
        }

        public UpdateDnsGtmAddressPoolRequestAddr setAttributeInfo(String attributeInfo) {
            this.attributeInfo = attributeInfo;
            return this;
        }
        public String getAttributeInfo() {
            return this.attributeInfo;
        }

        public UpdateDnsGtmAddressPoolRequestAddr setLbaWeight(Integer lbaWeight) {
            this.lbaWeight = lbaWeight;
            return this;
        }
        public Integer getLbaWeight() {
            return this.lbaWeight;
        }

        public UpdateDnsGtmAddressPoolRequestAddr setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public UpdateDnsGtmAddressPoolRequestAddr setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

}

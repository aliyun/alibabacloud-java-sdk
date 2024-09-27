// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsGtmAddressPoolRequest extends TeaModel {
    /**
     * <p>The address pools.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Addr")
    public java.util.List<UpdateDnsGtmAddressPoolRequestAddr> addr;

    /**
     * <p>The ID of the address pool.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testpool1</p>
     */
    @NameInMap("AddrPoolId")
    public String addrPoolId;

    /**
     * <p>The language of the values of specific response parameters. Default value: en. Valid values: en, zh, and ja.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The load balancing policy of the address pool. Valid values:</p>
     * <ul>
     * <li>ALL_RR: returns all addresses.</li>
     * <li>RATIO: returns addresses by weight.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>all_rr</p>
     */
    @NameInMap("LbaStrategy")
    public String lbaStrategy;

    /**
     * <p>The name of the address pool.</p>
     * 
     * <strong>example:</strong>
     * <p>testpoolname</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("Addr")
        public String addr;

        /**
         * <p>The information about the source region of the address. The value of the parameter is a string in the JSON format. Valid values:</p>
         * <ul>
         * <li><p>LineCode: the line code of the source region. This parameter is deprecated. Use lineCodes instead.</p>
         * </li>
         * <li><p>lineCodes: the line codes of the source region</p>
         * </li>
         * <li><p>lineCodeRectifyType: the rectification type of the line code. Default value: AUTO. Valid values:</p>
         * <ul>
         * <li>NO_NEED: no need for rectification</li>
         * <li>RECTIFIED: rectified</li>
         * <li>AUTO: automatic rectification</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Linecode:default,lineCodes:[&quot;default&quot;],lineCodeRectifyType:&quot;NO_NEED&quot;</p>
         */
        @NameInMap("AttributeInfo")
        public String attributeInfo;

        /**
         * <p>The weight of the address.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LbaWeight")
        public Integer lbaWeight;

        /**
         * <p>The return mode of the addresses. Valid values:</p>
         * <ul>
         * <li>SMART: smart return</li>
         * <li>ONLINE: always online</li>
         * <li>OFFLINE: always offline</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The description of the address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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

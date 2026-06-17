// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyUserIPSWhitelistRequest extends TeaModel {
    /**
     * <p>The traffic direction for the Internet Border.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Direction")
    public Long direction;

    /**
     * <p>The IP version.</p>
     * 
     * <strong>example:</strong>
     * <p>ipv4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The type of address in the Internet Border whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ListType")
    public Long listType;

    /**
     * <p>The value of the Internet Border whitelist.</p>
     * <ul>
     * <li><p>If ListType is set to <code>Custom</code>: the name of the address book.</p>
     * </li>
     * <li><p>If ListType is set to <code>Address book</code>: the IPv4 address.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>115.236.36.114/32</p>
     */
    @NameInMap("ListValue")
    public String listValue;

    /**
     * <p>The source IP address of the visitor.</p>
     * 
     * <strong>example:</strong>
     * <p>47.100.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of source or destination for which the Internet Border whitelist takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("WhiteType")
    public Long whiteType;

    public static ModifyUserIPSWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserIPSWhitelistRequest self = new ModifyUserIPSWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUserIPSWhitelistRequest setDirection(Long direction) {
        this.direction = direction;
        return this;
    }
    public Long getDirection() {
        return this.direction;
    }

    public ModifyUserIPSWhitelistRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public ModifyUserIPSWhitelistRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyUserIPSWhitelistRequest setListType(Long listType) {
        this.listType = listType;
        return this;
    }
    public Long getListType() {
        return this.listType;
    }

    public ModifyUserIPSWhitelistRequest setListValue(String listValue) {
        this.listValue = listValue;
        return this;
    }
    public String getListValue() {
        return this.listValue;
    }

    public ModifyUserIPSWhitelistRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyUserIPSWhitelistRequest setWhiteType(Long whiteType) {
        this.whiteType = whiteType;
        return this;
    }
    public Long getWhiteType() {
        return this.whiteType;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeleteWhitelistSettingRequest extends TeaModel {
    /**
     * <p>List of rule IDs to be deleted.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[6222001]</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <p>Specify the language of the user information to be deleted. Values: -<strong>zh</strong>: Chinese. -<strong>en</strong>: English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>ServiceCode for the real-person cloud product, only takes the value: <strong>antcloudauth</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>antcloudauth</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <p>Set the source IP address of the visitor. Supports IP addresses in CIDR and IPv4 formats. Example: 10.0.3.0/24.</p>
     * 
     * <strong>example:</strong>
     * <p>120.25.41.25</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DeleteWhitelistSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWhitelistSettingRequest self = new DeleteWhitelistSettingRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWhitelistSettingRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public DeleteWhitelistSettingRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteWhitelistSettingRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public DeleteWhitelistSettingRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}

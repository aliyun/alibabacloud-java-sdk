// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeleteWhitelistSettingRequest extends TeaModel {
    /**
     * <p>The list of rule IDs to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[6222001]</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <p>The language of the user information to delete. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The service code of the ID Verification product. Set the value to <strong>antcloudauth</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>antcloudauth</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <p>The source IP address of the visitor. CIDR format and IPv4 format are supported. Example: 10.0.3.0/24.</p>
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

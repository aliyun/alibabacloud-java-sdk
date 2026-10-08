// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchDomainRemarkRequest extends TeaModel {
    /**
     * <p>List of instance IDs. We recommend grouping them in sets of <strong>10</strong>, with a maximum of <strong>50</strong> per group, separated by commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>S12344567</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>Language of the error message returned by the API. Valid values:  </p>
     * <ul>
     * <li><strong>zh</strong>: Chinese;  </li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Default value: <strong>en</strong>. This parameter is Required.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Remark information.</p>
     * 
     * <strong>example:</strong>
     * <p>MyRemarkInfo</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>User IP address, which can be set to <strong>127.0.0.1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveBatchDomainRemarkRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchDomainRemarkRequest self = new SaveBatchDomainRemarkRequest();
        return TeaModel.build(map, self);
    }

    public SaveBatchDomainRemarkRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public SaveBatchDomainRemarkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveBatchDomainRemarkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public SaveBatchDomainRemarkRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListAccountsByLogRequest extends TeaModel {
    /**
     * <p>The code that is used for multi-cloud environments.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hcloud</p>
     */
    @NameInMap("CloudCode")
    public String cloudCode;

    /**
     * <p>The codes of logs. The value is a JSON array.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;cloud_siem_hcloud_waf_alert_log&quot;]</p>
     */
    @NameInMap("LogCodes")
    public java.util.List<String> logCodes;

    /**
     * <p>The code of the service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qcloud_waf</p>
     */
    @NameInMap("ProdCode")
    public String prodCode;

    /**
     * <p>The data management center of the threat analysis feature. Specify this parameter based on the region where your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in regions inside China.</li>
     * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the account that you switch from the management account.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The type of the view. Valid values:</p>
     * <ul>
     * <li>0: the current Alibaba Cloud account</li>
     * <li>1: the global account</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    public static ListAccountsByLogRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccountsByLogRequest self = new ListAccountsByLogRequest();
        return TeaModel.build(map, self);
    }

    public ListAccountsByLogRequest setCloudCode(String cloudCode) {
        this.cloudCode = cloudCode;
        return this;
    }
    public String getCloudCode() {
        return this.cloudCode;
    }

    public ListAccountsByLogRequest setLogCodes(java.util.List<String> logCodes) {
        this.logCodes = logCodes;
        return this;
    }
    public java.util.List<String> getLogCodes() {
        return this.logCodes;
    }

    public ListAccountsByLogRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public ListAccountsByLogRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListAccountsByLogRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public ListAccountsByLogRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

}

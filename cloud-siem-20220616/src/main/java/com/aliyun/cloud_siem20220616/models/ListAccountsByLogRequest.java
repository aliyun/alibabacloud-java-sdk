// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListAccountsByLogRequest extends TeaModel {
    /**
     * <p>The code that is used for multi-cloud environments.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   qcloud</p>
     * <p>*   hcloud</p>
     * <p>*   aliyun</p>
     */
    @NameInMap("CloudCode")
    public String cloudCode;

    /**
     * <p>The codes of logs. The value is a JSON array.</p>
     */
    @NameInMap("LogCodes")
    public java.util.List<String> logCodes;

    /**
     * <p>The code of the service.</p>
     */
    @NameInMap("ProdCode")
    public String prodCode;

    /**
     * <p>The data management center of the threat analysis feature. Specify this parameter based on the region where your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions inside China.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside China.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleFor")
    public Long roleFor;

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

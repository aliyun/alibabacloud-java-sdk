// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListImportedLogsByProdRequest extends TeaModel {
    /**
     * <p>The code of the cloud service provider. Valid values:</p>
     * <br>
     * <p>*   qcloud: Tencent Cloud</p>
     * <p>*   aliyun: Alibaba Cloud</p>
     * <p>*   hcloud: Huawei Cloud</p>
     */
    @NameInMap("CloudCode")
    public String cloudCode;

    /**
     * <p>The code of the cloud service.</p>
     */
    @NameInMap("ProdCode")
    public String prodCode;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions in China.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside China.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleFor")
    public Long roleFor;

    @NameInMap("RoleType")
    public Integer roleType;

    public static ListImportedLogsByProdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImportedLogsByProdRequest self = new ListImportedLogsByProdRequest();
        return TeaModel.build(map, self);
    }

    public ListImportedLogsByProdRequest setCloudCode(String cloudCode) {
        this.cloudCode = cloudCode;
        return this;
    }
    public String getCloudCode() {
        return this.cloudCode;
    }

    public ListImportedLogsByProdRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public ListImportedLogsByProdRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListImportedLogsByProdRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public ListImportedLogsByProdRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

}

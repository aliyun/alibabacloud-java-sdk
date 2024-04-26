// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListUserProdLogsRequest extends TeaModel {
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

    /**
     * <p>The log code.</p>
     */
    @NameInMap("SourceLogCode")
    public String sourceLogCode;

    /**
     * <p>The code of the cloud service.</p>
     */
    @NameInMap("SourceProdCode")
    public String sourceProdCode;

    public static ListUserProdLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserProdLogsRequest self = new ListUserProdLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserProdLogsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListUserProdLogsRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public ListUserProdLogsRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

    public ListUserProdLogsRequest setSourceLogCode(String sourceLogCode) {
        this.sourceLogCode = sourceLogCode;
        return this;
    }
    public String getSourceLogCode() {
        return this.sourceLogCode;
    }

    public ListUserProdLogsRequest setSourceProdCode(String sourceProdCode) {
        this.sourceProdCode = sourceProdCode;
        return this;
    }
    public String getSourceProdCode() {
        return this.sourceProdCode;
    }

}

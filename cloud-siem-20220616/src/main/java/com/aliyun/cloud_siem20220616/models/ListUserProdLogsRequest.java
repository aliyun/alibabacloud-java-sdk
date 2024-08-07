// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListUserProdLogsRequest extends TeaModel {
    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in regions in China.</li>
     * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>管理员切换成其他成员视角的用户ID。</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>视图类型。</p>
     * <ul>
     * <li>0：当前阿里云账号视图。</li>
     * <li>1：企业下所有账号的视图。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The log code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_siem_aegis_proc</p>
     */
    @NameInMap("SourceLogCode")
    public String sourceLogCode;

    /**
     * <p>The code of the cloud service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
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

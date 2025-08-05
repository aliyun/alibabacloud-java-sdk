// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetAssetInstanceStatisticsRequest extends TeaModel {
    @NameInMap("CategoryUuid")
    public String categoryUuid;

    @NameInMap("ObjectDefineUuidList")
    public java.util.List<String> objectDefineUuidList;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetAssetInstanceStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAssetInstanceStatisticsRequest self = new GetAssetInstanceStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetAssetInstanceStatisticsRequest setCategoryUuid(String categoryUuid) {
        this.categoryUuid = categoryUuid;
        return this;
    }
    public String getCategoryUuid() {
        return this.categoryUuid;
    }

    public GetAssetInstanceStatisticsRequest setObjectDefineUuidList(java.util.List<String> objectDefineUuidList) {
        this.objectDefineUuidList = objectDefineUuidList;
        return this;
    }
    public java.util.List<String> getObjectDefineUuidList() {
        return this.objectDefineUuidList;
    }

    public GetAssetInstanceStatisticsRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetAssetInstanceStatisticsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetAssetInstanceStatisticsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

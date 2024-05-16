// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDIProjectConfigRequest extends TeaModel {
    /**
     * <p>The type of the destination data source of the sync solution. This parameter cannot be left empty.</p>
     * <br>
     * <p>Valid values: analyticdb_for_mysql, odps, elasticsearch, holo, mysql, and polardb. You can call the ListDIProjectConfig operation to query the supported types of destination data sources.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to obtain the workspace ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The type of the source data source of the sync solution.</p>
     * <br>
     * <p>Valid values: oracle, mysql, polardb, datahub, drds, and analyticdb_for_mysql. You can call the ListDIProjectConfig operation to query the supported types of source data sources.</p>
     * <br>
     * <p>If you do not set this parameter, DataWorks applies the default global configuration to all the source data sources of the preceding types.</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static ListDIProjectConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDIProjectConfigRequest self = new ListDIProjectConfigRequest();
        return TeaModel.build(map, self);
    }

    public ListDIProjectConfigRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public ListDIProjectConfigRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListDIProjectConfigRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}

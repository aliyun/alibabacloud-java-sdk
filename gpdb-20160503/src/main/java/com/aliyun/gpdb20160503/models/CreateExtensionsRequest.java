// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateExtensionsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBNames")
    public String DBNames;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Extensions")
    public String extensions;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateExtensionsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExtensionsRequest self = new CreateExtensionsRequest();
        return TeaModel.build(map, self);
    }

    public CreateExtensionsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateExtensionsRequest setDBNames(String DBNames) {
        this.DBNames = DBNames;
        return this;
    }
    public String getDBNames() {
        return this.DBNames;
    }

    public CreateExtensionsRequest setExtensions(String extensions) {
        this.extensions = extensions;
        return this;
    }
    public String getExtensions() {
        return this.extensions;
    }

    public CreateExtensionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

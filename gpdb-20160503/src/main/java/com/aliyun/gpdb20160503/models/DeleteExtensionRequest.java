// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteExtensionRequest extends TeaModel {
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
    @NameInMap("Extension")
    public String extension;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteExtensionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteExtensionRequest self = new DeleteExtensionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteExtensionRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DeleteExtensionRequest setDBNames(String DBNames) {
        this.DBNames = DBNames;
        return this;
    }
    public String getDBNames() {
        return this.DBNames;
    }

    public DeleteExtensionRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public DeleteExtensionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

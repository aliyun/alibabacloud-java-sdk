// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateMmsTableRequest extends TeaModel {
    /**
     * <p>The name of the destination MaxCompute table. If you do not specify this parameter, the source table name is used.</p>
     * 
     * <strong>example:</strong>
     * <p>dst_table_name</p>
     */
    @NameInMap("dstName")
    public String dstName;

    /**
     * <p>The name of the destination MaxCompute project.</p>
     * 
     * <strong>example:</strong>
     * <p>dst_project_name</p>
     */
    @NameInMap("dstProjectName")
    public String dstProjectName;

    /**
     * <p>The schema of the destination MaxCompute project.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("dstSchemaName")
    public String dstSchemaName;

    /**
     * <p>The migration status.</p>
     * 
     * <strong>example:</strong>
     * <p>INIT</p>
     */
    @NameInMap("status")
    public String status;

    public static UpdateMmsTableRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmsTableRequest self = new UpdateMmsTableRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMmsTableRequest setDstName(String dstName) {
        this.dstName = dstName;
        return this;
    }
    public String getDstName() {
        return this.dstName;
    }

    public UpdateMmsTableRequest setDstProjectName(String dstProjectName) {
        this.dstProjectName = dstProjectName;
        return this;
    }
    public String getDstProjectName() {
        return this.dstProjectName;
    }

    public UpdateMmsTableRequest setDstSchemaName(String dstSchemaName) {
        this.dstSchemaName = dstSchemaName;
        return this;
    }
    public String getDstSchemaName() {
        return this.dstSchemaName;
    }

    public UpdateMmsTableRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}

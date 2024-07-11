// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateLakeHouseSpaceRequest extends TeaModel {
    /**
     * <p>The description of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the development database. You can call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> or <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2435****</p>
     */
    @NameInMap("DevDbId")
    public String devDbId;

    /**
     * <p>The type of the database. Valid values:</p>
     * <ul>
     * <li><strong>14</strong>: AnalyticDB for MySQL</li>
     * <li><strong>18</strong>: AnalyticDB for PostgreSQL</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>14</p>
     */
    @NameInMap("DwDbType")
    public String dwDbType;

    /**
     * <p>The mode in which the workspace runs. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: basic mode. This mode is unavailable.</li>
     * <li><strong>1</strong>: standard mode.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The ID of the production database. You can call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> or <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2442****</p>
     */
    @NameInMap("ProdDbId")
    public String prodDbId;

    /**
     * <p>The configuration of the workspace. Valid values:</p>
     * <ul>
     * <li><strong>skipManualRunCheck</strong>: No security rule check is required in the trial run phase.</li>
     * <li><strong>skipPublishApprove</strong>: No approval is required for publishing and O\&amp;M.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;skipManualRunCheck\&quot;:true,\&quot;skipPublishApprove\&quot;:true}</p>
     */
    @NameInMap("SpaceConfig")
    public String spaceConfig;

    /**
     * <p>The name of the workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_space</p>
     */
    @NameInMap("SpaceName")
    public String spaceName;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to obtain the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static CreateLakeHouseSpaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLakeHouseSpaceRequest self = new CreateLakeHouseSpaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateLakeHouseSpaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLakeHouseSpaceRequest setDevDbId(String devDbId) {
        this.devDbId = devDbId;
        return this;
    }
    public String getDevDbId() {
        return this.devDbId;
    }

    public CreateLakeHouseSpaceRequest setDwDbType(String dwDbType) {
        this.dwDbType = dwDbType;
        return this;
    }
    public String getDwDbType() {
        return this.dwDbType;
    }

    public CreateLakeHouseSpaceRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public CreateLakeHouseSpaceRequest setProdDbId(String prodDbId) {
        this.prodDbId = prodDbId;
        return this;
    }
    public String getProdDbId() {
        return this.prodDbId;
    }

    public CreateLakeHouseSpaceRequest setSpaceConfig(String spaceConfig) {
        this.spaceConfig = spaceConfig;
        return this;
    }
    public String getSpaceConfig() {
        return this.spaceConfig;
    }

    public CreateLakeHouseSpaceRequest setSpaceName(String spaceName) {
        this.spaceName = spaceName;
        return this;
    }
    public String getSpaceName() {
        return this.spaceName;
    }

    public CreateLakeHouseSpaceRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}

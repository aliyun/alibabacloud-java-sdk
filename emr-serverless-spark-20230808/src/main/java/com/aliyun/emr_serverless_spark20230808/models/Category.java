// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class Category extends TeaModel {
    /**
     * <p>The folder ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>w-d8********</p>
     */
    @NameInMap("bizId")
    public String bizId;

    /**
     * <p>The ID of the user who creates the folder.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>150978934701****</p>
     */
    @NameInMap("creator")
    public Long creator;

    /**
     * <p>The time when the folder was created.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-10T02:02:41.000+00:00</p>
     */
    @NameInMap("gmtCreated")
    public String gmtCreated;

    /**
     * <p>The time when the folder was last updated.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-10T02:02:41.000+00:00</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <p>The ID of the user who last modifies the folder.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>150978934701****</p>
     */
    @NameInMap("modifier")
    public Long modifier;

    /**
     * <p>The name of the folder.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The parent folder ID.</p>
     * 
     * <strong>example:</strong>
     * <p>w-d6********</p>
     */
    @NameInMap("parentBizId")
    public String parentBizId;

    /**
     * <p>The type of the folder.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TASK</p>
     */
    @NameInMap("type")
    public String type;

    public static Category build(java.util.Map<String, ?> map) throws Exception {
        Category self = new Category();
        return TeaModel.build(map, self);
    }

    public Category setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public Category setCreator(Long creator) {
        this.creator = creator;
        return this;
    }
    public Long getCreator() {
        return this.creator;
    }

    public Category setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public Category setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public Category setModifier(Long modifier) {
        this.modifier = modifier;
        return this;
    }
    public Long getModifier() {
        return this.modifier;
    }

    public Category setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Category setParentBizId(String parentBizId) {
        this.parentBizId = parentBizId;
        return this;
    }
    public String getParentBizId() {
        return this.parentBizId;
    }

    public Category setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

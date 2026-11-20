// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelGroupDTO extends TeaModel {
    /**
     * <p>The time when the group was created. Format: yyyy-MM-dd HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01 00:00:00</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>The time when the group was updated. Format: yyyy-MM-dd HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01 00:00:00</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <p>The unique identifier of the group. It starts with the mg_ prefix and remains unchanged after creation.</p>
     * 
     * <strong>example:</strong>
     * <p>mg_a1b2c3d4e5f6g7h8i9j0</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>The number of models currently included in the group.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("modelCount")
    public Integer modelCount;

    /**
     * <p>The array of all member model IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[101, 102, 103]</p>
     */
    @NameInMap("modelList")
    public java.util.List<Long> modelList;

    /**
     * <p>The name of the group. If a system group is unnamed, the default platform name is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Professional Edition plan</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The type of the group. Valid values:</p>
     * <ul>
     * <li>system: The group is automatically created by the system and cannot be edited or deleted.</li>
     * <li>manual: The group is manually created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>manual</p>
     */
    @NameInMap("type")
    public String type;

    public static ModelGroupDTO build(java.util.Map<String, ?> map) throws Exception {
        ModelGroupDTO self = new ModelGroupDTO();
        return TeaModel.build(map, self);
    }

    public ModelGroupDTO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ModelGroupDTO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public ModelGroupDTO setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ModelGroupDTO setModelCount(Integer modelCount) {
        this.modelCount = modelCount;
        return this;
    }
    public Integer getModelCount() {
        return this.modelCount;
    }

    public ModelGroupDTO setModelList(java.util.List<Long> modelList) {
        this.modelList = modelList;
        return this;
    }
    public java.util.List<Long> getModelList() {
        return this.modelList;
    }

    public ModelGroupDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModelGroupDTO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

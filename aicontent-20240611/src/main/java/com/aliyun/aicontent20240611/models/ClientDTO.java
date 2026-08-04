// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ClientDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Hangzhou</p>
     */
    @NameInMap("address")
    public String address;

    /**
     * <strong>example:</strong>
     * <p>{&quot;model_ids&quot;:[1,2],&quot;group_ids&quot;:[&quot;mg_xxx&quot;]}</p>
     */
    @NameInMap("allowedModelGroupConfig")
    public String allowedModelGroupConfig;

    /**
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("allowedModels")
    public String allowedModels;

    /**
     * <strong>example:</strong>
     * <p>st-xxxx</p>
     */
    @NameInMap("clientUuid")
    public String clientUuid;

    /**
     * <strong>example:</strong>
     * <p>13800138000</p>
     */
    @NameInMap("contact")
    public String contact;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("deleteTag")
    public Integer deleteTag;

    /**
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("discount")
    public Double discount;

    /**
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("level")
    public Integer level;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("main")
    public Integer main;

    /**
     * <strong>example:</strong>
     * <p>My customer</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>department</p>
     */
    @NameInMap("nodeType")
    public String nodeType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("parentId")
    public Long parentId;

    /**
     * <strong>example:</strong>
     * <p>Remarks</p>
     */
    @NameInMap("remark")
    public String remark;

    /**
     * <strong>example:</strong>
     * <p>30001</p>
     */
    @NameInMap("userId")
    public Long userId;

    public static ClientDTO build(java.util.Map<String, ?> map) throws Exception {
        ClientDTO self = new ClientDTO();
        return TeaModel.build(map, self);
    }

    public ClientDTO setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public ClientDTO setAllowedModelGroupConfig(String allowedModelGroupConfig) {
        this.allowedModelGroupConfig = allowedModelGroupConfig;
        return this;
    }
    public String getAllowedModelGroupConfig() {
        return this.allowedModelGroupConfig;
    }

    public ClientDTO setAllowedModels(String allowedModels) {
        this.allowedModels = allowedModels;
        return this;
    }
    public String getAllowedModels() {
        return this.allowedModels;
    }

    public ClientDTO setClientUuid(String clientUuid) {
        this.clientUuid = clientUuid;
        return this;
    }
    public String getClientUuid() {
        return this.clientUuid;
    }

    public ClientDTO setContact(String contact) {
        this.contact = contact;
        return this;
    }
    public String getContact() {
        return this.contact;
    }

    public ClientDTO setDeleteTag(Integer deleteTag) {
        this.deleteTag = deleteTag;
        return this;
    }
    public Integer getDeleteTag() {
        return this.deleteTag;
    }

    public ClientDTO setDiscount(Double discount) {
        this.discount = discount;
        return this;
    }
    public Double getDiscount() {
        return this.discount;
    }

    public ClientDTO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ClientDTO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public ClientDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ClientDTO setLevel(Integer level) {
        this.level = level;
        return this;
    }
    public Integer getLevel() {
        return this.level;
    }

    public ClientDTO setMain(Integer main) {
        this.main = main;
        return this;
    }
    public Integer getMain() {
        return this.main;
    }

    public ClientDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ClientDTO setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public ClientDTO setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public ClientDTO setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ClientDTO setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}

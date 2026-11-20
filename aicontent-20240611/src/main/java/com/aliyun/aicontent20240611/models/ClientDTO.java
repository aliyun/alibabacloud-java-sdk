// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ClientDTO extends TeaModel {
    /**
     * <p>The company address.</p>
     * 
     * <strong>example:</strong>
     * <p>Hangzhou</p>
     */
    @NameInMap("address")
    public String address;

    /**
     * <p>The authorization management configuration in the format of {&quot;model_ids&quot;:[...],&quot;group_ids&quot;:[...]}. An empty value indicates that group authorization is not used.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;model_ids&quot;:[1,2],&quot;group_ids&quot;:[&quot;mg_xxx&quot;]}</p>
     */
    @NameInMap("allowedModelGroupConfig")
    public String allowedModelGroupConfig;

    /**
     * <p>The list of allowed model IDs, separated by commas. An empty value indicates all models.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("allowedModels")
    public String allowedModels;

    /**
     * <p>The customer UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>st-xxxx</p>
     */
    @NameInMap("clientUuid")
    public String clientUuid;

    /**
     * <p>The contact information.</p>
     * 
     * <strong>example:</strong>
     * <p>13800138000</p>
     */
    @NameInMap("contact")
    public String contact;

    /**
     * <p>The status. A value of 0 indicates enabled, and a non-zero value indicates disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("deleteTag")
    public Integer deleteTag;

    /**
     * <p>The discount factor. A value of 1.0 indicates no discount.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("discount")
    public Double discount;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>The update time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <p>ID</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>The hierarchy level. Valid values: 1 to 5.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("level")
    public Integer level;

    /**
     * <p>The account type. A value of 0 indicates a main account, and a value of 1 indicates a regular account.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("main")
    public Integer main;

    /**
     * <p>The customer name.</p>
     * 
     * <strong>example:</strong>
     * <p>My customer</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The node type. Valid values: department: Department. user: User node, which is a leaf in the department tree.</p>
     * 
     * <strong>example:</strong>
     * <p>department</p>
     */
    @NameInMap("nodeType")
    public String nodeType;

    /**
     * <p>The parent department ID. An empty value indicates the top level.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("parentId")
    public Long parentId;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>Remarks</p>
     */
    @NameInMap("remark")
    public String remark;

    /**
     * <p>The user ID. This field has a value only when the node type is user.</p>
     * 
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

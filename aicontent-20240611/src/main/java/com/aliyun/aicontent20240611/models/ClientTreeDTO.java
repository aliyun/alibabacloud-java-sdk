// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ClientTreeDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>杭州市</p>
     */
    @NameInMap("address")
    public String address;

    /**
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("allowedModels")
    public String allowedModels;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("children")
    public java.util.List<ClientTreeDTO> children;

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
     * <p>我的客户</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("parentId")
    public Long parentId;

    /**
     * <strong>example:</strong>
     * <p>备注</p>
     */
    @NameInMap("remark")
    public String remark;

    public static ClientTreeDTO build(java.util.Map<String, ?> map) throws Exception {
        ClientTreeDTO self = new ClientTreeDTO();
        return TeaModel.build(map, self);
    }

    public ClientTreeDTO setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public ClientTreeDTO setAllowedModels(String allowedModels) {
        this.allowedModels = allowedModels;
        return this;
    }
    public String getAllowedModels() {
        return this.allowedModels;
    }

    public ClientTreeDTO setChildren(java.util.List<ClientTreeDTO> children) {
        this.children = children;
        return this;
    }
    public java.util.List<ClientTreeDTO> getChildren() {
        return this.children;
    }

    public ClientTreeDTO setClientUuid(String clientUuid) {
        this.clientUuid = clientUuid;
        return this;
    }
    public String getClientUuid() {
        return this.clientUuid;
    }

    public ClientTreeDTO setContact(String contact) {
        this.contact = contact;
        return this;
    }
    public String getContact() {
        return this.contact;
    }

    public ClientTreeDTO setDeleteTag(Integer deleteTag) {
        this.deleteTag = deleteTag;
        return this;
    }
    public Integer getDeleteTag() {
        return this.deleteTag;
    }

    public ClientTreeDTO setDiscount(Double discount) {
        this.discount = discount;
        return this;
    }
    public Double getDiscount() {
        return this.discount;
    }

    public ClientTreeDTO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ClientTreeDTO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public ClientTreeDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ClientTreeDTO setLevel(Integer level) {
        this.level = level;
        return this;
    }
    public Integer getLevel() {
        return this.level;
    }

    public ClientTreeDTO setMain(Integer main) {
        this.main = main;
        return this;
    }
    public Integer getMain() {
        return this.main;
    }

    public ClientTreeDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ClientTreeDTO setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public ClientTreeDTO setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}

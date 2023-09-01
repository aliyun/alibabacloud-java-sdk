// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteSwimmingLaneGroupRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the lane group.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    public static DeleteSwimmingLaneGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSwimmingLaneGroupRequest self = new DeleteSwimmingLaneGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSwimmingLaneGroupRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DeleteSwimmingLaneGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DeleteSwimmingLaneGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteSwimmingLaneGroupRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}

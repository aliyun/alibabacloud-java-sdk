// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAppBySwimmingLaneGroupTagRequest extends TeaModel {
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
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The name of the Microservices Engine (MSE) namespace that you want to query.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The tag.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Tag")
    public String tag;

    public static ListAppBySwimmingLaneGroupTagRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppBySwimmingLaneGroupTagRequest self = new ListAppBySwimmingLaneGroupTagRequest();
        return TeaModel.build(map, self);
    }

    public ListAppBySwimmingLaneGroupTagRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListAppBySwimmingLaneGroupTagRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public ListAppBySwimmingLaneGroupTagRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListAppBySwimmingLaneGroupTagRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAppBySwimmingLaneGroupTagsShrinkRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Tags")
    public String tagsShrink;

    public static ListAppBySwimmingLaneGroupTagsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppBySwimmingLaneGroupTagsShrinkRequest self = new ListAppBySwimmingLaneGroupTagsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAppBySwimmingLaneGroupTagsShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListAppBySwimmingLaneGroupTagsShrinkRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public ListAppBySwimmingLaneGroupTagsShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListAppBySwimmingLaneGroupTagsShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}

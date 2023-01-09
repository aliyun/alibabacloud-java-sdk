// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAppBySwimmingLaneGroupTagRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The ID of the lane group.
    @NameInMap("GroupId")
    public Long groupId;

    // The tag.
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

    public ListAppBySwimmingLaneGroupTagRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}

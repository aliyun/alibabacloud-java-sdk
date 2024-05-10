// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateSubscribedCalendarShrinkRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Managers")
    public String managersShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SubscribeScope")
    public String subscribeScopeShrink;

    public static CreateSubscribedCalendarShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSubscribedCalendarShrinkRequest self = new CreateSubscribedCalendarShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSubscribedCalendarShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSubscribedCalendarShrinkRequest setManagersShrink(String managersShrink) {
        this.managersShrink = managersShrink;
        return this;
    }
    public String getManagersShrink() {
        return this.managersShrink;
    }

    public CreateSubscribedCalendarShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSubscribedCalendarShrinkRequest setSubscribeScopeShrink(String subscribeScopeShrink) {
        this.subscribeScopeShrink = subscribeScopeShrink;
        return this;
    }
    public String getSubscribeScopeShrink() {
        return this.subscribeScopeShrink;
    }

}

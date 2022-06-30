// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class ListSurveyResourceByMigrationGroupsShrinkRequest extends TeaModel {
    @NameInMap("body")
    public String bodyShrink;

    public static ListSurveyResourceByMigrationGroupsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSurveyResourceByMigrationGroupsShrinkRequest self = new ListSurveyResourceByMigrationGroupsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListSurveyResourceByMigrationGroupsShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListTestCaseFieldsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("spaceIdentifier")
    public String spaceIdentifier;

    public static ListTestCaseFieldsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTestCaseFieldsRequest self = new ListTestCaseFieldsRequest();
        return TeaModel.build(map, self);
    }

    public ListTestCaseFieldsRequest setSpaceIdentifier(String spaceIdentifier) {
        this.spaceIdentifier = spaceIdentifier;
        return this;
    }
    public String getSpaceIdentifier() {
        return this.spaceIdentifier;
    }

}

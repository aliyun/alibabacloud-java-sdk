// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetTestResultListRequest extends TeaModel {
    @NameInMap("conditions")
    public String conditions;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("directoryIdentifier")
    public String directoryIdentifier;

    public static GetTestResultListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTestResultListRequest self = new GetTestResultListRequest();
        return TeaModel.build(map, self);
    }

    public GetTestResultListRequest setConditions(String conditions) {
        this.conditions = conditions;
        return this;
    }
    public String getConditions() {
        return this.conditions;
    }

    public GetTestResultListRequest setDirectoryIdentifier(String directoryIdentifier) {
        this.directoryIdentifier = directoryIdentifier;
        return this;
    }
    public String getDirectoryIdentifier() {
        return this.directoryIdentifier;
    }

}

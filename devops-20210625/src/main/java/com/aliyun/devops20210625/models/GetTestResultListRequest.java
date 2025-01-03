// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetTestResultListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{\&quot;conditionGroups\&quot;: [[{\&quot;fieldIdentifier\&quot;: \&quot;gmtModified\&quot;, \&quot;operator\&quot;: \&quot;MORE_THAN_AND_EQUAL\&quot;, \&quot;value\&quot;: [\&quot;2023-04-20 18:03:12.442140\&quot;], \&quot;className\&quot;: \&quot;dateTime\&quot;, \&quot;format\&quot;: \&quot;input\&quot;}]]}</p>
     */
    @NameInMap("conditions")
    public String conditions;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e27b8eace6501ce51cf5d56784</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetTtsQuestionByGroupIdRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    public static GetTtsQuestionByGroupIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTtsQuestionByGroupIdRequest self = new GetTtsQuestionByGroupIdRequest();
        return TeaModel.build(map, self);
    }

    public GetTtsQuestionByGroupIdRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}

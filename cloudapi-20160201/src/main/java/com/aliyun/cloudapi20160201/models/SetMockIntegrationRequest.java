// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class SetMockIntegrationRequest extends TeaModel {
    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Mock")
    public String mock;

    @NameInMap("MockResult")
    public String mockResult;

    public static SetMockIntegrationRequest build(java.util.Map<String, ?> map) throws Exception {
        SetMockIntegrationRequest self = new SetMockIntegrationRequest();
        return TeaModel.build(map, self);
    }

    public SetMockIntegrationRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public SetMockIntegrationRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SetMockIntegrationRequest setMock(String mock) {
        this.mock = mock;
        return this;
    }
    public String getMock() {
        return this.mock;
    }

    public SetMockIntegrationRequest setMockResult(String mockResult) {
        this.mockResult = mockResult;
        return this;
    }
    public String getMockResult() {
        return this.mockResult;
    }

}

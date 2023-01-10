// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListServiceVersionsRequest extends TeaModel {
    // The order in which the returned versions are sorted. Valid values:
    //   - **FORWARD**: in ascending order. 
    //   - **BACKWARD**: in descending order. This is the default value.
    @NameInMap("direction")
    public String direction;

    // The maximum number of resources to return. Default value: 20. Maximum value: 100. The number of returned resources is less than or equal to the specified number.
    @NameInMap("limit")
    public Integer limit;

    // The token used to obtain more results. If the number of resources exceeds the limit, the nextToken parameter is returned. You can include the parameter in subsequent calls to obtain more results. You do not need to provide this parameter in the first call.
    @NameInMap("nextToken")
    public String nextToken;

    // The starting position of the result list. The returned resources are sorted based on the version number, and the resources that include and follow the resource specified by the startKey parameter are returned.
    @NameInMap("startKey")
    public String startKey;

    public static ListServiceVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceVersionsRequest self = new ListServiceVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceVersionsRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ListServiceVersionsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListServiceVersionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceVersionsRequest setStartKey(String startKey) {
        this.startKey = startKey;
        return this;
    }
    public String getStartKey() {
        return this.startKey;
    }

}

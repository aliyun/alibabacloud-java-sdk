// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListServiceVersionsRequest extends TeaModel {
    /**
     * <p>The name of the service.</p>
     */
    @NameInMap("direction")
    public String direction;

    /**
     * <p>The token used to obtain more results. If the number of resources exceeds the limit, the nextToken parameter is returned. You can include the parameter in subsequent calls to obtain more results. You do not need to provide this parameter in the first call.</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The description of the service version.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The time when the service version was created.</p>
     */
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

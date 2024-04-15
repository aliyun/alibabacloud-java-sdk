// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListLayersRequest extends TeaModel {
    /**
     * <p>The number of layers that are returned</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Specifies whether the layer is official. Valid values: true and false.</p>
     */
    @NameInMap("official")
    public String official;

    /**
     * <p>The name prefix of the layer.</p>
     */
    @NameInMap("prefix")
    public String prefix;

    /**
     * <p>Specifies whether the layer is public. Valid values: true and false.</p>
     */
    @NameInMap("public")
    public String _public;

    public static ListLayersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLayersRequest self = new ListLayersRequest();
        return TeaModel.build(map, self);
    }

    public ListLayersRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListLayersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListLayersRequest setOfficial(String official) {
        this.official = official;
        return this;
    }
    public String getOfficial() {
        return this.official;
    }

    public ListLayersRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ListLayersRequest set_public(String _public) {
        this._public = _public;
        return this;
    }
    public String get_public() {
        return this._public;
    }

}

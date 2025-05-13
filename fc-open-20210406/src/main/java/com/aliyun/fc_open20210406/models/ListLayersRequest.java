// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListLayersRequest extends TeaModel {
    /**
     * <p>The maximum number of resources to return. Default value: 20. Maximum value: 100. The number of returned configurations is less than or equal to the specified number.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The token required to obtain more results. If the number of resources exceeds the limit, the nextToken parameter is returned. You can include the parameter in subsequent calls to obtain more results. You do not need to provide this parameter in the first call.</p>
     * 
     * <strong>example:</strong>
     * <p>next-layer-name</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Specifies whether to obtain the official public layer. When the official parameter is set to true, the public field does not take effect. The default value is false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("official")
    public Boolean official;

    /**
     * <p>The name prefix of the layer. The names of returned resources must contain the prefix. If the name prefix is a, the names of returned resources must start with a.</p>
     * 
     * <strong>example:</strong>
     * <p>prefix-Layer</p>
     */
    @NameInMap("prefix")
    public String prefix;

    /**
     * <p>Specifies whether to obtain only the common layer. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("public")
    public Boolean _public;

    /**
     * <p>The name of the start layer. The returned layers are sorted in alphabetical order, and the layers that include and follow the layer specified by the startKey parameter are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>start-layer-name</p>
     */
    @NameInMap("startKey")
    public String startKey;

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

    public ListLayersRequest setOfficial(Boolean official) {
        this.official = official;
        return this;
    }
    public Boolean getOfficial() {
        return this.official;
    }

    public ListLayersRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ListLayersRequest set_public(Boolean _public) {
        this._public = _public;
        return this;
    }
    public Boolean get_public() {
        return this._public;
    }

    public ListLayersRequest setStartKey(String startKey) {
        this.startKey = startKey;
        return this;
    }
    public String getStartKey() {
        return this.startKey;
    }

}

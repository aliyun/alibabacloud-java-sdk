// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListRankingModelsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("rankingModelId")
    public String rankingModelId;

    @NameInMap("size")
    public Integer size;

    public static ListRankingModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRankingModelsRequest self = new ListRankingModelsRequest();
        return TeaModel.build(map, self);
    }

    public ListRankingModelsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListRankingModelsRequest setRankingModelId(String rankingModelId) {
        this.rankingModelId = rankingModelId;
        return this;
    }
    public String getRankingModelId() {
        return this.rankingModelId;
    }

    public ListRankingModelsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}

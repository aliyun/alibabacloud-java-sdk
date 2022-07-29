// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetSourceMapInfoRequest extends TeaModel {
    @NameInMap("AscendingSequence")
    public Boolean ascendingSequence;

    @NameInMap("Edition")
    public String edition;

    @NameInMap("ID")
    public String ID;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("OrderField")
    public String orderField;

    @NameInMap("RegionId")
    public String regionId;

    public static GetSourceMapInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSourceMapInfoRequest self = new GetSourceMapInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetSourceMapInfoRequest setAscendingSequence(Boolean ascendingSequence) {
        this.ascendingSequence = ascendingSequence;
        return this;
    }
    public Boolean getAscendingSequence() {
        return this.ascendingSequence;
    }

    public GetSourceMapInfoRequest setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
    }

    public GetSourceMapInfoRequest setID(String ID) {
        this.ID = ID;
        return this;
    }
    public String getID() {
        return this.ID;
    }

    public GetSourceMapInfoRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public GetSourceMapInfoRequest setOrderField(String orderField) {
        this.orderField = orderField;
        return this;
    }
    public String getOrderField() {
        return this.orderField;
    }

    public GetSourceMapInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

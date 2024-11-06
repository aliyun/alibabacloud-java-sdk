// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class PlaceSearchRequest extends TeaModel {
    @NameInMap("keywords")
    public String keywords;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    @NameInMap("region")
    public String region;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <strong>example:</strong>
     * <p>GAS_STATION|RESTAURANT|HOTEL|ATTRACTION</p>
     */
    @NameInMap("types")
    public String types;

    public static PlaceSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        PlaceSearchRequest self = new PlaceSearchRequest();
        return TeaModel.build(map, self);
    }

    public PlaceSearchRequest setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

    public PlaceSearchRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public PlaceSearchRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public PlaceSearchRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public PlaceSearchRequest setTypes(String types) {
        this.types = types;
        return this;
    }
    public String getTypes() {
        return this.types;
    }

}

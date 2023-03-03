// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetSourceMapInfoRequest extends TeaModel {
    /**
     * <p>The order in which the files are sorted. Valid values:</p>
     * <br>
     * <p>*   true: ascending order</p>
     * <p>*   false: descending order</p>
     */
    @NameInMap("AscendingSequence")
    public Boolean ascendingSequence;

    /**
     * <p>The version of the SourceMap file.</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>The IDs of the SourceMap files.</p>
     */
    @NameInMap("ID")
    public String ID;

    /**
     * <p>The keyword in the file name. The files are searched by keyword.</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The criterion by which the files are sorted. Valid values:</p>
     * <br>
     * <p>*   version: The files are sorted by version.</p>
     * <p>*   uploadTime: The files are sorted by upload time.</p>
     */
    @NameInMap("OrderField")
    public String orderField;

    /**
     * <p>The ID of the region.</p>
     */
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

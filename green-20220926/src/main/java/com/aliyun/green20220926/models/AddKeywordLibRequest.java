// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class AddKeywordLibRequest extends TeaModel {
    @NameInMap("Keywords")
    public String keywords;

    /**
     * <strong>example:</strong>
     * <p>upload/1e5353c0-0d91-40ba-9d41-ae7abd3fe561.txt</p>
     */
    @NameInMap("KeywordsObject")
    public String keywordsObject;

    @NameInMap("LibName")
    public String libName;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AddKeywordLibRequest build(java.util.Map<String, ?> map) throws Exception {
        AddKeywordLibRequest self = new AddKeywordLibRequest();
        return TeaModel.build(map, self);
    }

    public AddKeywordLibRequest setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

    public AddKeywordLibRequest setKeywordsObject(String keywordsObject) {
        this.keywordsObject = keywordsObject;
        return this;
    }
    public String getKeywordsObject() {
        return this.keywordsObject;
    }

    public AddKeywordLibRequest setLibName(String libName) {
        this.libName = libName;
        return this;
    }
    public String getLibName() {
        return this.libName;
    }

    public AddKeywordLibRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

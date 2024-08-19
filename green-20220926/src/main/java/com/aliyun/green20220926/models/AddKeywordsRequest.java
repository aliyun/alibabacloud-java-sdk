// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class AddKeywordsRequest extends TeaModel {
    @NameInMap("Keywords")
    public String keywords;

    /**
     * <strong>example:</strong>
     * <p>upload/1e5353c0-0d91-40ba-9d41-ae7abd3fe561.txt</p>
     */
    @NameInMap("KeywordsObject")
    public String keywordsObject;

    /**
     * <strong>example:</strong>
     * <p>customxx_xxxx</p>
     */
    @NameInMap("LibId")
    public String libId;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AddKeywordsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddKeywordsRequest self = new AddKeywordsRequest();
        return TeaModel.build(map, self);
    }

    public AddKeywordsRequest setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

    public AddKeywordsRequest setKeywordsObject(String keywordsObject) {
        this.keywordsObject = keywordsObject;
        return this;
    }
    public String getKeywordsObject() {
        return this.keywordsObject;
    }

    public AddKeywordsRequest setLibId(String libId) {
        this.libId = libId;
        return this;
    }
    public String getLibId() {
        return this.libId;
    }

    public AddKeywordsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

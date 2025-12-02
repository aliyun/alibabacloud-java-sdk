// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class AddKeywordsToLibRequest extends TeaModel {
    /**
     * <p>The keyword to be added.</p>
     * 
     * <strong>example:</strong>
     * <p>keyword</p>
     */
    @NameInMap("Keywords")
    public String keywords;

    /**
     * <p>The name of the keyword file.</p>
     * 
     * <strong>example:</strong>
     * <p>upload/1e5353c0-0d91-40ba-9d41-ae7abd3fe561.txt</p>
     */
    @NameInMap("KeywordsObject")
    public String keywordsObject;

    /**
     * <p>The id of the keyword library.</p>
     * 
     * <strong>example:</strong>
     * <p>customxx_xxxx</p>
     */
    @NameInMap("LibId")
    public String libId;

    /**
     * <p>Region ID</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AddKeywordsToLibRequest build(java.util.Map<String, ?> map) throws Exception {
        AddKeywordsToLibRequest self = new AddKeywordsToLibRequest();
        return TeaModel.build(map, self);
    }

    public AddKeywordsToLibRequest setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

    public AddKeywordsToLibRequest setKeywordsObject(String keywordsObject) {
        this.keywordsObject = keywordsObject;
        return this;
    }
    public String getKeywordsObject() {
        return this.keywordsObject;
    }

    public AddKeywordsToLibRequest setLibId(String libId) {
        this.libId = libId;
        return this;
    }
    public String getLibId() {
        return this.libId;
    }

    public AddKeywordsToLibRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

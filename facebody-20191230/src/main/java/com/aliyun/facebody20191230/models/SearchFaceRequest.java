// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class SearchFaceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <strong>example:</strong>
     * <p>test1,test2,test3</p>
     */
    @NameInMap("DbNames")
    public String dbNames;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/SearchFace/SearchFace1.png">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/SearchFace/SearchFace1.png</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("MaxFaceNum")
    public Long maxFaceNum;

    /**
     * <strong>example:</strong>
     * <p>50.0</p>
     */
    @NameInMap("QualityScoreThreshold")
    public Float qualityScoreThreshold;

    public static SearchFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchFaceRequest self = new SearchFaceRequest();
        return TeaModel.build(map, self);
    }

    public SearchFaceRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public SearchFaceRequest setDbNames(String dbNames) {
        this.dbNames = dbNames;
        return this;
    }
    public String getDbNames() {
        return this.dbNames;
    }

    public SearchFaceRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public SearchFaceRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public SearchFaceRequest setMaxFaceNum(Long maxFaceNum) {
        this.maxFaceNum = maxFaceNum;
        return this;
    }
    public Long getMaxFaceNum() {
        return this.maxFaceNum;
    }

    public SearchFaceRequest setQualityScoreThreshold(Float qualityScoreThreshold) {
        this.qualityScoreThreshold = qualityScoreThreshold;
        return this;
    }
    public Float getQualityScoreThreshold() {
        return this.qualityScoreThreshold;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgQueryDesensStatusListRequest extends TeaModel {
    /**
     * <p>Query keyword</p>
     * 
     * <strong>example:</strong>
     * <p>my</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>Page number</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Primary scene code</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dataworks_display_desense_code</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    /**
     * <p>Scene ID. Only required when querying project workspace switch data.</p>
     * 
     * <strong>example:</strong>
     * <p>124</p>
     */
    @NameInMap("sceneId")
    public String sceneId;

    public static DsgQueryDesensStatusListRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgQueryDesensStatusListRequest self = new DsgQueryDesensStatusListRequest();
        return TeaModel.build(map, self);
    }

    public DsgQueryDesensStatusListRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DsgQueryDesensStatusListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DsgQueryDesensStatusListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DsgQueryDesensStatusListRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public DsgQueryDesensStatusListRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}

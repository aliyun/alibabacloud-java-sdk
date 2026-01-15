// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class SearchImageByTextRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DistinctProductId")
    public Boolean distinctProductId;

    /**
     * <strong>example:</strong>
     * <p>int_attr=1000 AND str_attr=&quot;value1&quot;</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demoinstance1</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Num")
    public Integer num;

    @NameInMap("ScoreThreshold")
    public String scoreThreshold;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Start")
    public Integer start;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("Text")
    public String text;

    public static SearchImageByTextRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchImageByTextRequest self = new SearchImageByTextRequest();
        return TeaModel.build(map, self);
    }

    public SearchImageByTextRequest setDistinctProductId(Boolean distinctProductId) {
        this.distinctProductId = distinctProductId;
        return this;
    }
    public Boolean getDistinctProductId() {
        return this.distinctProductId;
    }

    public SearchImageByTextRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public SearchImageByTextRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public SearchImageByTextRequest setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public SearchImageByTextRequest setScoreThreshold(String scoreThreshold) {
        this.scoreThreshold = scoreThreshold;
        return this;
    }
    public String getScoreThreshold() {
        return this.scoreThreshold;
    }

    public SearchImageByTextRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

    public SearchImageByTextRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}

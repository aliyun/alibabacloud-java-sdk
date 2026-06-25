// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class SearchImageByTextRequest extends TeaModel {
    /**
     * <p>If this parameter is set to true, duplicate data is removed based on the ProductId field during the search.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DistinctProductId")
    public Boolean distinctProductId;

    /**
     * <p>The filter condition. The int_attr field supports the following operators: in, not in, greater than (&gt;), greater than or equal to (&gt;=), less than (&lt;), less than or equal to (&lt;=), and equal to (=). The str_attr field supports the following operators: in, not in, equal to (=), and not equal to (!=). You can use AND and OR to connect multiple conditions.
     * Examples:</p>
     * <ul>
     * <li>int_attr &gt;= 100.</li>
     * <li>str_attr != &quot;value1&quot;.</li>
     * <li>int_attr = 1000 AND str_attr = &quot;value1&quot;.</li>
     * </ul>
     * <blockquote>
     * <p>The filter condition can be up to 4,096 characters in length.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>int_attr=1000 AND str_attr=&quot;value1&quot;</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The name of the Image Search instance. The name can be up to 20 characters in length.
     * If you have purchased an Image Search instance, log on to the <a href="https://imagesearch.console.aliyun.com/">Image Search console</a> to view the instance name.
     * If you have not purchased an Image Search instance, see <a href="https://help.aliyun.com/document_detail/179178.html">Activate the service</a> and <a href="https://help.aliyun.com/document_detail/66569.html">Create an instance</a>.</p>
     * <blockquote>
     * <p>The instance name is not the instance ID. Make sure you distinguish between them.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demoinstance1</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The number of results to return. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Num")
    public Integer num;

    /**
     * <p>The similarity score threshold. After you specify this parameter, only images whose similarity scores are greater than or equal to the threshold are returned. Valid values: 0.00 to 1.00. The value supports up to two decimal places. Default value: 0.00.</p>
     * 
     * <strong>example:</strong>
     * <p>0.50</p>
     */
    @NameInMap("ScoreThreshold")
    public String scoreThreshold;

    /**
     * <p>The start position of the results to return. Valid values: 0 to 499. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Start")
    public Integer start;

    /**
     * <p>The description text for searching images. Chinese and English are supported.</p>
     * <blockquote>
     * <p>The text can be up to 512 characters in length.</p>
     * </blockquote>
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

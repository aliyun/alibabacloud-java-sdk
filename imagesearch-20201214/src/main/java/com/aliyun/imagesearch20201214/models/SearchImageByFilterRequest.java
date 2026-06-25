// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class SearchImageByFilterRequest extends TeaModel {
    /**
     * <p>The filter conditions. The operators supported by int_attr include in, not in, greater than (&gt;), greater than or equal to (&gt;=), less than (&lt;), less than or equal to (&lt;=), and equal to (=). The operators supported by str_attr include in, not in, equal to (=), and not equal to (!=). Multiple conditions can be connected by AND and OR.
     * Examples:</p>
     * <ul>
     * <li>int_attr &gt;= 100.</li>
     * <li>str_attr != &quot;value1&quot;.</li>
     * <li>int_attr = 1000 AND str_attr = &quot;value1&quot;.</li>
     * </ul>
     * <blockquote>
     * <p>A maximum of 4,096 characters are supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>int_attr=1000 AND str_attr=&quot;value1&quot;</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The name of the Image Search instance. The name can be up to 20 characters in length.
     * If you have purchased an Image Search instance, you can log on to the <a href="https://imagesearch.console.aliyun.com/">Image Search console</a> to view the instance.
     * If you have not purchased an Image Search instance, see <a href="https://help.aliyun.com/document_detail/179178.html">Activate the service</a> and <a href="https://help.aliyun.com/document_detail/66569.html">Create an instance</a>.</p>
     * <blockquote>
     * <p>The instance name is not the instance ID. Make sure that you can distinguish between them.</p>
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
     * <p>The start position of the results to return. Valid values: 0 to 499. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Start")
    public Integer start;

    public static SearchImageByFilterRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchImageByFilterRequest self = new SearchImageByFilterRequest();
        return TeaModel.build(map, self);
    }

    public SearchImageByFilterRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public SearchImageByFilterRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public SearchImageByFilterRequest setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public SearchImageByFilterRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

}

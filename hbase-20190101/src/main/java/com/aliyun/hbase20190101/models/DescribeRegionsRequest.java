// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeRegionsRequest extends TeaModel {
    /**
     * <p>The supported language. Valid values:</p>
     * <ul>
     * <li><strong>zh-CN</strong>: Chinese (default)</li>
     * <li><strong>en-US</strong>: English</li>
     * <li><strong>ja</strong>: Japanese.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The data engine type. Valid values:</p>
     * <ul>
     * <li><strong>hbase</strong>: ApsaraDB for HBase Standard Edition or ApsaraDB for HBase single-node edition.</li>
     * <li><strong>hbaseue</strong>: ApsaraDB for HBase Performance-enhanced Edition.</li>
     * <li><strong>serverlesshbase</strong>: ApsaraDB for HBase Serverless edition.</li>
     * <li><strong>bds</strong>: BDS instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hbase</p>
     */
    @NameInMap("Engine")
    public String engine;

    public static DescribeRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsRequest self = new DescribeRegionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DescribeRegionsRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

}

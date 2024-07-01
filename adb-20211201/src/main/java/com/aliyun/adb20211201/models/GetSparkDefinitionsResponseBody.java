// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkDefinitionsResponseBody extends TeaModel {
    /**
     * <p>The common definitions of Spark applications.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;SQLTemplateExample&quot;: &quot;-- Here is just an example of SparkSQL. Modify the content and run your spark program.
     * conf spark.driver.resourceSpec=medium;
     * conf spark.executor.instances=2;
     * conf spark.executor.resourceSpec=medium;
     * conf spark.app.name=Spark SQL Test;
     * conf spark.adb.connectors=oss;</p>
     * <p>-- Here are your sql statements
     * show databases;&quot;,
     *                  &quot;BatchTemplateExample&quot;: &quot;{
     *     &quot;comments&quot;: [
     *         &quot;-- Here is just an example of SparkPi. Modify the content and run your spark program.&quot;
     *     ],
     *     &quot;args&quot;: [&quot;1000&quot;],
     *   &quot;file&quot;:&quot;local:///tmp/spark-examples.jar&quot;,
     *     &quot;name&quot;: &quot;SparkPi&quot;,
     *     &quot;className&quot;: &quot;org.apache.spark.examples.SparkPi&quot;,
     *     &quot;conf&quot;: {      &quot;spark.driver.resourceSpec&quot;: &quot;medium&quot;,
     *         &quot;spark.executor.instances&quot;: 2,
     *         &quot;spark.executor.resourceSpec&quot;: &quot;medium&quot;
     *     }
     * }&quot;</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D65A809F-34CE-4550-9BC1-0ED21ETG380</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSparkDefinitionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSparkDefinitionsResponseBody self = new GetSparkDefinitionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSparkDefinitionsResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetSparkDefinitionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

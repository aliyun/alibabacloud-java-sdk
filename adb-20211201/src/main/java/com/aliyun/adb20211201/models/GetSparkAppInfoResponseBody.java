// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkAppInfoResponseBody extends TeaModel {
    /**
     * <p>The queried Spark application. Fields in the response parameter:</p>
     * <ul>
     * <li><strong>Data</strong>: the data of the Spark application template.</li>
     * <li><strong>EstimateExecutionCpuTimeInSeconds</strong>: the amount of time that is required to consume CPU resources for running the Spark application. Unit: milliseconds.</li>
     * <li><strong>LogRootPath</strong>: the storage path of log files.</li>
     * <li><strong>LastAttemptId</strong>: the most recent attempt ID.</li>
     * <li><strong>WebUiAddress</strong>: the web UI URL.</li>
     * <li><strong>SubmittedTimeInMillis</strong>: the time when the Spark application was submitted. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</li>
     * <li><strong>StartedTimeInMillis</strong>: the time when the Spark application was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</li>
     * <li><strong>LastUpdatedTimeInMillis</strong>: the time when the Spark application was last updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</li>
     * <li><strong>TerminatedTimeInMillis</strong>: the time when the Spark application was terminated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</li>
     * <li><strong>DBClusterId</strong>: the ID of the cluster on which the Spark application runs.</li>
     * <li><strong>ResourceGroupName</strong>: the name of the job resource group.</li>
     * <li><strong>DurationInMillis</strong>: the amount of time that is required to run the Spark application. Unit: milliseconds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{     \&quot;name\&quot;: \&quot;SparkPi\&quot;,     \&quot;file\&quot;: \&quot;local:///tmp/spark-examples.jar\&quot;,     \&quot;className\&quot;: \&quot;org.apache.spark.examples.SparkPi\&quot;,     \&quot;args\&quot;: [         \&quot;1000000\&quot;     ],     \&quot;conf\&quot;: {         \&quot;spark.driver.resourceSpec\&quot;: \&quot;small\&quot;,         \&quot;spark.executor.instances\&quot;: 1,         \&quot;spark.executor.resourceSpec\&quot;: \&quot;small\&quot;     } }&quot;,
     *       &quot;EstimateExecutionCpuTimeInSeconds&quot; : 100,
     *       &quot;LogRootPath&quot; : &quot;oss://test/logs/driver&quot;,
     *       &quot;LastAttemptId&quot; : &quot;s202204291426hzpre60cfabb0000004-0003&quot;,
     *       &quot;WebUiAddress&quot; : &quot;<a href="https://sparkui.aliyuncs.com/token=xxx">https://sparkui.aliyuncs.com/token=xxx</a>&quot;,
     *       &quot;SubmittedTimeInMillis&quot; : 1651213645000,
     *       &quot;StartedTimeInMillis&quot; : 1651213645010,
     *       &quot;LastUpdatedTimeInMillis&quot; : 1651213645200,
     *       &quot;TerminatedTimeInMillis&quot; : 1651213645300,
     *       &quot;DBClusterId&quot; : &quot;am-dbclusterid&quot;,
     *       &quot;ResourceGroupName&quot; : &quot;spark-rg&quot;,
     *       &quot;DurationInMillis&quot; : 100
     *     }</p>
     */
    @NameInMap("Data")
    public SparkAppInfo data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D65A809F-34CE-4550-9BC1-0ED21ETG380</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSparkAppInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSparkAppInfoResponseBody self = new GetSparkAppInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSparkAppInfoResponseBody setData(SparkAppInfo data) {
        this.data = data;
        return this;
    }
    public SparkAppInfo getData() {
        return this.data;
    }

    public GetSparkAppInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

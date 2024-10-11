// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListDataDiagnoseReportsResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8B90B646-1678-41A3-B23F-EAC6587B0E48</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;todayTimeLimit&quot;:8,
     *     &quot;totalCount&quot;:10,
     *     &quot;reports&quot;:[
     *         {
     *             &quot;diagnoseLevel&quot;:&quot;low | medium | high&quot;,
     *             &quot;startTime&quot;:1566489600,
     *             &quot;endTime&quot;:1566489600,
     *             &quot;taskCreateTime&quot;:1566489600,
     *             &quot;taskSource&quot;:&quot;manual | cycle | firstRun&quot;,
     *             &quot;total&quot;:{
     *                 &quot;itemCount&quot;:100,
     *                 &quot;userCount&quot;:100,
     *                 &quot;bhvCount&quot;:100
     *             },
     *             &quot;details&quot;:[
     *                 {
     *                     &quot;key&quot;:&quot;&quot;,
     *                     &quot;level&quot;:&quot;error | warn | info&quot;,
     *                     &quot;errorCount&quot;:10,
     *                     &quot;errorPercent&quot;:10,
     *                     &quot;sampleEnabled&quot;:true;
     *                 }
     *             ]
     *         },
     *         {
     *             &quot;diagnoseLevel&quot;:&quot;low | medium | high&quot;,
     *             &quot;startTime&quot;:1566489600,
     *             &quot;endTime&quot;:1566489600,
     *             &quot;taskCreateTime&quot;:1566489600,
     *             &quot;taskSource&quot;:&quot;manual | cycle | firstRun&quot;,
     *             &quot;total&quot;:{
     *                 &quot;itemCount&quot;:100,
     *                 &quot;userCount&quot;:100,
     *                 &quot;bhvCount&quot;:100
     *             },
     *             &quot;details&quot;:[
     *                 {
     *                     &quot;key&quot;:&quot;&quot;,
     *                     &quot;level&quot;:&quot;error | warn | info&quot;,
     *                     &quot;errorCount&quot;:10,
     *                     &quot;errorPercent&quot;:10,
     *                     &quot;sampleEnabled&quot;:true;
     *                 }
     *             ]
     *         }
     *     ]
     * }</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static ListDataDiagnoseReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataDiagnoseReportsResponseBody self = new ListDataDiagnoseReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataDiagnoseReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataDiagnoseReportsResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}

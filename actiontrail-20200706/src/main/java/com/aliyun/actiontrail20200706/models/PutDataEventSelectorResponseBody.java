// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class PutDataEventSelectorResponseBody extends TeaModel {
    /**
     * <p>The configuration of the data event selector. This parameter is a JSON array that can contain a maximum of 20 elements.</p>
     * <p>Each element in the JSON array includes the following fields:</p>
     * <ul>
     * <li><p><code>ServiceName</code>: The name of the Alibaba Cloud service that supports data events.</p>
     * </li>
     * <li><p><code>ReadWriteType</code>: The type of data event. Valid values: Read, Write, and All.</p>
     * </li>
     * <li><p><code>EventName</code>: This field contains the <code>Equals</code> and <code>NotEquals</code> subfields.</p>
     * <p>For example, the following configuration specifies that only <code>GetObject</code>, <code>CopyObject</code>, and <code>AppendObject</code> events are delivered:</p>
     * <p><code>{&quot;EventName&quot;:{&quot;Equals&quot;:[&quot;GetObject&quot;,&quot;CopyObject&quot;,&quot;AppendObject&quot;]}}</code></p>
     * <p>If you specify <code>NotEquals</code>, events other than <code>GetObject</code>, <code>CopyObject</code>, and <code>AppendObject</code> are delivered.</p>
     * </li>
     * <li><p><code>ResourceArn</code>: This field also contains the <code>Equals</code> and <code>NotEquals</code> subfields, similar to <code>EventName</code>. For example:</p>
     * <p><code>{&quot;ResourceArn&quot;:{&quot;Equals&quot;:[arn1,...,arnx]}}</code></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;EventName&quot;:{&quot;Equals&quot;:[&quot;GetObject&quot;,&quot;CopyObject&quot;,&quot;AppendObject&quot;]},&quot;ReadWriteType&quot;:&quot;All&quot;,&quot;ServiceName&quot;:&quot;Oss&quot;}]</p>
     */
    @NameInMap("DataEventSelectors")
    public String dataEventSelectors;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>243E1250-32DA-493B-9347-3C7EEE07****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the trail.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:actiontrail:cn-shanghai:159498693826****:trail/trail-name</p>
     */
    @NameInMap("TrailArn")
    public String trailArn;

    public static PutDataEventSelectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutDataEventSelectorResponseBody self = new PutDataEventSelectorResponseBody();
        return TeaModel.build(map, self);
    }

    public PutDataEventSelectorResponseBody setDataEventSelectors(String dataEventSelectors) {
        this.dataEventSelectors = dataEventSelectors;
        return this;
    }
    public String getDataEventSelectors() {
        return this.dataEventSelectors;
    }

    public PutDataEventSelectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PutDataEventSelectorResponseBody setTrailArn(String trailArn) {
        this.trailArn = trailArn;
        return this;
    }
    public String getTrailArn() {
        return this.trailArn;
    }

}

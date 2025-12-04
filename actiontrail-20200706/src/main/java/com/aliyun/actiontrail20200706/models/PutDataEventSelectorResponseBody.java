// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class PutDataEventSelectorResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[{&quot;EventName&quot;:{&quot;Equals&quot;:[&quot;GetObject&quot;,&quot;CopyObject&quot;,&quot;AppendObject&quot;]},&quot;ReadWriteType&quot;:&quot;All&quot;,&quot;ServiceName&quot;:&quot;Oss&quot;}]</p>
     */
    @NameInMap("DataEventSelectors")
    public String dataEventSelectors;

    /**
     * <strong>example:</strong>
     * <p>243E1250-32DA-493B-9347-3C7EEE07****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class PushMeteringDataRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[{&quot;InstanceId&quot;:&quot;1000001&quot;,&quot;StartTime&quot;:&quot;100000000&quot;,&quot;EndTime&quot;:&quot;100000010&quot;,&quot;Entities&quot;:[{&quot;Key&quot;:&quot;PeriodMin&quot;,&quot;Value&quot;:&quot;96&quot;,&quot;meteringAssit&quot;:&quot;cmapi00060317-PeriodMin-4&quot;}]}]</p>
     */
    @NameInMap("Metering")
    public String metering;

    public static PushMeteringDataRequest build(java.util.Map<String, ?> map) throws Exception {
        PushMeteringDataRequest self = new PushMeteringDataRequest();
        return TeaModel.build(map, self);
    }

    public PushMeteringDataRequest setMetering(String metering) {
        this.metering = metering;
        return this;
    }
    public String getMetering() {
        return this.metering;
    }

}

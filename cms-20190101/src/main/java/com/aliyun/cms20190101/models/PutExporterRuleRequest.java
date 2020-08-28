// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutExporterRuleRequest extends TeaModel {
    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("DstNames")
    public java.util.List<String> dstNames;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("TargetWindows")
    public String targetWindows;

    @NameInMap("Describe")
    public String describe;

    public static PutExporterRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        PutExporterRuleRequest self = new PutExporterRuleRequest();
        return TeaModel.build(map, self);
    }

}
